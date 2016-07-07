//------------------------------------------------------------------------------
// <auto-generated>
//     Dieser Code wurde von einem Tool generiert.
//     Laufzeitversion:4.0.30319.42000
//
//     Änderungen an dieser Datei können falsches Verhalten verursachen und gehen verloren, wenn
//     der Code erneut generiert wird.
// </auto-generated>
//------------------------------------------------------------------------------

using NMF.Collections.Generic;
using NMF.Collections.ObjectModel;
using NMF.Expressions;
using NMF.Expressions.Linq;
using NMF.Models;
using NMF.Models.Collections;
using NMF.Models.Expressions;
using NMF.Models.Meta;
using NMF.Serialization;
using NMF.Utilities;
using System;
using System.Collections;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.ComponentModel;
using System.Diagnostics;
using System.Linq;

namespace TTC2016.LiveContest.Dataflow
{
    
    
    /// <summary>
    /// The default implementation of the GetFeature class
    /// </summary>
    [XmlNamespaceAttribute("http://transformation-tool-contest.eu/2016/dataflow")]
    [XmlNamespacePrefixAttribute("df")]
    [ModelRepresentationClassAttribute("http://transformation-tool-contest.eu/2016/dataflow#//GetFeature/")]
    [DebuggerDisplayAttribute("GetFeature {Name}")]
    public class GetFeature : Element, IGetFeature, IModelElement
    {
        
        /// <summary>
        /// The backing field for the ObjectField property
        /// </summary>
        private string _objectField;
        
        /// <summary>
        /// The backing field for the ValueField property
        /// </summary>
        private string _valueField;
        
        /// <summary>
        /// The backing field for the Feature property
        /// </summary>
        private string _feature;
        
        /// <summary>
        /// The objectField property
        /// </summary>
        [XmlElementNameAttribute("objectField")]
        [XmlAttributeAttribute(true)]
        public virtual string ObjectField
        {
            get
            {
                return this._objectField;
            }
            set
            {
                if ((this._objectField != value))
                {
                    string old = this._objectField;
                    this._objectField = value;
                    ValueChangedEventArgs e = new ValueChangedEventArgs(old, value);
                    this.OnObjectFieldChanged(e);
                    this.OnPropertyChanged("ObjectField", e);
                }
            }
        }
        
        /// <summary>
        /// The valueField property
        /// </summary>
        [XmlElementNameAttribute("valueField")]
        [XmlAttributeAttribute(true)]
        public virtual string ValueField
        {
            get
            {
                return this._valueField;
            }
            set
            {
                if ((this._valueField != value))
                {
                    string old = this._valueField;
                    this._valueField = value;
                    ValueChangedEventArgs e = new ValueChangedEventArgs(old, value);
                    this.OnValueFieldChanged(e);
                    this.OnPropertyChanged("ValueField", e);
                }
            }
        }
        
        /// <summary>
        /// The feature property
        /// </summary>
        [XmlElementNameAttribute("feature")]
        [XmlAttributeAttribute(true)]
        public virtual string Feature
        {
            get
            {
                return this._feature;
            }
            set
            {
                if ((this._feature != value))
                {
                    string old = this._feature;
                    this._feature = value;
                    ValueChangedEventArgs e = new ValueChangedEventArgs(old, value);
                    this.OnFeatureChanged(e);
                    this.OnPropertyChanged("Feature", e);
                }
            }
        }
        
        /// <summary>
        /// Gets the Class element that describes the structure of this type
        /// </summary>
        public new static NMF.Models.Meta.IClass ClassInstance
        {
            get
            {
                return NMF.Models.Repository.MetaRepository.Instance.ResolveClass("http://transformation-tool-contest.eu/2016/dataflow#//GetFeature/");
            }
        }
        
        /// <summary>
        /// Gets fired when the ObjectField property changed its value
        /// </summary>
        public event EventHandler<ValueChangedEventArgs> ObjectFieldChanged;
        
        /// <summary>
        /// Gets fired when the ValueField property changed its value
        /// </summary>
        public event EventHandler<ValueChangedEventArgs> ValueFieldChanged;
        
        /// <summary>
        /// Gets fired when the Feature property changed its value
        /// </summary>
        public event EventHandler<ValueChangedEventArgs> FeatureChanged;
        
        /// <summary>
        /// Raises the ObjectFieldChanged event
        /// </summary>
        /// <param name="eventArgs">The event data</param>
        protected virtual void OnObjectFieldChanged(ValueChangedEventArgs eventArgs)
        {
            EventHandler<ValueChangedEventArgs> handler = this.ObjectFieldChanged;
            if ((handler != null))
            {
                handler.Invoke(this, eventArgs);
            }
        }
        
        /// <summary>
        /// Raises the ValueFieldChanged event
        /// </summary>
        /// <param name="eventArgs">The event data</param>
        protected virtual void OnValueFieldChanged(ValueChangedEventArgs eventArgs)
        {
            EventHandler<ValueChangedEventArgs> handler = this.ValueFieldChanged;
            if ((handler != null))
            {
                handler.Invoke(this, eventArgs);
            }
        }
        
        /// <summary>
        /// Raises the FeatureChanged event
        /// </summary>
        /// <param name="eventArgs">The event data</param>
        protected virtual void OnFeatureChanged(ValueChangedEventArgs eventArgs)
        {
            EventHandler<ValueChangedEventArgs> handler = this.FeatureChanged;
            if ((handler != null))
            {
                handler.Invoke(this, eventArgs);
            }
        }
        
        /// <summary>
        /// Resolves the given attribute name
        /// </summary>
        /// <returns>The attribute value or null if it could not be found</returns>
        /// <param name="attribute">The requested attribute name</param>
        /// <param name="index">The index of this attribute</param>
        protected override object GetAttributeValue(string attribute, int index)
        {
            if ((attribute == "OBJECTFIELD"))
            {
                return this.ObjectField;
            }
            if ((attribute == "VALUEFIELD"))
            {
                return this.ValueField;
            }
            if ((attribute == "FEATURE"))
            {
                return this.Feature;
            }
            return base.GetAttributeValue(attribute, index);
        }
        
        /// <summary>
        /// Sets a value to the given feature
        /// </summary>
        /// <param name="feature">The requested feature</param>
        /// <param name="value">The value that should be set to that feature</param>
        protected override void SetFeature(string feature, object value)
        {
            if ((feature == "OBJECTFIELD"))
            {
                this.ObjectField = ((string)(value));
                return;
            }
            if ((feature == "VALUEFIELD"))
            {
                this.ValueField = ((string)(value));
                return;
            }
            if ((feature == "FEATURE"))
            {
                this.Feature = ((string)(value));
                return;
            }
            base.SetFeature(feature, value);
        }
        
        /// <summary>
        /// Gets the Class for this model element
        /// </summary>
        public override IClass GetClass()
        {
            return ((IClass)(NMF.Models.Repository.MetaRepository.Instance.Resolve("http://transformation-tool-contest.eu/2016/dataflow#//GetFeature/")));
        }
        
        /// <summary>
        /// Represents a proxy to represent an incremental access to the objectField property
        /// </summary>
        private sealed class ObjectFieldProxy : ModelPropertyChange<IGetFeature, string>
        {
            
            /// <summary>
            /// Creates a new observable property access proxy
            /// </summary>
            /// <param name="modelElement">The model instance element for which to create the property access proxy</param>
            public ObjectFieldProxy(IGetFeature modelElement) : 
                    base(modelElement)
            {
            }
            
            /// <summary>
            /// Gets or sets the value of this expression
            /// </summary>
            public override string Value
            {
                get
                {
                    return this.ModelElement.ObjectField;
                }
                set
                {
                    this.ModelElement.ObjectField = value;
                }
            }
            
            /// <summary>
            /// Registers an event handler to subscribe specifically on the changed event for this property
            /// </summary>
            /// <param name="handler">The handler that should be subscribed to the property change event</param>
            protected override void RegisterChangeEventHandler(System.EventHandler<NMF.Expressions.ValueChangedEventArgs> handler)
            {
                this.ModelElement.ObjectFieldChanged += handler;
            }
            
            /// <summary>
            /// Registers an event handler to subscribe specifically on the changed event for this property
            /// </summary>
            /// <param name="handler">The handler that should be unsubscribed from the property change event</param>
            protected override void UnregisterChangeEventHandler(System.EventHandler<NMF.Expressions.ValueChangedEventArgs> handler)
            {
                this.ModelElement.ObjectFieldChanged -= handler;
            }
        }
        
        /// <summary>
        /// Represents a proxy to represent an incremental access to the valueField property
        /// </summary>
        private sealed class ValueFieldProxy : ModelPropertyChange<IGetFeature, string>
        {
            
            /// <summary>
            /// Creates a new observable property access proxy
            /// </summary>
            /// <param name="modelElement">The model instance element for which to create the property access proxy</param>
            public ValueFieldProxy(IGetFeature modelElement) : 
                    base(modelElement)
            {
            }
            
            /// <summary>
            /// Gets or sets the value of this expression
            /// </summary>
            public override string Value
            {
                get
                {
                    return this.ModelElement.ValueField;
                }
                set
                {
                    this.ModelElement.ValueField = value;
                }
            }
            
            /// <summary>
            /// Registers an event handler to subscribe specifically on the changed event for this property
            /// </summary>
            /// <param name="handler">The handler that should be subscribed to the property change event</param>
            protected override void RegisterChangeEventHandler(System.EventHandler<NMF.Expressions.ValueChangedEventArgs> handler)
            {
                this.ModelElement.ValueFieldChanged += handler;
            }
            
            /// <summary>
            /// Registers an event handler to subscribe specifically on the changed event for this property
            /// </summary>
            /// <param name="handler">The handler that should be unsubscribed from the property change event</param>
            protected override void UnregisterChangeEventHandler(System.EventHandler<NMF.Expressions.ValueChangedEventArgs> handler)
            {
                this.ModelElement.ValueFieldChanged -= handler;
            }
        }
        
        /// <summary>
        /// Represents a proxy to represent an incremental access to the feature property
        /// </summary>
        private sealed class FeatureProxy : ModelPropertyChange<IGetFeature, string>
        {
            
            /// <summary>
            /// Creates a new observable property access proxy
            /// </summary>
            /// <param name="modelElement">The model instance element for which to create the property access proxy</param>
            public FeatureProxy(IGetFeature modelElement) : 
                    base(modelElement)
            {
            }
            
            /// <summary>
            /// Gets or sets the value of this expression
            /// </summary>
            public override string Value
            {
                get
                {
                    return this.ModelElement.Feature;
                }
                set
                {
                    this.ModelElement.Feature = value;
                }
            }
            
            /// <summary>
            /// Registers an event handler to subscribe specifically on the changed event for this property
            /// </summary>
            /// <param name="handler">The handler that should be subscribed to the property change event</param>
            protected override void RegisterChangeEventHandler(System.EventHandler<NMF.Expressions.ValueChangedEventArgs> handler)
            {
                this.ModelElement.FeatureChanged += handler;
            }
            
            /// <summary>
            /// Registers an event handler to subscribe specifically on the changed event for this property
            /// </summary>
            /// <param name="handler">The handler that should be unsubscribed from the property change event</param>
            protected override void UnregisterChangeEventHandler(System.EventHandler<NMF.Expressions.ValueChangedEventArgs> handler)
            {
                this.ModelElement.FeatureChanged -= handler;
            }
        }
    }
}

