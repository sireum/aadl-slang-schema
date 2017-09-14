// #Sireum
// @formatter:off

/*
 Copyright (c) 2017, Robby, Kansas State University
 All rights reserved.

 Redistribution and use in source and binary forms, with or without
 modification, are permitted provided that the following conditions are met:

 1. Redistributions of source code must retain the above copyright notice, this
    list of conditions and the following disclaimer.
 2. Redistributions in binary form must reproduce the above copyright notice,
    this list of conditions and the following disclaimer in the documentation
    and/or other materials provided with the distribution.

 THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND
 ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED
 WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE LIABLE FOR
 ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES
 (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES;
 LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND
 ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
 (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */

// This file is auto-generated from AadlAST.scala

package org.sireum.lang.ast

import org.sireum._
import org.sireum.Json.Printer._

object JSON {

  object Printer {

    @pure def printAadlXml(o: AadlXml): ST = {
      return printObject(ISZ(
        ("type", st""""AadlXml""""),
        ("components", printISZ(T, o.components, printString))
      ))
    }

    @pure def printComponent(o: Component): ST = {
      return printObject(ISZ(
        ("type", st""""Component""""),
        ("identifier", printString(o.identifier)),
        ("category", printCategory(o.category)),
        ("classifier", printClassifier(o.classifier)),
        ("features", printISZ(F, o.features, printFeature)),
        ("subComponents", printISZ(F, o.subComponents, printComponent)),
        ("connections", printISZ(F, o.connections, printConnection)),
        ("properties", printISZ(F, o.properties, printProperty)),
        ("flows", printISZ(F, o.flows, printFlow)),
        ("modes", printISZ(F, o.modes, printMode)),
        ("annexes", printISZ(F, o.annexes, printAnnex))
      ))
    }

    @pure def printClassifier(o: Classifier): ST = {
      return printObject(ISZ(
        ("type", st""""Classifier"""")
      ))
    }

    @pure def printCategory(o: Category.Type): ST = {
      val value: String = o match {
        case Category.Abstract => "Abstract"
        case Category.Bus => "Bus"
        case Category.Data => "Data"
        case Category.Device => "Device"
        case Category.Process => "Process"
        case Category.Processor => "Processor"
        case Category.Thread => "Thread"
        case Category.Port => "Port"
        case Category.Subprogram => "Subprogram"
        case Category.System => "System"
        case Category.VirtualBus => "VirtualBus"
        case Category.VirtualProcessor => "VirtualProcessor"
      }
      return printObject(ISZ(
        ("type", printString("Category")),
        ("value", printString(value))
      ))
    }

    @pure def printFeature(o: Feature): ST = {
      return printObject(ISZ(
        ("type", st""""Feature""""),
        ("identifier", printString(o.identifier)),
        ("direction", printDirection(o.direction)),
        ("typ", printTyp(o.typ)),
        ("classifier", printClassifier(o.classifier)),
        ("properties", printISZ(F, o.properties, printProperty))
      ))
    }

    @pure def printDirection(o: Direction.Type): ST = {
      val value: String = o match {
        case Direction.In => "In"
        case Direction.Out => "Out"
        case Direction.InOut => "InOut"
        case Direction.None => "None"
      }
      return printObject(ISZ(
        ("type", printString("Direction")),
        ("value", printString(value))
      ))
    }

    @pure def printTyp(o: Typ.Type): ST = {
      val value: String = o match {
        case Typ.Acccess => "Acccess"
        case Typ.Data => "Data"
        case Typ.Event => "Event"
        case Typ.EventData => "EventData"
        case Typ.Feature => "Feature"
      }
      return printObject(ISZ(
        ("type", printString("Typ")),
        ("value", printString(value))
      ))
    }

    @pure def printConnection(o: Connection): ST = {
      return printObject(ISZ(
        ("type", st""""Connection""""),
        ("name", printString(o.name)),
        ("src", printEndPoint(o.src)),
        ("dst", printEndPoint(o.dst)),
        ("properties", printISZ(F, o.properties, printProperty))
      ))
    }

    @pure def printEndPoint(o: EndPoint): ST = {
      return printObject(ISZ(
        ("type", st""""EndPoint""""),
        ("component", printString(o.component)),
        ("feature", printString(o.feature))
      ))
    }

    @pure def printProperty(o: Property): ST = {
      return printObject(ISZ(
        ("type", st""""Property""""),
        ("name", printString(o.name)),
        ("propertyValues", printISZ(F, o.propertyValues, printPropertyValue))
      ))
    }

    @pure def printPropertyValue(o: PropertyValue): ST = {
      o match {
        case o: PropertyValue.ClassifierProp => return printPropertyValueClassifierProp(o)
        case o: PropertyValue.UnitProp => return printPropertyValueUnitProp(o)
        case o: PropertyValue.RangeProp => return printPropertyValueRangeProp(o)
      }
    }

    @pure def printPropertyValueClassifierProp(o: PropertyValue.ClassifierProp): ST = {
      return printObject(ISZ(
        ("type", st""""PropertyValue.ClassifierProp""""),
        ("name", printString(o.name))
      ))
    }

    @pure def printPropertyValueUnitProp(o: PropertyValue.UnitProp): ST = {
      return printObject(ISZ(
        ("type", st""""PropertyValue.UnitProp""""),
        ("value", printString(o.value)),
        ("unit", printString(o.unit))
      ))
    }

    @pure def printPropertyValueRangeProp(o: PropertyValue.RangeProp): ST = {
      return printObject(ISZ(
        ("type", st""""PropertyValue.RangeProp""""),
        ("ValueLow", printString(o.ValueLow)),
        ("ValueHigh", printString(o.ValueHigh)),
        ("Unit", printString(o.Unit))
      ))
    }

    @pure def printMode(o: Mode): ST = {
      return printObject(ISZ(
        ("type", st""""Mode""""),
        ("name", printString(o.name))
      ))
    }

    @pure def printFlow(o: Flow): ST = {
      return printObject(ISZ(
        ("type", st""""Flow""""),
        ("name", printString(o.name))
      ))
    }

    @pure def printAnnex(o: Annex): ST = {
      return printObject(ISZ(
        ("type", st""""Annex""""),
        ("name", printString(o.name))
      ))
    }

  }

  @record class Parser(input: String) {
    val parser: Json.Parser = Json.Parser.create(input)

    def parseAadlXml(): AadlXml = {
      val r = parseAadlXmlT(F)
      return r
    }

    def parseAadlXmlT(typeParsed: B): AadlXml = {
      if (!typeParsed) {
        parser.parseObjectType("AadlXml")
      }
      parser.parseObjectKey("components")
      val components = parser.parseISZ(parser.parseString _)
      parser.parseObjectNext()
      return AadlXml(components)
    }

    def parseComponent(): Component = {
      val r = parseComponentT(F)
      return r
    }

    def parseComponentT(typeParsed: B): Component = {
      if (!typeParsed) {
        parser.parseObjectType("Component")
      }
      parser.parseObjectKey("identifier")
      val identifier = parser.parseString()
      parser.parseObjectNext()
      parser.parseObjectKey("category")
      val category = parseCategory()
      parser.parseObjectNext()
      parser.parseObjectKey("classifier")
      val classifier = parseClassifier()
      parser.parseObjectNext()
      parser.parseObjectKey("features")
      val features = parser.parseISZ(parseFeature _)
      parser.parseObjectNext()
      parser.parseObjectKey("subComponents")
      val subComponents = parser.parseISZ(parseComponent _)
      parser.parseObjectNext()
      parser.parseObjectKey("connections")
      val connections = parser.parseISZ(parseConnection _)
      parser.parseObjectNext()
      parser.parseObjectKey("properties")
      val properties = parser.parseISZ(parseProperty _)
      parser.parseObjectNext()
      parser.parseObjectKey("flows")
      val flows = parser.parseISZ(parseFlow _)
      parser.parseObjectNext()
      parser.parseObjectKey("modes")
      val modes = parser.parseISZ(parseMode _)
      parser.parseObjectNext()
      parser.parseObjectKey("annexes")
      val annexes = parser.parseISZ(parseAnnex _)
      parser.parseObjectNext()
      return Component(identifier, category, classifier, features, subComponents, connections, properties, flows, modes, annexes)
    }

    def parseClassifier(): Classifier = {
      val r = parseClassifierT(F)
      return r
    }

    def parseClassifierT(typeParsed: B): Classifier = {
      if (!typeParsed) {
        parser.parseObjectType("Classifier")
      }
      return Classifier()
    }

    def parseCategory(): Category.Type = {
      val r = parseCategoryT(F)
      return r
    }

    def parseCategoryT(typeParsed: B): Category.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Category")
      }
      parser.parseObjectKey("value")
      val s = parser.parseString()
      parser.parseObjectNext()
      s match {
        case "Abstract" => return Category.Abstract
        case "Bus" => return Category.Bus
        case "Data" => return Category.Data
        case "Device" => return Category.Device
        case "Process" => return Category.Process
        case "Processor" => return Category.Processor
        case "Thread" => return Category.Thread
        case "Port" => return Category.Port
        case "Subprogram" => return Category.Subprogram
        case "System" => return Category.System
        case "VirtualBus" => return Category.VirtualBus
        case "VirtualProcessor" => return Category.VirtualProcessor
        case _ => halt(parser.errorMessage)
      }
    }

    def parseFeature(): Feature = {
      val r = parseFeatureT(F)
      return r
    }

    def parseFeatureT(typeParsed: B): Feature = {
      if (!typeParsed) {
        parser.parseObjectType("Feature")
      }
      parser.parseObjectKey("identifier")
      val identifier = parser.parseString()
      parser.parseObjectNext()
      parser.parseObjectKey("direction")
      val direction = parseDirection()
      parser.parseObjectNext()
      parser.parseObjectKey("typ")
      val typ = parseTyp()
      parser.parseObjectNext()
      parser.parseObjectKey("classifier")
      val classifier = parseClassifier()
      parser.parseObjectNext()
      parser.parseObjectKey("properties")
      val properties = parser.parseISZ(parseProperty _)
      parser.parseObjectNext()
      return Feature(identifier, direction, typ, classifier, properties)
    }

    def parseDirection(): Direction.Type = {
      val r = parseDirectionT(F)
      return r
    }

    def parseDirectionT(typeParsed: B): Direction.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Direction")
      }
      parser.parseObjectKey("value")
      val s = parser.parseString()
      parser.parseObjectNext()
      s match {
        case "In" => return Direction.In
        case "Out" => return Direction.Out
        case "InOut" => return Direction.InOut
        case "None" => return Direction.None
        case _ => halt(parser.errorMessage)
      }
    }

    def parseTyp(): Typ.Type = {
      val r = parseTypT(F)
      return r
    }

    def parseTypT(typeParsed: B): Typ.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Typ")
      }
      parser.parseObjectKey("value")
      val s = parser.parseString()
      parser.parseObjectNext()
      s match {
        case "Acccess" => return Typ.Acccess
        case "Data" => return Typ.Data
        case "Event" => return Typ.Event
        case "EventData" => return Typ.EventData
        case "Feature" => return Typ.Feature
        case _ => halt(parser.errorMessage)
      }
    }

    def parseConnection(): Connection = {
      val r = parseConnectionT(F)
      return r
    }

    def parseConnectionT(typeParsed: B): Connection = {
      if (!typeParsed) {
        parser.parseObjectType("Connection")
      }
      parser.parseObjectKey("name")
      val name = parser.parseString()
      parser.parseObjectNext()
      parser.parseObjectKey("src")
      val src = parseEndPoint()
      parser.parseObjectNext()
      parser.parseObjectKey("dst")
      val dst = parseEndPoint()
      parser.parseObjectNext()
      parser.parseObjectKey("properties")
      val properties = parser.parseISZ(parseProperty _)
      parser.parseObjectNext()
      return Connection(name, src, dst, properties)
    }

    def parseEndPoint(): EndPoint = {
      val r = parseEndPointT(F)
      return r
    }

    def parseEndPointT(typeParsed: B): EndPoint = {
      if (!typeParsed) {
        parser.parseObjectType("EndPoint")
      }
      parser.parseObjectKey("component")
      val component = parser.parseString()
      parser.parseObjectNext()
      parser.parseObjectKey("feature")
      val feature = parser.parseString()
      parser.parseObjectNext()
      return EndPoint(component, feature)
    }

    def parseProperty(): Property = {
      val r = parsePropertyT(F)
      return r
    }

    def parsePropertyT(typeParsed: B): Property = {
      if (!typeParsed) {
        parser.parseObjectType("Property")
      }
      parser.parseObjectKey("name")
      val name = parser.parseString()
      parser.parseObjectNext()
      parser.parseObjectKey("propertyValues")
      val propertyValues = parser.parseISZ(parsePropertyValue _)
      parser.parseObjectNext()
      return Property(name, propertyValues)
    }

    def parsePropertyValue(): PropertyValue = {
      val t = parser.parseObjectTypes(ISZ("PropertyValue.ClassifierProp", "PropertyValue.UnitProp", "PropertyValue.RangeProp"))
      t match {
        case "PropertyValue.ClassifierProp" => val r = parsePropertyValueClassifierPropT(T); return r
        case "PropertyValue.UnitProp" => val r = parsePropertyValueUnitPropT(T); return r
        case "PropertyValue.RangeProp" => val r = parsePropertyValueRangePropT(T); return r
        case _ => halt(parser.errorMessage)
      }
    }

    def parsePropertyValueClassifierProp(): PropertyValue.ClassifierProp = {
      val r = parsePropertyValueClassifierPropT(F)
      return r
    }

    def parsePropertyValueClassifierPropT(typeParsed: B): PropertyValue.ClassifierProp = {
      if (!typeParsed) {
        parser.parseObjectType("PropertyValue.ClassifierProp")
      }
      parser.parseObjectKey("name")
      val name = parser.parseString()
      parser.parseObjectNext()
      return PropertyValue.ClassifierProp(name)
    }

    def parsePropertyValueUnitProp(): PropertyValue.UnitProp = {
      val r = parsePropertyValueUnitPropT(F)
      return r
    }

    def parsePropertyValueUnitPropT(typeParsed: B): PropertyValue.UnitProp = {
      if (!typeParsed) {
        parser.parseObjectType("PropertyValue.UnitProp")
      }
      parser.parseObjectKey("value")
      val value = parser.parseString()
      parser.parseObjectNext()
      parser.parseObjectKey("unit")
      val unit = parser.parseString()
      parser.parseObjectNext()
      return PropertyValue.UnitProp(value, unit)
    }

    def parsePropertyValueRangeProp(): PropertyValue.RangeProp = {
      val r = parsePropertyValueRangePropT(F)
      return r
    }

    def parsePropertyValueRangePropT(typeParsed: B): PropertyValue.RangeProp = {
      if (!typeParsed) {
        parser.parseObjectType("PropertyValue.RangeProp")
      }
      parser.parseObjectKey("ValueLow")
      val ValueLow = parser.parseString()
      parser.parseObjectNext()
      parser.parseObjectKey("ValueHigh")
      val ValueHigh = parser.parseString()
      parser.parseObjectNext()
      parser.parseObjectKey("Unit")
      val Unit = parser.parseString()
      parser.parseObjectNext()
      return PropertyValue.RangeProp(ValueLow, ValueHigh, Unit)
    }

    def parseMode(): Mode = {
      val r = parseModeT(F)
      return r
    }

    def parseModeT(typeParsed: B): Mode = {
      if (!typeParsed) {
        parser.parseObjectType("Mode")
      }
      parser.parseObjectKey("name")
      val name = parser.parseString()
      parser.parseObjectNext()
      return Mode(name)
    }

    def parseFlow(): Flow = {
      val r = parseFlowT(F)
      return r
    }

    def parseFlowT(typeParsed: B): Flow = {
      if (!typeParsed) {
        parser.parseObjectType("Flow")
      }
      parser.parseObjectKey("name")
      val name = parser.parseString()
      parser.parseObjectNext()
      return Flow(name)
    }

    def parseAnnex(): Annex = {
      val r = parseAnnexT(F)
      return r
    }

    def parseAnnexT(typeParsed: B): Annex = {
      if (!typeParsed) {
        parser.parseObjectType("Annex")
      }
      parser.parseObjectKey("name")
      val name = parser.parseString()
      parser.parseObjectNext()
      return Annex(name)
    }

    def eof(): B = {
      val r = parser.eof()
      return r
    }

    def errorOpt: Option[Json.ErrorMsg] = {
      return parser.errorOpt
    }

  }

  def to[T](s: String, f: Parser => T): T = {
    val parser = Parser(s)
    val r = f(parser)
    parser.eof()
    return r
  }

  def fromAadlXml(o: AadlXml, isCompact: B): String = {
    val st = Printer.printAadlXml(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toAadlXml(s: String): AadlXml = {
    def fAadlXml(parser: Parser): AadlXml = {
      var r = parser.parseAadlXml()
      return r
    }
    val r = to(s, fAadlXml)
    return r
  }

  def fromComponent(o: Component, isCompact: B): String = {
    val st = Printer.printComponent(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toComponent(s: String): Component = {
    def fComponent(parser: Parser): Component = {
      var r = parser.parseComponent()
      return r
    }
    val r = to(s, fComponent)
    return r
  }

  def fromClassifier(o: Classifier, isCompact: B): String = {
    val st = Printer.printClassifier(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toClassifier(s: String): Classifier = {
    def fClassifier(parser: Parser): Classifier = {
      var r = parser.parseClassifier()
      return r
    }
    val r = to(s, fClassifier)
    return r
  }

  def fromFeature(o: Feature, isCompact: B): String = {
    val st = Printer.printFeature(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFeature(s: String): Feature = {
    def fFeature(parser: Parser): Feature = {
      var r = parser.parseFeature()
      return r
    }
    val r = to(s, fFeature)
    return r
  }

  def fromConnection(o: Connection, isCompact: B): String = {
    val st = Printer.printConnection(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toConnection(s: String): Connection = {
    def fConnection(parser: Parser): Connection = {
      var r = parser.parseConnection()
      return r
    }
    val r = to(s, fConnection)
    return r
  }

  def fromEndPoint(o: EndPoint, isCompact: B): String = {
    val st = Printer.printEndPoint(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEndPoint(s: String): EndPoint = {
    def fEndPoint(parser: Parser): EndPoint = {
      var r = parser.parseEndPoint()
      return r
    }
    val r = to(s, fEndPoint)
    return r
  }

  def fromProperty(o: Property, isCompact: B): String = {
    val st = Printer.printProperty(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toProperty(s: String): Property = {
    def fProperty(parser: Parser): Property = {
      var r = parser.parseProperty()
      return r
    }
    val r = to(s, fProperty)
    return r
  }

  def fromPropertyValue(o: PropertyValue, isCompact: B): String = {
    val st = Printer.printPropertyValue(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toPropertyValue(s: String): PropertyValue = {
    def fPropertyValue(parser: Parser): PropertyValue = {
      var r = parser.parsePropertyValue()
      return r
    }
    val r = to(s, fPropertyValue)
    return r
  }

  def fromPropertyValueClassifierProp(o: PropertyValue.ClassifierProp, isCompact: B): String = {
    val st = Printer.printPropertyValueClassifierProp(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toPropertyValueClassifierProp(s: String): PropertyValue.ClassifierProp = {
    def fPropertyValueClassifierProp(parser: Parser): PropertyValue.ClassifierProp = {
      var r = parser.parsePropertyValueClassifierProp()
      return r
    }
    val r = to(s, fPropertyValueClassifierProp)
    return r
  }

  def fromPropertyValueUnitProp(o: PropertyValue.UnitProp, isCompact: B): String = {
    val st = Printer.printPropertyValueUnitProp(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toPropertyValueUnitProp(s: String): PropertyValue.UnitProp = {
    def fPropertyValueUnitProp(parser: Parser): PropertyValue.UnitProp = {
      var r = parser.parsePropertyValueUnitProp()
      return r
    }
    val r = to(s, fPropertyValueUnitProp)
    return r
  }

  def fromPropertyValueRangeProp(o: PropertyValue.RangeProp, isCompact: B): String = {
    val st = Printer.printPropertyValueRangeProp(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toPropertyValueRangeProp(s: String): PropertyValue.RangeProp = {
    def fPropertyValueRangeProp(parser: Parser): PropertyValue.RangeProp = {
      var r = parser.parsePropertyValueRangeProp()
      return r
    }
    val r = to(s, fPropertyValueRangeProp)
    return r
  }

  def fromMode(o: Mode, isCompact: B): String = {
    val st = Printer.printMode(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toMode(s: String): Mode = {
    def fMode(parser: Parser): Mode = {
      var r = parser.parseMode()
      return r
    }
    val r = to(s, fMode)
    return r
  }

  def fromFlow(o: Flow, isCompact: B): String = {
    val st = Printer.printFlow(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFlow(s: String): Flow = {
    def fFlow(parser: Parser): Flow = {
      var r = parser.parseFlow()
      return r
    }
    val r = to(s, fFlow)
    return r
  }

  def fromAnnex(o: Annex, isCompact: B): String = {
    val st = Printer.printAnnex(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toAnnex(s: String): Annex = {
    def fAnnex(parser: Parser): Annex = {
      var r = parser.parseAnnex()
      return r
    }
    val r = to(s, fAnnex)
    return r
  }

}