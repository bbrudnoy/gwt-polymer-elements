package com.vaadin.components.gwt.polymer.client.sampler;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import com.google.gwt.core.shared.GWT;
import com.google.gwt.dom.client.SpanElement;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.event.logical.shared.ValueChangeEvent;
import com.google.gwt.event.logical.shared.ValueChangeHandler;
import com.google.gwt.resources.client.CssResource;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.History;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.FlowPanel;
import com.google.gwt.user.client.ui.HTMLPanel;
import com.google.gwt.user.client.ui.Widget;
import com.vaadin.components.gwt.polymer.client.sampler.gwt.PaperJavaAPI;
import com.vaadin.components.gwt.polymer.client.sampler.gwt.PaperTabsView;
import com.vaadin.components.gwt.polymer.client.sampler.gwt.PaperTabsWidgetView;
import com.vaadin.components.gwt.polymer.client.sampler.iron.IronCollapseSample;
import com.vaadin.components.gwt.polymer.client.sampler.iron.IronSelectorSample;
import com.vaadin.components.gwt.polymer.client.sampler.paper.ButtonSample;
import com.vaadin.components.gwt.polymer.client.sampler.paper.CheckboxSample;
import com.vaadin.components.gwt.polymer.client.sampler.paper.DialogSample;
import com.vaadin.components.gwt.polymer.client.sampler.paper.FabSample;
import com.vaadin.components.gwt.polymer.client.sampler.paper.HeaderPanelSample;
import com.vaadin.components.gwt.polymer.client.sampler.paper.IconButtonSample;
import com.vaadin.components.gwt.polymer.client.sampler.paper.InputSample;
import com.vaadin.components.gwt.polymer.client.sampler.paper.ItemSample;
import com.vaadin.components.gwt.polymer.client.sampler.paper.MaterialSample;
import com.vaadin.components.gwt.polymer.client.sampler.paper.MenuSample;
import com.vaadin.components.gwt.polymer.client.sampler.paper.ProgressSample;
import com.vaadin.components.gwt.polymer.client.sampler.paper.RadioButtonSample;
import com.vaadin.components.gwt.polymer.client.sampler.paper.RadioGroupSample;
import com.vaadin.components.gwt.polymer.client.sampler.paper.RippleSample;
import com.vaadin.components.gwt.polymer.client.sampler.paper.SliderSample;
import com.vaadin.components.gwt.polymer.client.sampler.paper.SpinnerSample;
import com.vaadin.components.gwt.polymer.client.sampler.paper.TabsSample;
import com.vaadin.components.gwt.polymer.client.sampler.paper.ToastSample;
import com.vaadin.components.gwt.polymer.client.sampler.paper.ToggleButtonSample;
import com.vaadin.components.gwt.polymer.client.sampler.paper.ToolbarSample;
import com.vaadin.polymer.Polymer;
import com.vaadin.polymer.PolymerWidget;
import com.vaadin.polymer.elemental.Function;
import com.vaadin.polymer.iron.widget.IronCollapse;
import com.vaadin.polymer.iron.widget.IronSelector;
import com.vaadin.polymer.paper.widget.PaperButton;
import com.vaadin.polymer.paper.widget.PaperDialog;
import com.vaadin.polymer.paper.widget.PaperDrawerPanel;
import com.vaadin.polymer.paper.widget.PaperItem;

public class Sampler extends Composite {

    public static final String REPO_PATH = "https://github.com/vaadin/gwt-polymer-elements/blob/master/demo/src/main/java/com/vaadin/components/gwt/polymer/client/sampler/";

    interface SamplerUiBinder extends UiBinder<HTMLPanel, Sampler> {
    }

    interface Style extends CssResource {
        String toolbar();
        String category();
        String item();
        String current();
        String buttons();
        String list();
    }

    private static SamplerUiBinder ourUiBinder = GWT.create(SamplerUiBinder.class);

    private Map<String, IronSelector> selectorMap = new HashMap<>();
    private TreeMap<String, IronCollapse> collapseMap = new TreeMap<>();
    private List<Item> items = new ArrayList<>();
    private Item currentItem;

    @UiField Style style;

    @UiField PaperDrawerPanel drawerPanel;
    @UiField FlowPanel listPanel;
    @UiField HTMLPanel content;
    @UiField SpanElement currentLabel;
    @UiField PaperDialog about;
    @UiField PaperButton xmlButton;

    public Sampler() {
        initWidget(ourUiBinder.createAndBindUi(this));


        addCategory("iron", "Iron Elements");
        addSample("Collapse", new IronCollapseSample(), "iron", "IronCollapseSample");
        addSample("Selector", new IronSelectorSample(), "iron", "IronSelectorSample");

        addCategory("paper", "Paper Elements");
        addSample("Button", new ButtonSample(), "paper", "ButtonSample");
        addSample("CheckBox", new CheckboxSample(), "paper", "CheckboxSample");
        addSample("Dialog", new DialogSample(), "paper", "DialogSample");
        // not suitable for current showcase. In original showcase it works inside iframe
//        addSample("DrawerPanel", new DrawerPanelSample(), "paper", "DrawerPanelSample");
        addSample("Fab", new FabSample(), "paper", "FabSample");
        addSample("HeaderPanel", new HeaderPanelSample(), "paper", "HeaderPanelSample");
        addSample("IconButton", new IconButtonSample(), "paper", "IconButtonSample");
        addSample("Item", new ItemSample(), "paper", "ItemSample");
        addSample("Input", new InputSample(), "paper", "InputSample");
        addSample("Material", new MaterialSample(), "paper", "MaterialSample");
        addSample("Menu", new MenuSample(), "paper", "MenuSample");
        addSample("Progress", new ProgressSample(), "paper", "ProgressSample");
        addSample("Radio Button", new RadioButtonSample(), "paper", "RadioButtonSample");
        addSample("Radio Group", new RadioGroupSample(), "paper", "RadioGroupSample");
        addSample("Ripple", new RippleSample(), "paper", "RippleSample");
        addSample("Spinner", new SpinnerSample(), "paper", "SpinnerSample");
        addSample("Slider", new SliderSample(), "paper", "SliderSample");
        addSample("Tabs", new TabsSample(), "paper", "TabsSample");
        addSample("Toast", new ToastSample(), "paper", "ToastSample");
        addSample("Toggle Button", new ToggleButtonSample(), "paper", "ToggleButtonSample");
        addSample("Toolbar", new ToolbarSample(), "paper", "ToolbarSample");

        addCategory("gwt", "Other");
        addSample("Element UiBinder", new PaperTabsView(), "gwt", "PaperTabsView");
        addSample("Widget UiBinder", new PaperTabsWidgetView(), "gwt", "PaperTabsWidgetView");
        addSample("Java API", new PaperJavaAPI(), "gwt", "PaperJavaAPI", false);

        History.addValueChangeHandler(new ValueChangeHandler<String>() {
            public void onValueChange(ValueChangeEvent<String> event) {
                selectItem(event.getValue());
            }
        });

        PolymerWidget last = collapseMap.lastEntry().getValue();
        Polymer.endLoading(this.getElement(), last.getElement());
        last.ready(new Function() {
            public Object call(Object arg) {
                selectItem(Window.Location.getHash().replace("#", ""));
                return null;
            }
        });
    }

    @UiHandler("xmlButton")
    protected void onXmlButton(ClickEvent e) {
        Window.open(REPO_PATH + currentItem.category + "/" + currentItem.path + ".ui.xml", "_blank", "");
    }
    @UiHandler("javaButton")
    protected void onJavaButton(ClickEvent e) {
        Window.open(REPO_PATH + currentItem.category + "/" + currentItem.path + ".java", "_blank", "");
    }

    @UiHandler({"logo1", "logo2", "logo3"})
    protected void onLogo(ClickEvent e) {
        about.toggle();
    }

    private void addCategory(String path, String name) {
        PaperItem item = new PaperItem("<iron-icon icon='expand-more'></iron-icon>" + name);
        item.addStyleName(style.category());

        final IronCollapse collapse = new IronCollapse("");
        item.addClickHandler(new ClickHandler() {
            public void onClick(ClickEvent event) {
                setOpened(collapse, !collapse.getOpened());
            }
        });

        IronSelector selector = new IronSelector("");
        collapse.add(selector);
        selectorMap.put(path, selector);
        collapseMap.put(path, collapse);

        listPanel.add(item);
        listPanel.add(collapse);
    }

    private void addSample(final String name, final Widget sample, String category, String path) {
        addSample(name, sample, category, path, true);
    }

    private void addSample(final String name, final Widget sample, String category, String path, boolean hasxml) {
        final int idx = content.getWidgetCount();
        content.add(sample);

        IronCollapse collapse = collapseMap.get(category);
        IronSelector selector = selectorMap.get(category);
        items.add(new Item(collapse, selector, category, path, idx, sample, name, hasxml));
    }

    private void selectItem(String hash) {
        String tmp[] = hash != null ? hash.split("/") : null;
        if (tmp == null || tmp.length < 2) {
            tmp = new String[]{"paper", "ButtonSample"};
        }
        for (Item i : items) {
            if (i.category == tmp[0] && i.path == tmp[1]) {
                // First time we select
                i.ready(o -> {
                    i.onClick(null);
                    return o;
                });
                return;
            }
        }
    }

    private void setOpened(IronCollapse collapse, boolean opened) {
        for (IronCollapse c : collapseMap.values()) {
            c.setOpened(c == collapse && opened);
        }
    }

    private class Item extends PaperItem implements ClickHandler {
        Widget sample;
        String category;
        IronCollapse collapse;
        IronSelector selector;
        String path;
        String name;
        int selectorIdx;
        boolean uixml;

        public Item(IronCollapse collapse, IronSelector selector, String category, String path, int idx, Widget sample, String name, boolean uixml) {
            super(name);
            this.collapse = collapse;
            this.selector = selector;
            this.category = category;
            this.path = path;
            this.name = name;
            this.sample = sample;
            this.uixml = uixml;
            selectorIdx = selector.getWidgetCount();
            selector.add(this);
            setName(name);
            addStyleName(style.item());
            addClickHandler(this);
        }

        public void onClick(ClickEvent event) {
            for (IronSelector s : selectorMap.values()) {
                s.setSelected("-1");
            }
            selector.getPolymerElement().setAttribute("selected", selectorIdx);
            content.clear();
            content.add(sample);
            currentItem = this;
            History.newItem(category + "/" + path, false);
            currentLabel.setInnerText(name);
            xmlButton.setVisible(uixml);
            if (drawerPanel.getNarrow()) {
                drawerPanel.closeDrawer();
            }
            setOpened(collapse, true);
        }
    }
}
