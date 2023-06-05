# Custom Views

## NOTES

- Why do you need to override onSizeChanged()?
  - When onSizeChanged() is called for the first time, 
  - the correct size for the canvas has been calculated and is now available for use.
- What happens if you get the size of the canvas in onCreate()?
  - In onCreate(), the size of the canvas is returned as 0,0 
  - because its size has not been determined yet
- Why do you override performClick()? What happens if you override onClickListener() instead?
  - The performClick() method calls onClickListener(). 
  - If you override performClick(), another contributor can still override onClickListener(). 
  - For example, if you create a custom view and make it available through a library for use or subclassing, 
  - its user can add their own click handling through onClickListener().

## Steps

- Subclass an existing view and override methods
- Create a subclass of View to customize everything
- Override View methods such as onDraw()
- Use invalidate() to force a draw or redraw of the view
- Allocate space and initialize variables outside the onDraw() method
- Override performClick() rather than onClickListener()
- Use xml layout file
- Create attrs.xml file to define custom attributes

