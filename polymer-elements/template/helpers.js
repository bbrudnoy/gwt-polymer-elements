module.exports = {
  javaKeywords: ['for', 'switch'], // TODO: if it's necessary add other keywords as well
  className: function () {
    return this.camelCase(this['name']);
  },
  baseClassName: function () {
    return this['extends'] ? this.camelCase(this['extends']) : 'PolymerElement';
  },
  camelCase: function(s) {
    return (s || '').toLowerCase().replace(/(\b|-)\w/g, function (m) {
      return m.toUpperCase().replace(/-/, '');
    });
  },
  computeType: function(type) {
    if (type === 'string' || type === 'String') return 'String';
    if (type === 'boolean') return 'boolean';
    if (type === 'array') return 'JsArray';
    if (type === 'element' || type === 'Element') return 'Element';
    if (type === 'number' || type === 'Number') return 'double';
    return "Object";
  },
  hasEvents: function() {
    return !!this.events;
  },
  hasAttributes: function() {
    return !!this.attributes;
  },
  hasProperties: function() {
    return !!this.properties;
  },
  hasMethods: function() {
    return !!this.methods;
  },
  hasParams: function() {
    return !!this.params;
  },
  capitalizeFirstLetter: function(string) {
    return string.charAt(0).toUpperCase() + string.slice(1);
  },
  computeGetter: function(item) {
    var name = item.name;
    if (this.startsWith(name, "detail.")) {
      name = name.substring("detail.".length);
    }
    if (this.javaKeywords.indexOf(name) >= 0) {
      var prefix = item.type === 'boolean' ? 'is' : 'get';
      return prefix + name;
    } else {
      return name;
    }
  },
  computeSetter: function(item) {
    if (this.javaKeywords.indexOf(item.name) >= 0) {
      return 'set' + item.name;
    } else {
      return item.name;
    }
  },
  startsWith: function (str, substr){
    return str.indexOf(substr) === 0;
  }
};