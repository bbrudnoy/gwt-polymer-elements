/*
 * This code was generated with Vaadin Web Component GWT API Generator, 
 * from paper-toggle-button project by The Polymer Authors
 * that is licensed with http://polymer.github.io/LICENSE.txt license.
 */
package com.vaadin.polymer.paper.widget;

import com.vaadin.polymer.paper.element.*;

import com.vaadin.polymer.change.widget.event.ChangeEvent;
import com.vaadin.polymer.change.widget.event.ChangeEventHandler;

import com.vaadin.polymer.iron.widget.event.IronChangeEvent;
import com.vaadin.polymer.iron.widget.event.IronChangeEventHandler;

import com.vaadin.polymer.PolymerWidget;
import com.vaadin.polymer.elemental.*;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.event.shared.HandlerRegistration;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * <p><code>paper-toggle-button</code> provides a ON/OFF switch that user can toggle the state<br>by tapping or by dragging the switch.</p>
 * <p>Example:</p>
 * <pre><code>&lt;paper-toggle-button&gt;&lt;/paper-toggle-button&gt;
 * 
 * 
 * </code></pre><h3 id="styling">Styling</h3>
 * <p>The following custom properties and mixins are available for styling:</p>
 * <table>
 * <thead>
 * <tr>
 * <th>Custom property</th>
 * <th>Description</th>
 * <th>Default</th>
 * </tr>
 * </thead>
 * <tbody>
 * <tr>
 * <td><code>--paper-toggle-button-unchecked-bar-color</code></td>
 * <td>Slider color when the input is not checked</td>
 * <td><code>#000000</code></td>
 * </tr>
 * <tr>
 * <td><code>--paper-toggle-button-unchecked-button-color</code></td>
 * <td>Button color when the input is not checked</td>
 * <td><code>--paper-grey-50</code></td>
 * </tr>
 * <tr>
 * <td><code>--paper-toggle-button-unchecked-ink-color</code></td>
 * <td>Selected/focus ripple color when the input is not checked</td>
 * <td><code>--dark-primary-color</code></td>
 * </tr>
 * <tr>
 * <td><code>--paper-toggle-button-checked-bar-color</code></td>
 * <td>Slider button color when the input is checked</td>
 * <td><code>--google-green-500</code></td>
 * </tr>
 * <tr>
 * <td><code>--paper-toggle-button-checked-button-color</code></td>
 * <td>Button color when the input is checked</td>
 * <td><code>--google-green-500</code></td>
 * </tr>
 * <tr>
 * <td><code>--paper-toggle-button-checked-ink-color</code></td>
 * <td>Selected/focus ripple color when the input is checked</td>
 * <td><code>--google-green-500</code></td>
 * </tr>
 * </tbody>
 * </table>
 */
public class PaperToggleButton extends PolymerWidget {
    /**
     * Default Constructor.
     */
    public PaperToggleButton() {
       this("");
    }

    /**
     * Constructor used by UIBinder to create widgets with content.
     */
    public PaperToggleButton(String html) {
        super(PaperToggleButtonElement.TAG, PaperToggleButtonElement.SRC, html);

        getPolymerElement().addEventListener(
                com.vaadin.polymer.change.element.event.ChangeEvent.NAME,
                new com.vaadin.polymer.change.element.event.ChangeEvent.Listener() {
            @Override
            protected void handleEvent(com.vaadin.polymer.change.element.event.ChangeEvent event) {
                fireEvent(new ChangeEvent(event));
            }
        });

        getPolymerElement().addEventListener(
                com.vaadin.polymer.iron.element.event.IronChangeEvent.NAME,
                new com.vaadin.polymer.iron.element.event.IronChangeEvent.Listener() {
            @Override
            protected void handleEvent(com.vaadin.polymer.iron.element.event.IronChangeEvent event) {
                fireEvent(new IronChangeEvent(event));
            }
        });

    }

    /**
     * Gets a handle to the Polymer object's underlying DOM element.
     */
    public PaperToggleButtonElement getPolymerElement() {
        return (PaperToggleButtonElement) getElement();
    }


  
    /**
     * <p>Gets or sets the state, <code>true</code> is checked and <code>false</code> is unchecked.</p>
     *
     * JavaScript Info:
     * @property checked
     * @type Boolean
     * 
     */
    public boolean getChecked(){
        return getPolymerElement().getChecked();
    }
    /**
     * <p>Gets or sets the state, <code>true</code> is checked and <code>false</code> is unchecked.</p>
     *
     * JavaScript Info:
     * @property checked
     * @type Boolean
     * 
     */
    public void setChecked(boolean value) {
        getPolymerElement().setChecked(value);
    }
   
  

  
    /**
     * <p>If true, the button toggles the active state with each tap or press<br>of the spacebar.</p>
     *
     * JavaScript Info:
     * @property toggles
     * @type Boolean
     * 
     */
    public boolean getToggles(){
        return getPolymerElement().getToggles();
    }
    /**
     * <p>If true, the button toggles the active state with each tap or press<br>of the spacebar.</p>
     *
     * JavaScript Info:
     * @property toggles
     * @type Boolean
     * 
     */
    public void setToggles(boolean value) {
        getPolymerElement().setToggles(value);
    }
   
  

  
    /**
     * 
     *
     * JavaScript Info:
     * @property hostAttributes
     * @type Object
     * 
     */
    public JavaScriptObject getHostAttributes(){
        return getPolymerElement().getHostAttributes();
    }
    /**
     * 
     *
     * JavaScript Info:
     * @property hostAttributes
     * @type Object
     * 
     */
    public void setHostAttributes(JavaScriptObject value) {
        getPolymerElement().setHostAttributes(value);
    }
   
  

  
    /**
     * 
     *
     * JavaScript Info:
     * @property listeners
     * @type Object
     * 
     */
    public JavaScriptObject getListeners(){
        return getPolymerElement().getListeners();
    }
    /**
     * 
     *
     * JavaScript Info:
     * @property listeners
     * @type Object
     * 
     */
    public void setListeners(JavaScriptObject value) {
        getPolymerElement().setListeners(value);
    }
   
  

  
    /**
     * 
     *
     * JavaScript Info:
     * @property observers
     * @type Array
     * @behavior PaperToggleButton
     */
    public JsArray getObservers(){
        return getPolymerElement().getObservers();
    }
    /**
     * 
     *
     * JavaScript Info:
     * @property observers
     * @type Array
     * @behavior PaperToggleButton
     */
    public void setObservers(JsArray value) {
        getPolymerElement().setObservers(value);
    }
   
  

  
    /**
     * <p>If true, the button is a toggle and is currently in the active state.</p>
     *
     * JavaScript Info:
     * @property active
     * @type Boolean
     * @behavior PaperToggleButton
     */
    public boolean getActive(){
        return getPolymerElement().getActive();
    }
    /**
     * <p>If true, the button is a toggle and is currently in the active state.</p>
     *
     * JavaScript Info:
     * @property active
     * @type Boolean
     * @behavior PaperToggleButton
     */
    public void setActive(boolean value) {
        getPolymerElement().setActive(value);
    }
   
  

  
    /**
     * 
     *
     * JavaScript Info:
     * @property keyBindings
     * @type Object
     * @behavior PaperToggleButton
     */
    public JavaScriptObject getKeyBindings(){
        return getPolymerElement().getKeyBindings();
    }
    /**
     * 
     *
     * JavaScript Info:
     * @property keyBindings
     * @type Object
     * @behavior PaperToggleButton
     */
    public void setKeyBindings(JavaScriptObject value) {
        getPolymerElement().setKeyBindings(value);
    }
   
  

  
    /**
     * <p>True if the element is currently being pressed by a “pointer,” which<br>is loosely defined as mouse or touch input (but specifically excluding<br>keyboard input).</p>
     *
     * JavaScript Info:
     * @property pointerDown
     * @type Boolean
     * @behavior PaperToggleButton
     */
    public boolean getPointerDown(){
        return getPolymerElement().getPointerDown();
    }
    /**
     * <p>True if the element is currently being pressed by a “pointer,” which<br>is loosely defined as mouse or touch input (but specifically excluding<br>keyboard input).</p>
     *
     * JavaScript Info:
     * @property pointerDown
     * @type Boolean
     * @behavior PaperToggleButton
     */
    public void setPointerDown(boolean value) {
        getPolymerElement().setPointerDown(value);
    }
   
  

  
    /**
     * <p>If true, the user is currently holding down the button.</p>
     *
     * JavaScript Info:
     * @property pressed
     * @type Boolean
     * @behavior PaperToggleButton
     */
    public boolean getPressed(){
        return getPolymerElement().getPressed();
    }
    /**
     * <p>If true, the user is currently holding down the button.</p>
     *
     * JavaScript Info:
     * @property pressed
     * @type Boolean
     * @behavior PaperToggleButton
     */
    public void setPressed(boolean value) {
        getPolymerElement().setPressed(value);
    }
   
  

  
    /**
     * <p>True if the input device that caused the element to receive focus<br>was a keyboard.</p>
     *
     * JavaScript Info:
     * @property receivedFocusFromKeyboard
     * @type Boolean
     * @behavior PaperToggleButton
     */
    public boolean getReceivedFocusFromKeyboard(){
        return getPolymerElement().getReceivedFocusFromKeyboard();
    }
    /**
     * <p>True if the input device that caused the element to receive focus<br>was a keyboard.</p>
     *
     * JavaScript Info:
     * @property receivedFocusFromKeyboard
     * @type Boolean
     * @behavior PaperToggleButton
     */
    public void setReceivedFocusFromKeyboard(boolean value) {
        getPolymerElement().setReceivedFocusFromKeyboard(value);
    }
   
  

  
    /**
     * <p>Can be used to imperatively add a key binding to the implementing<br>element. This is the imperative equivalent of declaring a keybinding<br>in the <code>keyBindings</code> prototype property.</p>
     *
     * JavaScript Info:
     * @method addOwnKeyBinding
     * @param {} eventString  
     * @param {} handlerName  
     * @behavior PaperTabs
     */
    public void addOwnKeyBinding(JavaScriptObject eventString, JavaScriptObject handlerName) {
        getPolymerElement().addOwnKeyBinding(eventString, handlerName);
    }
  

  
    /**
     * <p>The HTMLElement that will be firing relevant KeyboardEvents.</p>
     *
     * JavaScript Info:
     * @property keyEventTarget
     * @type Object
     * @behavior PaperTabs
     */
    public JavaScriptObject getKeyEventTarget(){
        return getPolymerElement().getKeyEventTarget();
    }
    /**
     * <p>The HTMLElement that will be firing relevant KeyboardEvents.</p>
     *
     * JavaScript Info:
     * @property keyEventTarget
     * @type Object
     * @behavior PaperTabs
     */
    public void setKeyEventTarget(JavaScriptObject value) {
        getPolymerElement().setKeyEventTarget(value);
    }
   
    /**
     * <p>The HTMLElement that will be firing relevant KeyboardEvents.</p>
     *
     * JavaScript Info:
     * @attribute key-event-target
     * @behavior PaperTabs
     */
    public void setKeyEventTarget(String value) {
        getPolymerElement().setAttribute("key-event-target", value);
    }
   
  

  
    /**
     * 
     *
     * JavaScript Info:
     * @method keyboardEventMatchesKeys
     * @param {} event  
     * @param {} eventString  
     * @behavior PaperTabs
     */
    public void keyboardEventMatchesKeys(JavaScriptObject event, JavaScriptObject eventString) {
        getPolymerElement().keyboardEventMatchesKeys(event, eventString);
    }
  

  
    /**
     * <p>When called, will remove all imperatively-added key bindings.</p>
     *
     * JavaScript Info:
     * @method removeOwnKeyBindings
     * @behavior PaperTabs
     */
    public void removeOwnKeyBindings() {
        getPolymerElement().removeOwnKeyBindings();
    }
  

  
    /**
     * 
     *
     * JavaScript Info:
     * @method attached
     * @behavior PaperTabs
     */
    public void attached() {
        getPolymerElement().attached();
    }
  

  
    /**
     * 
     *
     * JavaScript Info:
     * @method detached
     * @behavior PaperTabs
     */
    public void detached() {
        getPolymerElement().detached();
    }
  

  
    /**
     * 
     *
     * JavaScript Info:
     * @method registered
     * @behavior PaperTabs
     */
    public void registered() {
        getPolymerElement().registered();
    }
  

  
    /**
     * <p>If true, the user cannot interact with this element.</p>
     *
     * JavaScript Info:
     * @property disabled
     * @type Boolean
     * @behavior PaperInput
     */
    public boolean getDisabled(){
        return getPolymerElement().getDisabled();
    }
    /**
     * <p>If true, the user cannot interact with this element.</p>
     *
     * JavaScript Info:
     * @property disabled
     * @type Boolean
     * @behavior PaperInput
     */
    public void setDisabled(boolean value) {
        getPolymerElement().setDisabled(value);
    }
   
  

  
    /**
     * <p>If true, the element currently has focus.</p>
     *
     * JavaScript Info:
     * @property focused
     * @type Boolean
     * @behavior PaperInput
     */
    public boolean getFocused(){
        return getPolymerElement().getFocused();
    }
    /**
     * <p>If true, the element currently has focus.</p>
     *
     * JavaScript Info:
     * @property focused
     * @type Boolean
     * @behavior PaperInput
     */
    public void setFocused(boolean value) {
        getPolymerElement().setFocused(value);
    }
   
  


    /**
     * <p>Fired when the checked state changes due to user interaction.</p>
     *
     * JavaScript Info:
     * @event change
     */
    public HandlerRegistration addChangeHandler(ChangeEventHandler handler) {
        return addHandler(handler, ChangeEvent.TYPE);
    }

    /**
     * <p>Fired when the checked state changes.</p>
     *
     * JavaScript Info:
     * @event iron-change
     */
    public HandlerRegistration addIronChangeHandler(IronChangeEventHandler handler) {
        return addHandler(handler, IronChangeEvent.TYPE);
    }

}
