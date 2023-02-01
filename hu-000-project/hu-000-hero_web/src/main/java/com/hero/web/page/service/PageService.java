package com.hero.web.page.service;

import java.util.Map;

public interface PageService {
  Map<String, Object> findPageAllDataBySpuId(String paramString);
  
  void createStaticPage(Map<String, Object> paramMap, String paramString) throws Exception;
}


/* Location:              /Users/husx/temp/hero_web-1.0-SNAPSHOT-default.jar!/BOOT-INF/classes/com/hero/web/page/service/PageService.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */