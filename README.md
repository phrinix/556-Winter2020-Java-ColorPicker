# 556-Winter2020-JavaScript-ColorPicker

# Handling Errors and Exceptions 

Create a web application that allows the user to specify Red, Green, and Blue colour components. When the user submits their selection, the program displays a message stating the values selected and shows a box with the selected colour (as shown above).

The initial JSP should use an HTML form for the colour value submission and send these values to a filter. The form should use the post request method. The filter will then validate the colour values and if they are invalid (use try...catch) or outside the range 0-255, the program will throw a custom exception called InvalidColourArgumentException (wrapping the original exception). This exception should inherit from ServletException so that it can be thrown out of the filter and handled by the container. Then create an error response page that states the proper use of colour values (e.g. 'Colour values must be integer values in the range 0-255 blah blah blah'). Then in the deployment descriptor file (web.xml), specify this page as the error response page for the InvalidColourArgumentException exception. Remember to use a fully qualified exception class name (i.e., include both package and class name).

As is the case with filters, the exception class should be in a package. If there is no error, then the filter should carry on to the output jspx page sending the three colour values using request attributes. Be sure to put the filter into a package.

The initial JSP page should also have three links that send the colours GOLD (red=204, green=167, blue=55), PINK (red=255, green=128, blue=192), and BROWN (red=128, green=64, blue=0) to the filter using url-encoded parameters.

The second JSP should display a message similar to the one shown above. Use a <div> tag to generate the colour box. A CSS style sheet can be used to specify the width and height of the box. However, you will need to use an inline style to specify the colour. To specify an inline style, use the style attribute within the <div> tag. E.g., to specify a background colour of red, you would use style="background-color: rgb(255,0,0);". You will, however, have to insert the colour values from the request attributes. Note that all other CSS style values should be specified in a CSS file and linked to the document.

Use JSP documents (i.e. .jspx) for the JSPs which should validate as valid XHTML 1.1.
