package com.crm.qa.util;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.events.WebDriverEventListener;

import com.crm.qa.base.TestBase;

@SuppressWarnings("deprecation")
public class WebEventListener extends TestBase implements WebDriverEventListener {
	
	public void beforeNavigateTo(String url, WebDriver driver) {
		System.out.println("Before Navigating To:'"+url+ " '");
	}
    
	public void afterNavigateTo(String url, WebDriver driver) {
		System.out.println(" Navigated To:'"+url+ " '");
	}
	public void beforeChangeValueOf(WebElement element, WebDriver driver) {
		System.out.println("Value Of The:" +element.toString()+ "Before Any Changes Mode");
	}
	
	public void afterChangeValueOf(WebElement element, WebDriver driver) {
		System.out.println("Element Value Change To:" +element.toString());
	}
	
	public void beforeClickOn(WebElement element, WebDriver driver) {
		System.out.println("Trying to Click On:" +element.toString());
	}
	
	public void afterClickOn(WebElement element, WebDriver driver) {
		System.out.println("Clicked On:" +element.toString());
	}
	
	public void beforeNavigateBack(WebDriver driver) {
		System.out.println("Navigating Back To Previous Page ");
	}
	
	public void afterNavigateBack(WebDriver driver) {
		System.out.println("Navigated Back To Previous Page ");
	}
	
	public void beforeNavigateForward(WebDriver driver) {
		System.out.println("Navigating Forward to Next Page ");
	}
	
	public void afterNavigateForward(WebDriver driver) {
		System.out.println("Navigated Forward to Next Page ");
	}
	
	public void onException(Throwable error, WebDriver driver) {
        System.out.println("Exception Occured: "+ error);
	
	try {
		TestUtil.takeScreenshotAtEndOfTest();
	}
	catch(IOException e)
	{
		e.printStackTrace();
	}
}
	
	public void beforeFindBy(By by, WebElement element, WebDriver driver) {
        System.out.println("Trying to Find Element By:" +by.toString());
	}
	
	public void afterFindBy(By by, WebElement element, WebDriver driver) {
        System.out.println("Found Element By:" +by.toString());
	}
	
	//Non Overriden Methods Of WebListener Class
	
	  public void beforeScript(String script, WebDriver driver) {
	   
	    }
	
	  public void afterScript(String script, WebDriver driver) {
		    
		    }
	
	  public void beforeAlertAccept(WebDriver driver) {
		   
		    }
	
	  public void afterAlertAccept(WebDriver driver) {
		    
		    }
	
	  public void afterAlertDismiss(WebDriver driver) {
		    
		    }
	  
	  public void beforeAlertDismiss(WebDriver driver) {
		    
	    }
	  
	  public void beforeNavigateRefresh(WebDriver driver) {
	  
	  }
	  public void afterNavigateRefresh(WebDriver driver) {
		  
	  }
	  
	  public void beforeChangeValueOf(WebElement element, WebDriver driver,
	            CharSequence[] keysToSend) {
	  
	  }
	  
	  public void afterChangeValueOf(WebElement element, WebDriver driver,
	            CharSequence[] keysToSend) {
	  
	  }

	@Override
	public void beforeSwitchToWindow(String windowName, WebDriver driver) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void afterSwitchToWindow(String windowName, WebDriver driver) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public <X> void beforeGetScreenshotAs(OutputType<X> target) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public <X> void afterGetScreenshotAs(OutputType<X> target, X screenshot) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void beforeGetText(WebElement element, WebDriver driver) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void afterGetText(WebElement element, WebDriver driver, String text) {
		// TODO Auto-generated method stub
		
	}
}



