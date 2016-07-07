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
    /// The default implementation of the NewInstance class
    /// </summary>
    [XmlNamespaceAttribute("http://transformation-tool-contest.eu/2016/dataflow")]
    [XmlNamespacePrefixAttribute("df")]
    [ModelRepresentationClassAttribute("http://transformation-tool-contest.eu/2016/dataflow#//NewInstance/")]
    [DebuggerDisplayAttribute("NewInstance {Name}")]
    public class NewInstance : Element, INewInstance, IModelElement
    {
        
        /// <summary>
        /// The backing field for the InstanceField property
        /// </summary>
        private string _instanceField;
        
        /// <summary>
        /// The backing field for the Model property
        /// </summary>
        private string _model;
        
        /// <summary>
        /// The backing field for the PackageName property
        /// </summary>
        private string _packageName;
        
        /// <summary>
        /// The backing field for the TypeName property
        /// </summary>
        private string _typeName;
        
        /// <summary>
        /// The backing field for the Key property
        /// </summary>
        private IExpression _key;
        
        /// <summary>
        /// The instanceField property
        /// </summary>
        [XmlElementNameAttribute("instanceField")]
        [XmlAttributeAttribute(true)]
        public virtual string InstanceField
        {
            get
            {
                return this._instanceField;
            }
            set
            {
                if ((this._instanceField != value))
                {
                    string old = this._instanceField;
                    this._instanceField = value;
                    ValueChangedEventArgs e = new ValueChangedEventArgs(old, value);
                    this.OnInstanceFieldChanged(e);
                    this.OnPropertyChanged("InstanceField", e);
                }
            }
        }
        
        /// <summary>
        /// The model property
        /// </summary>
        [XmlElementNameAttribute("model")]
        [XmlAttributeAttribute(true)]
        public virtual string Model
        {
            get
            {
                return this._model;
            }
            set
            {
                if ((this._model != value))
                {
                    string old = this._model;
                    this._model = value;
                    ValueChangedEventArgs e = new ValueChangedEventArgs(old, value);
                    this.OnModelChanged(e);
                    this.OnPropertyChanged("Model", e);
                }
            }
        }
        
        /// <summary>
        /// The packageName property
        /// </summary>
        [XmlElementNameAttribute("packageName")]
        [XmlAttributeAttribute(true)]
        public virtual string PackageName
        {
            get
            {
                return this._packageName;
            }
            set
            {
                if ((this._packageName != value))
                {
                    string old = this._packageName;
                    this._packageName = value;
                    ValueChangedEventArgs e = new ValueChangedEventArgs(old, value);
                    this.OnPackageNameChanged(e);
                    this.OnPropertyChanged("PackageName", e);
                }
            }
        }
        
        /// <summary>
        /// The typeName property
        /// </summary>
        [XmlElementNameAttribute("typeName")]
        [XmlAttributeAttribute(true)]
        public virtual string TypeName
        {
            get
            {
                return this._typeName;
            }
            set
            {
                if ((this._typeName != value))
                {
                    string old = this._typeName;
                    this._typeName = value;
                    ValueChangedEventArgs e = new ValueChangedEventArgs(old, value);
                    this.OnTypeNameChanged(e);
                    this.OnPropertyChanged("TypeName", e);
                }
            }
        }
        
        /// <summary>
        /// The key property
        /// </summary>
        [XmlElementNameAttribute("key")]
        [XmlAttributeAttribute(false)]
        [ContainmentAttribute()]
        public virtual IExpression Key
        {
            get
            {
                return this._key;
            }
            set
            {
                if ((this._key != value))
                {
                    IExpression old = this._key;
                    this._key = value;
                    if ((old != null))
                    {
                        old.Parent = null;
                        old.Deleted -= this.OnResetKey;
                    }
                    if ((value != null))
                    {
                        value.Parent = this;
                        value.Deleted += this.OnResetKey;
                    }
                    ValueChangedEventArgs e = new ValueChangedEventArgs(old, value);
                    this.OnKeyChanged(e);
                    this.OnPropertyChanged("Key", e);
                }
            }
        }
        
        /// <summary>
        /// Gets the child model elements of this model element
        /// </summary>
        public override IEnumerableExpression<IModelElement> Children
        {
            get
            {
                return base.Children.Concat(new NewInstanceChildrenCollection(this));
            }
        }
        
        /// <summary>
        /// Gets the referenced model elements of this model element
        /// </summary>
        public override IEnumerableExpression<IModelElement> ReferencedElements
        {
            get
            {
                return base.ReferencedElements.Concat(new NewInstanceReferencedElementsCollection(this));
            }
        }
        
        /// <summary>
        /// Gets the Class element that describes the structure of this type
        /// </summary>
        public new static NMF.Models.Meta.IClass ClassInstance
        {
            get
            {
                return NMF.Models.Repository.MetaRepository.Instance.ResolveClass("http://transformation-tool-contest.eu/2016/dataflow#//NewInstance/");
            }
        }
        
        /// <summary>
        /// Gets fired when the InstanceField property changed its value
        /// </summary>
        public event EventHandler<ValueChangedEventArgs> InstanceFieldChanged;
        
        /// <summary>
        /// Gets fired when the Model property changed its value
        /// </summary>
        public event EventHandler<ValueChangedEventArgs> ModelChanged;
        
        /// <summary>
        /// Gets fired when the PackageName property changed its value
        /// </summary>
        public event EventHandler<ValueChangedEventArgs> PackageNameChanged;
        
        /// <summary>
        /// Gets fired when the TypeName property changed its value
        /// </summary>
        public event EventHandler<ValueChangedEventArgs> TypeNameChanged;
        
        /// <summary>
        /// Gets fired when the Key property changed its value
        /// </summary>
        public event EventHandler<ValueChangedEventArgs> KeyChanged;
        
        /// <summary>
        /// Raises the InstanceFieldChanged event
        /// </summary>
        /// <param name="eventArgs">The event data</param>
        protected virtual void OnInstanceFieldChanged(ValueChangedEventArgs eventArgs)
        {
            EventHandler<ValueChangedEventArgs> handler = this.InstanceFieldChanged;
            if ((handler != null))
            {
                handler.Invoke(this, eventArgs);
            }
        }
        
        /// <summary>
        /// Raises the ModelChanged event
        /// </summary>
        /// <param name="eventArgs">The event data</param>
        protected virtual void OnModelChanged(ValueChangedEventArgs eventArgs)
        {
            EventHandler<ValueChangedEventArgs> handler = this.ModelChanged;
            if ((handler != null))
            {
                handler.Invoke(this, eventArgs);
            }
        }
        
        /// <summary>
        /// Raises the PackageNameChanged event
        /// </summary>
        /// <param name="eventArgs">The event data</param>
        protected virtual void OnPackageNameChanged(ValueChangedEventArgs eventArgs)
        {
            EventHandler<ValueChangedEventArgs> handler = this.PackageNameChanged;
            if ((handler != null))
            {
                handler.Invoke(this, eventArgs);
            }
        }
        
        /// <summary>
        /// Raises the TypeNameChanged event
        /// </summary>
        /// <param name="eventArgs">The event data</param>
        protected virtual void OnTypeNameChanged(ValueChangedEventArgs eventArgs)
        {
            EventHandler<ValueChangedEventArgs> handler = this.TypeNameChanged;
            if ((handler != null))
            {
                handler.Invoke(this, eventArgs);
            }
        }
        
        /// <summary>
        /// Raises the KeyChanged event
        /// </summary>
        /// <param name="eventArgs">The event data</param>
        protected virtual void OnKeyChanged(ValueChangedEventArgs eventArgs)
        {
            EventHandler<ValueChangedEventArgs> handler = this.KeyChanged;
            if ((handler != null))
            {
                handler.Invoke(this, eventArgs);
            }
        }
        
        /// <summary>
        /// Handles the event that the Key property must reset
        /// </summary>
        /// <param name="sender">The object that sent this reset request</param>
        /// <param name="eventArgs">The event data for the reset event</param>
        private void OnResetKey(object sender, EventArgs eventArgs)
        {
            this.Key = null;
        }
        
        /// <summary>
        /// Gets the relative URI fragment for the given child model element
        /// </summary>
        /// <returns>A fragment of the relative URI</returns>
        /// <param name="element">The element that should be looked for</param>
        protected override string GetRelativePathForNonIdentifiedChild(IModelElement element)
        {
            if ((element == this.Key))
            {
                return ModelHelper.CreatePath("Key");
            }
            return base.GetRelativePathForNonIdentifiedChild(element);
        }
        
        /// <summary>
        /// Resolves the given URI to a child model element
        /// </summary>
        /// <returns>The model element or null if it could not be found</returns>
        /// <param name="reference">The requested reference name</param>
        /// <param name="index">The index of this reference</param>
        protected override IModelElement GetModelElementForReference(string reference, int index)
        {
            if ((reference == "KEY"))
            {
                return this.Key;
            }
            return base.GetModelElementForReference(reference, index);
        }
        
        /// <summary>
        /// Resolves the given attribute name
        /// </summary>
        /// <returns>The attribute value or null if it could not be found</returns>
        /// <param name="attribute">The requested attribute name</param>
        /// <param name="index">The index of this attribute</param>
        protected override object GetAttributeValue(string attribute, int index)
        {
            if ((attribute == "INSTANCEFIELD"))
            {
                return this.InstanceField;
            }
            if ((attribute == "MODEL"))
            {
                return this.Model;
            }
            if ((attribute == "PACKAGENAME"))
            {
                return this.PackageName;
            }
            if ((attribute == "TYPENAME"))
            {
                return this.TypeName;
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
            if ((feature == "KEY"))
            {
                this.Key = ((IExpression)(value));
                return;
            }
            if ((feature == "INSTANCEFIELD"))
            {
                this.InstanceField = ((string)(value));
                return;
            }
            if ((feature == "MODEL"))
            {
                this.Model = ((string)(value));
                return;
            }
            if ((feature == "PACKAGENAME"))
            {
                this.PackageName = ((string)(value));
                return;
            }
            if ((feature == "TYPENAME"))
            {
                this.TypeName = ((string)(value));
                return;
            }
            base.SetFeature(feature, value);
        }
        
        /// <summary>
        /// Gets the property expression for the given attribute
        /// </summary>
        /// <returns>An incremental property expression</returns>
        /// <param name="attribute">The requested attribute in upper case</param>
        protected override NMF.Expressions.INotifyExpression<object> GetExpressionForAttribute(string attribute)
        {
            if ((attribute == "KEY"))
            {
                return new KeyProxy(this);
            }
            return base.GetExpressionForAttribute(attribute);
        }
        
        /// <summary>
        /// Gets the property expression for the given reference
        /// </summary>
        /// <returns>An incremental property expression</returns>
        /// <param name="reference">The requested reference in upper case</param>
        protected override NMF.Expressions.INotifyExpression<NMF.Models.IModelElement> GetExpressionForReference(string reference)
        {
            if ((reference == "KEY"))
            {
                return new KeyProxy(this);
            }
            return base.GetExpressionForReference(reference);
        }
        
        /// <summary>
        /// Gets the Class for this model element
        /// </summary>
        public override IClass GetClass()
        {
            return ((IClass)(NMF.Models.Repository.MetaRepository.Instance.Resolve("http://transformation-tool-contest.eu/2016/dataflow#//NewInstance/")));
        }
        
        /// <summary>
        /// The collection class to to represent the children of the NewInstance class
        /// </summary>
        public class NewInstanceChildrenCollection : ReferenceCollection, ICollectionExpression<IModelElement>, ICollection<IModelElement>
        {
            
            private NewInstance _parent;
            
            /// <summary>
            /// Creates a new instance
            /// </summary>
            public NewInstanceChildrenCollection(NewInstance parent)
            {
                this._parent = parent;
            }
            
            /// <summary>
            /// Gets the amount of elements contained in this collection
            /// </summary>
            public override int Count
            {
                get
                {
                    int count = 0;
                    if ((this._parent.Key != null))
                    {
                        count = (count + 1);
                    }
                    return count;
                }
            }
            
            protected override void AttachCore()
            {
                this._parent.KeyChanged += this.PropagateValueChanges;
            }
            
            protected override void DetachCore()
            {
                this._parent.KeyChanged -= this.PropagateValueChanges;
            }
            
            /// <summary>
            /// Adds the given element to the collection
            /// </summary>
            /// <param name="item">The item to add</param>
            public override void Add(IModelElement item)
            {
                if ((this._parent.Key == null))
                {
                    IExpression keyCasted = item.As<IExpression>();
                    if ((keyCasted != null))
                    {
                        this._parent.Key = keyCasted;
                        return;
                    }
                }
            }
            
            /// <summary>
            /// Clears the collection and resets all references that implement it.
            /// </summary>
            public override void Clear()
            {
                this._parent.Key = null;
            }
            
            /// <summary>
            /// Gets a value indicating whether the given element is contained in the collection
            /// </summary>
            /// <returns>True, if it is contained, otherwise False</returns>
            /// <param name="item">The item that should be looked out for</param>
            public override bool Contains(IModelElement item)
            {
                if ((item == this._parent.Key))
                {
                    return true;
                }
                return false;
            }
            
            /// <summary>
            /// Copies the contents of the collection to the given array starting from the given array index
            /// </summary>
            /// <param name="array">The array in which the elements should be copied</param>
            /// <param name="arrayIndex">The starting index</param>
            public override void CopyTo(IModelElement[] array, int arrayIndex)
            {
                if ((this._parent.Key != null))
                {
                    array[arrayIndex] = this._parent.Key;
                    arrayIndex = (arrayIndex + 1);
                }
            }
            
            /// <summary>
            /// Removes the given item from the collection
            /// </summary>
            /// <returns>True, if the item was removed, otherwise False</returns>
            /// <param name="item">The item that should be removed</param>
            public override bool Remove(IModelElement item)
            {
                if ((this._parent.Key == item))
                {
                    this._parent.Key = null;
                    return true;
                }
                return false;
            }
            
            /// <summary>
            /// Gets an enumerator that enumerates the collection
            /// </summary>
            /// <returns>A generic enumerator</returns>
            public override IEnumerator<IModelElement> GetEnumerator()
            {
                return Enumerable.Empty<IModelElement>().Concat(this._parent.Key).GetEnumerator();
            }
        }
        
        /// <summary>
        /// The collection class to to represent the children of the NewInstance class
        /// </summary>
        public class NewInstanceReferencedElementsCollection : ReferenceCollection, ICollectionExpression<IModelElement>, ICollection<IModelElement>
        {
            
            private NewInstance _parent;
            
            /// <summary>
            /// Creates a new instance
            /// </summary>
            public NewInstanceReferencedElementsCollection(NewInstance parent)
            {
                this._parent = parent;
            }
            
            /// <summary>
            /// Gets the amount of elements contained in this collection
            /// </summary>
            public override int Count
            {
                get
                {
                    int count = 0;
                    if ((this._parent.Key != null))
                    {
                        count = (count + 1);
                    }
                    return count;
                }
            }
            
            protected override void AttachCore()
            {
                this._parent.KeyChanged += this.PropagateValueChanges;
            }
            
            protected override void DetachCore()
            {
                this._parent.KeyChanged -= this.PropagateValueChanges;
            }
            
            /// <summary>
            /// Adds the given element to the collection
            /// </summary>
            /// <param name="item">The item to add</param>
            public override void Add(IModelElement item)
            {
                if ((this._parent.Key == null))
                {
                    IExpression keyCasted = item.As<IExpression>();
                    if ((keyCasted != null))
                    {
                        this._parent.Key = keyCasted;
                        return;
                    }
                }
            }
            
            /// <summary>
            /// Clears the collection and resets all references that implement it.
            /// </summary>
            public override void Clear()
            {
                this._parent.Key = null;
            }
            
            /// <summary>
            /// Gets a value indicating whether the given element is contained in the collection
            /// </summary>
            /// <returns>True, if it is contained, otherwise False</returns>
            /// <param name="item">The item that should be looked out for</param>
            public override bool Contains(IModelElement item)
            {
                if ((item == this._parent.Key))
                {
                    return true;
                }
                return false;
            }
            
            /// <summary>
            /// Copies the contents of the collection to the given array starting from the given array index
            /// </summary>
            /// <param name="array">The array in which the elements should be copied</param>
            /// <param name="arrayIndex">The starting index</param>
            public override void CopyTo(IModelElement[] array, int arrayIndex)
            {
                if ((this._parent.Key != null))
                {
                    array[arrayIndex] = this._parent.Key;
                    arrayIndex = (arrayIndex + 1);
                }
            }
            
            /// <summary>
            /// Removes the given item from the collection
            /// </summary>
            /// <returns>True, if the item was removed, otherwise False</returns>
            /// <param name="item">The item that should be removed</param>
            public override bool Remove(IModelElement item)
            {
                if ((this._parent.Key == item))
                {
                    this._parent.Key = null;
                    return true;
                }
                return false;
            }
            
            /// <summary>
            /// Gets an enumerator that enumerates the collection
            /// </summary>
            /// <returns>A generic enumerator</returns>
            public override IEnumerator<IModelElement> GetEnumerator()
            {
                return Enumerable.Empty<IModelElement>().Concat(this._parent.Key).GetEnumerator();
            }
        }
        
        /// <summary>
        /// Represents a proxy to represent an incremental access to the instanceField property
        /// </summary>
        private sealed class InstanceFieldProxy : ModelPropertyChange<INewInstance, string>
        {
            
            /// <summary>
            /// Creates a new observable property access proxy
            /// </summary>
            /// <param name="modelElement">The model instance element for which to create the property access proxy</param>
            public InstanceFieldProxy(INewInstance modelElement) : 
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
                    return this.ModelElement.InstanceField;
                }
                set
                {
                    this.ModelElement.InstanceField = value;
                }
            }
            
            /// <summary>
            /// Registers an event handler to subscribe specifically on the changed event for this property
            /// </summary>
            /// <param name="handler">The handler that should be subscribed to the property change event</param>
            protected override void RegisterChangeEventHandler(System.EventHandler<NMF.Expressions.ValueChangedEventArgs> handler)
            {
                this.ModelElement.InstanceFieldChanged += handler;
            }
            
            /// <summary>
            /// Registers an event handler to subscribe specifically on the changed event for this property
            /// </summary>
            /// <param name="handler">The handler that should be unsubscribed from the property change event</param>
            protected override void UnregisterChangeEventHandler(System.EventHandler<NMF.Expressions.ValueChangedEventArgs> handler)
            {
                this.ModelElement.InstanceFieldChanged -= handler;
            }
        }
        
        /// <summary>
        /// Represents a proxy to represent an incremental access to the model property
        /// </summary>
        private sealed class ModelProxy : ModelPropertyChange<INewInstance, string>
        {
            
            /// <summary>
            /// Creates a new observable property access proxy
            /// </summary>
            /// <param name="modelElement">The model instance element for which to create the property access proxy</param>
            public ModelProxy(INewInstance modelElement) : 
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
                    return this.ModelElement.Model;
                }
                set
                {
                    this.ModelElement.Model = value;
                }
            }
            
            /// <summary>
            /// Registers an event handler to subscribe specifically on the changed event for this property
            /// </summary>
            /// <param name="handler">The handler that should be subscribed to the property change event</param>
            protected override void RegisterChangeEventHandler(System.EventHandler<NMF.Expressions.ValueChangedEventArgs> handler)
            {
                this.ModelElement.ModelChanged += handler;
            }
            
            /// <summary>
            /// Registers an event handler to subscribe specifically on the changed event for this property
            /// </summary>
            /// <param name="handler">The handler that should be unsubscribed from the property change event</param>
            protected override void UnregisterChangeEventHandler(System.EventHandler<NMF.Expressions.ValueChangedEventArgs> handler)
            {
                this.ModelElement.ModelChanged -= handler;
            }
        }
        
        /// <summary>
        /// Represents a proxy to represent an incremental access to the packageName property
        /// </summary>
        private sealed class PackageNameProxy : ModelPropertyChange<INewInstance, string>
        {
            
            /// <summary>
            /// Creates a new observable property access proxy
            /// </summary>
            /// <param name="modelElement">The model instance element for which to create the property access proxy</param>
            public PackageNameProxy(INewInstance modelElement) : 
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
                    return this.ModelElement.PackageName;
                }
                set
                {
                    this.ModelElement.PackageName = value;
                }
            }
            
            /// <summary>
            /// Registers an event handler to subscribe specifically on the changed event for this property
            /// </summary>
            /// <param name="handler">The handler that should be subscribed to the property change event</param>
            protected override void RegisterChangeEventHandler(System.EventHandler<NMF.Expressions.ValueChangedEventArgs> handler)
            {
                this.ModelElement.PackageNameChanged += handler;
            }
            
            /// <summary>
            /// Registers an event handler to subscribe specifically on the changed event for this property
            /// </summary>
            /// <param name="handler">The handler that should be unsubscribed from the property change event</param>
            protected override void UnregisterChangeEventHandler(System.EventHandler<NMF.Expressions.ValueChangedEventArgs> handler)
            {
                this.ModelElement.PackageNameChanged -= handler;
            }
        }
        
        /// <summary>
        /// Represents a proxy to represent an incremental access to the typeName property
        /// </summary>
        private sealed class TypeNameProxy : ModelPropertyChange<INewInstance, string>
        {
            
            /// <summary>
            /// Creates a new observable property access proxy
            /// </summary>
            /// <param name="modelElement">The model instance element for which to create the property access proxy</param>
            public TypeNameProxy(INewInstance modelElement) : 
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
                    return this.ModelElement.TypeName;
                }
                set
                {
                    this.ModelElement.TypeName = value;
                }
            }
            
            /// <summary>
            /// Registers an event handler to subscribe specifically on the changed event for this property
            /// </summary>
            /// <param name="handler">The handler that should be subscribed to the property change event</param>
            protected override void RegisterChangeEventHandler(System.EventHandler<NMF.Expressions.ValueChangedEventArgs> handler)
            {
                this.ModelElement.TypeNameChanged += handler;
            }
            
            /// <summary>
            /// Registers an event handler to subscribe specifically on the changed event for this property
            /// </summary>
            /// <param name="handler">The handler that should be unsubscribed from the property change event</param>
            protected override void UnregisterChangeEventHandler(System.EventHandler<NMF.Expressions.ValueChangedEventArgs> handler)
            {
                this.ModelElement.TypeNameChanged -= handler;
            }
        }
        
        /// <summary>
        /// Represents a proxy to represent an incremental access to the key property
        /// </summary>
        private sealed class KeyProxy : ModelPropertyChange<INewInstance, IExpression>
        {
            
            /// <summary>
            /// Creates a new observable property access proxy
            /// </summary>
            /// <param name="modelElement">The model instance element for which to create the property access proxy</param>
            public KeyProxy(INewInstance modelElement) : 
                    base(modelElement)
            {
            }
            
            /// <summary>
            /// Gets or sets the value of this expression
            /// </summary>
            public override IExpression Value
            {
                get
                {
                    return this.ModelElement.Key;
                }
                set
                {
                    this.ModelElement.Key = value;
                }
            }
            
            /// <summary>
            /// Registers an event handler to subscribe specifically on the changed event for this property
            /// </summary>
            /// <param name="handler">The handler that should be subscribed to the property change event</param>
            protected override void RegisterChangeEventHandler(System.EventHandler<NMF.Expressions.ValueChangedEventArgs> handler)
            {
                this.ModelElement.KeyChanged += handler;
            }
            
            /// <summary>
            /// Registers an event handler to subscribe specifically on the changed event for this property
            /// </summary>
            /// <param name="handler">The handler that should be unsubscribed from the property change event</param>
            protected override void UnregisterChangeEventHandler(System.EventHandler<NMF.Expressions.ValueChangedEventArgs> handler)
            {
                this.ModelElement.KeyChanged -= handler;
            }
        }
    }
}

