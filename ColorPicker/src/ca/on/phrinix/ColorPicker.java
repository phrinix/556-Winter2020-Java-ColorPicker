package ca.on.phrinix;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
/**
 * Servlet Filter implementation class ColorPicker
 */
@WebFilter("/Output.jspx")
public class ColorPicker implements Filter {

    /**
     * Default constructor. 
     */
    public ColorPicker() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException 
	{
		int red;
		int green; 
		int blue;
		try{
			red = Integer.parseInt(request.getParameter("RED"));
			blue = Integer.parseInt(request.getParameter("BLUE"));
			green = Integer.parseInt(request.getParameter("GREEN"));
		}
		catch (Exception e)
		{
			throw new InvalidColourArgumentException(e);
		}
		if (red < 0 || red > 255)
		{
			throw new InvalidColourArgumentException("Red is not Vaild");
		}
		if (blue < 0 || blue > 255)
		{
			throw new InvalidColourArgumentException("Blue is not Valid");
		}
		if (green < 0 || green > 255)
		{
			throw new InvalidColourArgumentException("Green is not Valid");
		}
		request.setAttribute("red", red);
		request.setAttribute("green", green);
		request.setAttribute("blue", blue);
		
		
		chain.doFilter(request, response);
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
