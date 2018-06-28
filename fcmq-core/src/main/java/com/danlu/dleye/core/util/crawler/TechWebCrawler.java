package com.danlu.dleye.core.util.crawler;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.util.CollectionUtils;

import com.danlu.dleye.core.ArticleInfoManager;
import com.danlu.dleye.persist.base.ArticleInfo;
import com.gargoylesoftware.htmlunit.WebClient;
import com.gargoylesoftware.htmlunit.html.HtmlAnchor;
import com.gargoylesoftware.htmlunit.html.HtmlDivision;
import com.gargoylesoftware.htmlunit.html.HtmlImage;
import com.gargoylesoftware.htmlunit.html.HtmlPage;
import com.gargoylesoftware.htmlunit.html.HtmlParagraph;
import com.gargoylesoftware.htmlunit.html.HtmlSpan;

public class TechWebCrawler implements Runnable {

    private static final Logger logger = LoggerFactory.getLogger(TechWebCrawler.class);
    private static final String TECHWEB = "techweb";
    private static final String URL_STRING = "http://mi.techweb.com.cn";
    private static final String DEFAULT_PIC = "http://chenzhuo.pub/default.png";

    private WebClient webClient;
    private ArticleInfoManager articleInfoManager;

    public TechWebCrawler(ArticleInfoManager articleInfoManager) {
        super();
        this.webClient = initWebClient();
        this.articleInfoManager = articleInfoManager;
    }

    @SuppressWarnings("unchecked")
    @Override
    public void run() {
        try {
            String xPath = "//div[@class='con_one bg_grag']";
            HtmlPage page = webClient.getPage(URL_STRING);
            List<HtmlDivision> list = (List<HtmlDivision>) page.getByXPath(xPath);
            Iterator<HtmlDivision> ite = list.iterator();
            while (ite.hasNext()) {
                try {
                    ArticleInfo articleInfo = new ArticleInfo();
                    articleInfo.setSource(TECHWEB);
                    HtmlDivision division = ite.next();
                    List<HtmlAnchor> titleAnchorList = (List<HtmlAnchor>) division
                        .getByXPath(".//h2/a");
                    if (!CollectionUtils.isEmpty(titleAnchorList)) {
                        articleInfo.setTitle(titleAnchorList.get(0).asText());
                        articleInfo.setLinkUrl(titleAnchorList.get(0).getAttribute("href"));
                    }
                    List<HtmlImage> picImageList = (List<HtmlImage>) division
                        .getByXPath(".//div[@class='con_img']/a/img");
                    if (!CollectionUtils.isEmpty(picImageList)) {
                        articleInfo.setPicUrl(picImageList.get(0).getAttribute("src"));
                    } else {
                        articleInfo.setPicUrl(DEFAULT_PIC);
                    }
                    List<HtmlParagraph> descParagraphList = (List<HtmlParagraph>) division
                        .getByXPath(".//div[@class='con_txt']/p");
                    if (!CollectionUtils.isEmpty(descParagraphList)) {
                        articleInfo.setIntroduction(descParagraphList.get(0).asText());
                    }
                    List<HtmlSpan> dateSpanList = (List<HtmlSpan>) division
                        .getByXPath(".//div[@class='con_txt']/div[@class='time_tag']/span");
                    if (!CollectionUtils.isEmpty(dateSpanList)) {
                        articleInfo.setDate(dateSpanList.get(0).asText());
                    }
                    List<HtmlAnchor> tagAnchorList = (List<HtmlAnchor>) division
                        .getByXPath(".//div[@class='con_txt']/div[@class='time_tag']/span[@class='tag']/a");
                    if (!CollectionUtils.isEmpty(tagAnchorList)) {
                        articleInfo.setTag(tagAnchorList.get(0).asText());
                    }
                    saveArticle(articleInfo);
                } catch (Exception e) {
                    logger.error("techwebCrawler is exception:" + e.toString());
                }
            }
        } catch (Exception e) {
            logger.error("techwebCrawler is exception:" + e.toString());
        }
        webClient.closeAllWindows();
    }

    private void saveArticle(ArticleInfo articleInfo) {
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("title", articleInfo.getTitle());
        map.put("source", articleInfo.getSource());
        map.put("offset", 0);
        map.put("limit", 200);
        List<ArticleInfo> result = articleInfoManager.getArticleInfosByParams(map);
        if (CollectionUtils.isEmpty(result)) {
            articleInfoManager.addArticleInfo(articleInfo);
        }
    }

    private WebClient initWebClient() {
        WebClient webClient = new WebClient();
        webClient.getOptions().setUseInsecureSSL(true);
        webClient.getOptions().setCssEnabled(false);
        webClient.getOptions().setAppletEnabled(false);
        webClient.getOptions().setJavaScriptEnabled(true);
        webClient.getOptions().setThrowExceptionOnFailingStatusCode(false);
        webClient.getOptions().setThrowExceptionOnScriptError(false);
        int timeout = webClient.getOptions().getTimeout();
        webClient.getOptions().setTimeout(timeout * 10);
        return webClient;
    }

}
