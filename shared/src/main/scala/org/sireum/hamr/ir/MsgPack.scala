// #Sireum
// @formatter:off

/*
 Copyright (c) 2018, Kansas State University
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

package org.sireum.hamr.ir

import org.sireum._

object MsgPack {

  object Constants {

    val Aadl: Z = -32

    val Name: Z = -31

    val Component: Z = -30

    val Classifier: Z = -29

    val FeatureEnd: Z = -28

    val FeatureGroup: Z = -27

    val FeatureAccess: Z = -26

    val Connection: Z = -25

    val ConnectionInstance: Z = -24

    val ConnectionReference: Z = -23

    val EndPoint: Z = -22

    val Property: Z = -21

    val AadlElementRef: Z = -20

    val ClassifierProp: Z = -19

    val RangeProp: Z = -18

    val RecordProp: Z = -17

    val ReferenceProp: Z = -16

    val UnitProp: Z = -15

    val ValueProp: Z = -14

    val Mode: Z = -13

    val Flow: Z = -12

    val Annex: Z = -11

    val Emv2ElementRef: Z = -10

    val Emv2Library: Z = -9

    val ErrorTypeDef: Z = -8

    val ErrorAliasDef: Z = -7

    val ErrorTypeSetDef: Z = -6

    val BehaveStateMachine: Z = -5

    val ErrorEvent: Z = -4

    val ErrorState: Z = -3

    val ErrorTransition: Z = -2

    val ConditionTrigger: Z = -1

    val AndCondition: Z = 0

    val OrCondition: Z = 1

    val AllCondition: Z = 2

    val OrMoreCondition: Z = 3

    val OrLessCondition: Z = 4

    val Emv2Clause: Z = 5

    val Emv2Propagation: Z = 6

    val Emv2Flow: Z = 7

    val Emv2BehaviorSection: Z = 8

    val ErrorPropagation: Z = 9

    val SmfClause: Z = 10

    val SmfClassification: Z = 11

    val SmfDeclass: Z = 12

    val SmfLibrary: Z = 13

    val SmfType: Z = 14

    val OtherAnnex: Z = 15

  }

  object Writer {

    @record class Default(val writer: MessagePack.Writer.Impl) extends Writer

  }

  @msig trait Writer {

    def writer: MessagePack.Writer

    def writeAadlInstInfo(o: AadlInstInfo): Unit = {
      o match {
        case o: Component => writeComponent(o)
        case o: FeatureEnd => writeFeatureEnd(o)
        case o: FeatureGroup => writeFeatureGroup(o)
        case o: FeatureAccess => writeFeatureAccess(o)
        case o: Connection => writeConnection(o)
        case o: Flow => writeFlow(o)
        case o: ErrorTypeDef => writeErrorTypeDef(o)
        case o: Emv2Flow => writeEmv2Flow(o)
      }
    }

    def writeAadl(o: Aadl): Unit = {
      writer.writeZ(Constants.Aadl)
      writer.writeISZ(o.components, writeComponent _)
      writer.writeISZ(o.annexLib, writeAnnexLib _)
      writer.writeISZ(o.dataComponents, writeComponent _)
    }

    def writeName(o: Name): Unit = {
      writer.writeZ(Constants.Name)
      writer.writeISZ(o.name, writer.writeString _)
      writer.writeOption(o.pos, writer.writePosition _)
    }

    def writeComponent(o: Component): Unit = {
      writer.writeZ(Constants.Component)
      writeName(o.identifier)
      writeComponentCategoryType(o.category)
      writer.writeOption(o.classifier, writeClassifier _)
      writer.writeISZ(o.features, writeFeature _)
      writer.writeISZ(o.subComponents, writeComponent _)
      writer.writeISZ(o.connections, writeConnection _)
      writer.writeISZ(o.connectionInstances, writeConnectionInstance _)
      writer.writeISZ(o.properties, writeProperty _)
      writer.writeISZ(o.flows, writeFlow _)
      writer.writeISZ(o.modes, writeMode _)
      writer.writeISZ(o.annexes, writeAnnex _)
      writer.writeString(o.uriFrag)
    }

    def writeClassifier(o: Classifier): Unit = {
      writer.writeZ(Constants.Classifier)
      writer.writeString(o.name)
    }

    def writeComponentCategoryType(o: ComponentCategory.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeFeature(o: Feature): Unit = {
      o match {
        case o: FeatureEnd => writeFeatureEnd(o)
        case o: FeatureGroup => writeFeatureGroup(o)
        case o: FeatureAccess => writeFeatureAccess(o)
      }
    }

    def writeFeatureEnd(o: FeatureEnd): Unit = {
      writer.writeZ(Constants.FeatureEnd)
      writeName(o.identifier)
      writeDirectionType(o.direction)
      writeFeatureCategoryType(o.category)
      writer.writeOption(o.classifier, writeClassifier _)
      writer.writeISZ(o.properties, writeProperty _)
      writer.writeString(o.uriFrag)
    }

    def writeFeatureGroup(o: FeatureGroup): Unit = {
      writer.writeZ(Constants.FeatureGroup)
      writeName(o.identifier)
      writer.writeISZ(o.features, writeFeature _)
      writer.writeB(o.isInverse)
      writeFeatureCategoryType(o.category)
      writer.writeISZ(o.properties, writeProperty _)
      writer.writeString(o.uriFrag)
    }

    def writeFeatureAccess(o: FeatureAccess): Unit = {
      writer.writeZ(Constants.FeatureAccess)
      writeName(o.identifier)
      writeFeatureCategoryType(o.category)
      writer.writeOption(o.classifier, writeClassifier _)
      writeAccessTypeType(o.accessType)
      writeAccessCategoryType(o.accessCategory)
      writer.writeISZ(o.properties, writeProperty _)
      writer.writeString(o.uriFrag)
    }

    def writeAccessTypeType(o: AccessType.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeAccessCategoryType(o: AccessCategory.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeDirectionType(o: Direction.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeFeatureCategoryType(o: FeatureCategory.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeConnection(o: Connection): Unit = {
      writer.writeZ(Constants.Connection)
      writeName(o.name)
      writer.writeISZ(o.src, writeEndPoint _)
      writer.writeISZ(o.dst, writeEndPoint _)
      writeConnectionKindType(o.kind)
      writer.writeB(o.isBiDirectional)
      writer.writeISZ(o.connectionInstances, writeName _)
      writer.writeISZ(o.properties, writeProperty _)
      writer.writeString(o.uriFrag)
    }

    def writeConnectionInstance(o: ConnectionInstance): Unit = {
      writer.writeZ(Constants.ConnectionInstance)
      writeName(o.name)
      writeEndPoint(o.src)
      writeEndPoint(o.dst)
      writeConnectionKindType(o.kind)
      writer.writeISZ(o.connectionRefs, writeConnectionReference _)
      writer.writeISZ(o.properties, writeProperty _)
    }

    def writeConnectionReference(o: ConnectionReference): Unit = {
      writer.writeZ(Constants.ConnectionReference)
      writeName(o.name)
      writeName(o.context)
      writer.writeB(o.isParent)
    }

    def writeConnectionKindType(o: ConnectionKind.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeEndPoint(o: EndPoint): Unit = {
      writer.writeZ(Constants.EndPoint)
      writeName(o.component)
      writer.writeOption(o.feature, writeName _)
      writer.writeOption(o.direction, writeDirectionType _)
    }

    def writeProperty(o: Property): Unit = {
      writer.writeZ(Constants.Property)
      writeName(o.name)
      writer.writeISZ(o.propertyValues, writePropertyValue _)
      writer.writeISZ(o.appliesTo, writeElementRef _)
    }

    def writeElementRef(o: ElementRef): Unit = {
      o match {
        case o: AadlElementRef => writeAadlElementRef(o)
        case o: Emv2ElementRef => writeEmv2ElementRef(o)
      }
    }

    def writeElementKindType(o: ElementKind.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeAadlElementRef(o: AadlElementRef): Unit = {
      writer.writeZ(Constants.AadlElementRef)
      writeElementKindType(o.elementKind)
      writeName(o.name)
    }

    def writePropertyValue(o: PropertyValue): Unit = {
      o match {
        case o: ClassifierProp => writeClassifierProp(o)
        case o: RangeProp => writeRangeProp(o)
        case o: RecordProp => writeRecordProp(o)
        case o: ReferenceProp => writeReferenceProp(o)
        case o: UnitProp => writeUnitProp(o)
        case o: ValueProp => writeValueProp(o)
      }
    }

    def writeClassifierProp(o: ClassifierProp): Unit = {
      writer.writeZ(Constants.ClassifierProp)
      writer.writeString(o.name)
    }

    def writeRangeProp(o: RangeProp): Unit = {
      writer.writeZ(Constants.RangeProp)
      writeUnitProp(o.low)
      writeUnitProp(o.high)
    }

    def writeRecordProp(o: RecordProp): Unit = {
      writer.writeZ(Constants.RecordProp)
      writer.writeISZ(o.properties, writeProperty _)
    }

    def writeReferenceProp(o: ReferenceProp): Unit = {
      writer.writeZ(Constants.ReferenceProp)
      writeName(o.value)
    }

    def writeUnitProp(o: UnitProp): Unit = {
      writer.writeZ(Constants.UnitProp)
      writer.writeString(o.value)
      writer.writeOption(o.unit, writer.writeString _)
    }

    def writeValueProp(o: ValueProp): Unit = {
      writer.writeZ(Constants.ValueProp)
      writer.writeString(o.value)
    }

    def writeMode(o: Mode): Unit = {
      writer.writeZ(Constants.Mode)
      writeName(o.name)
    }

    def writeFlowKindType(o: FlowKind.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeFlow(o: Flow): Unit = {
      writer.writeZ(Constants.Flow)
      writeName(o.name)
      writeFlowKindType(o.kind)
      writer.writeOption(o.source, writeName _)
      writer.writeOption(o.sink, writeName _)
      writer.writeString(o.uriFrag)
    }

    def writeAnnex(o: Annex): Unit = {
      writer.writeZ(Constants.Annex)
      writer.writeString(o.name)
      writeAnnexClause(o.clause)
    }

    def writeAnnexClause(o: AnnexClause): Unit = {
      o match {
        case o: ErrorTypeDef => writeErrorTypeDef(o)
        case o: ErrorAliasDef => writeErrorAliasDef(o)
        case o: ErrorTypeSetDef => writeErrorTypeSetDef(o)
        case o: BehaveStateMachine => writeBehaveStateMachine(o)
        case o: ErrorEvent => writeErrorEvent(o)
        case o: ErrorState => writeErrorState(o)
        case o: ErrorTransition => writeErrorTransition(o)
        case o: ConditionTrigger => writeConditionTrigger(o)
        case o: AndCondition => writeAndCondition(o)
        case o: OrCondition => writeOrCondition(o)
        case o: AllCondition => writeAllCondition(o)
        case o: OrMoreCondition => writeOrMoreCondition(o)
        case o: OrLessCondition => writeOrLessCondition(o)
        case o: Emv2Clause => writeEmv2Clause(o)
        case o: Emv2Propagation => writeEmv2Propagation(o)
        case o: Emv2Flow => writeEmv2Flow(o)
        case o: Emv2BehaviorSection => writeEmv2BehaviorSection(o)
        case o: ErrorPropagation => writeErrorPropagation(o)
        case o: SmfClause => writeSmfClause(o)
        case o: SmfClassification => writeSmfClassification(o)
        case o: SmfDeclass => writeSmfDeclass(o)
        case o: SmfType => writeSmfType(o)
        case o: OtherAnnex => writeOtherAnnex(o)
      }
    }

    def writeAnnexLib(o: AnnexLib): Unit = {
      o match {
        case o: Emv2Library => writeEmv2Library(o)
        case o: SmfLibrary => writeSmfLibrary(o)
      }
    }

    def writeEmv2Annex(o: Emv2Annex): Unit = {
      o match {
        case o: ErrorTypeDef => writeErrorTypeDef(o)
        case o: ErrorAliasDef => writeErrorAliasDef(o)
        case o: ErrorTypeSetDef => writeErrorTypeSetDef(o)
        case o: BehaveStateMachine => writeBehaveStateMachine(o)
        case o: ErrorEvent => writeErrorEvent(o)
        case o: ErrorState => writeErrorState(o)
        case o: ErrorTransition => writeErrorTransition(o)
        case o: ConditionTrigger => writeConditionTrigger(o)
        case o: AndCondition => writeAndCondition(o)
        case o: OrCondition => writeOrCondition(o)
        case o: AllCondition => writeAllCondition(o)
        case o: OrMoreCondition => writeOrMoreCondition(o)
        case o: OrLessCondition => writeOrLessCondition(o)
        case o: Emv2Clause => writeEmv2Clause(o)
        case o: Emv2Propagation => writeEmv2Propagation(o)
        case o: Emv2Flow => writeEmv2Flow(o)
        case o: Emv2BehaviorSection => writeEmv2BehaviorSection(o)
        case o: ErrorPropagation => writeErrorPropagation(o)
      }
    }

    def writeEmv2Lib(o: Emv2Lib): Unit = {
      o match {
        case o: Emv2Library => writeEmv2Library(o)
      }
    }

    def writePropagationDirectionType(o: PropagationDirection.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeEmv2ElementRef(o: Emv2ElementRef): Unit = {
      writer.writeZ(Constants.Emv2ElementRef)
      writeEmv2ElementKindType(o.kind)
      writeName(o.name)
      writer.writeISZ(o.errorTypes, writeName _)
    }

    def writeEmv2ElementKindType(o: Emv2ElementKind.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeEmv2Library(o: Emv2Library): Unit = {
      writer.writeZ(Constants.Emv2Library)
      writeName(o.name)
      writer.writeISZ(o.useTypes, writer.writeString _)
      writer.writeISZ(o.errorTypeDef, writeErrorTypeDef _)
      writer.writeISZ(o.errorTypeSetDef, writeErrorTypeSetDef _)
      writer.writeISZ(o.alias, writeErrorAliasDef _)
      writer.writeISZ(o.behaveStateMachine, writeBehaveStateMachine _)
    }

    def writeErrorKindType(o: ErrorKind.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeErrorTypeDef(o: ErrorTypeDef): Unit = {
      writer.writeZ(Constants.ErrorTypeDef)
      writeName(o.id)
      writer.writeOption(o.extendType, writeName _)
      writer.writeString(o.uriFrag)
    }

    def writeErrorAliasDef(o: ErrorAliasDef): Unit = {
      writer.writeZ(Constants.ErrorAliasDef)
      writeName(o.errorType)
      writeName(o.aliseType)
    }

    def writeErrorTypeSetDef(o: ErrorTypeSetDef): Unit = {
      writer.writeZ(Constants.ErrorTypeSetDef)
      writeName(o.id)
      writer.writeISZ(o.errorTypes, writeName _)
    }

    def writeBehaveStateMachine(o: BehaveStateMachine): Unit = {
      writer.writeZ(Constants.BehaveStateMachine)
      writeName(o.id)
      writer.writeISZ(o.events, writeErrorEvent _)
      writer.writeISZ(o.states, writeErrorState _)
      writer.writeISZ(o.transitions, writeErrorTransition _)
      writer.writeISZ(o.properties, writeProperty _)
    }

    def writeErrorEvent(o: ErrorEvent): Unit = {
      writer.writeZ(Constants.ErrorEvent)
      writeName(o.id)
    }

    def writeErrorState(o: ErrorState): Unit = {
      writer.writeZ(Constants.ErrorState)
      writeName(o.id)
      writer.writeB(o.isInitial)
    }

    def writeErrorTransition(o: ErrorTransition): Unit = {
      writer.writeZ(Constants.ErrorTransition)
      writer.writeOption(o.id, writeName _)
      writeName(o.sourceState)
      writeErrorCondition(o.condition)
      writeName(o.targetState)
    }

    def writeErrorCondition(o: ErrorCondition): Unit = {
      o match {
        case o: ConditionTrigger => writeConditionTrigger(o)
        case o: AndCondition => writeAndCondition(o)
        case o: OrCondition => writeOrCondition(o)
        case o: AllCondition => writeAllCondition(o)
        case o: OrMoreCondition => writeOrMoreCondition(o)
        case o: OrLessCondition => writeOrLessCondition(o)
      }
    }

    def writeConditionTrigger(o: ConditionTrigger): Unit = {
      writer.writeZ(Constants.ConditionTrigger)
      writer.writeISZ(o.events, writeName _)
      writer.writeISZ(o.propagationPoints, writeEmv2Propagation _)
    }

    def writeAndCondition(o: AndCondition): Unit = {
      writer.writeZ(Constants.AndCondition)
      writer.writeISZ(o.op, writeErrorCondition _)
    }

    def writeOrCondition(o: OrCondition): Unit = {
      writer.writeZ(Constants.OrCondition)
      writer.writeISZ(o.op, writeErrorCondition _)
    }

    def writeAllCondition(o: AllCondition): Unit = {
      writer.writeZ(Constants.AllCondition)
      writer.writeISZ(o.op, writeErrorCondition _)
    }

    def writeOrMoreCondition(o: OrMoreCondition): Unit = {
      writer.writeZ(Constants.OrMoreCondition)
      writer.writeZ(o.number)
      writer.writeISZ(o.conditions, writeErrorCondition _)
    }

    def writeOrLessCondition(o: OrLessCondition): Unit = {
      writer.writeZ(Constants.OrLessCondition)
      writer.writeZ(o.number)
      writer.writeISZ(o.conditions, writeErrorCondition _)
    }

    def writeEmv2Clause(o: Emv2Clause): Unit = {
      writer.writeZ(Constants.Emv2Clause)
      writer.writeISZ(o.libraries, writeName _)
      writer.writeISZ(o.propagations, writeEmv2Propagation _)
      writer.writeISZ(o.flows, writeEmv2Flow _)
      writer.writeOption(o.componentBehavior, writeEmv2BehaviorSection _)
      writer.writeISZ(o.properties, writeProperty _)
    }

    def writeEmv2Propagation(o: Emv2Propagation): Unit = {
      writer.writeZ(Constants.Emv2Propagation)
      writePropagationDirectionType(o.direction)
      writeName(o.propagationPoint)
      writer.writeISZ(o.errorTokens, writeName _)
    }

    def writeEmv2Flow(o: Emv2Flow): Unit = {
      writer.writeZ(Constants.Emv2Flow)
      writeName(o.identifier)
      writeFlowKindType(o.kind)
      writer.writeOption(o.sourcePropagation, writeEmv2Propagation _)
      writer.writeOption(o.sinkPropagation, writeEmv2Propagation _)
      writer.writeString(o.uriFrag)
    }

    def writeEmv2BehaviorSection(o: Emv2BehaviorSection): Unit = {
      writer.writeZ(Constants.Emv2BehaviorSection)
      writer.writeISZ(o.events, writeErrorEvent _)
      writer.writeISZ(o.transitions, writeErrorTransition _)
      writer.writeISZ(o.propagations, writeErrorPropagation _)
    }

    def writeErrorPropagation(o: ErrorPropagation): Unit = {
      writer.writeZ(Constants.ErrorPropagation)
      writer.writeOption(o.id, writeName _)
      writer.writeISZ(o.source, writeName _)
      writer.writeOption(o.condition, writeErrorCondition _)
      writer.writeISZ(o.target, writeEmv2Propagation _)
    }

    def writeSmfAnnex(o: SmfAnnex): Unit = {
      o match {
        case o: SmfClause => writeSmfClause(o)
        case o: SmfClassification => writeSmfClassification(o)
        case o: SmfDeclass => writeSmfDeclass(o)
        case o: SmfType => writeSmfType(o)
      }
    }

    def writeSmfLib(o: SmfLib): Unit = {
      o match {
        case o: SmfLibrary => writeSmfLibrary(o)
      }
    }

    def writeSmfClause(o: SmfClause): Unit = {
      writer.writeZ(Constants.SmfClause)
      writer.writeISZ(o.classification, writeSmfClassification _)
      writer.writeISZ(o.declass, writeSmfDeclass _)
    }

    def writeSmfClassification(o: SmfClassification): Unit = {
      writer.writeZ(Constants.SmfClassification)
      writeName(o.portName)
      writeName(o.typeName)
    }

    def writeSmfDeclass(o: SmfDeclass): Unit = {
      writer.writeZ(Constants.SmfDeclass)
      writeName(o.flowName)
      writer.writeOption(o.srcType, writeName _)
      writeName(o.snkType)
    }

    def writeSmfLibrary(o: SmfLibrary): Unit = {
      writer.writeZ(Constants.SmfLibrary)
      writer.writeISZ(o.types, writeSmfType _)
    }

    def writeSmfType(o: SmfType): Unit = {
      writer.writeZ(Constants.SmfType)
      writeName(o.typeName)
      writer.writeISZ(o.parentType, writeName _)
    }

    def writeOtherAnnex(o: OtherAnnex): Unit = {
      writer.writeZ(Constants.OtherAnnex)
      writer.writeString(o.clause)
    }

    def result: ISZ[U8] = {
      return writer.result
    }

  }

  object Reader {

    @record class Default(val reader: MessagePack.Reader.Impl) extends Reader {
      def errorOpt: Option[MessagePack.ErrorMsg] = {
        return reader.errorOpt
      }
    }

  }

  @msig trait Reader {

    def reader: MessagePack.Reader

    def readAadlInstInfo(): AadlInstInfo = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Component => val r = readComponentT(T); return r
        case Constants.FeatureEnd => val r = readFeatureEndT(T); return r
        case Constants.FeatureGroup => val r = readFeatureGroupT(T); return r
        case Constants.FeatureAccess => val r = readFeatureAccessT(T); return r
        case Constants.Connection => val r = readConnectionT(T); return r
        case Constants.Flow => val r = readFlowT(T); return r
        case Constants.ErrorTypeDef => val r = readErrorTypeDefT(T); return r
        case Constants.Emv2Flow => val r = readEmv2FlowT(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of AadlInstInfo.")
          val r = readEmv2FlowT(T)
          return r
      }
    }

    def readAadl(): Aadl = {
      val r = readAadlT(F)
      return r
    }

    def readAadlT(typeParsed: B): Aadl = {
      if (!typeParsed) {
        reader.expectZ(Constants.Aadl)
      }
      val components = reader.readISZ(readComponent _)
      val annexLib = reader.readISZ(readAnnexLib _)
      val dataComponents = reader.readISZ(readComponent _)
      return Aadl(components, annexLib, dataComponents)
    }

    def readName(): Name = {
      val r = readNameT(F)
      return r
    }

    def readNameT(typeParsed: B): Name = {
      if (!typeParsed) {
        reader.expectZ(Constants.Name)
      }
      val name = reader.readISZ(reader.readString _)
      val pos = reader.readOption(reader.readPosition _)
      return Name(name, pos)
    }

    def readComponent(): Component = {
      val r = readComponentT(F)
      return r
    }

    def readComponentT(typeParsed: B): Component = {
      if (!typeParsed) {
        reader.expectZ(Constants.Component)
      }
      val identifier = readName()
      val category = readComponentCategoryType()
      val classifier = reader.readOption(readClassifier _)
      val features = reader.readISZ(readFeature _)
      val subComponents = reader.readISZ(readComponent _)
      val connections = reader.readISZ(readConnection _)
      val connectionInstances = reader.readISZ(readConnectionInstance _)
      val properties = reader.readISZ(readProperty _)
      val flows = reader.readISZ(readFlow _)
      val modes = reader.readISZ(readMode _)
      val annexes = reader.readISZ(readAnnex _)
      val uriFrag = reader.readString()
      return Component(identifier, category, classifier, features, subComponents, connections, connectionInstances, properties, flows, modes, annexes, uriFrag)
    }

    def readClassifier(): Classifier = {
      val r = readClassifierT(F)
      return r
    }

    def readClassifierT(typeParsed: B): Classifier = {
      if (!typeParsed) {
        reader.expectZ(Constants.Classifier)
      }
      val name = reader.readString()
      return Classifier(name)
    }

    def readComponentCategoryType(): ComponentCategory.Type = {
      val r = reader.readZ()
      return ComponentCategory.byOrdinal(r).get
    }

    def readFeature(): Feature = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.FeatureEnd => val r = readFeatureEndT(T); return r
        case Constants.FeatureGroup => val r = readFeatureGroupT(T); return r
        case Constants.FeatureAccess => val r = readFeatureAccessT(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Feature.")
          val r = readFeatureAccessT(T)
          return r
      }
    }

    def readFeatureEnd(): FeatureEnd = {
      val r = readFeatureEndT(F)
      return r
    }

    def readFeatureEndT(typeParsed: B): FeatureEnd = {
      if (!typeParsed) {
        reader.expectZ(Constants.FeatureEnd)
      }
      val identifier = readName()
      val direction = readDirectionType()
      val category = readFeatureCategoryType()
      val classifier = reader.readOption(readClassifier _)
      val properties = reader.readISZ(readProperty _)
      val uriFrag = reader.readString()
      return FeatureEnd(identifier, direction, category, classifier, properties, uriFrag)
    }

    def readFeatureGroup(): FeatureGroup = {
      val r = readFeatureGroupT(F)
      return r
    }

    def readFeatureGroupT(typeParsed: B): FeatureGroup = {
      if (!typeParsed) {
        reader.expectZ(Constants.FeatureGroup)
      }
      val identifier = readName()
      val features = reader.readISZ(readFeature _)
      val isInverse = reader.readB()
      val category = readFeatureCategoryType()
      val properties = reader.readISZ(readProperty _)
      val uriFrag = reader.readString()
      return FeatureGroup(identifier, features, isInverse, category, properties, uriFrag)
    }

    def readFeatureAccess(): FeatureAccess = {
      val r = readFeatureAccessT(F)
      return r
    }

    def readFeatureAccessT(typeParsed: B): FeatureAccess = {
      if (!typeParsed) {
        reader.expectZ(Constants.FeatureAccess)
      }
      val identifier = readName()
      val category = readFeatureCategoryType()
      val classifier = reader.readOption(readClassifier _)
      val accessType = readAccessTypeType()
      val accessCategory = readAccessCategoryType()
      val properties = reader.readISZ(readProperty _)
      val uriFrag = reader.readString()
      return FeatureAccess(identifier, category, classifier, accessType, accessCategory, properties, uriFrag)
    }

    def readAccessTypeType(): AccessType.Type = {
      val r = reader.readZ()
      return AccessType.byOrdinal(r).get
    }

    def readAccessCategoryType(): AccessCategory.Type = {
      val r = reader.readZ()
      return AccessCategory.byOrdinal(r).get
    }

    def readDirectionType(): Direction.Type = {
      val r = reader.readZ()
      return Direction.byOrdinal(r).get
    }

    def readFeatureCategoryType(): FeatureCategory.Type = {
      val r = reader.readZ()
      return FeatureCategory.byOrdinal(r).get
    }

    def readConnection(): Connection = {
      val r = readConnectionT(F)
      return r
    }

    def readConnectionT(typeParsed: B): Connection = {
      if (!typeParsed) {
        reader.expectZ(Constants.Connection)
      }
      val name = readName()
      val src = reader.readISZ(readEndPoint _)
      val dst = reader.readISZ(readEndPoint _)
      val kind = readConnectionKindType()
      val isBiDirectional = reader.readB()
      val connectionInstances = reader.readISZ(readName _)
      val properties = reader.readISZ(readProperty _)
      val uriFrag = reader.readString()
      return Connection(name, src, dst, kind, isBiDirectional, connectionInstances, properties, uriFrag)
    }

    def readConnectionInstance(): ConnectionInstance = {
      val r = readConnectionInstanceT(F)
      return r
    }

    def readConnectionInstanceT(typeParsed: B): ConnectionInstance = {
      if (!typeParsed) {
        reader.expectZ(Constants.ConnectionInstance)
      }
      val name = readName()
      val src = readEndPoint()
      val dst = readEndPoint()
      val kind = readConnectionKindType()
      val connectionRefs = reader.readISZ(readConnectionReference _)
      val properties = reader.readISZ(readProperty _)
      return ConnectionInstance(name, src, dst, kind, connectionRefs, properties)
    }

    def readConnectionReference(): ConnectionReference = {
      val r = readConnectionReferenceT(F)
      return r
    }

    def readConnectionReferenceT(typeParsed: B): ConnectionReference = {
      if (!typeParsed) {
        reader.expectZ(Constants.ConnectionReference)
      }
      val name = readName()
      val context = readName()
      val isParent = reader.readB()
      return ConnectionReference(name, context, isParent)
    }

    def readConnectionKindType(): ConnectionKind.Type = {
      val r = reader.readZ()
      return ConnectionKind.byOrdinal(r).get
    }

    def readEndPoint(): EndPoint = {
      val r = readEndPointT(F)
      return r
    }

    def readEndPointT(typeParsed: B): EndPoint = {
      if (!typeParsed) {
        reader.expectZ(Constants.EndPoint)
      }
      val component = readName()
      val feature = reader.readOption(readName _)
      val direction = reader.readOption(readDirectionType _)
      return EndPoint(component, feature, direction)
    }

    def readProperty(): Property = {
      val r = readPropertyT(F)
      return r
    }

    def readPropertyT(typeParsed: B): Property = {
      if (!typeParsed) {
        reader.expectZ(Constants.Property)
      }
      val name = readName()
      val propertyValues = reader.readISZ(readPropertyValue _)
      val appliesTo = reader.readISZ(readElementRef _)
      return Property(name, propertyValues, appliesTo)
    }

    def readElementRef(): ElementRef = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.AadlElementRef => val r = readAadlElementRefT(T); return r
        case Constants.Emv2ElementRef => val r = readEmv2ElementRefT(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of ElementRef.")
          val r = readEmv2ElementRefT(T)
          return r
      }
    }

    def readElementKindType(): ElementKind.Type = {
      val r = reader.readZ()
      return ElementKind.byOrdinal(r).get
    }

    def readAadlElementRef(): AadlElementRef = {
      val r = readAadlElementRefT(F)
      return r
    }

    def readAadlElementRefT(typeParsed: B): AadlElementRef = {
      if (!typeParsed) {
        reader.expectZ(Constants.AadlElementRef)
      }
      val elementKind = readElementKindType()
      val name = readName()
      return AadlElementRef(elementKind, name)
    }

    def readPropertyValue(): PropertyValue = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.ClassifierProp => val r = readClassifierPropT(T); return r
        case Constants.RangeProp => val r = readRangePropT(T); return r
        case Constants.RecordProp => val r = readRecordPropT(T); return r
        case Constants.ReferenceProp => val r = readReferencePropT(T); return r
        case Constants.UnitProp => val r = readUnitPropT(T); return r
        case Constants.ValueProp => val r = readValuePropT(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of PropertyValue.")
          val r = readValuePropT(T)
          return r
      }
    }

    def readClassifierProp(): ClassifierProp = {
      val r = readClassifierPropT(F)
      return r
    }

    def readClassifierPropT(typeParsed: B): ClassifierProp = {
      if (!typeParsed) {
        reader.expectZ(Constants.ClassifierProp)
      }
      val name = reader.readString()
      return ClassifierProp(name)
    }

    def readRangeProp(): RangeProp = {
      val r = readRangePropT(F)
      return r
    }

    def readRangePropT(typeParsed: B): RangeProp = {
      if (!typeParsed) {
        reader.expectZ(Constants.RangeProp)
      }
      val low = readUnitProp()
      val high = readUnitProp()
      return RangeProp(low, high)
    }

    def readRecordProp(): RecordProp = {
      val r = readRecordPropT(F)
      return r
    }

    def readRecordPropT(typeParsed: B): RecordProp = {
      if (!typeParsed) {
        reader.expectZ(Constants.RecordProp)
      }
      val properties = reader.readISZ(readProperty _)
      return RecordProp(properties)
    }

    def readReferenceProp(): ReferenceProp = {
      val r = readReferencePropT(F)
      return r
    }

    def readReferencePropT(typeParsed: B): ReferenceProp = {
      if (!typeParsed) {
        reader.expectZ(Constants.ReferenceProp)
      }
      val value = readName()
      return ReferenceProp(value)
    }

    def readUnitProp(): UnitProp = {
      val r = readUnitPropT(F)
      return r
    }

    def readUnitPropT(typeParsed: B): UnitProp = {
      if (!typeParsed) {
        reader.expectZ(Constants.UnitProp)
      }
      val value = reader.readString()
      val unit = reader.readOption(reader.readString _)
      return UnitProp(value, unit)
    }

    def readValueProp(): ValueProp = {
      val r = readValuePropT(F)
      return r
    }

    def readValuePropT(typeParsed: B): ValueProp = {
      if (!typeParsed) {
        reader.expectZ(Constants.ValueProp)
      }
      val value = reader.readString()
      return ValueProp(value)
    }

    def readMode(): Mode = {
      val r = readModeT(F)
      return r
    }

    def readModeT(typeParsed: B): Mode = {
      if (!typeParsed) {
        reader.expectZ(Constants.Mode)
      }
      val name = readName()
      return Mode(name)
    }

    def readFlowKindType(): FlowKind.Type = {
      val r = reader.readZ()
      return FlowKind.byOrdinal(r).get
    }

    def readFlow(): Flow = {
      val r = readFlowT(F)
      return r
    }

    def readFlowT(typeParsed: B): Flow = {
      if (!typeParsed) {
        reader.expectZ(Constants.Flow)
      }
      val name = readName()
      val kind = readFlowKindType()
      val source = reader.readOption(readName _)
      val sink = reader.readOption(readName _)
      val uriFrag = reader.readString()
      return Flow(name, kind, source, sink, uriFrag)
    }

    def readAnnex(): Annex = {
      val r = readAnnexT(F)
      return r
    }

    def readAnnexT(typeParsed: B): Annex = {
      if (!typeParsed) {
        reader.expectZ(Constants.Annex)
      }
      val name = reader.readString()
      val clause = readAnnexClause()
      return Annex(name, clause)
    }

    def readAnnexClause(): AnnexClause = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.ErrorTypeDef => val r = readErrorTypeDefT(T); return r
        case Constants.ErrorAliasDef => val r = readErrorAliasDefT(T); return r
        case Constants.ErrorTypeSetDef => val r = readErrorTypeSetDefT(T); return r
        case Constants.BehaveStateMachine => val r = readBehaveStateMachineT(T); return r
        case Constants.ErrorEvent => val r = readErrorEventT(T); return r
        case Constants.ErrorState => val r = readErrorStateT(T); return r
        case Constants.ErrorTransition => val r = readErrorTransitionT(T); return r
        case Constants.ConditionTrigger => val r = readConditionTriggerT(T); return r
        case Constants.AndCondition => val r = readAndConditionT(T); return r
        case Constants.OrCondition => val r = readOrConditionT(T); return r
        case Constants.AllCondition => val r = readAllConditionT(T); return r
        case Constants.OrMoreCondition => val r = readOrMoreConditionT(T); return r
        case Constants.OrLessCondition => val r = readOrLessConditionT(T); return r
        case Constants.Emv2Clause => val r = readEmv2ClauseT(T); return r
        case Constants.Emv2Propagation => val r = readEmv2PropagationT(T); return r
        case Constants.Emv2Flow => val r = readEmv2FlowT(T); return r
        case Constants.Emv2BehaviorSection => val r = readEmv2BehaviorSectionT(T); return r
        case Constants.ErrorPropagation => val r = readErrorPropagationT(T); return r
        case Constants.SmfClause => val r = readSmfClauseT(T); return r
        case Constants.SmfClassification => val r = readSmfClassificationT(T); return r
        case Constants.SmfDeclass => val r = readSmfDeclassT(T); return r
        case Constants.SmfType => val r = readSmfTypeT(T); return r
        case Constants.OtherAnnex => val r = readOtherAnnexT(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of AnnexClause.")
          val r = readOtherAnnexT(T)
          return r
      }
    }

    def readAnnexLib(): AnnexLib = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Emv2Library => val r = readEmv2LibraryT(T); return r
        case Constants.SmfLibrary => val r = readSmfLibraryT(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of AnnexLib.")
          val r = readSmfLibraryT(T)
          return r
      }
    }

    def readEmv2Annex(): Emv2Annex = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.ErrorTypeDef => val r = readErrorTypeDefT(T); return r
        case Constants.ErrorAliasDef => val r = readErrorAliasDefT(T); return r
        case Constants.ErrorTypeSetDef => val r = readErrorTypeSetDefT(T); return r
        case Constants.BehaveStateMachine => val r = readBehaveStateMachineT(T); return r
        case Constants.ErrorEvent => val r = readErrorEventT(T); return r
        case Constants.ErrorState => val r = readErrorStateT(T); return r
        case Constants.ErrorTransition => val r = readErrorTransitionT(T); return r
        case Constants.ConditionTrigger => val r = readConditionTriggerT(T); return r
        case Constants.AndCondition => val r = readAndConditionT(T); return r
        case Constants.OrCondition => val r = readOrConditionT(T); return r
        case Constants.AllCondition => val r = readAllConditionT(T); return r
        case Constants.OrMoreCondition => val r = readOrMoreConditionT(T); return r
        case Constants.OrLessCondition => val r = readOrLessConditionT(T); return r
        case Constants.Emv2Clause => val r = readEmv2ClauseT(T); return r
        case Constants.Emv2Propagation => val r = readEmv2PropagationT(T); return r
        case Constants.Emv2Flow => val r = readEmv2FlowT(T); return r
        case Constants.Emv2BehaviorSection => val r = readEmv2BehaviorSectionT(T); return r
        case Constants.ErrorPropagation => val r = readErrorPropagationT(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Emv2Annex.")
          val r = readErrorPropagationT(T)
          return r
      }
    }

    def readEmv2Lib(): Emv2Lib = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Emv2Library => val r = readEmv2LibraryT(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Emv2Lib.")
          val r = readEmv2LibraryT(T)
          return r
      }
    }

    def readPropagationDirectionType(): PropagationDirection.Type = {
      val r = reader.readZ()
      return PropagationDirection.byOrdinal(r).get
    }

    def readEmv2ElementRef(): Emv2ElementRef = {
      val r = readEmv2ElementRefT(F)
      return r
    }

    def readEmv2ElementRefT(typeParsed: B): Emv2ElementRef = {
      if (!typeParsed) {
        reader.expectZ(Constants.Emv2ElementRef)
      }
      val kind = readEmv2ElementKindType()
      val name = readName()
      val errorTypes = reader.readISZ(readName _)
      return Emv2ElementRef(kind, name, errorTypes)
    }

    def readEmv2ElementKindType(): Emv2ElementKind.Type = {
      val r = reader.readZ()
      return Emv2ElementKind.byOrdinal(r).get
    }

    def readEmv2Library(): Emv2Library = {
      val r = readEmv2LibraryT(F)
      return r
    }

    def readEmv2LibraryT(typeParsed: B): Emv2Library = {
      if (!typeParsed) {
        reader.expectZ(Constants.Emv2Library)
      }
      val name = readName()
      val useTypes = reader.readISZ(reader.readString _)
      val errorTypeDef = reader.readISZ(readErrorTypeDef _)
      val errorTypeSetDef = reader.readISZ(readErrorTypeSetDef _)
      val alias = reader.readISZ(readErrorAliasDef _)
      val behaveStateMachine = reader.readISZ(readBehaveStateMachine _)
      return Emv2Library(name, useTypes, errorTypeDef, errorTypeSetDef, alias, behaveStateMachine)
    }

    def readErrorKindType(): ErrorKind.Type = {
      val r = reader.readZ()
      return ErrorKind.byOrdinal(r).get
    }

    def readErrorTypeDef(): ErrorTypeDef = {
      val r = readErrorTypeDefT(F)
      return r
    }

    def readErrorTypeDefT(typeParsed: B): ErrorTypeDef = {
      if (!typeParsed) {
        reader.expectZ(Constants.ErrorTypeDef)
      }
      val id = readName()
      val extendType = reader.readOption(readName _)
      val uriFrag = reader.readString()
      return ErrorTypeDef(id, extendType, uriFrag)
    }

    def readErrorAliasDef(): ErrorAliasDef = {
      val r = readErrorAliasDefT(F)
      return r
    }

    def readErrorAliasDefT(typeParsed: B): ErrorAliasDef = {
      if (!typeParsed) {
        reader.expectZ(Constants.ErrorAliasDef)
      }
      val errorType = readName()
      val aliseType = readName()
      return ErrorAliasDef(errorType, aliseType)
    }

    def readErrorTypeSetDef(): ErrorTypeSetDef = {
      val r = readErrorTypeSetDefT(F)
      return r
    }

    def readErrorTypeSetDefT(typeParsed: B): ErrorTypeSetDef = {
      if (!typeParsed) {
        reader.expectZ(Constants.ErrorTypeSetDef)
      }
      val id = readName()
      val errorTypes = reader.readISZ(readName _)
      return ErrorTypeSetDef(id, errorTypes)
    }

    def readBehaveStateMachine(): BehaveStateMachine = {
      val r = readBehaveStateMachineT(F)
      return r
    }

    def readBehaveStateMachineT(typeParsed: B): BehaveStateMachine = {
      if (!typeParsed) {
        reader.expectZ(Constants.BehaveStateMachine)
      }
      val id = readName()
      val events = reader.readISZ(readErrorEvent _)
      val states = reader.readISZ(readErrorState _)
      val transitions = reader.readISZ(readErrorTransition _)
      val properties = reader.readISZ(readProperty _)
      return BehaveStateMachine(id, events, states, transitions, properties)
    }

    def readErrorEvent(): ErrorEvent = {
      val r = readErrorEventT(F)
      return r
    }

    def readErrorEventT(typeParsed: B): ErrorEvent = {
      if (!typeParsed) {
        reader.expectZ(Constants.ErrorEvent)
      }
      val id = readName()
      return ErrorEvent(id)
    }

    def readErrorState(): ErrorState = {
      val r = readErrorStateT(F)
      return r
    }

    def readErrorStateT(typeParsed: B): ErrorState = {
      if (!typeParsed) {
        reader.expectZ(Constants.ErrorState)
      }
      val id = readName()
      val isInitial = reader.readB()
      return ErrorState(id, isInitial)
    }

    def readErrorTransition(): ErrorTransition = {
      val r = readErrorTransitionT(F)
      return r
    }

    def readErrorTransitionT(typeParsed: B): ErrorTransition = {
      if (!typeParsed) {
        reader.expectZ(Constants.ErrorTransition)
      }
      val id = reader.readOption(readName _)
      val sourceState = readName()
      val condition = readErrorCondition()
      val targetState = readName()
      return ErrorTransition(id, sourceState, condition, targetState)
    }

    def readErrorCondition(): ErrorCondition = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.ConditionTrigger => val r = readConditionTriggerT(T); return r
        case Constants.AndCondition => val r = readAndConditionT(T); return r
        case Constants.OrCondition => val r = readOrConditionT(T); return r
        case Constants.AllCondition => val r = readAllConditionT(T); return r
        case Constants.OrMoreCondition => val r = readOrMoreConditionT(T); return r
        case Constants.OrLessCondition => val r = readOrLessConditionT(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of ErrorCondition.")
          val r = readOrLessConditionT(T)
          return r
      }
    }

    def readConditionTrigger(): ConditionTrigger = {
      val r = readConditionTriggerT(F)
      return r
    }

    def readConditionTriggerT(typeParsed: B): ConditionTrigger = {
      if (!typeParsed) {
        reader.expectZ(Constants.ConditionTrigger)
      }
      val events = reader.readISZ(readName _)
      val propagationPoints = reader.readISZ(readEmv2Propagation _)
      return ConditionTrigger(events, propagationPoints)
    }

    def readAndCondition(): AndCondition = {
      val r = readAndConditionT(F)
      return r
    }

    def readAndConditionT(typeParsed: B): AndCondition = {
      if (!typeParsed) {
        reader.expectZ(Constants.AndCondition)
      }
      val op = reader.readISZ(readErrorCondition _)
      return AndCondition(op)
    }

    def readOrCondition(): OrCondition = {
      val r = readOrConditionT(F)
      return r
    }

    def readOrConditionT(typeParsed: B): OrCondition = {
      if (!typeParsed) {
        reader.expectZ(Constants.OrCondition)
      }
      val op = reader.readISZ(readErrorCondition _)
      return OrCondition(op)
    }

    def readAllCondition(): AllCondition = {
      val r = readAllConditionT(F)
      return r
    }

    def readAllConditionT(typeParsed: B): AllCondition = {
      if (!typeParsed) {
        reader.expectZ(Constants.AllCondition)
      }
      val op = reader.readISZ(readErrorCondition _)
      return AllCondition(op)
    }

    def readOrMoreCondition(): OrMoreCondition = {
      val r = readOrMoreConditionT(F)
      return r
    }

    def readOrMoreConditionT(typeParsed: B): OrMoreCondition = {
      if (!typeParsed) {
        reader.expectZ(Constants.OrMoreCondition)
      }
      val number = reader.readZ()
      val conditions = reader.readISZ(readErrorCondition _)
      return OrMoreCondition(number, conditions)
    }

    def readOrLessCondition(): OrLessCondition = {
      val r = readOrLessConditionT(F)
      return r
    }

    def readOrLessConditionT(typeParsed: B): OrLessCondition = {
      if (!typeParsed) {
        reader.expectZ(Constants.OrLessCondition)
      }
      val number = reader.readZ()
      val conditions = reader.readISZ(readErrorCondition _)
      return OrLessCondition(number, conditions)
    }

    def readEmv2Clause(): Emv2Clause = {
      val r = readEmv2ClauseT(F)
      return r
    }

    def readEmv2ClauseT(typeParsed: B): Emv2Clause = {
      if (!typeParsed) {
        reader.expectZ(Constants.Emv2Clause)
      }
      val libraries = reader.readISZ(readName _)
      val propagations = reader.readISZ(readEmv2Propagation _)
      val flows = reader.readISZ(readEmv2Flow _)
      val componentBehavior = reader.readOption(readEmv2BehaviorSection _)
      val properties = reader.readISZ(readProperty _)
      return Emv2Clause(libraries, propagations, flows, componentBehavior, properties)
    }

    def readEmv2Propagation(): Emv2Propagation = {
      val r = readEmv2PropagationT(F)
      return r
    }

    def readEmv2PropagationT(typeParsed: B): Emv2Propagation = {
      if (!typeParsed) {
        reader.expectZ(Constants.Emv2Propagation)
      }
      val direction = readPropagationDirectionType()
      val propagationPoint = readName()
      val errorTokens = reader.readISZ(readName _)
      return Emv2Propagation(direction, propagationPoint, errorTokens)
    }

    def readEmv2Flow(): Emv2Flow = {
      val r = readEmv2FlowT(F)
      return r
    }

    def readEmv2FlowT(typeParsed: B): Emv2Flow = {
      if (!typeParsed) {
        reader.expectZ(Constants.Emv2Flow)
      }
      val identifier = readName()
      val kind = readFlowKindType()
      val sourcePropagation = reader.readOption(readEmv2Propagation _)
      val sinkPropagation = reader.readOption(readEmv2Propagation _)
      val uriFrag = reader.readString()
      return Emv2Flow(identifier, kind, sourcePropagation, sinkPropagation, uriFrag)
    }

    def readEmv2BehaviorSection(): Emv2BehaviorSection = {
      val r = readEmv2BehaviorSectionT(F)
      return r
    }

    def readEmv2BehaviorSectionT(typeParsed: B): Emv2BehaviorSection = {
      if (!typeParsed) {
        reader.expectZ(Constants.Emv2BehaviorSection)
      }
      val events = reader.readISZ(readErrorEvent _)
      val transitions = reader.readISZ(readErrorTransition _)
      val propagations = reader.readISZ(readErrorPropagation _)
      return Emv2BehaviorSection(events, transitions, propagations)
    }

    def readErrorPropagation(): ErrorPropagation = {
      val r = readErrorPropagationT(F)
      return r
    }

    def readErrorPropagationT(typeParsed: B): ErrorPropagation = {
      if (!typeParsed) {
        reader.expectZ(Constants.ErrorPropagation)
      }
      val id = reader.readOption(readName _)
      val source = reader.readISZ(readName _)
      val condition = reader.readOption(readErrorCondition _)
      val target = reader.readISZ(readEmv2Propagation _)
      return ErrorPropagation(id, source, condition, target)
    }

    def readSmfAnnex(): SmfAnnex = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.SmfClause => val r = readSmfClauseT(T); return r
        case Constants.SmfClassification => val r = readSmfClassificationT(T); return r
        case Constants.SmfDeclass => val r = readSmfDeclassT(T); return r
        case Constants.SmfType => val r = readSmfTypeT(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of SmfAnnex.")
          val r = readSmfTypeT(T)
          return r
      }
    }

    def readSmfLib(): SmfLib = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.SmfLibrary => val r = readSmfLibraryT(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of SmfLib.")
          val r = readSmfLibraryT(T)
          return r
      }
    }

    def readSmfClause(): SmfClause = {
      val r = readSmfClauseT(F)
      return r
    }

    def readSmfClauseT(typeParsed: B): SmfClause = {
      if (!typeParsed) {
        reader.expectZ(Constants.SmfClause)
      }
      val classification = reader.readISZ(readSmfClassification _)
      val declass = reader.readISZ(readSmfDeclass _)
      return SmfClause(classification, declass)
    }

    def readSmfClassification(): SmfClassification = {
      val r = readSmfClassificationT(F)
      return r
    }

    def readSmfClassificationT(typeParsed: B): SmfClassification = {
      if (!typeParsed) {
        reader.expectZ(Constants.SmfClassification)
      }
      val portName = readName()
      val typeName = readName()
      return SmfClassification(portName, typeName)
    }

    def readSmfDeclass(): SmfDeclass = {
      val r = readSmfDeclassT(F)
      return r
    }

    def readSmfDeclassT(typeParsed: B): SmfDeclass = {
      if (!typeParsed) {
        reader.expectZ(Constants.SmfDeclass)
      }
      val flowName = readName()
      val srcType = reader.readOption(readName _)
      val snkType = readName()
      return SmfDeclass(flowName, srcType, snkType)
    }

    def readSmfLibrary(): SmfLibrary = {
      val r = readSmfLibraryT(F)
      return r
    }

    def readSmfLibraryT(typeParsed: B): SmfLibrary = {
      if (!typeParsed) {
        reader.expectZ(Constants.SmfLibrary)
      }
      val types = reader.readISZ(readSmfType _)
      return SmfLibrary(types)
    }

    def readSmfType(): SmfType = {
      val r = readSmfTypeT(F)
      return r
    }

    def readSmfTypeT(typeParsed: B): SmfType = {
      if (!typeParsed) {
        reader.expectZ(Constants.SmfType)
      }
      val typeName = readName()
      val parentType = reader.readISZ(readName _)
      return SmfType(typeName, parentType)
    }

    def readOtherAnnex(): OtherAnnex = {
      val r = readOtherAnnexT(F)
      return r
    }

    def readOtherAnnexT(typeParsed: B): OtherAnnex = {
      if (!typeParsed) {
        reader.expectZ(Constants.OtherAnnex)
      }
      val clause = reader.readString()
      return OtherAnnex(clause)
    }

  }

  def to[T](data: ISZ[U8], f: Reader => T): Either[T, MessagePack.ErrorMsg] = {
    val rd = Reader.Default(MessagePack.reader(data))
    rd.reader.init()
    val r = f(rd)
    rd.errorOpt match {
      case Some(e) => return Either.Right(e)
      case _ => return Either.Left(r)
    }
  }

  def fromAadlInstInfo(o: AadlInstInfo, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeAadlInstInfo(o)
    return w.result
  }

  def toAadlInstInfo(data: ISZ[U8]): Either[AadlInstInfo, MessagePack.ErrorMsg] = {
    def fAadlInstInfo(reader: Reader): AadlInstInfo = {
      val r = reader.readAadlInstInfo()
      return r
    }
    val r = to(data, fAadlInstInfo _)
    return r
  }

  def fromAadl(o: Aadl, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeAadl(o)
    return w.result
  }

  def toAadl(data: ISZ[U8]): Either[Aadl, MessagePack.ErrorMsg] = {
    def fAadl(reader: Reader): Aadl = {
      val r = reader.readAadl()
      return r
    }
    val r = to(data, fAadl _)
    return r
  }

  def fromName(o: Name, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeName(o)
    return w.result
  }

  def toName(data: ISZ[U8]): Either[Name, MessagePack.ErrorMsg] = {
    def fName(reader: Reader): Name = {
      val r = reader.readName()
      return r
    }
    val r = to(data, fName _)
    return r
  }

  def fromComponent(o: Component, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeComponent(o)
    return w.result
  }

  def toComponent(data: ISZ[U8]): Either[Component, MessagePack.ErrorMsg] = {
    def fComponent(reader: Reader): Component = {
      val r = reader.readComponent()
      return r
    }
    val r = to(data, fComponent _)
    return r
  }

  def fromClassifier(o: Classifier, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeClassifier(o)
    return w.result
  }

  def toClassifier(data: ISZ[U8]): Either[Classifier, MessagePack.ErrorMsg] = {
    def fClassifier(reader: Reader): Classifier = {
      val r = reader.readClassifier()
      return r
    }
    val r = to(data, fClassifier _)
    return r
  }

  def fromFeature(o: Feature, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFeature(o)
    return w.result
  }

  def toFeature(data: ISZ[U8]): Either[Feature, MessagePack.ErrorMsg] = {
    def fFeature(reader: Reader): Feature = {
      val r = reader.readFeature()
      return r
    }
    val r = to(data, fFeature _)
    return r
  }

  def fromFeatureEnd(o: FeatureEnd, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFeatureEnd(o)
    return w.result
  }

  def toFeatureEnd(data: ISZ[U8]): Either[FeatureEnd, MessagePack.ErrorMsg] = {
    def fFeatureEnd(reader: Reader): FeatureEnd = {
      val r = reader.readFeatureEnd()
      return r
    }
    val r = to(data, fFeatureEnd _)
    return r
  }

  def fromFeatureGroup(o: FeatureGroup, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFeatureGroup(o)
    return w.result
  }

  def toFeatureGroup(data: ISZ[U8]): Either[FeatureGroup, MessagePack.ErrorMsg] = {
    def fFeatureGroup(reader: Reader): FeatureGroup = {
      val r = reader.readFeatureGroup()
      return r
    }
    val r = to(data, fFeatureGroup _)
    return r
  }

  def fromFeatureAccess(o: FeatureAccess, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFeatureAccess(o)
    return w.result
  }

  def toFeatureAccess(data: ISZ[U8]): Either[FeatureAccess, MessagePack.ErrorMsg] = {
    def fFeatureAccess(reader: Reader): FeatureAccess = {
      val r = reader.readFeatureAccess()
      return r
    }
    val r = to(data, fFeatureAccess _)
    return r
  }

  def fromConnection(o: Connection, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeConnection(o)
    return w.result
  }

  def toConnection(data: ISZ[U8]): Either[Connection, MessagePack.ErrorMsg] = {
    def fConnection(reader: Reader): Connection = {
      val r = reader.readConnection()
      return r
    }
    val r = to(data, fConnection _)
    return r
  }

  def fromConnectionInstance(o: ConnectionInstance, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeConnectionInstance(o)
    return w.result
  }

  def toConnectionInstance(data: ISZ[U8]): Either[ConnectionInstance, MessagePack.ErrorMsg] = {
    def fConnectionInstance(reader: Reader): ConnectionInstance = {
      val r = reader.readConnectionInstance()
      return r
    }
    val r = to(data, fConnectionInstance _)
    return r
  }

  def fromConnectionReference(o: ConnectionReference, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeConnectionReference(o)
    return w.result
  }

  def toConnectionReference(data: ISZ[U8]): Either[ConnectionReference, MessagePack.ErrorMsg] = {
    def fConnectionReference(reader: Reader): ConnectionReference = {
      val r = reader.readConnectionReference()
      return r
    }
    val r = to(data, fConnectionReference _)
    return r
  }

  def fromEndPoint(o: EndPoint, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEndPoint(o)
    return w.result
  }

  def toEndPoint(data: ISZ[U8]): Either[EndPoint, MessagePack.ErrorMsg] = {
    def fEndPoint(reader: Reader): EndPoint = {
      val r = reader.readEndPoint()
      return r
    }
    val r = to(data, fEndPoint _)
    return r
  }

  def fromProperty(o: Property, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeProperty(o)
    return w.result
  }

  def toProperty(data: ISZ[U8]): Either[Property, MessagePack.ErrorMsg] = {
    def fProperty(reader: Reader): Property = {
      val r = reader.readProperty()
      return r
    }
    val r = to(data, fProperty _)
    return r
  }

  def fromElementRef(o: ElementRef, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeElementRef(o)
    return w.result
  }

  def toElementRef(data: ISZ[U8]): Either[ElementRef, MessagePack.ErrorMsg] = {
    def fElementRef(reader: Reader): ElementRef = {
      val r = reader.readElementRef()
      return r
    }
    val r = to(data, fElementRef _)
    return r
  }

  def fromAadlElementRef(o: AadlElementRef, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeAadlElementRef(o)
    return w.result
  }

  def toAadlElementRef(data: ISZ[U8]): Either[AadlElementRef, MessagePack.ErrorMsg] = {
    def fAadlElementRef(reader: Reader): AadlElementRef = {
      val r = reader.readAadlElementRef()
      return r
    }
    val r = to(data, fAadlElementRef _)
    return r
  }

  def fromPropertyValue(o: PropertyValue, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writePropertyValue(o)
    return w.result
  }

  def toPropertyValue(data: ISZ[U8]): Either[PropertyValue, MessagePack.ErrorMsg] = {
    def fPropertyValue(reader: Reader): PropertyValue = {
      val r = reader.readPropertyValue()
      return r
    }
    val r = to(data, fPropertyValue _)
    return r
  }

  def fromClassifierProp(o: ClassifierProp, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeClassifierProp(o)
    return w.result
  }

  def toClassifierProp(data: ISZ[U8]): Either[ClassifierProp, MessagePack.ErrorMsg] = {
    def fClassifierProp(reader: Reader): ClassifierProp = {
      val r = reader.readClassifierProp()
      return r
    }
    val r = to(data, fClassifierProp _)
    return r
  }

  def fromRangeProp(o: RangeProp, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeRangeProp(o)
    return w.result
  }

  def toRangeProp(data: ISZ[U8]): Either[RangeProp, MessagePack.ErrorMsg] = {
    def fRangeProp(reader: Reader): RangeProp = {
      val r = reader.readRangeProp()
      return r
    }
    val r = to(data, fRangeProp _)
    return r
  }

  def fromRecordProp(o: RecordProp, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeRecordProp(o)
    return w.result
  }

  def toRecordProp(data: ISZ[U8]): Either[RecordProp, MessagePack.ErrorMsg] = {
    def fRecordProp(reader: Reader): RecordProp = {
      val r = reader.readRecordProp()
      return r
    }
    val r = to(data, fRecordProp _)
    return r
  }

  def fromReferenceProp(o: ReferenceProp, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeReferenceProp(o)
    return w.result
  }

  def toReferenceProp(data: ISZ[U8]): Either[ReferenceProp, MessagePack.ErrorMsg] = {
    def fReferenceProp(reader: Reader): ReferenceProp = {
      val r = reader.readReferenceProp()
      return r
    }
    val r = to(data, fReferenceProp _)
    return r
  }

  def fromUnitProp(o: UnitProp, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeUnitProp(o)
    return w.result
  }

  def toUnitProp(data: ISZ[U8]): Either[UnitProp, MessagePack.ErrorMsg] = {
    def fUnitProp(reader: Reader): UnitProp = {
      val r = reader.readUnitProp()
      return r
    }
    val r = to(data, fUnitProp _)
    return r
  }

  def fromValueProp(o: ValueProp, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeValueProp(o)
    return w.result
  }

  def toValueProp(data: ISZ[U8]): Either[ValueProp, MessagePack.ErrorMsg] = {
    def fValueProp(reader: Reader): ValueProp = {
      val r = reader.readValueProp()
      return r
    }
    val r = to(data, fValueProp _)
    return r
  }

  def fromMode(o: Mode, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeMode(o)
    return w.result
  }

  def toMode(data: ISZ[U8]): Either[Mode, MessagePack.ErrorMsg] = {
    def fMode(reader: Reader): Mode = {
      val r = reader.readMode()
      return r
    }
    val r = to(data, fMode _)
    return r
  }

  def fromFlow(o: Flow, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFlow(o)
    return w.result
  }

  def toFlow(data: ISZ[U8]): Either[Flow, MessagePack.ErrorMsg] = {
    def fFlow(reader: Reader): Flow = {
      val r = reader.readFlow()
      return r
    }
    val r = to(data, fFlow _)
    return r
  }

  def fromAnnex(o: Annex, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeAnnex(o)
    return w.result
  }

  def toAnnex(data: ISZ[U8]): Either[Annex, MessagePack.ErrorMsg] = {
    def fAnnex(reader: Reader): Annex = {
      val r = reader.readAnnex()
      return r
    }
    val r = to(data, fAnnex _)
    return r
  }

  def fromAnnexClause(o: AnnexClause, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeAnnexClause(o)
    return w.result
  }

  def toAnnexClause(data: ISZ[U8]): Either[AnnexClause, MessagePack.ErrorMsg] = {
    def fAnnexClause(reader: Reader): AnnexClause = {
      val r = reader.readAnnexClause()
      return r
    }
    val r = to(data, fAnnexClause _)
    return r
  }

  def fromAnnexLib(o: AnnexLib, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeAnnexLib(o)
    return w.result
  }

  def toAnnexLib(data: ISZ[U8]): Either[AnnexLib, MessagePack.ErrorMsg] = {
    def fAnnexLib(reader: Reader): AnnexLib = {
      val r = reader.readAnnexLib()
      return r
    }
    val r = to(data, fAnnexLib _)
    return r
  }

  def fromEmv2Annex(o: Emv2Annex, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEmv2Annex(o)
    return w.result
  }

  def toEmv2Annex(data: ISZ[U8]): Either[Emv2Annex, MessagePack.ErrorMsg] = {
    def fEmv2Annex(reader: Reader): Emv2Annex = {
      val r = reader.readEmv2Annex()
      return r
    }
    val r = to(data, fEmv2Annex _)
    return r
  }

  def fromEmv2Lib(o: Emv2Lib, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEmv2Lib(o)
    return w.result
  }

  def toEmv2Lib(data: ISZ[U8]): Either[Emv2Lib, MessagePack.ErrorMsg] = {
    def fEmv2Lib(reader: Reader): Emv2Lib = {
      val r = reader.readEmv2Lib()
      return r
    }
    val r = to(data, fEmv2Lib _)
    return r
  }

  def fromEmv2ElementRef(o: Emv2ElementRef, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEmv2ElementRef(o)
    return w.result
  }

  def toEmv2ElementRef(data: ISZ[U8]): Either[Emv2ElementRef, MessagePack.ErrorMsg] = {
    def fEmv2ElementRef(reader: Reader): Emv2ElementRef = {
      val r = reader.readEmv2ElementRef()
      return r
    }
    val r = to(data, fEmv2ElementRef _)
    return r
  }

  def fromEmv2Library(o: Emv2Library, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEmv2Library(o)
    return w.result
  }

  def toEmv2Library(data: ISZ[U8]): Either[Emv2Library, MessagePack.ErrorMsg] = {
    def fEmv2Library(reader: Reader): Emv2Library = {
      val r = reader.readEmv2Library()
      return r
    }
    val r = to(data, fEmv2Library _)
    return r
  }

  def fromErrorTypeDef(o: ErrorTypeDef, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeErrorTypeDef(o)
    return w.result
  }

  def toErrorTypeDef(data: ISZ[U8]): Either[ErrorTypeDef, MessagePack.ErrorMsg] = {
    def fErrorTypeDef(reader: Reader): ErrorTypeDef = {
      val r = reader.readErrorTypeDef()
      return r
    }
    val r = to(data, fErrorTypeDef _)
    return r
  }

  def fromErrorAliasDef(o: ErrorAliasDef, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeErrorAliasDef(o)
    return w.result
  }

  def toErrorAliasDef(data: ISZ[U8]): Either[ErrorAliasDef, MessagePack.ErrorMsg] = {
    def fErrorAliasDef(reader: Reader): ErrorAliasDef = {
      val r = reader.readErrorAliasDef()
      return r
    }
    val r = to(data, fErrorAliasDef _)
    return r
  }

  def fromErrorTypeSetDef(o: ErrorTypeSetDef, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeErrorTypeSetDef(o)
    return w.result
  }

  def toErrorTypeSetDef(data: ISZ[U8]): Either[ErrorTypeSetDef, MessagePack.ErrorMsg] = {
    def fErrorTypeSetDef(reader: Reader): ErrorTypeSetDef = {
      val r = reader.readErrorTypeSetDef()
      return r
    }
    val r = to(data, fErrorTypeSetDef _)
    return r
  }

  def fromBehaveStateMachine(o: BehaveStateMachine, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBehaveStateMachine(o)
    return w.result
  }

  def toBehaveStateMachine(data: ISZ[U8]): Either[BehaveStateMachine, MessagePack.ErrorMsg] = {
    def fBehaveStateMachine(reader: Reader): BehaveStateMachine = {
      val r = reader.readBehaveStateMachine()
      return r
    }
    val r = to(data, fBehaveStateMachine _)
    return r
  }

  def fromErrorEvent(o: ErrorEvent, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeErrorEvent(o)
    return w.result
  }

  def toErrorEvent(data: ISZ[U8]): Either[ErrorEvent, MessagePack.ErrorMsg] = {
    def fErrorEvent(reader: Reader): ErrorEvent = {
      val r = reader.readErrorEvent()
      return r
    }
    val r = to(data, fErrorEvent _)
    return r
  }

  def fromErrorState(o: ErrorState, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeErrorState(o)
    return w.result
  }

  def toErrorState(data: ISZ[U8]): Either[ErrorState, MessagePack.ErrorMsg] = {
    def fErrorState(reader: Reader): ErrorState = {
      val r = reader.readErrorState()
      return r
    }
    val r = to(data, fErrorState _)
    return r
  }

  def fromErrorTransition(o: ErrorTransition, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeErrorTransition(o)
    return w.result
  }

  def toErrorTransition(data: ISZ[U8]): Either[ErrorTransition, MessagePack.ErrorMsg] = {
    def fErrorTransition(reader: Reader): ErrorTransition = {
      val r = reader.readErrorTransition()
      return r
    }
    val r = to(data, fErrorTransition _)
    return r
  }

  def fromErrorCondition(o: ErrorCondition, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeErrorCondition(o)
    return w.result
  }

  def toErrorCondition(data: ISZ[U8]): Either[ErrorCondition, MessagePack.ErrorMsg] = {
    def fErrorCondition(reader: Reader): ErrorCondition = {
      val r = reader.readErrorCondition()
      return r
    }
    val r = to(data, fErrorCondition _)
    return r
  }

  def fromConditionTrigger(o: ConditionTrigger, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeConditionTrigger(o)
    return w.result
  }

  def toConditionTrigger(data: ISZ[U8]): Either[ConditionTrigger, MessagePack.ErrorMsg] = {
    def fConditionTrigger(reader: Reader): ConditionTrigger = {
      val r = reader.readConditionTrigger()
      return r
    }
    val r = to(data, fConditionTrigger _)
    return r
  }

  def fromAndCondition(o: AndCondition, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeAndCondition(o)
    return w.result
  }

  def toAndCondition(data: ISZ[U8]): Either[AndCondition, MessagePack.ErrorMsg] = {
    def fAndCondition(reader: Reader): AndCondition = {
      val r = reader.readAndCondition()
      return r
    }
    val r = to(data, fAndCondition _)
    return r
  }

  def fromOrCondition(o: OrCondition, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeOrCondition(o)
    return w.result
  }

  def toOrCondition(data: ISZ[U8]): Either[OrCondition, MessagePack.ErrorMsg] = {
    def fOrCondition(reader: Reader): OrCondition = {
      val r = reader.readOrCondition()
      return r
    }
    val r = to(data, fOrCondition _)
    return r
  }

  def fromAllCondition(o: AllCondition, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeAllCondition(o)
    return w.result
  }

  def toAllCondition(data: ISZ[U8]): Either[AllCondition, MessagePack.ErrorMsg] = {
    def fAllCondition(reader: Reader): AllCondition = {
      val r = reader.readAllCondition()
      return r
    }
    val r = to(data, fAllCondition _)
    return r
  }

  def fromOrMoreCondition(o: OrMoreCondition, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeOrMoreCondition(o)
    return w.result
  }

  def toOrMoreCondition(data: ISZ[U8]): Either[OrMoreCondition, MessagePack.ErrorMsg] = {
    def fOrMoreCondition(reader: Reader): OrMoreCondition = {
      val r = reader.readOrMoreCondition()
      return r
    }
    val r = to(data, fOrMoreCondition _)
    return r
  }

  def fromOrLessCondition(o: OrLessCondition, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeOrLessCondition(o)
    return w.result
  }

  def toOrLessCondition(data: ISZ[U8]): Either[OrLessCondition, MessagePack.ErrorMsg] = {
    def fOrLessCondition(reader: Reader): OrLessCondition = {
      val r = reader.readOrLessCondition()
      return r
    }
    val r = to(data, fOrLessCondition _)
    return r
  }

  def fromEmv2Clause(o: Emv2Clause, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEmv2Clause(o)
    return w.result
  }

  def toEmv2Clause(data: ISZ[U8]): Either[Emv2Clause, MessagePack.ErrorMsg] = {
    def fEmv2Clause(reader: Reader): Emv2Clause = {
      val r = reader.readEmv2Clause()
      return r
    }
    val r = to(data, fEmv2Clause _)
    return r
  }

  def fromEmv2Propagation(o: Emv2Propagation, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEmv2Propagation(o)
    return w.result
  }

  def toEmv2Propagation(data: ISZ[U8]): Either[Emv2Propagation, MessagePack.ErrorMsg] = {
    def fEmv2Propagation(reader: Reader): Emv2Propagation = {
      val r = reader.readEmv2Propagation()
      return r
    }
    val r = to(data, fEmv2Propagation _)
    return r
  }

  def fromEmv2Flow(o: Emv2Flow, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEmv2Flow(o)
    return w.result
  }

  def toEmv2Flow(data: ISZ[U8]): Either[Emv2Flow, MessagePack.ErrorMsg] = {
    def fEmv2Flow(reader: Reader): Emv2Flow = {
      val r = reader.readEmv2Flow()
      return r
    }
    val r = to(data, fEmv2Flow _)
    return r
  }

  def fromEmv2BehaviorSection(o: Emv2BehaviorSection, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeEmv2BehaviorSection(o)
    return w.result
  }

  def toEmv2BehaviorSection(data: ISZ[U8]): Either[Emv2BehaviorSection, MessagePack.ErrorMsg] = {
    def fEmv2BehaviorSection(reader: Reader): Emv2BehaviorSection = {
      val r = reader.readEmv2BehaviorSection()
      return r
    }
    val r = to(data, fEmv2BehaviorSection _)
    return r
  }

  def fromErrorPropagation(o: ErrorPropagation, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeErrorPropagation(o)
    return w.result
  }

  def toErrorPropagation(data: ISZ[U8]): Either[ErrorPropagation, MessagePack.ErrorMsg] = {
    def fErrorPropagation(reader: Reader): ErrorPropagation = {
      val r = reader.readErrorPropagation()
      return r
    }
    val r = to(data, fErrorPropagation _)
    return r
  }

  def fromSmfAnnex(o: SmfAnnex, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeSmfAnnex(o)
    return w.result
  }

  def toSmfAnnex(data: ISZ[U8]): Either[SmfAnnex, MessagePack.ErrorMsg] = {
    def fSmfAnnex(reader: Reader): SmfAnnex = {
      val r = reader.readSmfAnnex()
      return r
    }
    val r = to(data, fSmfAnnex _)
    return r
  }

  def fromSmfLib(o: SmfLib, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeSmfLib(o)
    return w.result
  }

  def toSmfLib(data: ISZ[U8]): Either[SmfLib, MessagePack.ErrorMsg] = {
    def fSmfLib(reader: Reader): SmfLib = {
      val r = reader.readSmfLib()
      return r
    }
    val r = to(data, fSmfLib _)
    return r
  }

  def fromSmfClause(o: SmfClause, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeSmfClause(o)
    return w.result
  }

  def toSmfClause(data: ISZ[U8]): Either[SmfClause, MessagePack.ErrorMsg] = {
    def fSmfClause(reader: Reader): SmfClause = {
      val r = reader.readSmfClause()
      return r
    }
    val r = to(data, fSmfClause _)
    return r
  }

  def fromSmfClassification(o: SmfClassification, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeSmfClassification(o)
    return w.result
  }

  def toSmfClassification(data: ISZ[U8]): Either[SmfClassification, MessagePack.ErrorMsg] = {
    def fSmfClassification(reader: Reader): SmfClassification = {
      val r = reader.readSmfClassification()
      return r
    }
    val r = to(data, fSmfClassification _)
    return r
  }

  def fromSmfDeclass(o: SmfDeclass, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeSmfDeclass(o)
    return w.result
  }

  def toSmfDeclass(data: ISZ[U8]): Either[SmfDeclass, MessagePack.ErrorMsg] = {
    def fSmfDeclass(reader: Reader): SmfDeclass = {
      val r = reader.readSmfDeclass()
      return r
    }
    val r = to(data, fSmfDeclass _)
    return r
  }

  def fromSmfLibrary(o: SmfLibrary, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeSmfLibrary(o)
    return w.result
  }

  def toSmfLibrary(data: ISZ[U8]): Either[SmfLibrary, MessagePack.ErrorMsg] = {
    def fSmfLibrary(reader: Reader): SmfLibrary = {
      val r = reader.readSmfLibrary()
      return r
    }
    val r = to(data, fSmfLibrary _)
    return r
  }

  def fromSmfType(o: SmfType, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeSmfType(o)
    return w.result
  }

  def toSmfType(data: ISZ[U8]): Either[SmfType, MessagePack.ErrorMsg] = {
    def fSmfType(reader: Reader): SmfType = {
      val r = reader.readSmfType()
      return r
    }
    val r = to(data, fSmfType _)
    return r
  }

  def fromOtherAnnex(o: OtherAnnex, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeOtherAnnex(o)
    return w.result
  }

  def toOtherAnnex(data: ISZ[U8]): Either[OtherAnnex, MessagePack.ErrorMsg] = {
    def fOtherAnnex(reader: Reader): OtherAnnex = {
      val r = reader.readOtherAnnex()
      return r
    }
    val r = to(data, fOtherAnnex _)
    return r
  }

}