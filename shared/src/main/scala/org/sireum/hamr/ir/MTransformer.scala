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

// This file is auto-generated from AadlAST.scala, BlessAST.scala, Emv2AST.scala, SmfAST.scala

package org.sireum.hamr.ir

import org.sireum._

object MTransformer {

  @record class PreResult[T](continu: B,
                             resultOpt: MOption[T])

  def transformISZ[T](s: IS[Z, T], f: T => MOption[T]): MOption[IS[Z, T]] = {
    val s2: MS[Z, T] = s.toMS
    var changed: B = F
    for (i <- s2.indices) {
      val e: T = s(i)
      val r: MOption[T] = f(e)
      changed = changed || r.nonEmpty
      s2(i) = r.getOrElse(e)
    }
    if (changed) {
      return MSome(s2.toIS)
    } else {
      return MNone()
    }
  }

  def transformOption[T](option: Option[T], f: T => MOption[T]): MOption[Option[T]] = {
    option match {
      case Some(v) =>
        val r = f(v)
        r match {
          case MSome(v2) => return MSome(Some(v2))
          case _ => return MNone()
        }
      case _ => return MNone()
    }
  }

  val PreResultSmfClause: PreResult[SmfClause] = PreResult(T, MNone())

  val PostResultSmfClause: MOption[SmfClause] = MNone()

  val PreResultSmfClassification: PreResult[SmfClassification] = PreResult(T, MNone())

  val PostResultSmfClassification: MOption[SmfClassification] = MNone()

  val PreResultSmfDeclass: PreResult[SmfDeclass] = PreResult(T, MNone())

  val PostResultSmfDeclass: MOption[SmfDeclass] = MNone()

  val PreResultSmfLibrary: PreResult[SmfLibrary] = PreResult(T, MNone())

  val PostResultSmfLibrary: MOption[SmfLibrary] = MNone()

  val PreResultSmfType: PreResult[SmfType] = PreResult(T, MNone())

  val PostResultSmfType: MOption[SmfType] = MNone()

  val PreResultAadl: PreResult[Aadl] = PreResult(T, MNone())

  val PostResultAadl: MOption[Aadl] = MNone()

  val PreResultEmv2ElementRef: PreResult[Emv2ElementRef] = PreResult(T, MNone())

  val PostResultEmv2ElementRef: MOption[Emv2ElementRef] = MNone()

  val PreResultName: PreResult[Name] = PreResult(T, MNone())

  val PostResultName: MOption[Name] = MNone()

  val PreResultComponent: PreResult[Component] = PreResult(T, MNone())

  val PostResultComponent: MOption[Component] = MNone()

  val PreResultEmv2Library: PreResult[Emv2Library] = PreResult(T, MNone())

  val PostResultEmv2Library: MOption[Emv2Library] = MNone()

  val PreResultErrorTypeDef: PreResult[ErrorTypeDef] = PreResult(T, MNone())

  val PostResultErrorTypeDef: MOption[ErrorTypeDef] = MNone()

  val PreResultClassifier: PreResult[Classifier] = PreResult(T, MNone())

  val PostResultClassifier: MOption[Classifier] = MNone()

  val PreResultErrorAliasDef: PreResult[ErrorAliasDef] = PreResult(T, MNone())

  val PostResultErrorAliasDef: MOption[ErrorAliasDef] = MNone()

  val PreResultErrorTypeSetDef: PreResult[ErrorTypeSetDef] = PreResult(T, MNone())

  val PostResultErrorTypeSetDef: MOption[ErrorTypeSetDef] = MNone()

  val PreResultBehaveStateMachine: PreResult[BehaveStateMachine] = PreResult(T, MNone())

  val PostResultBehaveStateMachine: MOption[BehaveStateMachine] = MNone()

  val PreResultFeatureEnd: PreResult[FeatureEnd] = PreResult(T, MNone())

  val PostResultFeatureEnd: MOption[FeatureEnd] = MNone()

  val PreResultErrorEvent: PreResult[ErrorEvent] = PreResult(T, MNone())

  val PostResultErrorEvent: MOption[ErrorEvent] = MNone()

  val PreResultErrorState: PreResult[ErrorState] = PreResult(T, MNone())

  val PostResultErrorState: MOption[ErrorState] = MNone()

  val PreResultErrorTransition: PreResult[ErrorTransition] = PreResult(T, MNone())

  val PostResultErrorTransition: MOption[ErrorTransition] = MNone()

  val PreResultFeatureGroup: PreResult[FeatureGroup] = PreResult(T, MNone())

  val PostResultFeatureGroup: MOption[FeatureGroup] = MNone()

  val PreResultConditionTrigger: PreResult[ConditionTrigger] = PreResult(T, MNone())

  val PostResultConditionTrigger: MOption[ConditionTrigger] = MNone()

  val PreResultAndCondition: PreResult[AndCondition] = PreResult(T, MNone())

  val PostResultAndCondition: MOption[AndCondition] = MNone()

  val PreResultFeatureAccess: PreResult[FeatureAccess] = PreResult(T, MNone())

  val PostResultFeatureAccess: MOption[FeatureAccess] = MNone()

  val PreResultOrCondition: PreResult[OrCondition] = PreResult(T, MNone())

  val PostResultOrCondition: MOption[OrCondition] = MNone()

  val PreResultAllCondition: PreResult[AllCondition] = PreResult(T, MNone())

  val PostResultAllCondition: MOption[AllCondition] = MNone()

  val PreResultOrMoreCondition: PreResult[OrMoreCondition] = PreResult(T, MNone())

  val PostResultOrMoreCondition: MOption[OrMoreCondition] = MNone()

  val PreResultOrLessCondition: PreResult[OrLessCondition] = PreResult(T, MNone())

  val PostResultOrLessCondition: MOption[OrLessCondition] = MNone()

  val PreResultEmv2Clause: PreResult[Emv2Clause] = PreResult(T, MNone())

  val PostResultEmv2Clause: MOption[Emv2Clause] = MNone()

  val PreResultEmv2Propagation: PreResult[Emv2Propagation] = PreResult(T, MNone())

  val PostResultEmv2Propagation: MOption[Emv2Propagation] = MNone()

  val PreResultConnection: PreResult[Connection] = PreResult(T, MNone())

  val PostResultConnection: MOption[Connection] = MNone()

  val PreResultEmv2Flow: PreResult[Emv2Flow] = PreResult(T, MNone())

  val PostResultEmv2Flow: MOption[Emv2Flow] = MNone()

  val PreResultEmv2BehaviorSection: PreResult[Emv2BehaviorSection] = PreResult(T, MNone())

  val PostResultEmv2BehaviorSection: MOption[Emv2BehaviorSection] = MNone()

  val PreResultConnectionInstance: PreResult[ConnectionInstance] = PreResult(T, MNone())

  val PostResultConnectionInstance: MOption[ConnectionInstance] = MNone()

  val PreResultErrorPropagation: PreResult[ErrorPropagation] = PreResult(T, MNone())

  val PostResultErrorPropagation: MOption[ErrorPropagation] = MNone()

  val PreResultConnectionReference: PreResult[ConnectionReference] = PreResult(T, MNone())

  val PostResultConnectionReference: MOption[ConnectionReference] = MNone()

  val PreResultEndPoint: PreResult[EndPoint] = PreResult(T, MNone())

  val PostResultEndPoint: MOption[EndPoint] = MNone()

  val PreResultProperty: PreResult[Property] = PreResult(T, MNone())

  val PostResultProperty: MOption[Property] = MNone()

  val PreResultAadlElementRef: PreResult[AadlElementRef] = PreResult(T, MNone())

  val PostResultAadlElementRef: MOption[AadlElementRef] = MNone()

  val PreResultClassifierProp: PreResult[PropertyValue] = PreResult(T, MNone())

  val PostResultClassifierProp: MOption[PropertyValue] = MNone()

  val PreResultRangeProp: PreResult[PropertyValue] = PreResult(T, MNone())

  val PostResultRangeProp: MOption[PropertyValue] = MNone()

  val PreResultRecordProp: PreResult[PropertyValue] = PreResult(T, MNone())

  val PostResultRecordProp: MOption[PropertyValue] = MNone()

  val PreResultReferenceProp: PreResult[PropertyValue] = PreResult(T, MNone())

  val PostResultReferenceProp: MOption[PropertyValue] = MNone()

  val PreResultUnitProp: PreResult[PropertyValue] = PreResult(T, MNone())

  val PostResultUnitProp: MOption[PropertyValue] = MNone()

  val PreResultValueProp: PreResult[PropertyValue] = PreResult(T, MNone())

  val PostResultValueProp: MOption[PropertyValue] = MNone()

  val PreResultMode: PreResult[Mode] = PreResult(T, MNone())

  val PostResultMode: MOption[Mode] = MNone()

  val PreResultFlow: PreResult[Flow] = PreResult(T, MNone())

  val PostResultFlow: MOption[Flow] = MNone()

  val PreResultAnnex: PreResult[Annex] = PreResult(T, MNone())

  val PostResultAnnex: MOption[Annex] = MNone()

  val PreResultOtherAnnex: PreResult[OtherAnnex] = PreResult(T, MNone())

  val PostResultOtherAnnex: MOption[OtherAnnex] = MNone()

  val PreResultOtherLib: PreResult[OtherLib] = PreResult(T, MNone())

  val PostResultOtherLib: MOption[OtherLib] = MNone()

  val PreResultBTSBLESSAnnexClause: PreResult[BTSBLESSAnnexClause] = PreResult(T, MNone())

  val PostResultBTSBLESSAnnexClause: MOption[BTSBLESSAnnexClause] = MNone()

  val PreResultBTSVariableDeclaration: PreResult[BTSVariableDeclaration] = PreResult(T, MNone())

  val PostResultBTSVariableDeclaration: MOption[BTSVariableDeclaration] = MNone()

  val PreResultBTSClassifier: PreResult[BTSClassifier] = PreResult(T, MNone())

  val PostResultBTSClassifier: MOption[BTSClassifier] = MNone()

  val PreResultBLESSIntConst: PreResult[BLESSIntConst] = PreResult(T, MNone())

  val PostResultBLESSIntConst: MOption[BLESSIntConst] = MNone()

  val PreResultBTSStateDeclaration: PreResult[BTSStateDeclaration] = PreResult(T, MNone())

  val PostResultBTSStateDeclaration: MOption[BTSStateDeclaration] = MNone()

  val PreResultBTSTransition: PreResult[BTSTransition] = PreResult(T, MNone())

  val PostResultBTSTransition: MOption[BTSTransition] = MNone()

  val PreResultBTSTransitionLabel: PreResult[BTSTransitionLabel] = PreResult(T, MNone())

  val PostResultBTSTransitionLabel: MOption[BTSTransitionLabel] = MNone()

  val PreResultBTSDispatchCondition: PreResult[BTSDispatchCondition] = PreResult(T, MNone())

  val PostResultBTSDispatchCondition: MOption[BTSDispatchCondition] = MNone()

  val PreResultBTSDispatchConjunction: PreResult[BTSDispatchConjunction] = PreResult(T, MNone())

  val PostResultBTSDispatchConjunction: MOption[BTSDispatchConjunction] = MNone()

  val PreResultBTSDispatchTriggerStop: PreResult[BTSDispatchTriggerStop] = PreResult(T, MNone())

  val PostResultBTSDispatchTriggerStop: MOption[BTSDispatchTriggerStop] = MNone()

  val PreResultBTSDispatchTriggerPort: PreResult[BTSDispatchTriggerPort] = PreResult(T, MNone())

  val PostResultBTSDispatchTriggerPort: MOption[BTSDispatchTriggerPort] = MNone()

  val PreResultBTSDispatchTriggerTimeout: PreResult[BTSDispatchTriggerTimeout] = PreResult(T, MNone())

  val PostResultBTSDispatchTriggerTimeout: MOption[BTSDispatchTriggerTimeout] = MNone()

  val PreResultBTSExecuteConditionExp: PreResult[BTSExecuteConditionExp] = PreResult(T, MNone())

  val PostResultBTSExecuteConditionExp: MOption[BTSExecuteConditionExp] = MNone()

  val PreResultBTSExecuteConditionTimeout: PreResult[BTSExecuteConditionTimeout] = PreResult(T, MNone())

  val PostResultBTSExecuteConditionTimeout: MOption[BTSExecuteConditionTimeout] = MNone()

  val PreResultBTSExecuteConditionOtherwise: PreResult[BTSExecuteConditionOtherwise] = PreResult(T, MNone())

  val PostResultBTSExecuteConditionOtherwise: MOption[BTSExecuteConditionOtherwise] = MNone()

  val PreResultBTSModeCondition: PreResult[BTSModeCondition] = PreResult(T, MNone())

  val PostResultBTSModeCondition: MOption[BTSModeCondition] = MNone()

  val PreResultBTSTriggerLogicalExpression: PreResult[BTSTriggerLogicalExpression] = PreResult(T, MNone())

  val PostResultBTSTriggerLogicalExpression: MOption[BTSTriggerLogicalExpression] = MNone()

  val PreResultBTSSubcomponentPort: PreResult[BTSSubcomponentPort] = PreResult(T, MNone())

  val PostResultBTSSubcomponentPort: MOption[BTSSubcomponentPort] = MNone()

  val PreResultBTSInternalCondition: PreResult[BTSInternalCondition] = PreResult(T, MNone())

  val PostResultBTSInternalCondition: MOption[BTSInternalCondition] = MNone()

  val PreResultBTSNamedAssertion: PreResult[BTSNamedAssertion] = PreResult(T, MNone())

  val PostResultBTSNamedAssertion: MOption[BTSNamedAssertion] = MNone()

  val PreResultBTSNamedFunction: PreResult[BTSNamedFunction] = PreResult(T, MNone())

  val PostResultBTSNamedFunction: MOption[BTSNamedFunction] = MNone()

  val PreResultBTSNamedEnumeration: PreResult[BTSNamedEnumeration] = PreResult(T, MNone())

  val PostResultBTSNamedEnumeration: MOption[BTSNamedEnumeration] = MNone()

  val PreResultBTSNamelessAssertion: PreResult[BTSNamelessAssertion] = PreResult(T, MNone())

  val PostResultBTSNamelessAssertion: MOption[BTSNamelessAssertion] = MNone()

  val PreResultBTSNamelessFunction: PreResult[BTSNamelessFunction] = PreResult(T, MNone())

  val PostResultBTSNamelessFunction: MOption[BTSNamelessFunction] = MNone()

  val PreResultBTSNamelessEnumeration: PreResult[BTSNamelessEnumeration] = PreResult(T, MNone())

  val PostResultBTSNamelessEnumeration: MOption[BTSNamelessEnumeration] = MNone()

  val PreResultBTSEnumerationPairs: PreResult[BTSEnumerationPairs] = PreResult(T, MNone())

  val PostResultBTSEnumerationPairs: MOption[BTSEnumerationPairs] = MNone()

  val PreResultBTSEnumerationPair: PreResult[BTSEnumerationPair] = PreResult(T, MNone())

  val PostResultBTSEnumerationPair: MOption[BTSEnumerationPair] = MNone()

  val PreResultBTSInvocation: PreResult[BTSInvocation] = PreResult(T, MNone())

  val PostResultBTSInvocation: MOption[BTSInvocation] = MNone()

  val PreResultBTSActualParameter: PreResult[BTSActualParameter] = PreResult(T, MNone())

  val PostResultBTSActualParameter: MOption[BTSActualParameter] = MNone()

  val PreResultBTSVariable: PreResult[BTSVariable] = PreResult(T, MNone())

  val PostResultBTSVariable: MOption[BTSVariable] = MNone()

  val PreResultBTSBehaviorActions: PreResult[BTSBehaviorActions] = PreResult(T, MNone())

  val PostResultBTSBehaviorActions: MOption[BTSBehaviorActions] = MNone()

  val PreResultBTSAssertedAction: PreResult[BTSAssertedAction] = PreResult(T, MNone())

  val PostResultBTSAssertedAction: MOption[BTSAssertedAction] = MNone()

  val PreResultBTSSkipAction: PreResult[BTSSkipAction] = PreResult(T, MNone())

  val PostResultBTSSkipAction: MOption[BTSSkipAction] = MNone()

  val PreResultBTSAssignmentAction: PreResult[BTSAssignmentAction] = PreResult(T, MNone())

  val PostResultBTSAssignmentAction: MOption[BTSAssignmentAction] = MNone()

  val PreResultBTSSetMode: PreResult[BTSSetMode] = PreResult(T, MNone())

  val PostResultBTSSetMode: MOption[BTSSetMode] = MNone()

  val PreResultBTSWhenThrow: PreResult[BTSWhenThrow] = PreResult(T, MNone())

  val PostResultBTSWhenThrow: MOption[BTSWhenThrow] = MNone()

  val PreResultBTSFetchAdd: PreResult[BTSFetchAdd] = PreResult(T, MNone())

  val PostResultBTSFetchAdd: MOption[BTSFetchAdd] = MNone()

  val PreResultBTSFetchOr: PreResult[BTSFetchOr] = PreResult(T, MNone())

  val PostResultBTSFetchOr: MOption[BTSFetchOr] = MNone()

  val PreResultBTSFetchAnd: PreResult[BTSFetchAnd] = PreResult(T, MNone())

  val PostResultBTSFetchAnd: MOption[BTSFetchAnd] = MNone()

  val PreResultBTSFetchXor: PreResult[BTSFetchXor] = PreResult(T, MNone())

  val PostResultBTSFetchXor: MOption[BTSFetchXor] = MNone()

  val PreResultBTSSwap: PreResult[BTSSwap] = PreResult(T, MNone())

  val PostResultBTSSwap: MOption[BTSSwap] = MNone()

  val PreResultBTSSubprogramCallAction: PreResult[BTSSubprogramCallAction] = PreResult(T, MNone())

  val PostResultBTSSubprogramCallAction: MOption[BTSSubprogramCallAction] = MNone()

  val PreResultBTSFormalActual: PreResult[BTSFormalActual] = PreResult(T, MNone())

  val PostResultBTSFormalActual: MOption[BTSFormalActual] = MNone()

  val PreResultBTSPortOutput: PreResult[BTSPortOutput] = PreResult(T, MNone())

  val PostResultBTSPortOutput: MOption[BTSPortOutput] = MNone()

  val PreResultBTSPortInput: PreResult[BTSPortInput] = PreResult(T, MNone())

  val PostResultBTSPortInput: MOption[BTSPortInput] = MNone()

  val PreResultBTSFrozenPortAction: PreResult[BTSFrozenPortAction] = PreResult(T, MNone())

  val PostResultBTSFrozenPortAction: MOption[BTSFrozenPortAction] = MNone()

  val PreResultBTSPause: PreResult[BTSPause] = PreResult(T, MNone())

  val PostResultBTSPause: MOption[BTSPause] = MNone()

  val PreResultBTSIfBLESSAction: PreResult[BTSIfBLESSAction] = PreResult(T, MNone())

  val PostResultBTSIfBLESSAction: MOption[BTSIfBLESSAction] = MNone()

  val PreResultBTSGuardedAction: PreResult[BTSGuardedAction] = PreResult(T, MNone())

  val PostResultBTSGuardedAction: MOption[BTSGuardedAction] = MNone()

  val PreResultBTSIfBAAction: PreResult[BTSIfBAAction] = PreResult(T, MNone())

  val PostResultBTSIfBAAction: MOption[BTSIfBAAction] = MNone()

  val PreResultBTSConditionalActions: PreResult[BTSConditionalActions] = PreResult(T, MNone())

  val PostResultBTSConditionalActions: MOption[BTSConditionalActions] = MNone()

  val PreResultBTSWhileLoop: PreResult[BTSWhileLoop] = PreResult(T, MNone())

  val PostResultBTSWhileLoop: MOption[BTSWhileLoop] = MNone()

  val PreResultBTSForLoop: PreResult[BTSForLoop] = PreResult(T, MNone())

  val PostResultBTSForLoop: MOption[BTSForLoop] = MNone()

  val PreResultBTSDoUntilLoop: PreResult[BTSDoUntilLoop] = PreResult(T, MNone())

  val PostResultBTSDoUntilLoop: MOption[BTSDoUntilLoop] = MNone()

  val PreResultBTSExistentialLatticeQuantification: PreResult[BTSExistentialLatticeQuantification] = PreResult(T, MNone())

  val PostResultBTSExistentialLatticeQuantification: MOption[BTSExistentialLatticeQuantification] = MNone()

  val PreResultBTSCatchClauseTerm: PreResult[BTSCatchClauseTerm] = PreResult(T, MNone())

  val PostResultBTSCatchClauseTerm: MOption[BTSCatchClauseTerm] = MNone()

  val PreResultBTSUniversalLatticeQuantification: PreResult[BTSUniversalLatticeQuantification] = PreResult(T, MNone())

  val PostResultBTSUniversalLatticeQuantification: MOption[BTSUniversalLatticeQuantification] = MNone()

  val PreResultBTSUnaryExp: PreResult[BTSUnaryExp] = PreResult(T, MNone())

  val PostResultBTSUnaryExp: MOption[BTSUnaryExp] = MNone()

  val PreResultBTSBinaryExp: PreResult[BTSBinaryExp] = PreResult(T, MNone())

  val PostResultBTSBinaryExp: MOption[BTSBinaryExp] = MNone()

  val PreResultBTSLiteralExp: PreResult[BTSLiteralExp] = PreResult(T, MNone())

  val PostResultBTSLiteralExp: MOption[BTSLiteralExp] = MNone()

  val PreResultBTSVariableNameExp: PreResult[BTSVariableNameExp] = PreResult(T, MNone())

  val PostResultBTSVariableNameExp: MOption[BTSVariableNameExp] = MNone()

  val PreResultBTSPartialName: PreResult[BTSPartialName] = PreResult(T, MNone())

  val PostResultBTSPartialName: MOption[BTSPartialName] = MNone()

  val PreResultBTSIndexingExp: PreResult[BTSIndexingExp] = PreResult(T, MNone())

  val PostResultBTSIndexingExp: MOption[BTSIndexingExp] = MNone()

  val PreResultBTSAccessExp: PreResult[BTSAccessExp] = PreResult(T, MNone())

  val PostResultBTSAccessExp: MOption[BTSAccessExp] = MNone()

  val PreResultBTSFunctionCall: PreResult[BTSFunctionCall] = PreResult(T, MNone())

  val PostResultBTSFunctionCall: MOption[BTSFunctionCall] = MNone()

  val PreResultBTSPortValue: PreResult[BTSPortValue] = PreResult(T, MNone())

  val PostResultBTSPortValue: MOption[BTSPortValue] = MNone()

  val PreResultBTSConditionalExpression: PreResult[BTSConditionalExpression] = PreResult(T, MNone())

  val PostResultBTSConditionalExpression: MOption[BTSConditionalExpression] = MNone()

  val PreResultBTSRange: PreResult[BTSRange] = PreResult(T, MNone())

  val PostResultBTSRange: MOption[BTSRange] = MNone()

  val PreResultBTSBehaviorTime: PreResult[BTSBehaviorTime] = PreResult(T, MNone())

  val PostResultBTSBehaviorTime: MOption[BTSBehaviorTime] = MNone()

  val PreResultTODO: PreResult[TODO] = PreResult(T, MNone())

  val PostResultTODO: MOption[TODO] = MNone()

}

import MTransformer._

@msig trait MTransformer {

  def preSmfAnnex(o: SmfAnnex): PreResult[SmfAnnex] = {
    o match {
      case o: SmfClause =>
        val r: PreResult[SmfAnnex] = preSmfClause(o) match {
         case PreResult(continu, MSome(r: SmfAnnex)) => PreResult(continu, MSome[SmfAnnex](r))
         case PreResult(_, MSome(_)) => halt("Can only produce object of type SmfAnnex")
         case PreResult(continu, _) => PreResult(continu, MNone[SmfAnnex]())
        }
        return r
      case o: SmfClassification =>
        val r: PreResult[SmfAnnex] = preSmfClassification(o) match {
         case PreResult(continu, MSome(r: SmfAnnex)) => PreResult(continu, MSome[SmfAnnex](r))
         case PreResult(_, MSome(_)) => halt("Can only produce object of type SmfAnnex")
         case PreResult(continu, _) => PreResult(continu, MNone[SmfAnnex]())
        }
        return r
      case o: SmfDeclass =>
        val r: PreResult[SmfAnnex] = preSmfDeclass(o) match {
         case PreResult(continu, MSome(r: SmfAnnex)) => PreResult(continu, MSome[SmfAnnex](r))
         case PreResult(_, MSome(_)) => halt("Can only produce object of type SmfAnnex")
         case PreResult(continu, _) => PreResult(continu, MNone[SmfAnnex]())
        }
        return r
      case o: SmfType =>
        val r: PreResult[SmfAnnex] = preSmfType(o) match {
         case PreResult(continu, MSome(r: SmfAnnex)) => PreResult(continu, MSome[SmfAnnex](r))
         case PreResult(_, MSome(_)) => halt("Can only produce object of type SmfAnnex")
         case PreResult(continu, _) => PreResult(continu, MNone[SmfAnnex]())
        }
        return r
    }
  }

  def preSmfLib(o: SmfLib): PreResult[SmfLib] = {
    o match {
      case o: SmfLibrary =>
        val r: PreResult[SmfLib] = preSmfLibrary(o) match {
         case PreResult(continu, MSome(r: SmfLib)) => PreResult(continu, MSome[SmfLib](r))
         case PreResult(_, MSome(_)) => halt("Can only produce object of type SmfLib")
         case PreResult(continu, _) => PreResult(continu, MNone[SmfLib]())
        }
        return r
    }
  }

  def preSmfClause(o: SmfClause): PreResult[SmfClause] = {
    return PreResultSmfClause
  }

  def preSmfClassification(o: SmfClassification): PreResult[SmfClassification] = {
    return PreResultSmfClassification
  }

  def preSmfDeclass(o: SmfDeclass): PreResult[SmfDeclass] = {
    return PreResultSmfDeclass
  }

  def preSmfLibrary(o: SmfLibrary): PreResult[SmfLibrary] = {
    return PreResultSmfLibrary
  }

  def preSmfType(o: SmfType): PreResult[SmfType] = {
    return PreResultSmfType
  }

  def preAadlInstInfo(o: AadlInstInfo): PreResult[AadlInstInfo] = {
    o match {
      case o: Component =>
        val r: PreResult[AadlInstInfo] = preComponent(o) match {
         case PreResult(continu, MSome(r: AadlInstInfo)) => PreResult(continu, MSome[AadlInstInfo](r))
         case PreResult(_, MSome(_)) => halt("Can only produce object of type AadlInstInfo")
         case PreResult(continu, _) => PreResult(continu, MNone[AadlInstInfo]())
        }
        return r
      case o: ErrorTypeDef =>
        val r: PreResult[AadlInstInfo] = preErrorTypeDef(o) match {
         case PreResult(continu, MSome(r: AadlInstInfo)) => PreResult(continu, MSome[AadlInstInfo](r))
         case PreResult(_, MSome(_)) => halt("Can only produce object of type AadlInstInfo")
         case PreResult(continu, _) => PreResult(continu, MNone[AadlInstInfo]())
        }
        return r
      case o: FeatureEnd =>
        val r: PreResult[AadlInstInfo] = preFeatureEnd(o) match {
         case PreResult(continu, MSome(r: AadlInstInfo)) => PreResult(continu, MSome[AadlInstInfo](r))
         case PreResult(_, MSome(_)) => halt("Can only produce object of type AadlInstInfo")
         case PreResult(continu, _) => PreResult(continu, MNone[AadlInstInfo]())
        }
        return r
      case o: FeatureGroup =>
        val r: PreResult[AadlInstInfo] = preFeatureGroup(o) match {
         case PreResult(continu, MSome(r: AadlInstInfo)) => PreResult(continu, MSome[AadlInstInfo](r))
         case PreResult(_, MSome(_)) => halt("Can only produce object of type AadlInstInfo")
         case PreResult(continu, _) => PreResult(continu, MNone[AadlInstInfo]())
        }
        return r
      case o: FeatureAccess =>
        val r: PreResult[AadlInstInfo] = preFeatureAccess(o) match {
         case PreResult(continu, MSome(r: AadlInstInfo)) => PreResult(continu, MSome[AadlInstInfo](r))
         case PreResult(_, MSome(_)) => halt("Can only produce object of type AadlInstInfo")
         case PreResult(continu, _) => PreResult(continu, MNone[AadlInstInfo]())
        }
        return r
      case o: Connection =>
        val r: PreResult[AadlInstInfo] = preConnection(o) match {
         case PreResult(continu, MSome(r: AadlInstInfo)) => PreResult(continu, MSome[AadlInstInfo](r))
         case PreResult(_, MSome(_)) => halt("Can only produce object of type AadlInstInfo")
         case PreResult(continu, _) => PreResult(continu, MNone[AadlInstInfo]())
        }
        return r
      case o: Emv2Flow =>
        val r: PreResult[AadlInstInfo] = preEmv2Flow(o) match {
         case PreResult(continu, MSome(r: AadlInstInfo)) => PreResult(continu, MSome[AadlInstInfo](r))
         case PreResult(_, MSome(_)) => halt("Can only produce object of type AadlInstInfo")
         case PreResult(continu, _) => PreResult(continu, MNone[AadlInstInfo]())
        }
        return r
      case o: Flow =>
        val r: PreResult[AadlInstInfo] = preFlow(o) match {
         case PreResult(continu, MSome(r: AadlInstInfo)) => PreResult(continu, MSome[AadlInstInfo](r))
         case PreResult(_, MSome(_)) => halt("Can only produce object of type AadlInstInfo")
         case PreResult(continu, _) => PreResult(continu, MNone[AadlInstInfo]())
        }
        return r
    }
  }

  def preEmv2Annex(o: Emv2Annex): PreResult[Emv2Annex] = {
    o match {
      case o: ErrorTypeDef =>
        val r: PreResult[Emv2Annex] = preErrorTypeDef(o) match {
         case PreResult(continu, MSome(r: Emv2Annex)) => PreResult(continu, MSome[Emv2Annex](r))
         case PreResult(_, MSome(_)) => halt("Can only produce object of type Emv2Annex")
         case PreResult(continu, _) => PreResult(continu, MNone[Emv2Annex]())
        }
        return r
      case o: ErrorAliasDef =>
        val r: PreResult[Emv2Annex] = preErrorAliasDef(o) match {
         case PreResult(continu, MSome(r: Emv2Annex)) => PreResult(continu, MSome[Emv2Annex](r))
         case PreResult(_, MSome(_)) => halt("Can only produce object of type Emv2Annex")
         case PreResult(continu, _) => PreResult(continu, MNone[Emv2Annex]())
        }
        return r
      case o: ErrorTypeSetDef =>
        val r: PreResult[Emv2Annex] = preErrorTypeSetDef(o) match {
         case PreResult(continu, MSome(r: Emv2Annex)) => PreResult(continu, MSome[Emv2Annex](r))
         case PreResult(_, MSome(_)) => halt("Can only produce object of type Emv2Annex")
         case PreResult(continu, _) => PreResult(continu, MNone[Emv2Annex]())
        }
        return r
      case o: BehaveStateMachine =>
        val r: PreResult[Emv2Annex] = preBehaveStateMachine(o) match {
         case PreResult(continu, MSome(r: Emv2Annex)) => PreResult(continu, MSome[Emv2Annex](r))
         case PreResult(_, MSome(_)) => halt("Can only produce object of type Emv2Annex")
         case PreResult(continu, _) => PreResult(continu, MNone[Emv2Annex]())
        }
        return r
      case o: ErrorEvent =>
        val r: PreResult[Emv2Annex] = preErrorEvent(o) match {
         case PreResult(continu, MSome(r: Emv2Annex)) => PreResult(continu, MSome[Emv2Annex](r))
         case PreResult(_, MSome(_)) => halt("Can only produce object of type Emv2Annex")
         case PreResult(continu, _) => PreResult(continu, MNone[Emv2Annex]())
        }
        return r
      case o: ErrorState =>
        val r: PreResult[Emv2Annex] = preErrorState(o) match {
         case PreResult(continu, MSome(r: Emv2Annex)) => PreResult(continu, MSome[Emv2Annex](r))
         case PreResult(_, MSome(_)) => halt("Can only produce object of type Emv2Annex")
         case PreResult(continu, _) => PreResult(continu, MNone[Emv2Annex]())
        }
        return r
      case o: ErrorTransition =>
        val r: PreResult[Emv2Annex] = preErrorTransition(o) match {
         case PreResult(continu, MSome(r: Emv2Annex)) => PreResult(continu, MSome[Emv2Annex](r))
         case PreResult(_, MSome(_)) => halt("Can only produce object of type Emv2Annex")
         case PreResult(continu, _) => PreResult(continu, MNone[Emv2Annex]())
        }
        return r
      case o: ConditionTrigger =>
        val r: PreResult[Emv2Annex] = preConditionTrigger(o) match {
         case PreResult(continu, MSome(r: Emv2Annex)) => PreResult(continu, MSome[Emv2Annex](r))
         case PreResult(_, MSome(_)) => halt("Can only produce object of type Emv2Annex")
         case PreResult(continu, _) => PreResult(continu, MNone[Emv2Annex]())
        }
        return r
      case o: AndCondition =>
        val r: PreResult[Emv2Annex] = preAndCondition(o) match {
         case PreResult(continu, MSome(r: Emv2Annex)) => PreResult(continu, MSome[Emv2Annex](r))
         case PreResult(_, MSome(_)) => halt("Can only produce object of type Emv2Annex")
         case PreResult(continu, _) => PreResult(continu, MNone[Emv2Annex]())
        }
        return r
      case o: OrCondition =>
        val r: PreResult[Emv2Annex] = preOrCondition(o) match {
         case PreResult(continu, MSome(r: Emv2Annex)) => PreResult(continu, MSome[Emv2Annex](r))
         case PreResult(_, MSome(_)) => halt("Can only produce object of type Emv2Annex")
         case PreResult(continu, _) => PreResult(continu, MNone[Emv2Annex]())
        }
        return r
      case o: AllCondition =>
        val r: PreResult[Emv2Annex] = preAllCondition(o) match {
         case PreResult(continu, MSome(r: Emv2Annex)) => PreResult(continu, MSome[Emv2Annex](r))
         case PreResult(_, MSome(_)) => halt("Can only produce object of type Emv2Annex")
         case PreResult(continu, _) => PreResult(continu, MNone[Emv2Annex]())
        }
        return r
      case o: OrMoreCondition =>
        val r: PreResult[Emv2Annex] = preOrMoreCondition(o) match {
         case PreResult(continu, MSome(r: Emv2Annex)) => PreResult(continu, MSome[Emv2Annex](r))
         case PreResult(_, MSome(_)) => halt("Can only produce object of type Emv2Annex")
         case PreResult(continu, _) => PreResult(continu, MNone[Emv2Annex]())
        }
        return r
      case o: OrLessCondition =>
        val r: PreResult[Emv2Annex] = preOrLessCondition(o) match {
         case PreResult(continu, MSome(r: Emv2Annex)) => PreResult(continu, MSome[Emv2Annex](r))
         case PreResult(_, MSome(_)) => halt("Can only produce object of type Emv2Annex")
         case PreResult(continu, _) => PreResult(continu, MNone[Emv2Annex]())
        }
        return r
      case o: Emv2Clause =>
        val r: PreResult[Emv2Annex] = preEmv2Clause(o) match {
         case PreResult(continu, MSome(r: Emv2Annex)) => PreResult(continu, MSome[Emv2Annex](r))
         case PreResult(_, MSome(_)) => halt("Can only produce object of type Emv2Annex")
         case PreResult(continu, _) => PreResult(continu, MNone[Emv2Annex]())
        }
        return r
      case o: Emv2Propagation =>
        val r: PreResult[Emv2Annex] = preEmv2Propagation(o) match {
         case PreResult(continu, MSome(r: Emv2Annex)) => PreResult(continu, MSome[Emv2Annex](r))
         case PreResult(_, MSome(_)) => halt("Can only produce object of type Emv2Annex")
         case PreResult(continu, _) => PreResult(continu, MNone[Emv2Annex]())
        }
        return r
      case o: Emv2Flow =>
        val r: PreResult[Emv2Annex] = preEmv2Flow(o) match {
         case PreResult(continu, MSome(r: Emv2Annex)) => PreResult(continu, MSome[Emv2Annex](r))
         case PreResult(_, MSome(_)) => halt("Can only produce object of type Emv2Annex")
         case PreResult(continu, _) => PreResult(continu, MNone[Emv2Annex]())
        }
        return r
      case o: Emv2BehaviorSection =>
        val r: PreResult[Emv2Annex] = preEmv2BehaviorSection(o) match {
         case PreResult(continu, MSome(r: Emv2Annex)) => PreResult(continu, MSome[Emv2Annex](r))
         case PreResult(_, MSome(_)) => halt("Can only produce object of type Emv2Annex")
         case PreResult(continu, _) => PreResult(continu, MNone[Emv2Annex]())
        }
        return r
      case o: ErrorPropagation =>
        val r: PreResult[Emv2Annex] = preErrorPropagation(o) match {
         case PreResult(continu, MSome(r: Emv2Annex)) => PreResult(continu, MSome[Emv2Annex](r))
         case PreResult(_, MSome(_)) => halt("Can only produce object of type Emv2Annex")
         case PreResult(continu, _) => PreResult(continu, MNone[Emv2Annex]())
        }
        return r
    }
  }

  def preEmv2Lib(o: Emv2Lib): PreResult[Emv2Lib] = {
    o match {
      case o: Emv2Library =>
        val r: PreResult[Emv2Lib] = preEmv2Library(o) match {
         case PreResult(continu, MSome(r: Emv2Lib)) => PreResult(continu, MSome[Emv2Lib](r))
         case PreResult(_, MSome(_)) => halt("Can only produce object of type Emv2Lib")
         case PreResult(continu, _) => PreResult(continu, MNone[Emv2Lib]())
        }
        return r
    }
  }

  def preAadl(o: Aadl): PreResult[Aadl] = {
    return PreResultAadl
  }

  def preEmv2ElementRef(o: Emv2ElementRef): PreResult[Emv2ElementRef] = {
    return PreResultEmv2ElementRef
  }

  def preName(o: Name): PreResult[Name] = {
    return PreResultName
  }

  def preComponent(o: Component): PreResult[Component] = {
    return PreResultComponent
  }

  def preEmv2Library(o: Emv2Library): PreResult[Emv2Library] = {
    return PreResultEmv2Library
  }

  def preErrorTypeDef(o: ErrorTypeDef): PreResult[ErrorTypeDef] = {
    return PreResultErrorTypeDef
  }

  def preClassifier(o: Classifier): PreResult[Classifier] = {
    return PreResultClassifier
  }

  def preErrorAliasDef(o: ErrorAliasDef): PreResult[ErrorAliasDef] = {
    return PreResultErrorAliasDef
  }

  def preErrorTypeSetDef(o: ErrorTypeSetDef): PreResult[ErrorTypeSetDef] = {
    return PreResultErrorTypeSetDef
  }

  def preFeature(o: Feature): PreResult[Feature] = {
    o match {
      case o: FeatureEnd =>
        val r: PreResult[Feature] = preFeatureEnd(o) match {
         case PreResult(continu, MSome(r: Feature)) => PreResult(continu, MSome[Feature](r))
         case PreResult(_, MSome(_)) => halt("Can only produce object of type Feature")
         case PreResult(continu, _) => PreResult(continu, MNone[Feature]())
        }
        return r
      case o: FeatureGroup =>
        val r: PreResult[Feature] = preFeatureGroup(o) match {
         case PreResult(continu, MSome(r: Feature)) => PreResult(continu, MSome[Feature](r))
         case PreResult(_, MSome(_)) => halt("Can only produce object of type Feature")
         case PreResult(continu, _) => PreResult(continu, MNone[Feature]())
        }
        return r
      case o: FeatureAccess =>
        val r: PreResult[Feature] = preFeatureAccess(o) match {
         case PreResult(continu, MSome(r: Feature)) => PreResult(continu, MSome[Feature](r))
         case PreResult(_, MSome(_)) => halt("Can only produce object of type Feature")
         case PreResult(continu, _) => PreResult(continu, MNone[Feature]())
        }
        return r
    }
  }

  def preBehaveStateMachine(o: BehaveStateMachine): PreResult[BehaveStateMachine] = {
    return PreResultBehaveStateMachine
  }

  def preFeatureEnd(o: FeatureEnd): PreResult[FeatureEnd] = {
    return PreResultFeatureEnd
  }

  def preErrorEvent(o: ErrorEvent): PreResult[ErrorEvent] = {
    return PreResultErrorEvent
  }

  def preErrorState(o: ErrorState): PreResult[ErrorState] = {
    return PreResultErrorState
  }

  def preErrorTransition(o: ErrorTransition): PreResult[ErrorTransition] = {
    return PreResultErrorTransition
  }

  def preFeatureGroup(o: FeatureGroup): PreResult[FeatureGroup] = {
    return PreResultFeatureGroup
  }

  def preErrorCondition(o: ErrorCondition): PreResult[ErrorCondition] = {
    o match {
      case o: ConditionTrigger =>
        val r: PreResult[ErrorCondition] = preConditionTrigger(o) match {
         case PreResult(continu, MSome(r: ErrorCondition)) => PreResult(continu, MSome[ErrorCondition](r))
         case PreResult(_, MSome(_)) => halt("Can only produce object of type ErrorCondition")
         case PreResult(continu, _) => PreResult(continu, MNone[ErrorCondition]())
        }
        return r
      case o: AndCondition =>
        val r: PreResult[ErrorCondition] = preAndCondition(o) match {
         case PreResult(continu, MSome(r: ErrorCondition)) => PreResult(continu, MSome[ErrorCondition](r))
         case PreResult(_, MSome(_)) => halt("Can only produce object of type ErrorCondition")
         case PreResult(continu, _) => PreResult(continu, MNone[ErrorCondition]())
        }
        return r
      case o: OrCondition =>
        val r: PreResult[ErrorCondition] = preOrCondition(o) match {
         case PreResult(continu, MSome(r: ErrorCondition)) => PreResult(continu, MSome[ErrorCondition](r))
         case PreResult(_, MSome(_)) => halt("Can only produce object of type ErrorCondition")
         case PreResult(continu, _) => PreResult(continu, MNone[ErrorCondition]())
        }
        return r
      case o: AllCondition =>
        val r: PreResult[ErrorCondition] = preAllCondition(o) match {
         case PreResult(continu, MSome(r: ErrorCondition)) => PreResult(continu, MSome[ErrorCondition](r))
         case PreResult(_, MSome(_)) => halt("Can only produce object of type ErrorCondition")
         case PreResult(continu, _) => PreResult(continu, MNone[ErrorCondition]())
        }
        return r
      case o: OrMoreCondition =>
        val r: PreResult[ErrorCondition] = preOrMoreCondition(o) match {
         case PreResult(continu, MSome(r: ErrorCondition)) => PreResult(continu, MSome[ErrorCondition](r))
         case PreResult(_, MSome(_)) => halt("Can only produce object of type ErrorCondition")
         case PreResult(continu, _) => PreResult(continu, MNone[ErrorCondition]())
        }
        return r
      case o: OrLessCondition =>
        val r: PreResult[ErrorCondition] = preOrLessCondition(o) match {
         case PreResult(continu, MSome(r: ErrorCondition)) => PreResult(continu, MSome[ErrorCondition](r))
         case PreResult(_, MSome(_)) => halt("Can only produce object of type ErrorCondition")
         case PreResult(continu, _) => PreResult(continu, MNone[ErrorCondition]())
        }
        return r
    }
  }

  def preConditionTrigger(o: ConditionTrigger): PreResult[ConditionTrigger] = {
    return PreResultConditionTrigger
  }

  def preAndCondition(o: AndCondition): PreResult[AndCondition] = {
    return PreResultAndCondition
  }

  def preFeatureAccess(o: FeatureAccess): PreResult[FeatureAccess] = {
    return PreResultFeatureAccess
  }

  def preOrCondition(o: OrCondition): PreResult[OrCondition] = {
    return PreResultOrCondition
  }

  def preAllCondition(o: AllCondition): PreResult[AllCondition] = {
    return PreResultAllCondition
  }

  def preOrMoreCondition(o: OrMoreCondition): PreResult[OrMoreCondition] = {
    return PreResultOrMoreCondition
  }

  def preOrLessCondition(o: OrLessCondition): PreResult[OrLessCondition] = {
    return PreResultOrLessCondition
  }

  def preEmv2Clause(o: Emv2Clause): PreResult[Emv2Clause] = {
    return PreResultEmv2Clause
  }

  def preEmv2Propagation(o: Emv2Propagation): PreResult[Emv2Propagation] = {
    return PreResultEmv2Propagation
  }

  def preConnection(o: Connection): PreResult[Connection] = {
    return PreResultConnection
  }

  def preEmv2Flow(o: Emv2Flow): PreResult[Emv2Flow] = {
    return PreResultEmv2Flow
  }

  def preEmv2BehaviorSection(o: Emv2BehaviorSection): PreResult[Emv2BehaviorSection] = {
    return PreResultEmv2BehaviorSection
  }

  def preConnectionInstance(o: ConnectionInstance): PreResult[ConnectionInstance] = {
    return PreResultConnectionInstance
  }

  def preErrorPropagation(o: ErrorPropagation): PreResult[ErrorPropagation] = {
    return PreResultErrorPropagation
  }

  def preConnectionReference(o: ConnectionReference): PreResult[ConnectionReference] = {
    return PreResultConnectionReference
  }

  def preEndPoint(o: EndPoint): PreResult[EndPoint] = {
    return PreResultEndPoint
  }

  def preProperty(o: Property): PreResult[Property] = {
    return PreResultProperty
  }

  def preElementRef(o: ElementRef): PreResult[ElementRef] = {
    o match {
      case o: Emv2ElementRef =>
        val r: PreResult[ElementRef] = preEmv2ElementRef(o) match {
         case PreResult(continu, MSome(r: ElementRef)) => PreResult(continu, MSome[ElementRef](r))
         case PreResult(_, MSome(_)) => halt("Can only produce object of type ElementRef")
         case PreResult(continu, _) => PreResult(continu, MNone[ElementRef]())
        }
        return r
      case o: AadlElementRef =>
        val r: PreResult[ElementRef] = preAadlElementRef(o) match {
         case PreResult(continu, MSome(r: ElementRef)) => PreResult(continu, MSome[ElementRef](r))
         case PreResult(_, MSome(_)) => halt("Can only produce object of type ElementRef")
         case PreResult(continu, _) => PreResult(continu, MNone[ElementRef]())
        }
        return r
    }
  }

  def preAadlElementRef(o: AadlElementRef): PreResult[AadlElementRef] = {
    return PreResultAadlElementRef
  }

  def prePropertyValue(o: PropertyValue): PreResult[PropertyValue] = {
    o match {
      case o: ClassifierProp => return preClassifierProp(o)
      case o: RangeProp => return preRangeProp(o)
      case o: RecordProp => return preRecordProp(o)
      case o: ReferenceProp => return preReferenceProp(o)
      case o: UnitProp => return preUnitProp(o)
      case o: ValueProp => return preValueProp(o)
    }
  }

  def preClassifierProp(o: ClassifierProp): PreResult[PropertyValue] = {
    return PreResultClassifierProp
  }

  def preRangeProp(o: RangeProp): PreResult[PropertyValue] = {
    return PreResultRangeProp
  }

  def preRecordProp(o: RecordProp): PreResult[PropertyValue] = {
    return PreResultRecordProp
  }

  def preReferenceProp(o: ReferenceProp): PreResult[PropertyValue] = {
    return PreResultReferenceProp
  }

  def preUnitProp(o: UnitProp): PreResult[PropertyValue] = {
    return PreResultUnitProp
  }

  def preValueProp(o: ValueProp): PreResult[PropertyValue] = {
    return PreResultValueProp
  }

  def preMode(o: Mode): PreResult[Mode] = {
    return PreResultMode
  }

  def preFlow(o: Flow): PreResult[Flow] = {
    return PreResultFlow
  }

  def preAnnex(o: Annex): PreResult[Annex] = {
    return PreResultAnnex
  }

  def preAnnexClause(o: AnnexClause): PreResult[AnnexClause] = {
    o match {
      case o: SmfClause =>
        val r: PreResult[AnnexClause] = preSmfClause(o) match {
         case PreResult(continu, MSome(r: AnnexClause)) => PreResult(continu, MSome[AnnexClause](r))
         case PreResult(_, MSome(_)) => halt("Can only produce object of type AnnexClause")
         case PreResult(continu, _) => PreResult(continu, MNone[AnnexClause]())
        }
        return r
      case o: SmfClassification =>
        val r: PreResult[AnnexClause] = preSmfClassification(o) match {
         case PreResult(continu, MSome(r: AnnexClause)) => PreResult(continu, MSome[AnnexClause](r))
         case PreResult(_, MSome(_)) => halt("Can only produce object of type AnnexClause")
         case PreResult(continu, _) => PreResult(continu, MNone[AnnexClause]())
        }
        return r
      case o: SmfDeclass =>
        val r: PreResult[AnnexClause] = preSmfDeclass(o) match {
         case PreResult(continu, MSome(r: AnnexClause)) => PreResult(continu, MSome[AnnexClause](r))
         case PreResult(_, MSome(_)) => halt("Can only produce object of type AnnexClause")
         case PreResult(continu, _) => PreResult(continu, MNone[AnnexClause]())
        }
        return r
      case o: SmfType =>
        val r: PreResult[AnnexClause] = preSmfType(o) match {
         case PreResult(continu, MSome(r: AnnexClause)) => PreResult(continu, MSome[AnnexClause](r))
         case PreResult(_, MSome(_)) => halt("Can only produce object of type AnnexClause")
         case PreResult(continu, _) => PreResult(continu, MNone[AnnexClause]())
        }
        return r
      case o: ErrorTypeDef =>
        val r: PreResult[AnnexClause] = preErrorTypeDef(o) match {
         case PreResult(continu, MSome(r: AnnexClause)) => PreResult(continu, MSome[AnnexClause](r))
         case PreResult(_, MSome(_)) => halt("Can only produce object of type AnnexClause")
         case PreResult(continu, _) => PreResult(continu, MNone[AnnexClause]())
        }
        return r
      case o: ErrorAliasDef =>
        val r: PreResult[AnnexClause] = preErrorAliasDef(o) match {
         case PreResult(continu, MSome(r: AnnexClause)) => PreResult(continu, MSome[AnnexClause](r))
         case PreResult(_, MSome(_)) => halt("Can only produce object of type AnnexClause")
         case PreResult(continu, _) => PreResult(continu, MNone[AnnexClause]())
        }
        return r
      case o: ErrorTypeSetDef =>
        val r: PreResult[AnnexClause] = preErrorTypeSetDef(o) match {
         case PreResult(continu, MSome(r: AnnexClause)) => PreResult(continu, MSome[AnnexClause](r))
         case PreResult(_, MSome(_)) => halt("Can only produce object of type AnnexClause")
         case PreResult(continu, _) => PreResult(continu, MNone[AnnexClause]())
        }
        return r
      case o: BehaveStateMachine =>
        val r: PreResult[AnnexClause] = preBehaveStateMachine(o) match {
         case PreResult(continu, MSome(r: AnnexClause)) => PreResult(continu, MSome[AnnexClause](r))
         case PreResult(_, MSome(_)) => halt("Can only produce object of type AnnexClause")
         case PreResult(continu, _) => PreResult(continu, MNone[AnnexClause]())
        }
        return r
      case o: ErrorEvent =>
        val r: PreResult[AnnexClause] = preErrorEvent(o) match {
         case PreResult(continu, MSome(r: AnnexClause)) => PreResult(continu, MSome[AnnexClause](r))
         case PreResult(_, MSome(_)) => halt("Can only produce object of type AnnexClause")
         case PreResult(continu, _) => PreResult(continu, MNone[AnnexClause]())
        }
        return r
      case o: ErrorState =>
        val r: PreResult[AnnexClause] = preErrorState(o) match {
         case PreResult(continu, MSome(r: AnnexClause)) => PreResult(continu, MSome[AnnexClause](r))
         case PreResult(_, MSome(_)) => halt("Can only produce object of type AnnexClause")
         case PreResult(continu, _) => PreResult(continu, MNone[AnnexClause]())
        }
        return r
      case o: ErrorTransition =>
        val r: PreResult[AnnexClause] = preErrorTransition(o) match {
         case PreResult(continu, MSome(r: AnnexClause)) => PreResult(continu, MSome[AnnexClause](r))
         case PreResult(_, MSome(_)) => halt("Can only produce object of type AnnexClause")
         case PreResult(continu, _) => PreResult(continu, MNone[AnnexClause]())
        }
        return r
      case o: ConditionTrigger =>
        val r: PreResult[AnnexClause] = preConditionTrigger(o) match {
         case PreResult(continu, MSome(r: AnnexClause)) => PreResult(continu, MSome[AnnexClause](r))
         case PreResult(_, MSome(_)) => halt("Can only produce object of type AnnexClause")
         case PreResult(continu, _) => PreResult(continu, MNone[AnnexClause]())
        }
        return r
      case o: AndCondition =>
        val r: PreResult[AnnexClause] = preAndCondition(o) match {
         case PreResult(continu, MSome(r: AnnexClause)) => PreResult(continu, MSome[AnnexClause](r))
         case PreResult(_, MSome(_)) => halt("Can only produce object of type AnnexClause")
         case PreResult(continu, _) => PreResult(continu, MNone[AnnexClause]())
        }
        return r
      case o: OrCondition =>
        val r: PreResult[AnnexClause] = preOrCondition(o) match {
         case PreResult(continu, MSome(r: AnnexClause)) => PreResult(continu, MSome[AnnexClause](r))
         case PreResult(_, MSome(_)) => halt("Can only produce object of type AnnexClause")
         case PreResult(continu, _) => PreResult(continu, MNone[AnnexClause]())
        }
        return r
      case o: AllCondition =>
        val r: PreResult[AnnexClause] = preAllCondition(o) match {
         case PreResult(continu, MSome(r: AnnexClause)) => PreResult(continu, MSome[AnnexClause](r))
         case PreResult(_, MSome(_)) => halt("Can only produce object of type AnnexClause")
         case PreResult(continu, _) => PreResult(continu, MNone[AnnexClause]())
        }
        return r
      case o: OrMoreCondition =>
        val r: PreResult[AnnexClause] = preOrMoreCondition(o) match {
         case PreResult(continu, MSome(r: AnnexClause)) => PreResult(continu, MSome[AnnexClause](r))
         case PreResult(_, MSome(_)) => halt("Can only produce object of type AnnexClause")
         case PreResult(continu, _) => PreResult(continu, MNone[AnnexClause]())
        }
        return r
      case o: OrLessCondition =>
        val r: PreResult[AnnexClause] = preOrLessCondition(o) match {
         case PreResult(continu, MSome(r: AnnexClause)) => PreResult(continu, MSome[AnnexClause](r))
         case PreResult(_, MSome(_)) => halt("Can only produce object of type AnnexClause")
         case PreResult(continu, _) => PreResult(continu, MNone[AnnexClause]())
        }
        return r
      case o: Emv2Clause =>
        val r: PreResult[AnnexClause] = preEmv2Clause(o) match {
         case PreResult(continu, MSome(r: AnnexClause)) => PreResult(continu, MSome[AnnexClause](r))
         case PreResult(_, MSome(_)) => halt("Can only produce object of type AnnexClause")
         case PreResult(continu, _) => PreResult(continu, MNone[AnnexClause]())
        }
        return r
      case o: Emv2Propagation =>
        val r: PreResult[AnnexClause] = preEmv2Propagation(o) match {
         case PreResult(continu, MSome(r: AnnexClause)) => PreResult(continu, MSome[AnnexClause](r))
         case PreResult(_, MSome(_)) => halt("Can only produce object of type AnnexClause")
         case PreResult(continu, _) => PreResult(continu, MNone[AnnexClause]())
        }
        return r
      case o: Emv2Flow =>
        val r: PreResult[AnnexClause] = preEmv2Flow(o) match {
         case PreResult(continu, MSome(r: AnnexClause)) => PreResult(continu, MSome[AnnexClause](r))
         case PreResult(_, MSome(_)) => halt("Can only produce object of type AnnexClause")
         case PreResult(continu, _) => PreResult(continu, MNone[AnnexClause]())
        }
        return r
      case o: Emv2BehaviorSection =>
        val r: PreResult[AnnexClause] = preEmv2BehaviorSection(o) match {
         case PreResult(continu, MSome(r: AnnexClause)) => PreResult(continu, MSome[AnnexClause](r))
         case PreResult(_, MSome(_)) => halt("Can only produce object of type AnnexClause")
         case PreResult(continu, _) => PreResult(continu, MNone[AnnexClause]())
        }
        return r
      case o: ErrorPropagation =>
        val r: PreResult[AnnexClause] = preErrorPropagation(o) match {
         case PreResult(continu, MSome(r: AnnexClause)) => PreResult(continu, MSome[AnnexClause](r))
         case PreResult(_, MSome(_)) => halt("Can only produce object of type AnnexClause")
         case PreResult(continu, _) => PreResult(continu, MNone[AnnexClause]())
        }
        return r
      case o: OtherAnnex =>
        val r: PreResult[AnnexClause] = preOtherAnnex(o) match {
         case PreResult(continu, MSome(r: AnnexClause)) => PreResult(continu, MSome[AnnexClause](r))
         case PreResult(_, MSome(_)) => halt("Can only produce object of type AnnexClause")
         case PreResult(continu, _) => PreResult(continu, MNone[AnnexClause]())
        }
        return r
      case o: BTSBLESSAnnexClause =>
        val r: PreResult[AnnexClause] = preBTSBLESSAnnexClause(o) match {
         case PreResult(continu, MSome(r: AnnexClause)) => PreResult(continu, MSome[AnnexClause](r))
         case PreResult(_, MSome(_)) => halt("Can only produce object of type AnnexClause")
         case PreResult(continu, _) => PreResult(continu, MNone[AnnexClause]())
        }
        return r
    }
  }

  def preAnnexLib(o: AnnexLib): PreResult[AnnexLib] = {
    o match {
      case o: SmfLibrary =>
        val r: PreResult[AnnexLib] = preSmfLibrary(o) match {
         case PreResult(continu, MSome(r: AnnexLib)) => PreResult(continu, MSome[AnnexLib](r))
         case PreResult(_, MSome(_)) => halt("Can only produce object of type AnnexLib")
         case PreResult(continu, _) => PreResult(continu, MNone[AnnexLib]())
        }
        return r
      case o: Emv2Library =>
        val r: PreResult[AnnexLib] = preEmv2Library(o) match {
         case PreResult(continu, MSome(r: AnnexLib)) => PreResult(continu, MSome[AnnexLib](r))
         case PreResult(_, MSome(_)) => halt("Can only produce object of type AnnexLib")
         case PreResult(continu, _) => PreResult(continu, MNone[AnnexLib]())
        }
        return r
      case o: OtherLib =>
        val r: PreResult[AnnexLib] = preOtherLib(o) match {
         case PreResult(continu, MSome(r: AnnexLib)) => PreResult(continu, MSome[AnnexLib](r))
         case PreResult(_, MSome(_)) => halt("Can only produce object of type AnnexLib")
         case PreResult(continu, _) => PreResult(continu, MNone[AnnexLib]())
        }
        return r
    }
  }

  def preOtherAnnex(o: OtherAnnex): PreResult[OtherAnnex] = {
    return PreResultOtherAnnex
  }

  def preOtherLib(o: OtherLib): PreResult[OtherLib] = {
    return PreResultOtherLib
  }

  def preBLESSAnnex(o: BLESSAnnex): PreResult[BLESSAnnex] = {
    o match {
      case o: BTSBLESSAnnexClause =>
        val r: PreResult[BLESSAnnex] = preBTSBLESSAnnexClause(o) match {
         case PreResult(continu, MSome(r: BLESSAnnex)) => PreResult(continu, MSome[BLESSAnnex](r))
         case PreResult(_, MSome(_)) => halt("Can only produce object of type BLESSAnnex")
         case PreResult(continu, _) => PreResult(continu, MNone[BLESSAnnex]())
        }
        return r
    }
  }

  def preBTSBLESSAnnexClause(o: BTSBLESSAnnexClause): PreResult[BTSBLESSAnnexClause] = {
    return PreResultBTSBLESSAnnexClause
  }

  def preBTSVariableDeclaration(o: BTSVariableDeclaration): PreResult[BTSVariableDeclaration] = {
    return PreResultBTSVariableDeclaration
  }

  def preBTSClassifier(o: BTSClassifier): PreResult[BTSClassifier] = {
    return PreResultBTSClassifier
  }

  def preBLESSIntConst(o: BLESSIntConst): PreResult[BLESSIntConst] = {
    return PreResultBLESSIntConst
  }

  def preBTSStateDeclaration(o: BTSStateDeclaration): PreResult[BTSStateDeclaration] = {
    return PreResultBTSStateDeclaration
  }

  def preBTSTransition(o: BTSTransition): PreResult[BTSTransition] = {
    return PreResultBTSTransition
  }

  def preBTSTransitionLabel(o: BTSTransitionLabel): PreResult[BTSTransitionLabel] = {
    return PreResultBTSTransitionLabel
  }

  def preBTSTransitionCondition(o: BTSTransitionCondition): PreResult[BTSTransitionCondition] = {
    o match {
      case o: BTSDispatchCondition =>
        val r: PreResult[BTSTransitionCondition] = preBTSDispatchCondition(o) match {
         case PreResult(continu, MSome(r: BTSTransitionCondition)) => PreResult(continu, MSome[BTSTransitionCondition](r))
         case PreResult(_, MSome(_)) => halt("Can only produce object of type BTSTransitionCondition")
         case PreResult(continu, _) => PreResult(continu, MNone[BTSTransitionCondition]())
        }
        return r
      case o: BTSExecuteConditionExp =>
        val r: PreResult[BTSTransitionCondition] = preBTSExecuteConditionExp(o) match {
         case PreResult(continu, MSome(r: BTSTransitionCondition)) => PreResult(continu, MSome[BTSTransitionCondition](r))
         case PreResult(_, MSome(_)) => halt("Can only produce object of type BTSTransitionCondition")
         case PreResult(continu, _) => PreResult(continu, MNone[BTSTransitionCondition]())
        }
        return r
      case o: BTSExecuteConditionTimeout =>
        val r: PreResult[BTSTransitionCondition] = preBTSExecuteConditionTimeout(o) match {
         case PreResult(continu, MSome(r: BTSTransitionCondition)) => PreResult(continu, MSome[BTSTransitionCondition](r))
         case PreResult(_, MSome(_)) => halt("Can only produce object of type BTSTransitionCondition")
         case PreResult(continu, _) => PreResult(continu, MNone[BTSTransitionCondition]())
        }
        return r
      case o: BTSExecuteConditionOtherwise =>
        val r: PreResult[BTSTransitionCondition] = preBTSExecuteConditionOtherwise(o) match {
         case PreResult(continu, MSome(r: BTSTransitionCondition)) => PreResult(continu, MSome[BTSTransitionCondition](r))
         case PreResult(_, MSome(_)) => halt("Can only produce object of type BTSTransitionCondition")
         case PreResult(continu, _) => PreResult(continu, MNone[BTSTransitionCondition]())
        }
        return r
      case o: BTSModeCondition =>
        val r: PreResult[BTSTransitionCondition] = preBTSModeCondition(o) match {
         case PreResult(continu, MSome(r: BTSTransitionCondition)) => PreResult(continu, MSome[BTSTransitionCondition](r))
         case PreResult(_, MSome(_)) => halt("Can only produce object of type BTSTransitionCondition")
         case PreResult(continu, _) => PreResult(continu, MNone[BTSTransitionCondition]())
        }
        return r
      case o: BTSInternalCondition =>
        val r: PreResult[BTSTransitionCondition] = preBTSInternalCondition(o) match {
         case PreResult(continu, MSome(r: BTSTransitionCondition)) => PreResult(continu, MSome[BTSTransitionCondition](r))
         case PreResult(_, MSome(_)) => halt("Can only produce object of type BTSTransitionCondition")
         case PreResult(continu, _) => PreResult(continu, MNone[BTSTransitionCondition]())
        }
        return r
    }
  }

  def preBTSDispatchCondition(o: BTSDispatchCondition): PreResult[BTSDispatchCondition] = {
    return PreResultBTSDispatchCondition
  }

  def preBTSDispatchConjunction(o: BTSDispatchConjunction): PreResult[BTSDispatchConjunction] = {
    return PreResultBTSDispatchConjunction
  }

  def preBTSDispatchTrigger(o: BTSDispatchTrigger): PreResult[BTSDispatchTrigger] = {
    o match {
      case o: BTSDispatchTriggerStop =>
        val r: PreResult[BTSDispatchTrigger] = preBTSDispatchTriggerStop(o) match {
         case PreResult(continu, MSome(r: BTSDispatchTrigger)) => PreResult(continu, MSome[BTSDispatchTrigger](r))
         case PreResult(_, MSome(_)) => halt("Can only produce object of type BTSDispatchTrigger")
         case PreResult(continu, _) => PreResult(continu, MNone[BTSDispatchTrigger]())
        }
        return r
      case o: BTSDispatchTriggerPort =>
        val r: PreResult[BTSDispatchTrigger] = preBTSDispatchTriggerPort(o) match {
         case PreResult(continu, MSome(r: BTSDispatchTrigger)) => PreResult(continu, MSome[BTSDispatchTrigger](r))
         case PreResult(_, MSome(_)) => halt("Can only produce object of type BTSDispatchTrigger")
         case PreResult(continu, _) => PreResult(continu, MNone[BTSDispatchTrigger]())
        }
        return r
      case o: BTSDispatchTriggerTimeout =>
        val r: PreResult[BTSDispatchTrigger] = preBTSDispatchTriggerTimeout(o) match {
         case PreResult(continu, MSome(r: BTSDispatchTrigger)) => PreResult(continu, MSome[BTSDispatchTrigger](r))
         case PreResult(_, MSome(_)) => halt("Can only produce object of type BTSDispatchTrigger")
         case PreResult(continu, _) => PreResult(continu, MNone[BTSDispatchTrigger]())
        }
        return r
    }
  }

  def preBTSDispatchTriggerStop(o: BTSDispatchTriggerStop): PreResult[BTSDispatchTriggerStop] = {
    return PreResultBTSDispatchTriggerStop
  }

  def preBTSDispatchTriggerPort(o: BTSDispatchTriggerPort): PreResult[BTSDispatchTriggerPort] = {
    return PreResultBTSDispatchTriggerPort
  }

  def preBTSDispatchTriggerTimeout(o: BTSDispatchTriggerTimeout): PreResult[BTSDispatchTriggerTimeout] = {
    return PreResultBTSDispatchTriggerTimeout
  }

  def preBTSExecuteCondition(o: BTSExecuteCondition): PreResult[BTSExecuteCondition] = {
    o match {
      case o: BTSExecuteConditionExp =>
        val r: PreResult[BTSExecuteCondition] = preBTSExecuteConditionExp(o) match {
         case PreResult(continu, MSome(r: BTSExecuteCondition)) => PreResult(continu, MSome[BTSExecuteCondition](r))
         case PreResult(_, MSome(_)) => halt("Can only produce object of type BTSExecuteCondition")
         case PreResult(continu, _) => PreResult(continu, MNone[BTSExecuteCondition]())
        }
        return r
      case o: BTSExecuteConditionTimeout =>
        val r: PreResult[BTSExecuteCondition] = preBTSExecuteConditionTimeout(o) match {
         case PreResult(continu, MSome(r: BTSExecuteCondition)) => PreResult(continu, MSome[BTSExecuteCondition](r))
         case PreResult(_, MSome(_)) => halt("Can only produce object of type BTSExecuteCondition")
         case PreResult(continu, _) => PreResult(continu, MNone[BTSExecuteCondition]())
        }
        return r
      case o: BTSExecuteConditionOtherwise =>
        val r: PreResult[BTSExecuteCondition] = preBTSExecuteConditionOtherwise(o) match {
         case PreResult(continu, MSome(r: BTSExecuteCondition)) => PreResult(continu, MSome[BTSExecuteCondition](r))
         case PreResult(_, MSome(_)) => halt("Can only produce object of type BTSExecuteCondition")
         case PreResult(continu, _) => PreResult(continu, MNone[BTSExecuteCondition]())
        }
        return r
    }
  }

  def preBTSExecuteConditionExp(o: BTSExecuteConditionExp): PreResult[BTSExecuteConditionExp] = {
    return PreResultBTSExecuteConditionExp
  }

  def preBTSExecuteConditionTimeout(o: BTSExecuteConditionTimeout): PreResult[BTSExecuteConditionTimeout] = {
    return PreResultBTSExecuteConditionTimeout
  }

  def preBTSExecuteConditionOtherwise(o: BTSExecuteConditionOtherwise): PreResult[BTSExecuteConditionOtherwise] = {
    return PreResultBTSExecuteConditionOtherwise
  }

  def preBTSModeCondition(o: BTSModeCondition): PreResult[BTSModeCondition] = {
    return PreResultBTSModeCondition
  }

  def preBTSTriggerLogicalExpression(o: BTSTriggerLogicalExpression): PreResult[BTSTriggerLogicalExpression] = {
    return PreResultBTSTriggerLogicalExpression
  }

  def preBTSEventTrigger(o: BTSEventTrigger): PreResult[BTSEventTrigger] = {
    o match {
      case o: BTSTriggerLogicalExpression =>
        val r: PreResult[BTSEventTrigger] = preBTSTriggerLogicalExpression(o) match {
         case PreResult(continu, MSome(r: BTSEventTrigger)) => PreResult(continu, MSome[BTSEventTrigger](r))
         case PreResult(_, MSome(_)) => halt("Can only produce object of type BTSEventTrigger")
         case PreResult(continu, _) => PreResult(continu, MNone[BTSEventTrigger]())
        }
        return r
      case o: BTSSubcomponentPort =>
        val r: PreResult[BTSEventTrigger] = preBTSSubcomponentPort(o) match {
         case PreResult(continu, MSome(r: BTSEventTrigger)) => PreResult(continu, MSome[BTSEventTrigger](r))
         case PreResult(_, MSome(_)) => halt("Can only produce object of type BTSEventTrigger")
         case PreResult(continu, _) => PreResult(continu, MNone[BTSEventTrigger]())
        }
        return r
    }
  }

  def preBTSSubcomponentPort(o: BTSSubcomponentPort): PreResult[BTSSubcomponentPort] = {
    return PreResultBTSSubcomponentPort
  }

  def preBTSInternalCondition(o: BTSInternalCondition): PreResult[BTSInternalCondition] = {
    return PreResultBTSInternalCondition
  }

  def preBTSAssertion(o: BTSAssertion): PreResult[BTSAssertion] = {
    o match {
      case o: BTSNamedAssertion =>
        val r: PreResult[BTSAssertion] = preBTSNamedAssertion(o) match {
         case PreResult(continu, MSome(r: BTSAssertion)) => PreResult(continu, MSome[BTSAssertion](r))
         case PreResult(_, MSome(_)) => halt("Can only produce object of type BTSAssertion")
         case PreResult(continu, _) => PreResult(continu, MNone[BTSAssertion]())
        }
        return r
      case o: BTSNamedFunction =>
        val r: PreResult[BTSAssertion] = preBTSNamedFunction(o) match {
         case PreResult(continu, MSome(r: BTSAssertion)) => PreResult(continu, MSome[BTSAssertion](r))
         case PreResult(_, MSome(_)) => halt("Can only produce object of type BTSAssertion")
         case PreResult(continu, _) => PreResult(continu, MNone[BTSAssertion]())
        }
        return r
      case o: BTSNamedEnumeration =>
        val r: PreResult[BTSAssertion] = preBTSNamedEnumeration(o) match {
         case PreResult(continu, MSome(r: BTSAssertion)) => PreResult(continu, MSome[BTSAssertion](r))
         case PreResult(_, MSome(_)) => halt("Can only produce object of type BTSAssertion")
         case PreResult(continu, _) => PreResult(continu, MNone[BTSAssertion]())
        }
        return r
      case o: BTSNamelessAssertion =>
        val r: PreResult[BTSAssertion] = preBTSNamelessAssertion(o) match {
         case PreResult(continu, MSome(r: BTSAssertion)) => PreResult(continu, MSome[BTSAssertion](r))
         case PreResult(_, MSome(_)) => halt("Can only produce object of type BTSAssertion")
         case PreResult(continu, _) => PreResult(continu, MNone[BTSAssertion]())
        }
        return r
      case o: BTSNamelessFunction =>
        val r: PreResult[BTSAssertion] = preBTSNamelessFunction(o) match {
         case PreResult(continu, MSome(r: BTSAssertion)) => PreResult(continu, MSome[BTSAssertion](r))
         case PreResult(_, MSome(_)) => halt("Can only produce object of type BTSAssertion")
         case PreResult(continu, _) => PreResult(continu, MNone[BTSAssertion]())
        }
        return r
      case o: BTSNamelessEnumeration =>
        val r: PreResult[BTSAssertion] = preBTSNamelessEnumeration(o) match {
         case PreResult(continu, MSome(r: BTSAssertion)) => PreResult(continu, MSome[BTSAssertion](r))
         case PreResult(_, MSome(_)) => halt("Can only produce object of type BTSAssertion")
         case PreResult(continu, _) => PreResult(continu, MNone[BTSAssertion]())
        }
        return r
    }
  }

  def preBTSNamedAssertion(o: BTSNamedAssertion): PreResult[BTSNamedAssertion] = {
    return PreResultBTSNamedAssertion
  }

  def preBTSNamedFunction(o: BTSNamedFunction): PreResult[BTSNamedFunction] = {
    return PreResultBTSNamedFunction
  }

  def preBTSNamedEnumeration(o: BTSNamedEnumeration): PreResult[BTSNamedEnumeration] = {
    return PreResultBTSNamedEnumeration
  }

  def preBTSNamelessAssertion(o: BTSNamelessAssertion): PreResult[BTSNamelessAssertion] = {
    return PreResultBTSNamelessAssertion
  }

  def preBTSNamelessFunction(o: BTSNamelessFunction): PreResult[BTSNamelessFunction] = {
    return PreResultBTSNamelessFunction
  }

  def preBTSNamelessEnumeration(o: BTSNamelessEnumeration): PreResult[BTSNamelessEnumeration] = {
    return PreResultBTSNamelessEnumeration
  }

  def preBTSAssertionEnumeration(o: BTSAssertionEnumeration): PreResult[BTSAssertionEnumeration] = {
    o match {
      case o: BTSEnumerationPairs =>
        val r: PreResult[BTSAssertionEnumeration] = preBTSEnumerationPairs(o) match {
         case PreResult(continu, MSome(r: BTSAssertionEnumeration)) => PreResult(continu, MSome[BTSAssertionEnumeration](r))
         case PreResult(_, MSome(_)) => halt("Can only produce object of type BTSAssertionEnumeration")
         case PreResult(continu, _) => PreResult(continu, MNone[BTSAssertionEnumeration]())
        }
        return r
      case o: BTSInvocation =>
        val r: PreResult[BTSAssertionEnumeration] = preBTSInvocation(o) match {
         case PreResult(continu, MSome(r: BTSAssertionEnumeration)) => PreResult(continu, MSome[BTSAssertionEnumeration](r))
         case PreResult(_, MSome(_)) => halt("Can only produce object of type BTSAssertionEnumeration")
         case PreResult(continu, _) => PreResult(continu, MNone[BTSAssertionEnumeration]())
        }
        return r
    }
  }

  def preBTSEnumerationPairs(o: BTSEnumerationPairs): PreResult[BTSEnumerationPairs] = {
    return PreResultBTSEnumerationPairs
  }

  def preBTSEnumerationPair(o: BTSEnumerationPair): PreResult[BTSEnumerationPair] = {
    return PreResultBTSEnumerationPair
  }

  def preBTSInvocation(o: BTSInvocation): PreResult[BTSInvocation] = {
    return PreResultBTSInvocation
  }

  def preBTSActualParameter(o: BTSActualParameter): PreResult[BTSActualParameter] = {
    return PreResultBTSActualParameter
  }

  def preBTSVariable(o: BTSVariable): PreResult[BTSVariable] = {
    return PreResultBTSVariable
  }

  def preBTSBehaviorActions(o: BTSBehaviorActions): PreResult[BTSBehaviorActions] = {
    return PreResultBTSBehaviorActions
  }

  def preBTSAssertedAction(o: BTSAssertedAction): PreResult[BTSAssertedAction] = {
    return PreResultBTSAssertedAction
  }

  def preBTSAction(o: BTSAction): PreResult[BTSAction] = {
    o match {
      case o: BTSSkipAction =>
        val r: PreResult[BTSAction] = preBTSSkipAction(o) match {
         case PreResult(continu, MSome(r: BTSAction)) => PreResult(continu, MSome[BTSAction](r))
         case PreResult(_, MSome(_)) => halt("Can only produce object of type BTSAction")
         case PreResult(continu, _) => PreResult(continu, MNone[BTSAction]())
        }
        return r
      case o: BTSAssignmentAction =>
        val r: PreResult[BTSAction] = preBTSAssignmentAction(o) match {
         case PreResult(continu, MSome(r: BTSAction)) => PreResult(continu, MSome[BTSAction](r))
         case PreResult(_, MSome(_)) => halt("Can only produce object of type BTSAction")
         case PreResult(continu, _) => PreResult(continu, MNone[BTSAction]())
        }
        return r
      case o: BTSSetMode =>
        val r: PreResult[BTSAction] = preBTSSetMode(o) match {
         case PreResult(continu, MSome(r: BTSAction)) => PreResult(continu, MSome[BTSAction](r))
         case PreResult(_, MSome(_)) => halt("Can only produce object of type BTSAction")
         case PreResult(continu, _) => PreResult(continu, MNone[BTSAction]())
        }
        return r
      case o: BTSWhenThrow =>
        val r: PreResult[BTSAction] = preBTSWhenThrow(o) match {
         case PreResult(continu, MSome(r: BTSAction)) => PreResult(continu, MSome[BTSAction](r))
         case PreResult(_, MSome(_)) => halt("Can only produce object of type BTSAction")
         case PreResult(continu, _) => PreResult(continu, MNone[BTSAction]())
        }
        return r
      case o: BTSFetchAdd =>
        val r: PreResult[BTSAction] = preBTSFetchAdd(o) match {
         case PreResult(continu, MSome(r: BTSAction)) => PreResult(continu, MSome[BTSAction](r))
         case PreResult(_, MSome(_)) => halt("Can only produce object of type BTSAction")
         case PreResult(continu, _) => PreResult(continu, MNone[BTSAction]())
        }
        return r
      case o: BTSFetchOr =>
        val r: PreResult[BTSAction] = preBTSFetchOr(o) match {
         case PreResult(continu, MSome(r: BTSAction)) => PreResult(continu, MSome[BTSAction](r))
         case PreResult(_, MSome(_)) => halt("Can only produce object of type BTSAction")
         case PreResult(continu, _) => PreResult(continu, MNone[BTSAction]())
        }
        return r
      case o: BTSFetchAnd =>
        val r: PreResult[BTSAction] = preBTSFetchAnd(o) match {
         case PreResult(continu, MSome(r: BTSAction)) => PreResult(continu, MSome[BTSAction](r))
         case PreResult(_, MSome(_)) => halt("Can only produce object of type BTSAction")
         case PreResult(continu, _) => PreResult(continu, MNone[BTSAction]())
        }
        return r
      case o: BTSFetchXor =>
        val r: PreResult[BTSAction] = preBTSFetchXor(o) match {
         case PreResult(continu, MSome(r: BTSAction)) => PreResult(continu, MSome[BTSAction](r))
         case PreResult(_, MSome(_)) => halt("Can only produce object of type BTSAction")
         case PreResult(continu, _) => PreResult(continu, MNone[BTSAction]())
        }
        return r
      case o: BTSSwap =>
        val r: PreResult[BTSAction] = preBTSSwap(o) match {
         case PreResult(continu, MSome(r: BTSAction)) => PreResult(continu, MSome[BTSAction](r))
         case PreResult(_, MSome(_)) => halt("Can only produce object of type BTSAction")
         case PreResult(continu, _) => PreResult(continu, MNone[BTSAction]())
        }
        return r
      case o: BTSSubprogramCallAction =>
        val r: PreResult[BTSAction] = preBTSSubprogramCallAction(o) match {
         case PreResult(continu, MSome(r: BTSAction)) => PreResult(continu, MSome[BTSAction](r))
         case PreResult(_, MSome(_)) => halt("Can only produce object of type BTSAction")
         case PreResult(continu, _) => PreResult(continu, MNone[BTSAction]())
        }
        return r
      case o: BTSPortOutput =>
        val r: PreResult[BTSAction] = preBTSPortOutput(o) match {
         case PreResult(continu, MSome(r: BTSAction)) => PreResult(continu, MSome[BTSAction](r))
         case PreResult(_, MSome(_)) => halt("Can only produce object of type BTSAction")
         case PreResult(continu, _) => PreResult(continu, MNone[BTSAction]())
        }
        return r
      case o: BTSPortInput =>
        val r: PreResult[BTSAction] = preBTSPortInput(o) match {
         case PreResult(continu, MSome(r: BTSAction)) => PreResult(continu, MSome[BTSAction](r))
         case PreResult(_, MSome(_)) => halt("Can only produce object of type BTSAction")
         case PreResult(continu, _) => PreResult(continu, MNone[BTSAction]())
        }
        return r
      case o: BTSFrozenPortAction =>
        val r: PreResult[BTSAction] = preBTSFrozenPortAction(o) match {
         case PreResult(continu, MSome(r: BTSAction)) => PreResult(continu, MSome[BTSAction](r))
         case PreResult(_, MSome(_)) => halt("Can only produce object of type BTSAction")
         case PreResult(continu, _) => PreResult(continu, MNone[BTSAction]())
        }
        return r
      case o: BTSPause =>
        val r: PreResult[BTSAction] = preBTSPause(o) match {
         case PreResult(continu, MSome(r: BTSAction)) => PreResult(continu, MSome[BTSAction](r))
         case PreResult(_, MSome(_)) => halt("Can only produce object of type BTSAction")
         case PreResult(continu, _) => PreResult(continu, MNone[BTSAction]())
        }
        return r
      case o: BTSIfBLESSAction =>
        val r: PreResult[BTSAction] = preBTSIfBLESSAction(o) match {
         case PreResult(continu, MSome(r: BTSAction)) => PreResult(continu, MSome[BTSAction](r))
         case PreResult(_, MSome(_)) => halt("Can only produce object of type BTSAction")
         case PreResult(continu, _) => PreResult(continu, MNone[BTSAction]())
        }
        return r
      case o: BTSIfBAAction =>
        val r: PreResult[BTSAction] = preBTSIfBAAction(o) match {
         case PreResult(continu, MSome(r: BTSAction)) => PreResult(continu, MSome[BTSAction](r))
         case PreResult(_, MSome(_)) => halt("Can only produce object of type BTSAction")
         case PreResult(continu, _) => PreResult(continu, MNone[BTSAction]())
        }
        return r
      case o: BTSWhileLoop =>
        val r: PreResult[BTSAction] = preBTSWhileLoop(o) match {
         case PreResult(continu, MSome(r: BTSAction)) => PreResult(continu, MSome[BTSAction](r))
         case PreResult(_, MSome(_)) => halt("Can only produce object of type BTSAction")
         case PreResult(continu, _) => PreResult(continu, MNone[BTSAction]())
        }
        return r
      case o: BTSForLoop =>
        val r: PreResult[BTSAction] = preBTSForLoop(o) match {
         case PreResult(continu, MSome(r: BTSAction)) => PreResult(continu, MSome[BTSAction](r))
         case PreResult(_, MSome(_)) => halt("Can only produce object of type BTSAction")
         case PreResult(continu, _) => PreResult(continu, MNone[BTSAction]())
        }
        return r
      case o: BTSDoUntilLoop =>
        val r: PreResult[BTSAction] = preBTSDoUntilLoop(o) match {
         case PreResult(continu, MSome(r: BTSAction)) => PreResult(continu, MSome[BTSAction](r))
         case PreResult(_, MSome(_)) => halt("Can only produce object of type BTSAction")
         case PreResult(continu, _) => PreResult(continu, MNone[BTSAction]())
        }
        return r
      case o: BTSExistentialLatticeQuantification =>
        val r: PreResult[BTSAction] = preBTSExistentialLatticeQuantification(o) match {
         case PreResult(continu, MSome(r: BTSAction)) => PreResult(continu, MSome[BTSAction](r))
         case PreResult(_, MSome(_)) => halt("Can only produce object of type BTSAction")
         case PreResult(continu, _) => PreResult(continu, MNone[BTSAction]())
        }
        return r
      case o: BTSUniversalLatticeQuantification =>
        val r: PreResult[BTSAction] = preBTSUniversalLatticeQuantification(o) match {
         case PreResult(continu, MSome(r: BTSAction)) => PreResult(continu, MSome[BTSAction](r))
         case PreResult(_, MSome(_)) => halt("Can only produce object of type BTSAction")
         case PreResult(continu, _) => PreResult(continu, MNone[BTSAction]())
        }
        return r
    }
  }

  def preBTSBasicAction(o: BTSBasicAction): PreResult[BTSBasicAction] = {
    o match {
      case o: BTSSkipAction =>
        val r: PreResult[BTSBasicAction] = preBTSSkipAction(o) match {
         case PreResult(continu, MSome(r: BTSBasicAction)) => PreResult(continu, MSome[BTSBasicAction](r))
         case PreResult(_, MSome(_)) => halt("Can only produce object of type BTSBasicAction")
         case PreResult(continu, _) => PreResult(continu, MNone[BTSBasicAction]())
        }
        return r
      case o: BTSAssignmentAction =>
        val r: PreResult[BTSBasicAction] = preBTSAssignmentAction(o) match {
         case PreResult(continu, MSome(r: BTSBasicAction)) => PreResult(continu, MSome[BTSBasicAction](r))
         case PreResult(_, MSome(_)) => halt("Can only produce object of type BTSBasicAction")
         case PreResult(continu, _) => PreResult(continu, MNone[BTSBasicAction]())
        }
        return r
      case o: BTSSetMode =>
        val r: PreResult[BTSBasicAction] = preBTSSetMode(o) match {
         case PreResult(continu, MSome(r: BTSBasicAction)) => PreResult(continu, MSome[BTSBasicAction](r))
         case PreResult(_, MSome(_)) => halt("Can only produce object of type BTSBasicAction")
         case PreResult(continu, _) => PreResult(continu, MNone[BTSBasicAction]())
        }
        return r
      case o: BTSWhenThrow =>
        val r: PreResult[BTSBasicAction] = preBTSWhenThrow(o) match {
         case PreResult(continu, MSome(r: BTSBasicAction)) => PreResult(continu, MSome[BTSBasicAction](r))
         case PreResult(_, MSome(_)) => halt("Can only produce object of type BTSBasicAction")
         case PreResult(continu, _) => PreResult(continu, MNone[BTSBasicAction]())
        }
        return r
      case o: BTSFetchAdd =>
        val r: PreResult[BTSBasicAction] = preBTSFetchAdd(o) match {
         case PreResult(continu, MSome(r: BTSBasicAction)) => PreResult(continu, MSome[BTSBasicAction](r))
         case PreResult(_, MSome(_)) => halt("Can only produce object of type BTSBasicAction")
         case PreResult(continu, _) => PreResult(continu, MNone[BTSBasicAction]())
        }
        return r
      case o: BTSFetchOr =>
        val r: PreResult[BTSBasicAction] = preBTSFetchOr(o) match {
         case PreResult(continu, MSome(r: BTSBasicAction)) => PreResult(continu, MSome[BTSBasicAction](r))
         case PreResult(_, MSome(_)) => halt("Can only produce object of type BTSBasicAction")
         case PreResult(continu, _) => PreResult(continu, MNone[BTSBasicAction]())
        }
        return r
      case o: BTSFetchAnd =>
        val r: PreResult[BTSBasicAction] = preBTSFetchAnd(o) match {
         case PreResult(continu, MSome(r: BTSBasicAction)) => PreResult(continu, MSome[BTSBasicAction](r))
         case PreResult(_, MSome(_)) => halt("Can only produce object of type BTSBasicAction")
         case PreResult(continu, _) => PreResult(continu, MNone[BTSBasicAction]())
        }
        return r
      case o: BTSFetchXor =>
        val r: PreResult[BTSBasicAction] = preBTSFetchXor(o) match {
         case PreResult(continu, MSome(r: BTSBasicAction)) => PreResult(continu, MSome[BTSBasicAction](r))
         case PreResult(_, MSome(_)) => halt("Can only produce object of type BTSBasicAction")
         case PreResult(continu, _) => PreResult(continu, MNone[BTSBasicAction]())
        }
        return r
      case o: BTSSwap =>
        val r: PreResult[BTSBasicAction] = preBTSSwap(o) match {
         case PreResult(continu, MSome(r: BTSBasicAction)) => PreResult(continu, MSome[BTSBasicAction](r))
         case PreResult(_, MSome(_)) => halt("Can only produce object of type BTSBasicAction")
         case PreResult(continu, _) => PreResult(continu, MNone[BTSBasicAction]())
        }
        return r
      case o: BTSSubprogramCallAction =>
        val r: PreResult[BTSBasicAction] = preBTSSubprogramCallAction(o) match {
         case PreResult(continu, MSome(r: BTSBasicAction)) => PreResult(continu, MSome[BTSBasicAction](r))
         case PreResult(_, MSome(_)) => halt("Can only produce object of type BTSBasicAction")
         case PreResult(continu, _) => PreResult(continu, MNone[BTSBasicAction]())
        }
        return r
      case o: BTSPortOutput =>
        val r: PreResult[BTSBasicAction] = preBTSPortOutput(o) match {
         case PreResult(continu, MSome(r: BTSBasicAction)) => PreResult(continu, MSome[BTSBasicAction](r))
         case PreResult(_, MSome(_)) => halt("Can only produce object of type BTSBasicAction")
         case PreResult(continu, _) => PreResult(continu, MNone[BTSBasicAction]())
        }
        return r
      case o: BTSPortInput =>
        val r: PreResult[BTSBasicAction] = preBTSPortInput(o) match {
         case PreResult(continu, MSome(r: BTSBasicAction)) => PreResult(continu, MSome[BTSBasicAction](r))
         case PreResult(_, MSome(_)) => halt("Can only produce object of type BTSBasicAction")
         case PreResult(continu, _) => PreResult(continu, MNone[BTSBasicAction]())
        }
        return r
      case o: BTSFrozenPortAction =>
        val r: PreResult[BTSBasicAction] = preBTSFrozenPortAction(o) match {
         case PreResult(continu, MSome(r: BTSBasicAction)) => PreResult(continu, MSome[BTSBasicAction](r))
         case PreResult(_, MSome(_)) => halt("Can only produce object of type BTSBasicAction")
         case PreResult(continu, _) => PreResult(continu, MNone[BTSBasicAction]())
        }
        return r
      case o: BTSPause =>
        val r: PreResult[BTSBasicAction] = preBTSPause(o) match {
         case PreResult(continu, MSome(r: BTSBasicAction)) => PreResult(continu, MSome[BTSBasicAction](r))
         case PreResult(_, MSome(_)) => halt("Can only produce object of type BTSBasicAction")
         case PreResult(continu, _) => PreResult(continu, MNone[BTSBasicAction]())
        }
        return r
    }
  }

  def preBTSSkipAction(o: BTSSkipAction): PreResult[BTSSkipAction] = {
    return PreResultBTSSkipAction
  }

  def preBTSAssignmentAction(o: BTSAssignmentAction): PreResult[BTSAssignmentAction] = {
    return PreResultBTSAssignmentAction
  }

  def preBTSSetMode(o: BTSSetMode): PreResult[BTSSetMode] = {
    return PreResultBTSSetMode
  }

  def preBTSWhenThrow(o: BTSWhenThrow): PreResult[BTSWhenThrow] = {
    return PreResultBTSWhenThrow
  }

  def preBTSCombinableOperation(o: BTSCombinableOperation): PreResult[BTSCombinableOperation] = {
    o match {
      case o: BTSFetchAdd =>
        val r: PreResult[BTSCombinableOperation] = preBTSFetchAdd(o) match {
         case PreResult(continu, MSome(r: BTSCombinableOperation)) => PreResult(continu, MSome[BTSCombinableOperation](r))
         case PreResult(_, MSome(_)) => halt("Can only produce object of type BTSCombinableOperation")
         case PreResult(continu, _) => PreResult(continu, MNone[BTSCombinableOperation]())
        }
        return r
      case o: BTSFetchOr =>
        val r: PreResult[BTSCombinableOperation] = preBTSFetchOr(o) match {
         case PreResult(continu, MSome(r: BTSCombinableOperation)) => PreResult(continu, MSome[BTSCombinableOperation](r))
         case PreResult(_, MSome(_)) => halt("Can only produce object of type BTSCombinableOperation")
         case PreResult(continu, _) => PreResult(continu, MNone[BTSCombinableOperation]())
        }
        return r
      case o: BTSFetchAnd =>
        val r: PreResult[BTSCombinableOperation] = preBTSFetchAnd(o) match {
         case PreResult(continu, MSome(r: BTSCombinableOperation)) => PreResult(continu, MSome[BTSCombinableOperation](r))
         case PreResult(_, MSome(_)) => halt("Can only produce object of type BTSCombinableOperation")
         case PreResult(continu, _) => PreResult(continu, MNone[BTSCombinableOperation]())
        }
        return r
      case o: BTSFetchXor =>
        val r: PreResult[BTSCombinableOperation] = preBTSFetchXor(o) match {
         case PreResult(continu, MSome(r: BTSCombinableOperation)) => PreResult(continu, MSome[BTSCombinableOperation](r))
         case PreResult(_, MSome(_)) => halt("Can only produce object of type BTSCombinableOperation")
         case PreResult(continu, _) => PreResult(continu, MNone[BTSCombinableOperation]())
        }
        return r
      case o: BTSSwap =>
        val r: PreResult[BTSCombinableOperation] = preBTSSwap(o) match {
         case PreResult(continu, MSome(r: BTSCombinableOperation)) => PreResult(continu, MSome[BTSCombinableOperation](r))
         case PreResult(_, MSome(_)) => halt("Can only produce object of type BTSCombinableOperation")
         case PreResult(continu, _) => PreResult(continu, MNone[BTSCombinableOperation]())
        }
        return r
    }
  }

  def preBTSFetchAdd(o: BTSFetchAdd): PreResult[BTSFetchAdd] = {
    return PreResultBTSFetchAdd
  }

  def preBTSFetchOr(o: BTSFetchOr): PreResult[BTSFetchOr] = {
    return PreResultBTSFetchOr
  }

  def preBTSFetchAnd(o: BTSFetchAnd): PreResult[BTSFetchAnd] = {
    return PreResultBTSFetchAnd
  }

  def preBTSFetchXor(o: BTSFetchXor): PreResult[BTSFetchXor] = {
    return PreResultBTSFetchXor
  }

  def preBTSSwap(o: BTSSwap): PreResult[BTSSwap] = {
    return PreResultBTSSwap
  }

  def preBTSCommunicationAction(o: BTSCommunicationAction): PreResult[BTSCommunicationAction] = {
    o match {
      case o: BTSSubprogramCallAction =>
        val r: PreResult[BTSCommunicationAction] = preBTSSubprogramCallAction(o) match {
         case PreResult(continu, MSome(r: BTSCommunicationAction)) => PreResult(continu, MSome[BTSCommunicationAction](r))
         case PreResult(_, MSome(_)) => halt("Can only produce object of type BTSCommunicationAction")
         case PreResult(continu, _) => PreResult(continu, MNone[BTSCommunicationAction]())
        }
        return r
      case o: BTSPortOutput =>
        val r: PreResult[BTSCommunicationAction] = preBTSPortOutput(o) match {
         case PreResult(continu, MSome(r: BTSCommunicationAction)) => PreResult(continu, MSome[BTSCommunicationAction](r))
         case PreResult(_, MSome(_)) => halt("Can only produce object of type BTSCommunicationAction")
         case PreResult(continu, _) => PreResult(continu, MNone[BTSCommunicationAction]())
        }
        return r
      case o: BTSPortInput =>
        val r: PreResult[BTSCommunicationAction] = preBTSPortInput(o) match {
         case PreResult(continu, MSome(r: BTSCommunicationAction)) => PreResult(continu, MSome[BTSCommunicationAction](r))
         case PreResult(_, MSome(_)) => halt("Can only produce object of type BTSCommunicationAction")
         case PreResult(continu, _) => PreResult(continu, MNone[BTSCommunicationAction]())
        }
        return r
      case o: BTSFrozenPortAction =>
        val r: PreResult[BTSCommunicationAction] = preBTSFrozenPortAction(o) match {
         case PreResult(continu, MSome(r: BTSCommunicationAction)) => PreResult(continu, MSome[BTSCommunicationAction](r))
         case PreResult(_, MSome(_)) => halt("Can only produce object of type BTSCommunicationAction")
         case PreResult(continu, _) => PreResult(continu, MNone[BTSCommunicationAction]())
        }
        return r
      case o: BTSPause =>
        val r: PreResult[BTSCommunicationAction] = preBTSPause(o) match {
         case PreResult(continu, MSome(r: BTSCommunicationAction)) => PreResult(continu, MSome[BTSCommunicationAction](r))
         case PreResult(_, MSome(_)) => halt("Can only produce object of type BTSCommunicationAction")
         case PreResult(continu, _) => PreResult(continu, MNone[BTSCommunicationAction]())
        }
        return r
    }
  }

  def preBTSSubprogramCallAction(o: BTSSubprogramCallAction): PreResult[BTSSubprogramCallAction] = {
    return PreResultBTSSubprogramCallAction
  }

  def preBTSFormalActual(o: BTSFormalActual): PreResult[BTSFormalActual] = {
    return PreResultBTSFormalActual
  }

  def preBTSPortOutput(o: BTSPortOutput): PreResult[BTSPortOutput] = {
    return PreResultBTSPortOutput
  }

  def preBTSPortInput(o: BTSPortInput): PreResult[BTSPortInput] = {
    return PreResultBTSPortInput
  }

  def preBTSFrozenPortAction(o: BTSFrozenPortAction): PreResult[BTSFrozenPortAction] = {
    return PreResultBTSFrozenPortAction
  }

  def preBTSPause(o: BTSPause): PreResult[BTSPause] = {
    return PreResultBTSPause
  }

  def preBTSControlAction(o: BTSControlAction): PreResult[BTSControlAction] = {
    o match {
      case o: BTSIfBLESSAction =>
        val r: PreResult[BTSControlAction] = preBTSIfBLESSAction(o) match {
         case PreResult(continu, MSome(r: BTSControlAction)) => PreResult(continu, MSome[BTSControlAction](r))
         case PreResult(_, MSome(_)) => halt("Can only produce object of type BTSControlAction")
         case PreResult(continu, _) => PreResult(continu, MNone[BTSControlAction]())
        }
        return r
      case o: BTSIfBAAction =>
        val r: PreResult[BTSControlAction] = preBTSIfBAAction(o) match {
         case PreResult(continu, MSome(r: BTSControlAction)) => PreResult(continu, MSome[BTSControlAction](r))
         case PreResult(_, MSome(_)) => halt("Can only produce object of type BTSControlAction")
         case PreResult(continu, _) => PreResult(continu, MNone[BTSControlAction]())
        }
        return r
      case o: BTSWhileLoop =>
        val r: PreResult[BTSControlAction] = preBTSWhileLoop(o) match {
         case PreResult(continu, MSome(r: BTSControlAction)) => PreResult(continu, MSome[BTSControlAction](r))
         case PreResult(_, MSome(_)) => halt("Can only produce object of type BTSControlAction")
         case PreResult(continu, _) => PreResult(continu, MNone[BTSControlAction]())
        }
        return r
      case o: BTSForLoop =>
        val r: PreResult[BTSControlAction] = preBTSForLoop(o) match {
         case PreResult(continu, MSome(r: BTSControlAction)) => PreResult(continu, MSome[BTSControlAction](r))
         case PreResult(_, MSome(_)) => halt("Can only produce object of type BTSControlAction")
         case PreResult(continu, _) => PreResult(continu, MNone[BTSControlAction]())
        }
        return r
      case o: BTSDoUntilLoop =>
        val r: PreResult[BTSControlAction] = preBTSDoUntilLoop(o) match {
         case PreResult(continu, MSome(r: BTSControlAction)) => PreResult(continu, MSome[BTSControlAction](r))
         case PreResult(_, MSome(_)) => halt("Can only produce object of type BTSControlAction")
         case PreResult(continu, _) => PreResult(continu, MNone[BTSControlAction]())
        }
        return r
    }
  }

  def preBTSIfBLESSAction(o: BTSIfBLESSAction): PreResult[BTSIfBLESSAction] = {
    return PreResultBTSIfBLESSAction
  }

  def preBTSGuardedAction(o: BTSGuardedAction): PreResult[BTSGuardedAction] = {
    return PreResultBTSGuardedAction
  }

  def preBTSIfBAAction(o: BTSIfBAAction): PreResult[BTSIfBAAction] = {
    return PreResultBTSIfBAAction
  }

  def preBTSConditionalActions(o: BTSConditionalActions): PreResult[BTSConditionalActions] = {
    return PreResultBTSConditionalActions
  }

  def preBTSWhileLoop(o: BTSWhileLoop): PreResult[BTSWhileLoop] = {
    return PreResultBTSWhileLoop
  }

  def preBTSForLoop(o: BTSForLoop): PreResult[BTSForLoop] = {
    return PreResultBTSForLoop
  }

  def preBTSDoUntilLoop(o: BTSDoUntilLoop): PreResult[BTSDoUntilLoop] = {
    return PreResultBTSDoUntilLoop
  }

  def preBTSQuantificationActions(o: BTSQuantificationActions): PreResult[BTSQuantificationActions] = {
    o match {
      case o: BTSExistentialLatticeQuantification =>
        val r: PreResult[BTSQuantificationActions] = preBTSExistentialLatticeQuantification(o) match {
         case PreResult(continu, MSome(r: BTSQuantificationActions)) => PreResult(continu, MSome[BTSQuantificationActions](r))
         case PreResult(_, MSome(_)) => halt("Can only produce object of type BTSQuantificationActions")
         case PreResult(continu, _) => PreResult(continu, MNone[BTSQuantificationActions]())
        }
        return r
      case o: BTSUniversalLatticeQuantification =>
        val r: PreResult[BTSQuantificationActions] = preBTSUniversalLatticeQuantification(o) match {
         case PreResult(continu, MSome(r: BTSQuantificationActions)) => PreResult(continu, MSome[BTSQuantificationActions](r))
         case PreResult(_, MSome(_)) => halt("Can only produce object of type BTSQuantificationActions")
         case PreResult(continu, _) => PreResult(continu, MNone[BTSQuantificationActions]())
        }
        return r
    }
  }

  def preBTSExistentialLatticeQuantification(o: BTSExistentialLatticeQuantification): PreResult[BTSExistentialLatticeQuantification] = {
    return PreResultBTSExistentialLatticeQuantification
  }

  def preBTSCatchClauseTerm(o: BTSCatchClauseTerm): PreResult[BTSCatchClauseTerm] = {
    return PreResultBTSCatchClauseTerm
  }

  def preBTSUniversalLatticeQuantification(o: BTSUniversalLatticeQuantification): PreResult[BTSUniversalLatticeQuantification] = {
    return PreResultBTSUniversalLatticeQuantification
  }

  def preBTSExp(o: BTSExp): PreResult[BTSExp] = {
    o match {
      case o: BTSUnaryExp =>
        val r: PreResult[BTSExp] = preBTSUnaryExp(o) match {
         case PreResult(continu, MSome(r: BTSExp)) => PreResult(continu, MSome[BTSExp](r))
         case PreResult(_, MSome(_)) => halt("Can only produce object of type BTSExp")
         case PreResult(continu, _) => PreResult(continu, MNone[BTSExp]())
        }
        return r
      case o: BTSBinaryExp =>
        val r: PreResult[BTSExp] = preBTSBinaryExp(o) match {
         case PreResult(continu, MSome(r: BTSExp)) => PreResult(continu, MSome[BTSExp](r))
         case PreResult(_, MSome(_)) => halt("Can only produce object of type BTSExp")
         case PreResult(continu, _) => PreResult(continu, MNone[BTSExp]())
        }
        return r
      case o: BTSLiteralExp =>
        val r: PreResult[BTSExp] = preBTSLiteralExp(o) match {
         case PreResult(continu, MSome(r: BTSExp)) => PreResult(continu, MSome[BTSExp](r))
         case PreResult(_, MSome(_)) => halt("Can only produce object of type BTSExp")
         case PreResult(continu, _) => PreResult(continu, MNone[BTSExp]())
        }
        return r
      case o: BTSVariableNameExp =>
        val r: PreResult[BTSExp] = preBTSVariableNameExp(o) match {
         case PreResult(continu, MSome(r: BTSExp)) => PreResult(continu, MSome[BTSExp](r))
         case PreResult(_, MSome(_)) => halt("Can only produce object of type BTSExp")
         case PreResult(continu, _) => PreResult(continu, MNone[BTSExp]())
        }
        return r
      case o: BTSIndexingExp =>
        val r: PreResult[BTSExp] = preBTSIndexingExp(o) match {
         case PreResult(continu, MSome(r: BTSExp)) => PreResult(continu, MSome[BTSExp](r))
         case PreResult(_, MSome(_)) => halt("Can only produce object of type BTSExp")
         case PreResult(continu, _) => PreResult(continu, MNone[BTSExp]())
        }
        return r
      case o: BTSAccessExp =>
        val r: PreResult[BTSExp] = preBTSAccessExp(o) match {
         case PreResult(continu, MSome(r: BTSExp)) => PreResult(continu, MSome[BTSExp](r))
         case PreResult(_, MSome(_)) => halt("Can only produce object of type BTSExp")
         case PreResult(continu, _) => PreResult(continu, MNone[BTSExp]())
        }
        return r
      case o: BTSFunctionCall =>
        val r: PreResult[BTSExp] = preBTSFunctionCall(o) match {
         case PreResult(continu, MSome(r: BTSExp)) => PreResult(continu, MSome[BTSExp](r))
         case PreResult(_, MSome(_)) => halt("Can only produce object of type BTSExp")
         case PreResult(continu, _) => PreResult(continu, MNone[BTSExp]())
        }
        return r
      case o: BTSConditionalExpression =>
        val r: PreResult[BTSExp] = preBTSConditionalExpression(o) match {
         case PreResult(continu, MSome(r: BTSExp)) => PreResult(continu, MSome[BTSExp](r))
         case PreResult(_, MSome(_)) => halt("Can only produce object of type BTSExp")
         case PreResult(continu, _) => PreResult(continu, MNone[BTSExp]())
        }
        return r
      case o: BTSRange =>
        val r: PreResult[BTSExp] = preBTSRange(o) match {
         case PreResult(continu, MSome(r: BTSExp)) => PreResult(continu, MSome[BTSExp](r))
         case PreResult(_, MSome(_)) => halt("Can only produce object of type BTSExp")
         case PreResult(continu, _) => PreResult(continu, MNone[BTSExp]())
        }
        return r
    }
  }

  def preBTSUnaryExp(o: BTSUnaryExp): PreResult[BTSUnaryExp] = {
    return PreResultBTSUnaryExp
  }

  def preBTSBinaryExp(o: BTSBinaryExp): PreResult[BTSBinaryExp] = {
    return PreResultBTSBinaryExp
  }

  def preBTSLiteralExp(o: BTSLiteralExp): PreResult[BTSLiteralExp] = {
    return PreResultBTSLiteralExp
  }

  def preBTSValueName(o: BTSValueName): PreResult[BTSValueName] = {
    o match {
      case o: BTSVariableNameExp =>
        val r: PreResult[BTSValueName] = preBTSVariableNameExp(o) match {
         case PreResult(continu, MSome(r: BTSValueName)) => PreResult(continu, MSome[BTSValueName](r))
         case PreResult(_, MSome(_)) => halt("Can only produce object of type BTSValueName")
         case PreResult(continu, _) => PreResult(continu, MNone[BTSValueName]())
        }
        return r
      case o: BTSFunctionCall =>
        val r: PreResult[BTSValueName] = preBTSFunctionCall(o) match {
         case PreResult(continu, MSome(r: BTSValueName)) => PreResult(continu, MSome[BTSValueName](r))
         case PreResult(_, MSome(_)) => halt("Can only produce object of type BTSValueName")
         case PreResult(continu, _) => PreResult(continu, MNone[BTSValueName]())
        }
        return r
    }
  }

  def preBTSVariableNameExp(o: BTSVariableNameExp): PreResult[BTSVariableNameExp] = {
    return PreResultBTSVariableNameExp
  }

  def preBTSPartialName(o: BTSPartialName): PreResult[BTSPartialName] = {
    return PreResultBTSPartialName
  }

  def preBTSIndexingExp(o: BTSIndexingExp): PreResult[BTSIndexingExp] = {
    return PreResultBTSIndexingExp
  }

  def preBTSAccessExp(o: BTSAccessExp): PreResult[BTSAccessExp] = {
    return PreResultBTSAccessExp
  }

  def preBTSFunctionCall(o: BTSFunctionCall): PreResult[BTSFunctionCall] = {
    return PreResultBTSFunctionCall
  }

  def preBTSPortValue(o: BTSPortValue): PreResult[BTSPortValue] = {
    return PreResultBTSPortValue
  }

  def preBTSConditionalExpression(o: BTSConditionalExpression): PreResult[BTSConditionalExpression] = {
    return PreResultBTSConditionalExpression
  }

  def preBTSRange(o: BTSRange): PreResult[BTSRange] = {
    return PreResultBTSRange
  }

  def preBTSBehaviorTime(o: BTSBehaviorTime): PreResult[BTSBehaviorTime] = {
    return PreResultBTSBehaviorTime
  }

  def preBTSType(o: BTSType): PreResult[BTSType] = {
    o match {
      case o: BTSClassifier =>
        val r: PreResult[BTSType] = preBTSClassifier(o) match {
         case PreResult(continu, MSome(r: BTSType)) => PreResult(continu, MSome[BTSType](r))
         case PreResult(_, MSome(_)) => halt("Can only produce object of type BTSType")
         case PreResult(continu, _) => PreResult(continu, MNone[BTSType]())
        }
        return r
    }
  }

  def preTODO(o: TODO): PreResult[TODO] = {
    return PreResultTODO
  }

  def postSmfAnnex(o: SmfAnnex): MOption[SmfAnnex] = {
    o match {
      case o: SmfClause =>
        val r: MOption[SmfAnnex] = postSmfClause(o) match {
         case MSome(result: SmfAnnex) => MSome[SmfAnnex](result)
         case MSome(_) => halt("Can only produce object of type SmfAnnex")
         case _ => MNone[SmfAnnex]()
        }
        return r
      case o: SmfClassification =>
        val r: MOption[SmfAnnex] = postSmfClassification(o) match {
         case MSome(result: SmfAnnex) => MSome[SmfAnnex](result)
         case MSome(_) => halt("Can only produce object of type SmfAnnex")
         case _ => MNone[SmfAnnex]()
        }
        return r
      case o: SmfDeclass =>
        val r: MOption[SmfAnnex] = postSmfDeclass(o) match {
         case MSome(result: SmfAnnex) => MSome[SmfAnnex](result)
         case MSome(_) => halt("Can only produce object of type SmfAnnex")
         case _ => MNone[SmfAnnex]()
        }
        return r
      case o: SmfType =>
        val r: MOption[SmfAnnex] = postSmfType(o) match {
         case MSome(result: SmfAnnex) => MSome[SmfAnnex](result)
         case MSome(_) => halt("Can only produce object of type SmfAnnex")
         case _ => MNone[SmfAnnex]()
        }
        return r
    }
  }

  def postSmfLib(o: SmfLib): MOption[SmfLib] = {
    o match {
      case o: SmfLibrary =>
        val r: MOption[SmfLib] = postSmfLibrary(o) match {
         case MSome(result: SmfLib) => MSome[SmfLib](result)
         case MSome(_) => halt("Can only produce object of type SmfLib")
         case _ => MNone[SmfLib]()
        }
        return r
    }
  }

  def postSmfClause(o: SmfClause): MOption[SmfClause] = {
    return PostResultSmfClause
  }

  def postSmfClassification(o: SmfClassification): MOption[SmfClassification] = {
    return PostResultSmfClassification
  }

  def postSmfDeclass(o: SmfDeclass): MOption[SmfDeclass] = {
    return PostResultSmfDeclass
  }

  def postSmfLibrary(o: SmfLibrary): MOption[SmfLibrary] = {
    return PostResultSmfLibrary
  }

  def postSmfType(o: SmfType): MOption[SmfType] = {
    return PostResultSmfType
  }

  def postAadlInstInfo(o: AadlInstInfo): MOption[AadlInstInfo] = {
    o match {
      case o: Component =>
        val r: MOption[AadlInstInfo] = postComponent(o) match {
         case MSome(result: AadlInstInfo) => MSome[AadlInstInfo](result)
         case MSome(_) => halt("Can only produce object of type AadlInstInfo")
         case _ => MNone[AadlInstInfo]()
        }
        return r
      case o: ErrorTypeDef =>
        val r: MOption[AadlInstInfo] = postErrorTypeDef(o) match {
         case MSome(result: AadlInstInfo) => MSome[AadlInstInfo](result)
         case MSome(_) => halt("Can only produce object of type AadlInstInfo")
         case _ => MNone[AadlInstInfo]()
        }
        return r
      case o: FeatureEnd =>
        val r: MOption[AadlInstInfo] = postFeatureEnd(o) match {
         case MSome(result: AadlInstInfo) => MSome[AadlInstInfo](result)
         case MSome(_) => halt("Can only produce object of type AadlInstInfo")
         case _ => MNone[AadlInstInfo]()
        }
        return r
      case o: FeatureGroup =>
        val r: MOption[AadlInstInfo] = postFeatureGroup(o) match {
         case MSome(result: AadlInstInfo) => MSome[AadlInstInfo](result)
         case MSome(_) => halt("Can only produce object of type AadlInstInfo")
         case _ => MNone[AadlInstInfo]()
        }
        return r
      case o: FeatureAccess =>
        val r: MOption[AadlInstInfo] = postFeatureAccess(o) match {
         case MSome(result: AadlInstInfo) => MSome[AadlInstInfo](result)
         case MSome(_) => halt("Can only produce object of type AadlInstInfo")
         case _ => MNone[AadlInstInfo]()
        }
        return r
      case o: Connection =>
        val r: MOption[AadlInstInfo] = postConnection(o) match {
         case MSome(result: AadlInstInfo) => MSome[AadlInstInfo](result)
         case MSome(_) => halt("Can only produce object of type AadlInstInfo")
         case _ => MNone[AadlInstInfo]()
        }
        return r
      case o: Emv2Flow =>
        val r: MOption[AadlInstInfo] = postEmv2Flow(o) match {
         case MSome(result: AadlInstInfo) => MSome[AadlInstInfo](result)
         case MSome(_) => halt("Can only produce object of type AadlInstInfo")
         case _ => MNone[AadlInstInfo]()
        }
        return r
      case o: Flow =>
        val r: MOption[AadlInstInfo] = postFlow(o) match {
         case MSome(result: AadlInstInfo) => MSome[AadlInstInfo](result)
         case MSome(_) => halt("Can only produce object of type AadlInstInfo")
         case _ => MNone[AadlInstInfo]()
        }
        return r
    }
  }

  def postEmv2Annex(o: Emv2Annex): MOption[Emv2Annex] = {
    o match {
      case o: ErrorTypeDef =>
        val r: MOption[Emv2Annex] = postErrorTypeDef(o) match {
         case MSome(result: Emv2Annex) => MSome[Emv2Annex](result)
         case MSome(_) => halt("Can only produce object of type Emv2Annex")
         case _ => MNone[Emv2Annex]()
        }
        return r
      case o: ErrorAliasDef =>
        val r: MOption[Emv2Annex] = postErrorAliasDef(o) match {
         case MSome(result: Emv2Annex) => MSome[Emv2Annex](result)
         case MSome(_) => halt("Can only produce object of type Emv2Annex")
         case _ => MNone[Emv2Annex]()
        }
        return r
      case o: ErrorTypeSetDef =>
        val r: MOption[Emv2Annex] = postErrorTypeSetDef(o) match {
         case MSome(result: Emv2Annex) => MSome[Emv2Annex](result)
         case MSome(_) => halt("Can only produce object of type Emv2Annex")
         case _ => MNone[Emv2Annex]()
        }
        return r
      case o: BehaveStateMachine =>
        val r: MOption[Emv2Annex] = postBehaveStateMachine(o) match {
         case MSome(result: Emv2Annex) => MSome[Emv2Annex](result)
         case MSome(_) => halt("Can only produce object of type Emv2Annex")
         case _ => MNone[Emv2Annex]()
        }
        return r
      case o: ErrorEvent =>
        val r: MOption[Emv2Annex] = postErrorEvent(o) match {
         case MSome(result: Emv2Annex) => MSome[Emv2Annex](result)
         case MSome(_) => halt("Can only produce object of type Emv2Annex")
         case _ => MNone[Emv2Annex]()
        }
        return r
      case o: ErrorState =>
        val r: MOption[Emv2Annex] = postErrorState(o) match {
         case MSome(result: Emv2Annex) => MSome[Emv2Annex](result)
         case MSome(_) => halt("Can only produce object of type Emv2Annex")
         case _ => MNone[Emv2Annex]()
        }
        return r
      case o: ErrorTransition =>
        val r: MOption[Emv2Annex] = postErrorTransition(o) match {
         case MSome(result: Emv2Annex) => MSome[Emv2Annex](result)
         case MSome(_) => halt("Can only produce object of type Emv2Annex")
         case _ => MNone[Emv2Annex]()
        }
        return r
      case o: ConditionTrigger =>
        val r: MOption[Emv2Annex] = postConditionTrigger(o) match {
         case MSome(result: Emv2Annex) => MSome[Emv2Annex](result)
         case MSome(_) => halt("Can only produce object of type Emv2Annex")
         case _ => MNone[Emv2Annex]()
        }
        return r
      case o: AndCondition =>
        val r: MOption[Emv2Annex] = postAndCondition(o) match {
         case MSome(result: Emv2Annex) => MSome[Emv2Annex](result)
         case MSome(_) => halt("Can only produce object of type Emv2Annex")
         case _ => MNone[Emv2Annex]()
        }
        return r
      case o: OrCondition =>
        val r: MOption[Emv2Annex] = postOrCondition(o) match {
         case MSome(result: Emv2Annex) => MSome[Emv2Annex](result)
         case MSome(_) => halt("Can only produce object of type Emv2Annex")
         case _ => MNone[Emv2Annex]()
        }
        return r
      case o: AllCondition =>
        val r: MOption[Emv2Annex] = postAllCondition(o) match {
         case MSome(result: Emv2Annex) => MSome[Emv2Annex](result)
         case MSome(_) => halt("Can only produce object of type Emv2Annex")
         case _ => MNone[Emv2Annex]()
        }
        return r
      case o: OrMoreCondition =>
        val r: MOption[Emv2Annex] = postOrMoreCondition(o) match {
         case MSome(result: Emv2Annex) => MSome[Emv2Annex](result)
         case MSome(_) => halt("Can only produce object of type Emv2Annex")
         case _ => MNone[Emv2Annex]()
        }
        return r
      case o: OrLessCondition =>
        val r: MOption[Emv2Annex] = postOrLessCondition(o) match {
         case MSome(result: Emv2Annex) => MSome[Emv2Annex](result)
         case MSome(_) => halt("Can only produce object of type Emv2Annex")
         case _ => MNone[Emv2Annex]()
        }
        return r
      case o: Emv2Clause =>
        val r: MOption[Emv2Annex] = postEmv2Clause(o) match {
         case MSome(result: Emv2Annex) => MSome[Emv2Annex](result)
         case MSome(_) => halt("Can only produce object of type Emv2Annex")
         case _ => MNone[Emv2Annex]()
        }
        return r
      case o: Emv2Propagation =>
        val r: MOption[Emv2Annex] = postEmv2Propagation(o) match {
         case MSome(result: Emv2Annex) => MSome[Emv2Annex](result)
         case MSome(_) => halt("Can only produce object of type Emv2Annex")
         case _ => MNone[Emv2Annex]()
        }
        return r
      case o: Emv2Flow =>
        val r: MOption[Emv2Annex] = postEmv2Flow(o) match {
         case MSome(result: Emv2Annex) => MSome[Emv2Annex](result)
         case MSome(_) => halt("Can only produce object of type Emv2Annex")
         case _ => MNone[Emv2Annex]()
        }
        return r
      case o: Emv2BehaviorSection =>
        val r: MOption[Emv2Annex] = postEmv2BehaviorSection(o) match {
         case MSome(result: Emv2Annex) => MSome[Emv2Annex](result)
         case MSome(_) => halt("Can only produce object of type Emv2Annex")
         case _ => MNone[Emv2Annex]()
        }
        return r
      case o: ErrorPropagation =>
        val r: MOption[Emv2Annex] = postErrorPropagation(o) match {
         case MSome(result: Emv2Annex) => MSome[Emv2Annex](result)
         case MSome(_) => halt("Can only produce object of type Emv2Annex")
         case _ => MNone[Emv2Annex]()
        }
        return r
    }
  }

  def postEmv2Lib(o: Emv2Lib): MOption[Emv2Lib] = {
    o match {
      case o: Emv2Library =>
        val r: MOption[Emv2Lib] = postEmv2Library(o) match {
         case MSome(result: Emv2Lib) => MSome[Emv2Lib](result)
         case MSome(_) => halt("Can only produce object of type Emv2Lib")
         case _ => MNone[Emv2Lib]()
        }
        return r
    }
  }

  def postAadl(o: Aadl): MOption[Aadl] = {
    return PostResultAadl
  }

  def postEmv2ElementRef(o: Emv2ElementRef): MOption[Emv2ElementRef] = {
    return PostResultEmv2ElementRef
  }

  def postName(o: Name): MOption[Name] = {
    return PostResultName
  }

  def postComponent(o: Component): MOption[Component] = {
    return PostResultComponent
  }

  def postEmv2Library(o: Emv2Library): MOption[Emv2Library] = {
    return PostResultEmv2Library
  }

  def postErrorTypeDef(o: ErrorTypeDef): MOption[ErrorTypeDef] = {
    return PostResultErrorTypeDef
  }

  def postClassifier(o: Classifier): MOption[Classifier] = {
    return PostResultClassifier
  }

  def postErrorAliasDef(o: ErrorAliasDef): MOption[ErrorAliasDef] = {
    return PostResultErrorAliasDef
  }

  def postErrorTypeSetDef(o: ErrorTypeSetDef): MOption[ErrorTypeSetDef] = {
    return PostResultErrorTypeSetDef
  }

  def postFeature(o: Feature): MOption[Feature] = {
    o match {
      case o: FeatureEnd =>
        val r: MOption[Feature] = postFeatureEnd(o) match {
         case MSome(result: Feature) => MSome[Feature](result)
         case MSome(_) => halt("Can only produce object of type Feature")
         case _ => MNone[Feature]()
        }
        return r
      case o: FeatureGroup =>
        val r: MOption[Feature] = postFeatureGroup(o) match {
         case MSome(result: Feature) => MSome[Feature](result)
         case MSome(_) => halt("Can only produce object of type Feature")
         case _ => MNone[Feature]()
        }
        return r
      case o: FeatureAccess =>
        val r: MOption[Feature] = postFeatureAccess(o) match {
         case MSome(result: Feature) => MSome[Feature](result)
         case MSome(_) => halt("Can only produce object of type Feature")
         case _ => MNone[Feature]()
        }
        return r
    }
  }

  def postBehaveStateMachine(o: BehaveStateMachine): MOption[BehaveStateMachine] = {
    return PostResultBehaveStateMachine
  }

  def postFeatureEnd(o: FeatureEnd): MOption[FeatureEnd] = {
    return PostResultFeatureEnd
  }

  def postErrorEvent(o: ErrorEvent): MOption[ErrorEvent] = {
    return PostResultErrorEvent
  }

  def postErrorState(o: ErrorState): MOption[ErrorState] = {
    return PostResultErrorState
  }

  def postErrorTransition(o: ErrorTransition): MOption[ErrorTransition] = {
    return PostResultErrorTransition
  }

  def postFeatureGroup(o: FeatureGroup): MOption[FeatureGroup] = {
    return PostResultFeatureGroup
  }

  def postErrorCondition(o: ErrorCondition): MOption[ErrorCondition] = {
    o match {
      case o: ConditionTrigger =>
        val r: MOption[ErrorCondition] = postConditionTrigger(o) match {
         case MSome(result: ErrorCondition) => MSome[ErrorCondition](result)
         case MSome(_) => halt("Can only produce object of type ErrorCondition")
         case _ => MNone[ErrorCondition]()
        }
        return r
      case o: AndCondition =>
        val r: MOption[ErrorCondition] = postAndCondition(o) match {
         case MSome(result: ErrorCondition) => MSome[ErrorCondition](result)
         case MSome(_) => halt("Can only produce object of type ErrorCondition")
         case _ => MNone[ErrorCondition]()
        }
        return r
      case o: OrCondition =>
        val r: MOption[ErrorCondition] = postOrCondition(o) match {
         case MSome(result: ErrorCondition) => MSome[ErrorCondition](result)
         case MSome(_) => halt("Can only produce object of type ErrorCondition")
         case _ => MNone[ErrorCondition]()
        }
        return r
      case o: AllCondition =>
        val r: MOption[ErrorCondition] = postAllCondition(o) match {
         case MSome(result: ErrorCondition) => MSome[ErrorCondition](result)
         case MSome(_) => halt("Can only produce object of type ErrorCondition")
         case _ => MNone[ErrorCondition]()
        }
        return r
      case o: OrMoreCondition =>
        val r: MOption[ErrorCondition] = postOrMoreCondition(o) match {
         case MSome(result: ErrorCondition) => MSome[ErrorCondition](result)
         case MSome(_) => halt("Can only produce object of type ErrorCondition")
         case _ => MNone[ErrorCondition]()
        }
        return r
      case o: OrLessCondition =>
        val r: MOption[ErrorCondition] = postOrLessCondition(o) match {
         case MSome(result: ErrorCondition) => MSome[ErrorCondition](result)
         case MSome(_) => halt("Can only produce object of type ErrorCondition")
         case _ => MNone[ErrorCondition]()
        }
        return r
    }
  }

  def postConditionTrigger(o: ConditionTrigger): MOption[ConditionTrigger] = {
    return PostResultConditionTrigger
  }

  def postAndCondition(o: AndCondition): MOption[AndCondition] = {
    return PostResultAndCondition
  }

  def postFeatureAccess(o: FeatureAccess): MOption[FeatureAccess] = {
    return PostResultFeatureAccess
  }

  def postOrCondition(o: OrCondition): MOption[OrCondition] = {
    return PostResultOrCondition
  }

  def postAllCondition(o: AllCondition): MOption[AllCondition] = {
    return PostResultAllCondition
  }

  def postOrMoreCondition(o: OrMoreCondition): MOption[OrMoreCondition] = {
    return PostResultOrMoreCondition
  }

  def postOrLessCondition(o: OrLessCondition): MOption[OrLessCondition] = {
    return PostResultOrLessCondition
  }

  def postEmv2Clause(o: Emv2Clause): MOption[Emv2Clause] = {
    return PostResultEmv2Clause
  }

  def postEmv2Propagation(o: Emv2Propagation): MOption[Emv2Propagation] = {
    return PostResultEmv2Propagation
  }

  def postConnection(o: Connection): MOption[Connection] = {
    return PostResultConnection
  }

  def postEmv2Flow(o: Emv2Flow): MOption[Emv2Flow] = {
    return PostResultEmv2Flow
  }

  def postEmv2BehaviorSection(o: Emv2BehaviorSection): MOption[Emv2BehaviorSection] = {
    return PostResultEmv2BehaviorSection
  }

  def postConnectionInstance(o: ConnectionInstance): MOption[ConnectionInstance] = {
    return PostResultConnectionInstance
  }

  def postErrorPropagation(o: ErrorPropagation): MOption[ErrorPropagation] = {
    return PostResultErrorPropagation
  }

  def postConnectionReference(o: ConnectionReference): MOption[ConnectionReference] = {
    return PostResultConnectionReference
  }

  def postEndPoint(o: EndPoint): MOption[EndPoint] = {
    return PostResultEndPoint
  }

  def postProperty(o: Property): MOption[Property] = {
    return PostResultProperty
  }

  def postElementRef(o: ElementRef): MOption[ElementRef] = {
    o match {
      case o: Emv2ElementRef =>
        val r: MOption[ElementRef] = postEmv2ElementRef(o) match {
         case MSome(result: ElementRef) => MSome[ElementRef](result)
         case MSome(_) => halt("Can only produce object of type ElementRef")
         case _ => MNone[ElementRef]()
        }
        return r
      case o: AadlElementRef =>
        val r: MOption[ElementRef] = postAadlElementRef(o) match {
         case MSome(result: ElementRef) => MSome[ElementRef](result)
         case MSome(_) => halt("Can only produce object of type ElementRef")
         case _ => MNone[ElementRef]()
        }
        return r
    }
  }

  def postAadlElementRef(o: AadlElementRef): MOption[AadlElementRef] = {
    return PostResultAadlElementRef
  }

  def postPropertyValue(o: PropertyValue): MOption[PropertyValue] = {
    o match {
      case o: ClassifierProp => return postClassifierProp(o)
      case o: RangeProp => return postRangeProp(o)
      case o: RecordProp => return postRecordProp(o)
      case o: ReferenceProp => return postReferenceProp(o)
      case o: UnitProp => return postUnitProp(o)
      case o: ValueProp => return postValueProp(o)
    }
  }

  def postClassifierProp(o: ClassifierProp): MOption[PropertyValue] = {
    return PostResultClassifierProp
  }

  def postRangeProp(o: RangeProp): MOption[PropertyValue] = {
    return PostResultRangeProp
  }

  def postRecordProp(o: RecordProp): MOption[PropertyValue] = {
    return PostResultRecordProp
  }

  def postReferenceProp(o: ReferenceProp): MOption[PropertyValue] = {
    return PostResultReferenceProp
  }

  def postUnitProp(o: UnitProp): MOption[PropertyValue] = {
    return PostResultUnitProp
  }

  def postValueProp(o: ValueProp): MOption[PropertyValue] = {
    return PostResultValueProp
  }

  def postMode(o: Mode): MOption[Mode] = {
    return PostResultMode
  }

  def postFlow(o: Flow): MOption[Flow] = {
    return PostResultFlow
  }

  def postAnnex(o: Annex): MOption[Annex] = {
    return PostResultAnnex
  }

  def postAnnexClause(o: AnnexClause): MOption[AnnexClause] = {
    o match {
      case o: SmfClause =>
        val r: MOption[AnnexClause] = postSmfClause(o) match {
         case MSome(result: AnnexClause) => MSome[AnnexClause](result)
         case MSome(_) => halt("Can only produce object of type AnnexClause")
         case _ => MNone[AnnexClause]()
        }
        return r
      case o: SmfClassification =>
        val r: MOption[AnnexClause] = postSmfClassification(o) match {
         case MSome(result: AnnexClause) => MSome[AnnexClause](result)
         case MSome(_) => halt("Can only produce object of type AnnexClause")
         case _ => MNone[AnnexClause]()
        }
        return r
      case o: SmfDeclass =>
        val r: MOption[AnnexClause] = postSmfDeclass(o) match {
         case MSome(result: AnnexClause) => MSome[AnnexClause](result)
         case MSome(_) => halt("Can only produce object of type AnnexClause")
         case _ => MNone[AnnexClause]()
        }
        return r
      case o: SmfType =>
        val r: MOption[AnnexClause] = postSmfType(o) match {
         case MSome(result: AnnexClause) => MSome[AnnexClause](result)
         case MSome(_) => halt("Can only produce object of type AnnexClause")
         case _ => MNone[AnnexClause]()
        }
        return r
      case o: ErrorTypeDef =>
        val r: MOption[AnnexClause] = postErrorTypeDef(o) match {
         case MSome(result: AnnexClause) => MSome[AnnexClause](result)
         case MSome(_) => halt("Can only produce object of type AnnexClause")
         case _ => MNone[AnnexClause]()
        }
        return r
      case o: ErrorAliasDef =>
        val r: MOption[AnnexClause] = postErrorAliasDef(o) match {
         case MSome(result: AnnexClause) => MSome[AnnexClause](result)
         case MSome(_) => halt("Can only produce object of type AnnexClause")
         case _ => MNone[AnnexClause]()
        }
        return r
      case o: ErrorTypeSetDef =>
        val r: MOption[AnnexClause] = postErrorTypeSetDef(o) match {
         case MSome(result: AnnexClause) => MSome[AnnexClause](result)
         case MSome(_) => halt("Can only produce object of type AnnexClause")
         case _ => MNone[AnnexClause]()
        }
        return r
      case o: BehaveStateMachine =>
        val r: MOption[AnnexClause] = postBehaveStateMachine(o) match {
         case MSome(result: AnnexClause) => MSome[AnnexClause](result)
         case MSome(_) => halt("Can only produce object of type AnnexClause")
         case _ => MNone[AnnexClause]()
        }
        return r
      case o: ErrorEvent =>
        val r: MOption[AnnexClause] = postErrorEvent(o) match {
         case MSome(result: AnnexClause) => MSome[AnnexClause](result)
         case MSome(_) => halt("Can only produce object of type AnnexClause")
         case _ => MNone[AnnexClause]()
        }
        return r
      case o: ErrorState =>
        val r: MOption[AnnexClause] = postErrorState(o) match {
         case MSome(result: AnnexClause) => MSome[AnnexClause](result)
         case MSome(_) => halt("Can only produce object of type AnnexClause")
         case _ => MNone[AnnexClause]()
        }
        return r
      case o: ErrorTransition =>
        val r: MOption[AnnexClause] = postErrorTransition(o) match {
         case MSome(result: AnnexClause) => MSome[AnnexClause](result)
         case MSome(_) => halt("Can only produce object of type AnnexClause")
         case _ => MNone[AnnexClause]()
        }
        return r
      case o: ConditionTrigger =>
        val r: MOption[AnnexClause] = postConditionTrigger(o) match {
         case MSome(result: AnnexClause) => MSome[AnnexClause](result)
         case MSome(_) => halt("Can only produce object of type AnnexClause")
         case _ => MNone[AnnexClause]()
        }
        return r
      case o: AndCondition =>
        val r: MOption[AnnexClause] = postAndCondition(o) match {
         case MSome(result: AnnexClause) => MSome[AnnexClause](result)
         case MSome(_) => halt("Can only produce object of type AnnexClause")
         case _ => MNone[AnnexClause]()
        }
        return r
      case o: OrCondition =>
        val r: MOption[AnnexClause] = postOrCondition(o) match {
         case MSome(result: AnnexClause) => MSome[AnnexClause](result)
         case MSome(_) => halt("Can only produce object of type AnnexClause")
         case _ => MNone[AnnexClause]()
        }
        return r
      case o: AllCondition =>
        val r: MOption[AnnexClause] = postAllCondition(o) match {
         case MSome(result: AnnexClause) => MSome[AnnexClause](result)
         case MSome(_) => halt("Can only produce object of type AnnexClause")
         case _ => MNone[AnnexClause]()
        }
        return r
      case o: OrMoreCondition =>
        val r: MOption[AnnexClause] = postOrMoreCondition(o) match {
         case MSome(result: AnnexClause) => MSome[AnnexClause](result)
         case MSome(_) => halt("Can only produce object of type AnnexClause")
         case _ => MNone[AnnexClause]()
        }
        return r
      case o: OrLessCondition =>
        val r: MOption[AnnexClause] = postOrLessCondition(o) match {
         case MSome(result: AnnexClause) => MSome[AnnexClause](result)
         case MSome(_) => halt("Can only produce object of type AnnexClause")
         case _ => MNone[AnnexClause]()
        }
        return r
      case o: Emv2Clause =>
        val r: MOption[AnnexClause] = postEmv2Clause(o) match {
         case MSome(result: AnnexClause) => MSome[AnnexClause](result)
         case MSome(_) => halt("Can only produce object of type AnnexClause")
         case _ => MNone[AnnexClause]()
        }
        return r
      case o: Emv2Propagation =>
        val r: MOption[AnnexClause] = postEmv2Propagation(o) match {
         case MSome(result: AnnexClause) => MSome[AnnexClause](result)
         case MSome(_) => halt("Can only produce object of type AnnexClause")
         case _ => MNone[AnnexClause]()
        }
        return r
      case o: Emv2Flow =>
        val r: MOption[AnnexClause] = postEmv2Flow(o) match {
         case MSome(result: AnnexClause) => MSome[AnnexClause](result)
         case MSome(_) => halt("Can only produce object of type AnnexClause")
         case _ => MNone[AnnexClause]()
        }
        return r
      case o: Emv2BehaviorSection =>
        val r: MOption[AnnexClause] = postEmv2BehaviorSection(o) match {
         case MSome(result: AnnexClause) => MSome[AnnexClause](result)
         case MSome(_) => halt("Can only produce object of type AnnexClause")
         case _ => MNone[AnnexClause]()
        }
        return r
      case o: ErrorPropagation =>
        val r: MOption[AnnexClause] = postErrorPropagation(o) match {
         case MSome(result: AnnexClause) => MSome[AnnexClause](result)
         case MSome(_) => halt("Can only produce object of type AnnexClause")
         case _ => MNone[AnnexClause]()
        }
        return r
      case o: OtherAnnex =>
        val r: MOption[AnnexClause] = postOtherAnnex(o) match {
         case MSome(result: AnnexClause) => MSome[AnnexClause](result)
         case MSome(_) => halt("Can only produce object of type AnnexClause")
         case _ => MNone[AnnexClause]()
        }
        return r
      case o: BTSBLESSAnnexClause =>
        val r: MOption[AnnexClause] = postBTSBLESSAnnexClause(o) match {
         case MSome(result: AnnexClause) => MSome[AnnexClause](result)
         case MSome(_) => halt("Can only produce object of type AnnexClause")
         case _ => MNone[AnnexClause]()
        }
        return r
    }
  }

  def postAnnexLib(o: AnnexLib): MOption[AnnexLib] = {
    o match {
      case o: SmfLibrary =>
        val r: MOption[AnnexLib] = postSmfLibrary(o) match {
         case MSome(result: AnnexLib) => MSome[AnnexLib](result)
         case MSome(_) => halt("Can only produce object of type AnnexLib")
         case _ => MNone[AnnexLib]()
        }
        return r
      case o: Emv2Library =>
        val r: MOption[AnnexLib] = postEmv2Library(o) match {
         case MSome(result: AnnexLib) => MSome[AnnexLib](result)
         case MSome(_) => halt("Can only produce object of type AnnexLib")
         case _ => MNone[AnnexLib]()
        }
        return r
      case o: OtherLib =>
        val r: MOption[AnnexLib] = postOtherLib(o) match {
         case MSome(result: AnnexLib) => MSome[AnnexLib](result)
         case MSome(_) => halt("Can only produce object of type AnnexLib")
         case _ => MNone[AnnexLib]()
        }
        return r
    }
  }

  def postOtherAnnex(o: OtherAnnex): MOption[OtherAnnex] = {
    return PostResultOtherAnnex
  }

  def postOtherLib(o: OtherLib): MOption[OtherLib] = {
    return PostResultOtherLib
  }

  def postBLESSAnnex(o: BLESSAnnex): MOption[BLESSAnnex] = {
    o match {
      case o: BTSBLESSAnnexClause =>
        val r: MOption[BLESSAnnex] = postBTSBLESSAnnexClause(o) match {
         case MSome(result: BLESSAnnex) => MSome[BLESSAnnex](result)
         case MSome(_) => halt("Can only produce object of type BLESSAnnex")
         case _ => MNone[BLESSAnnex]()
        }
        return r
    }
  }

  def postBTSBLESSAnnexClause(o: BTSBLESSAnnexClause): MOption[BTSBLESSAnnexClause] = {
    return PostResultBTSBLESSAnnexClause
  }

  def postBTSVariableDeclaration(o: BTSVariableDeclaration): MOption[BTSVariableDeclaration] = {
    return PostResultBTSVariableDeclaration
  }

  def postBTSClassifier(o: BTSClassifier): MOption[BTSClassifier] = {
    return PostResultBTSClassifier
  }

  def postBLESSIntConst(o: BLESSIntConst): MOption[BLESSIntConst] = {
    return PostResultBLESSIntConst
  }

  def postBTSStateDeclaration(o: BTSStateDeclaration): MOption[BTSStateDeclaration] = {
    return PostResultBTSStateDeclaration
  }

  def postBTSTransition(o: BTSTransition): MOption[BTSTransition] = {
    return PostResultBTSTransition
  }

  def postBTSTransitionLabel(o: BTSTransitionLabel): MOption[BTSTransitionLabel] = {
    return PostResultBTSTransitionLabel
  }

  def postBTSTransitionCondition(o: BTSTransitionCondition): MOption[BTSTransitionCondition] = {
    o match {
      case o: BTSDispatchCondition =>
        val r: MOption[BTSTransitionCondition] = postBTSDispatchCondition(o) match {
         case MSome(result: BTSTransitionCondition) => MSome[BTSTransitionCondition](result)
         case MSome(_) => halt("Can only produce object of type BTSTransitionCondition")
         case _ => MNone[BTSTransitionCondition]()
        }
        return r
      case o: BTSExecuteConditionExp =>
        val r: MOption[BTSTransitionCondition] = postBTSExecuteConditionExp(o) match {
         case MSome(result: BTSTransitionCondition) => MSome[BTSTransitionCondition](result)
         case MSome(_) => halt("Can only produce object of type BTSTransitionCondition")
         case _ => MNone[BTSTransitionCondition]()
        }
        return r
      case o: BTSExecuteConditionTimeout =>
        val r: MOption[BTSTransitionCondition] = postBTSExecuteConditionTimeout(o) match {
         case MSome(result: BTSTransitionCondition) => MSome[BTSTransitionCondition](result)
         case MSome(_) => halt("Can only produce object of type BTSTransitionCondition")
         case _ => MNone[BTSTransitionCondition]()
        }
        return r
      case o: BTSExecuteConditionOtherwise =>
        val r: MOption[BTSTransitionCondition] = postBTSExecuteConditionOtherwise(o) match {
         case MSome(result: BTSTransitionCondition) => MSome[BTSTransitionCondition](result)
         case MSome(_) => halt("Can only produce object of type BTSTransitionCondition")
         case _ => MNone[BTSTransitionCondition]()
        }
        return r
      case o: BTSModeCondition =>
        val r: MOption[BTSTransitionCondition] = postBTSModeCondition(o) match {
         case MSome(result: BTSTransitionCondition) => MSome[BTSTransitionCondition](result)
         case MSome(_) => halt("Can only produce object of type BTSTransitionCondition")
         case _ => MNone[BTSTransitionCondition]()
        }
        return r
      case o: BTSInternalCondition =>
        val r: MOption[BTSTransitionCondition] = postBTSInternalCondition(o) match {
         case MSome(result: BTSTransitionCondition) => MSome[BTSTransitionCondition](result)
         case MSome(_) => halt("Can only produce object of type BTSTransitionCondition")
         case _ => MNone[BTSTransitionCondition]()
        }
        return r
    }
  }

  def postBTSDispatchCondition(o: BTSDispatchCondition): MOption[BTSDispatchCondition] = {
    return PostResultBTSDispatchCondition
  }

  def postBTSDispatchConjunction(o: BTSDispatchConjunction): MOption[BTSDispatchConjunction] = {
    return PostResultBTSDispatchConjunction
  }

  def postBTSDispatchTrigger(o: BTSDispatchTrigger): MOption[BTSDispatchTrigger] = {
    o match {
      case o: BTSDispatchTriggerStop =>
        val r: MOption[BTSDispatchTrigger] = postBTSDispatchTriggerStop(o) match {
         case MSome(result: BTSDispatchTrigger) => MSome[BTSDispatchTrigger](result)
         case MSome(_) => halt("Can only produce object of type BTSDispatchTrigger")
         case _ => MNone[BTSDispatchTrigger]()
        }
        return r
      case o: BTSDispatchTriggerPort =>
        val r: MOption[BTSDispatchTrigger] = postBTSDispatchTriggerPort(o) match {
         case MSome(result: BTSDispatchTrigger) => MSome[BTSDispatchTrigger](result)
         case MSome(_) => halt("Can only produce object of type BTSDispatchTrigger")
         case _ => MNone[BTSDispatchTrigger]()
        }
        return r
      case o: BTSDispatchTriggerTimeout =>
        val r: MOption[BTSDispatchTrigger] = postBTSDispatchTriggerTimeout(o) match {
         case MSome(result: BTSDispatchTrigger) => MSome[BTSDispatchTrigger](result)
         case MSome(_) => halt("Can only produce object of type BTSDispatchTrigger")
         case _ => MNone[BTSDispatchTrigger]()
        }
        return r
    }
  }

  def postBTSDispatchTriggerStop(o: BTSDispatchTriggerStop): MOption[BTSDispatchTriggerStop] = {
    return PostResultBTSDispatchTriggerStop
  }

  def postBTSDispatchTriggerPort(o: BTSDispatchTriggerPort): MOption[BTSDispatchTriggerPort] = {
    return PostResultBTSDispatchTriggerPort
  }

  def postBTSDispatchTriggerTimeout(o: BTSDispatchTriggerTimeout): MOption[BTSDispatchTriggerTimeout] = {
    return PostResultBTSDispatchTriggerTimeout
  }

  def postBTSExecuteCondition(o: BTSExecuteCondition): MOption[BTSExecuteCondition] = {
    o match {
      case o: BTSExecuteConditionExp =>
        val r: MOption[BTSExecuteCondition] = postBTSExecuteConditionExp(o) match {
         case MSome(result: BTSExecuteCondition) => MSome[BTSExecuteCondition](result)
         case MSome(_) => halt("Can only produce object of type BTSExecuteCondition")
         case _ => MNone[BTSExecuteCondition]()
        }
        return r
      case o: BTSExecuteConditionTimeout =>
        val r: MOption[BTSExecuteCondition] = postBTSExecuteConditionTimeout(o) match {
         case MSome(result: BTSExecuteCondition) => MSome[BTSExecuteCondition](result)
         case MSome(_) => halt("Can only produce object of type BTSExecuteCondition")
         case _ => MNone[BTSExecuteCondition]()
        }
        return r
      case o: BTSExecuteConditionOtherwise =>
        val r: MOption[BTSExecuteCondition] = postBTSExecuteConditionOtherwise(o) match {
         case MSome(result: BTSExecuteCondition) => MSome[BTSExecuteCondition](result)
         case MSome(_) => halt("Can only produce object of type BTSExecuteCondition")
         case _ => MNone[BTSExecuteCondition]()
        }
        return r
    }
  }

  def postBTSExecuteConditionExp(o: BTSExecuteConditionExp): MOption[BTSExecuteConditionExp] = {
    return PostResultBTSExecuteConditionExp
  }

  def postBTSExecuteConditionTimeout(o: BTSExecuteConditionTimeout): MOption[BTSExecuteConditionTimeout] = {
    return PostResultBTSExecuteConditionTimeout
  }

  def postBTSExecuteConditionOtherwise(o: BTSExecuteConditionOtherwise): MOption[BTSExecuteConditionOtherwise] = {
    return PostResultBTSExecuteConditionOtherwise
  }

  def postBTSModeCondition(o: BTSModeCondition): MOption[BTSModeCondition] = {
    return PostResultBTSModeCondition
  }

  def postBTSTriggerLogicalExpression(o: BTSTriggerLogicalExpression): MOption[BTSTriggerLogicalExpression] = {
    return PostResultBTSTriggerLogicalExpression
  }

  def postBTSEventTrigger(o: BTSEventTrigger): MOption[BTSEventTrigger] = {
    o match {
      case o: BTSTriggerLogicalExpression =>
        val r: MOption[BTSEventTrigger] = postBTSTriggerLogicalExpression(o) match {
         case MSome(result: BTSEventTrigger) => MSome[BTSEventTrigger](result)
         case MSome(_) => halt("Can only produce object of type BTSEventTrigger")
         case _ => MNone[BTSEventTrigger]()
        }
        return r
      case o: BTSSubcomponentPort =>
        val r: MOption[BTSEventTrigger] = postBTSSubcomponentPort(o) match {
         case MSome(result: BTSEventTrigger) => MSome[BTSEventTrigger](result)
         case MSome(_) => halt("Can only produce object of type BTSEventTrigger")
         case _ => MNone[BTSEventTrigger]()
        }
        return r
    }
  }

  def postBTSSubcomponentPort(o: BTSSubcomponentPort): MOption[BTSSubcomponentPort] = {
    return PostResultBTSSubcomponentPort
  }

  def postBTSInternalCondition(o: BTSInternalCondition): MOption[BTSInternalCondition] = {
    return PostResultBTSInternalCondition
  }

  def postBTSAssertion(o: BTSAssertion): MOption[BTSAssertion] = {
    o match {
      case o: BTSNamedAssertion =>
        val r: MOption[BTSAssertion] = postBTSNamedAssertion(o) match {
         case MSome(result: BTSAssertion) => MSome[BTSAssertion](result)
         case MSome(_) => halt("Can only produce object of type BTSAssertion")
         case _ => MNone[BTSAssertion]()
        }
        return r
      case o: BTSNamedFunction =>
        val r: MOption[BTSAssertion] = postBTSNamedFunction(o) match {
         case MSome(result: BTSAssertion) => MSome[BTSAssertion](result)
         case MSome(_) => halt("Can only produce object of type BTSAssertion")
         case _ => MNone[BTSAssertion]()
        }
        return r
      case o: BTSNamedEnumeration =>
        val r: MOption[BTSAssertion] = postBTSNamedEnumeration(o) match {
         case MSome(result: BTSAssertion) => MSome[BTSAssertion](result)
         case MSome(_) => halt("Can only produce object of type BTSAssertion")
         case _ => MNone[BTSAssertion]()
        }
        return r
      case o: BTSNamelessAssertion =>
        val r: MOption[BTSAssertion] = postBTSNamelessAssertion(o) match {
         case MSome(result: BTSAssertion) => MSome[BTSAssertion](result)
         case MSome(_) => halt("Can only produce object of type BTSAssertion")
         case _ => MNone[BTSAssertion]()
        }
        return r
      case o: BTSNamelessFunction =>
        val r: MOption[BTSAssertion] = postBTSNamelessFunction(o) match {
         case MSome(result: BTSAssertion) => MSome[BTSAssertion](result)
         case MSome(_) => halt("Can only produce object of type BTSAssertion")
         case _ => MNone[BTSAssertion]()
        }
        return r
      case o: BTSNamelessEnumeration =>
        val r: MOption[BTSAssertion] = postBTSNamelessEnumeration(o) match {
         case MSome(result: BTSAssertion) => MSome[BTSAssertion](result)
         case MSome(_) => halt("Can only produce object of type BTSAssertion")
         case _ => MNone[BTSAssertion]()
        }
        return r
    }
  }

  def postBTSNamedAssertion(o: BTSNamedAssertion): MOption[BTSNamedAssertion] = {
    return PostResultBTSNamedAssertion
  }

  def postBTSNamedFunction(o: BTSNamedFunction): MOption[BTSNamedFunction] = {
    return PostResultBTSNamedFunction
  }

  def postBTSNamedEnumeration(o: BTSNamedEnumeration): MOption[BTSNamedEnumeration] = {
    return PostResultBTSNamedEnumeration
  }

  def postBTSNamelessAssertion(o: BTSNamelessAssertion): MOption[BTSNamelessAssertion] = {
    return PostResultBTSNamelessAssertion
  }

  def postBTSNamelessFunction(o: BTSNamelessFunction): MOption[BTSNamelessFunction] = {
    return PostResultBTSNamelessFunction
  }

  def postBTSNamelessEnumeration(o: BTSNamelessEnumeration): MOption[BTSNamelessEnumeration] = {
    return PostResultBTSNamelessEnumeration
  }

  def postBTSAssertionEnumeration(o: BTSAssertionEnumeration): MOption[BTSAssertionEnumeration] = {
    o match {
      case o: BTSEnumerationPairs =>
        val r: MOption[BTSAssertionEnumeration] = postBTSEnumerationPairs(o) match {
         case MSome(result: BTSAssertionEnumeration) => MSome[BTSAssertionEnumeration](result)
         case MSome(_) => halt("Can only produce object of type BTSAssertionEnumeration")
         case _ => MNone[BTSAssertionEnumeration]()
        }
        return r
      case o: BTSInvocation =>
        val r: MOption[BTSAssertionEnumeration] = postBTSInvocation(o) match {
         case MSome(result: BTSAssertionEnumeration) => MSome[BTSAssertionEnumeration](result)
         case MSome(_) => halt("Can only produce object of type BTSAssertionEnumeration")
         case _ => MNone[BTSAssertionEnumeration]()
        }
        return r
    }
  }

  def postBTSEnumerationPairs(o: BTSEnumerationPairs): MOption[BTSEnumerationPairs] = {
    return PostResultBTSEnumerationPairs
  }

  def postBTSEnumerationPair(o: BTSEnumerationPair): MOption[BTSEnumerationPair] = {
    return PostResultBTSEnumerationPair
  }

  def postBTSInvocation(o: BTSInvocation): MOption[BTSInvocation] = {
    return PostResultBTSInvocation
  }

  def postBTSActualParameter(o: BTSActualParameter): MOption[BTSActualParameter] = {
    return PostResultBTSActualParameter
  }

  def postBTSVariable(o: BTSVariable): MOption[BTSVariable] = {
    return PostResultBTSVariable
  }

  def postBTSBehaviorActions(o: BTSBehaviorActions): MOption[BTSBehaviorActions] = {
    return PostResultBTSBehaviorActions
  }

  def postBTSAssertedAction(o: BTSAssertedAction): MOption[BTSAssertedAction] = {
    return PostResultBTSAssertedAction
  }

  def postBTSAction(o: BTSAction): MOption[BTSAction] = {
    o match {
      case o: BTSSkipAction =>
        val r: MOption[BTSAction] = postBTSSkipAction(o) match {
         case MSome(result: BTSAction) => MSome[BTSAction](result)
         case MSome(_) => halt("Can only produce object of type BTSAction")
         case _ => MNone[BTSAction]()
        }
        return r
      case o: BTSAssignmentAction =>
        val r: MOption[BTSAction] = postBTSAssignmentAction(o) match {
         case MSome(result: BTSAction) => MSome[BTSAction](result)
         case MSome(_) => halt("Can only produce object of type BTSAction")
         case _ => MNone[BTSAction]()
        }
        return r
      case o: BTSSetMode =>
        val r: MOption[BTSAction] = postBTSSetMode(o) match {
         case MSome(result: BTSAction) => MSome[BTSAction](result)
         case MSome(_) => halt("Can only produce object of type BTSAction")
         case _ => MNone[BTSAction]()
        }
        return r
      case o: BTSWhenThrow =>
        val r: MOption[BTSAction] = postBTSWhenThrow(o) match {
         case MSome(result: BTSAction) => MSome[BTSAction](result)
         case MSome(_) => halt("Can only produce object of type BTSAction")
         case _ => MNone[BTSAction]()
        }
        return r
      case o: BTSFetchAdd =>
        val r: MOption[BTSAction] = postBTSFetchAdd(o) match {
         case MSome(result: BTSAction) => MSome[BTSAction](result)
         case MSome(_) => halt("Can only produce object of type BTSAction")
         case _ => MNone[BTSAction]()
        }
        return r
      case o: BTSFetchOr =>
        val r: MOption[BTSAction] = postBTSFetchOr(o) match {
         case MSome(result: BTSAction) => MSome[BTSAction](result)
         case MSome(_) => halt("Can only produce object of type BTSAction")
         case _ => MNone[BTSAction]()
        }
        return r
      case o: BTSFetchAnd =>
        val r: MOption[BTSAction] = postBTSFetchAnd(o) match {
         case MSome(result: BTSAction) => MSome[BTSAction](result)
         case MSome(_) => halt("Can only produce object of type BTSAction")
         case _ => MNone[BTSAction]()
        }
        return r
      case o: BTSFetchXor =>
        val r: MOption[BTSAction] = postBTSFetchXor(o) match {
         case MSome(result: BTSAction) => MSome[BTSAction](result)
         case MSome(_) => halt("Can only produce object of type BTSAction")
         case _ => MNone[BTSAction]()
        }
        return r
      case o: BTSSwap =>
        val r: MOption[BTSAction] = postBTSSwap(o) match {
         case MSome(result: BTSAction) => MSome[BTSAction](result)
         case MSome(_) => halt("Can only produce object of type BTSAction")
         case _ => MNone[BTSAction]()
        }
        return r
      case o: BTSSubprogramCallAction =>
        val r: MOption[BTSAction] = postBTSSubprogramCallAction(o) match {
         case MSome(result: BTSAction) => MSome[BTSAction](result)
         case MSome(_) => halt("Can only produce object of type BTSAction")
         case _ => MNone[BTSAction]()
        }
        return r
      case o: BTSPortOutput =>
        val r: MOption[BTSAction] = postBTSPortOutput(o) match {
         case MSome(result: BTSAction) => MSome[BTSAction](result)
         case MSome(_) => halt("Can only produce object of type BTSAction")
         case _ => MNone[BTSAction]()
        }
        return r
      case o: BTSPortInput =>
        val r: MOption[BTSAction] = postBTSPortInput(o) match {
         case MSome(result: BTSAction) => MSome[BTSAction](result)
         case MSome(_) => halt("Can only produce object of type BTSAction")
         case _ => MNone[BTSAction]()
        }
        return r
      case o: BTSFrozenPortAction =>
        val r: MOption[BTSAction] = postBTSFrozenPortAction(o) match {
         case MSome(result: BTSAction) => MSome[BTSAction](result)
         case MSome(_) => halt("Can only produce object of type BTSAction")
         case _ => MNone[BTSAction]()
        }
        return r
      case o: BTSPause =>
        val r: MOption[BTSAction] = postBTSPause(o) match {
         case MSome(result: BTSAction) => MSome[BTSAction](result)
         case MSome(_) => halt("Can only produce object of type BTSAction")
         case _ => MNone[BTSAction]()
        }
        return r
      case o: BTSIfBLESSAction =>
        val r: MOption[BTSAction] = postBTSIfBLESSAction(o) match {
         case MSome(result: BTSAction) => MSome[BTSAction](result)
         case MSome(_) => halt("Can only produce object of type BTSAction")
         case _ => MNone[BTSAction]()
        }
        return r
      case o: BTSIfBAAction =>
        val r: MOption[BTSAction] = postBTSIfBAAction(o) match {
         case MSome(result: BTSAction) => MSome[BTSAction](result)
         case MSome(_) => halt("Can only produce object of type BTSAction")
         case _ => MNone[BTSAction]()
        }
        return r
      case o: BTSWhileLoop =>
        val r: MOption[BTSAction] = postBTSWhileLoop(o) match {
         case MSome(result: BTSAction) => MSome[BTSAction](result)
         case MSome(_) => halt("Can only produce object of type BTSAction")
         case _ => MNone[BTSAction]()
        }
        return r
      case o: BTSForLoop =>
        val r: MOption[BTSAction] = postBTSForLoop(o) match {
         case MSome(result: BTSAction) => MSome[BTSAction](result)
         case MSome(_) => halt("Can only produce object of type BTSAction")
         case _ => MNone[BTSAction]()
        }
        return r
      case o: BTSDoUntilLoop =>
        val r: MOption[BTSAction] = postBTSDoUntilLoop(o) match {
         case MSome(result: BTSAction) => MSome[BTSAction](result)
         case MSome(_) => halt("Can only produce object of type BTSAction")
         case _ => MNone[BTSAction]()
        }
        return r
      case o: BTSExistentialLatticeQuantification =>
        val r: MOption[BTSAction] = postBTSExistentialLatticeQuantification(o) match {
         case MSome(result: BTSAction) => MSome[BTSAction](result)
         case MSome(_) => halt("Can only produce object of type BTSAction")
         case _ => MNone[BTSAction]()
        }
        return r
      case o: BTSUniversalLatticeQuantification =>
        val r: MOption[BTSAction] = postBTSUniversalLatticeQuantification(o) match {
         case MSome(result: BTSAction) => MSome[BTSAction](result)
         case MSome(_) => halt("Can only produce object of type BTSAction")
         case _ => MNone[BTSAction]()
        }
        return r
    }
  }

  def postBTSBasicAction(o: BTSBasicAction): MOption[BTSBasicAction] = {
    o match {
      case o: BTSSkipAction =>
        val r: MOption[BTSBasicAction] = postBTSSkipAction(o) match {
         case MSome(result: BTSBasicAction) => MSome[BTSBasicAction](result)
         case MSome(_) => halt("Can only produce object of type BTSBasicAction")
         case _ => MNone[BTSBasicAction]()
        }
        return r
      case o: BTSAssignmentAction =>
        val r: MOption[BTSBasicAction] = postBTSAssignmentAction(o) match {
         case MSome(result: BTSBasicAction) => MSome[BTSBasicAction](result)
         case MSome(_) => halt("Can only produce object of type BTSBasicAction")
         case _ => MNone[BTSBasicAction]()
        }
        return r
      case o: BTSSetMode =>
        val r: MOption[BTSBasicAction] = postBTSSetMode(o) match {
         case MSome(result: BTSBasicAction) => MSome[BTSBasicAction](result)
         case MSome(_) => halt("Can only produce object of type BTSBasicAction")
         case _ => MNone[BTSBasicAction]()
        }
        return r
      case o: BTSWhenThrow =>
        val r: MOption[BTSBasicAction] = postBTSWhenThrow(o) match {
         case MSome(result: BTSBasicAction) => MSome[BTSBasicAction](result)
         case MSome(_) => halt("Can only produce object of type BTSBasicAction")
         case _ => MNone[BTSBasicAction]()
        }
        return r
      case o: BTSFetchAdd =>
        val r: MOption[BTSBasicAction] = postBTSFetchAdd(o) match {
         case MSome(result: BTSBasicAction) => MSome[BTSBasicAction](result)
         case MSome(_) => halt("Can only produce object of type BTSBasicAction")
         case _ => MNone[BTSBasicAction]()
        }
        return r
      case o: BTSFetchOr =>
        val r: MOption[BTSBasicAction] = postBTSFetchOr(o) match {
         case MSome(result: BTSBasicAction) => MSome[BTSBasicAction](result)
         case MSome(_) => halt("Can only produce object of type BTSBasicAction")
         case _ => MNone[BTSBasicAction]()
        }
        return r
      case o: BTSFetchAnd =>
        val r: MOption[BTSBasicAction] = postBTSFetchAnd(o) match {
         case MSome(result: BTSBasicAction) => MSome[BTSBasicAction](result)
         case MSome(_) => halt("Can only produce object of type BTSBasicAction")
         case _ => MNone[BTSBasicAction]()
        }
        return r
      case o: BTSFetchXor =>
        val r: MOption[BTSBasicAction] = postBTSFetchXor(o) match {
         case MSome(result: BTSBasicAction) => MSome[BTSBasicAction](result)
         case MSome(_) => halt("Can only produce object of type BTSBasicAction")
         case _ => MNone[BTSBasicAction]()
        }
        return r
      case o: BTSSwap =>
        val r: MOption[BTSBasicAction] = postBTSSwap(o) match {
         case MSome(result: BTSBasicAction) => MSome[BTSBasicAction](result)
         case MSome(_) => halt("Can only produce object of type BTSBasicAction")
         case _ => MNone[BTSBasicAction]()
        }
        return r
      case o: BTSSubprogramCallAction =>
        val r: MOption[BTSBasicAction] = postBTSSubprogramCallAction(o) match {
         case MSome(result: BTSBasicAction) => MSome[BTSBasicAction](result)
         case MSome(_) => halt("Can only produce object of type BTSBasicAction")
         case _ => MNone[BTSBasicAction]()
        }
        return r
      case o: BTSPortOutput =>
        val r: MOption[BTSBasicAction] = postBTSPortOutput(o) match {
         case MSome(result: BTSBasicAction) => MSome[BTSBasicAction](result)
         case MSome(_) => halt("Can only produce object of type BTSBasicAction")
         case _ => MNone[BTSBasicAction]()
        }
        return r
      case o: BTSPortInput =>
        val r: MOption[BTSBasicAction] = postBTSPortInput(o) match {
         case MSome(result: BTSBasicAction) => MSome[BTSBasicAction](result)
         case MSome(_) => halt("Can only produce object of type BTSBasicAction")
         case _ => MNone[BTSBasicAction]()
        }
        return r
      case o: BTSFrozenPortAction =>
        val r: MOption[BTSBasicAction] = postBTSFrozenPortAction(o) match {
         case MSome(result: BTSBasicAction) => MSome[BTSBasicAction](result)
         case MSome(_) => halt("Can only produce object of type BTSBasicAction")
         case _ => MNone[BTSBasicAction]()
        }
        return r
      case o: BTSPause =>
        val r: MOption[BTSBasicAction] = postBTSPause(o) match {
         case MSome(result: BTSBasicAction) => MSome[BTSBasicAction](result)
         case MSome(_) => halt("Can only produce object of type BTSBasicAction")
         case _ => MNone[BTSBasicAction]()
        }
        return r
    }
  }

  def postBTSSkipAction(o: BTSSkipAction): MOption[BTSSkipAction] = {
    return PostResultBTSSkipAction
  }

  def postBTSAssignmentAction(o: BTSAssignmentAction): MOption[BTSAssignmentAction] = {
    return PostResultBTSAssignmentAction
  }

  def postBTSSetMode(o: BTSSetMode): MOption[BTSSetMode] = {
    return PostResultBTSSetMode
  }

  def postBTSWhenThrow(o: BTSWhenThrow): MOption[BTSWhenThrow] = {
    return PostResultBTSWhenThrow
  }

  def postBTSCombinableOperation(o: BTSCombinableOperation): MOption[BTSCombinableOperation] = {
    o match {
      case o: BTSFetchAdd =>
        val r: MOption[BTSCombinableOperation] = postBTSFetchAdd(o) match {
         case MSome(result: BTSCombinableOperation) => MSome[BTSCombinableOperation](result)
         case MSome(_) => halt("Can only produce object of type BTSCombinableOperation")
         case _ => MNone[BTSCombinableOperation]()
        }
        return r
      case o: BTSFetchOr =>
        val r: MOption[BTSCombinableOperation] = postBTSFetchOr(o) match {
         case MSome(result: BTSCombinableOperation) => MSome[BTSCombinableOperation](result)
         case MSome(_) => halt("Can only produce object of type BTSCombinableOperation")
         case _ => MNone[BTSCombinableOperation]()
        }
        return r
      case o: BTSFetchAnd =>
        val r: MOption[BTSCombinableOperation] = postBTSFetchAnd(o) match {
         case MSome(result: BTSCombinableOperation) => MSome[BTSCombinableOperation](result)
         case MSome(_) => halt("Can only produce object of type BTSCombinableOperation")
         case _ => MNone[BTSCombinableOperation]()
        }
        return r
      case o: BTSFetchXor =>
        val r: MOption[BTSCombinableOperation] = postBTSFetchXor(o) match {
         case MSome(result: BTSCombinableOperation) => MSome[BTSCombinableOperation](result)
         case MSome(_) => halt("Can only produce object of type BTSCombinableOperation")
         case _ => MNone[BTSCombinableOperation]()
        }
        return r
      case o: BTSSwap =>
        val r: MOption[BTSCombinableOperation] = postBTSSwap(o) match {
         case MSome(result: BTSCombinableOperation) => MSome[BTSCombinableOperation](result)
         case MSome(_) => halt("Can only produce object of type BTSCombinableOperation")
         case _ => MNone[BTSCombinableOperation]()
        }
        return r
    }
  }

  def postBTSFetchAdd(o: BTSFetchAdd): MOption[BTSFetchAdd] = {
    return PostResultBTSFetchAdd
  }

  def postBTSFetchOr(o: BTSFetchOr): MOption[BTSFetchOr] = {
    return PostResultBTSFetchOr
  }

  def postBTSFetchAnd(o: BTSFetchAnd): MOption[BTSFetchAnd] = {
    return PostResultBTSFetchAnd
  }

  def postBTSFetchXor(o: BTSFetchXor): MOption[BTSFetchXor] = {
    return PostResultBTSFetchXor
  }

  def postBTSSwap(o: BTSSwap): MOption[BTSSwap] = {
    return PostResultBTSSwap
  }

  def postBTSCommunicationAction(o: BTSCommunicationAction): MOption[BTSCommunicationAction] = {
    o match {
      case o: BTSSubprogramCallAction =>
        val r: MOption[BTSCommunicationAction] = postBTSSubprogramCallAction(o) match {
         case MSome(result: BTSCommunicationAction) => MSome[BTSCommunicationAction](result)
         case MSome(_) => halt("Can only produce object of type BTSCommunicationAction")
         case _ => MNone[BTSCommunicationAction]()
        }
        return r
      case o: BTSPortOutput =>
        val r: MOption[BTSCommunicationAction] = postBTSPortOutput(o) match {
         case MSome(result: BTSCommunicationAction) => MSome[BTSCommunicationAction](result)
         case MSome(_) => halt("Can only produce object of type BTSCommunicationAction")
         case _ => MNone[BTSCommunicationAction]()
        }
        return r
      case o: BTSPortInput =>
        val r: MOption[BTSCommunicationAction] = postBTSPortInput(o) match {
         case MSome(result: BTSCommunicationAction) => MSome[BTSCommunicationAction](result)
         case MSome(_) => halt("Can only produce object of type BTSCommunicationAction")
         case _ => MNone[BTSCommunicationAction]()
        }
        return r
      case o: BTSFrozenPortAction =>
        val r: MOption[BTSCommunicationAction] = postBTSFrozenPortAction(o) match {
         case MSome(result: BTSCommunicationAction) => MSome[BTSCommunicationAction](result)
         case MSome(_) => halt("Can only produce object of type BTSCommunicationAction")
         case _ => MNone[BTSCommunicationAction]()
        }
        return r
      case o: BTSPause =>
        val r: MOption[BTSCommunicationAction] = postBTSPause(o) match {
         case MSome(result: BTSCommunicationAction) => MSome[BTSCommunicationAction](result)
         case MSome(_) => halt("Can only produce object of type BTSCommunicationAction")
         case _ => MNone[BTSCommunicationAction]()
        }
        return r
    }
  }

  def postBTSSubprogramCallAction(o: BTSSubprogramCallAction): MOption[BTSSubprogramCallAction] = {
    return PostResultBTSSubprogramCallAction
  }

  def postBTSFormalActual(o: BTSFormalActual): MOption[BTSFormalActual] = {
    return PostResultBTSFormalActual
  }

  def postBTSPortOutput(o: BTSPortOutput): MOption[BTSPortOutput] = {
    return PostResultBTSPortOutput
  }

  def postBTSPortInput(o: BTSPortInput): MOption[BTSPortInput] = {
    return PostResultBTSPortInput
  }

  def postBTSFrozenPortAction(o: BTSFrozenPortAction): MOption[BTSFrozenPortAction] = {
    return PostResultBTSFrozenPortAction
  }

  def postBTSPause(o: BTSPause): MOption[BTSPause] = {
    return PostResultBTSPause
  }

  def postBTSControlAction(o: BTSControlAction): MOption[BTSControlAction] = {
    o match {
      case o: BTSIfBLESSAction =>
        val r: MOption[BTSControlAction] = postBTSIfBLESSAction(o) match {
         case MSome(result: BTSControlAction) => MSome[BTSControlAction](result)
         case MSome(_) => halt("Can only produce object of type BTSControlAction")
         case _ => MNone[BTSControlAction]()
        }
        return r
      case o: BTSIfBAAction =>
        val r: MOption[BTSControlAction] = postBTSIfBAAction(o) match {
         case MSome(result: BTSControlAction) => MSome[BTSControlAction](result)
         case MSome(_) => halt("Can only produce object of type BTSControlAction")
         case _ => MNone[BTSControlAction]()
        }
        return r
      case o: BTSWhileLoop =>
        val r: MOption[BTSControlAction] = postBTSWhileLoop(o) match {
         case MSome(result: BTSControlAction) => MSome[BTSControlAction](result)
         case MSome(_) => halt("Can only produce object of type BTSControlAction")
         case _ => MNone[BTSControlAction]()
        }
        return r
      case o: BTSForLoop =>
        val r: MOption[BTSControlAction] = postBTSForLoop(o) match {
         case MSome(result: BTSControlAction) => MSome[BTSControlAction](result)
         case MSome(_) => halt("Can only produce object of type BTSControlAction")
         case _ => MNone[BTSControlAction]()
        }
        return r
      case o: BTSDoUntilLoop =>
        val r: MOption[BTSControlAction] = postBTSDoUntilLoop(o) match {
         case MSome(result: BTSControlAction) => MSome[BTSControlAction](result)
         case MSome(_) => halt("Can only produce object of type BTSControlAction")
         case _ => MNone[BTSControlAction]()
        }
        return r
    }
  }

  def postBTSIfBLESSAction(o: BTSIfBLESSAction): MOption[BTSIfBLESSAction] = {
    return PostResultBTSIfBLESSAction
  }

  def postBTSGuardedAction(o: BTSGuardedAction): MOption[BTSGuardedAction] = {
    return PostResultBTSGuardedAction
  }

  def postBTSIfBAAction(o: BTSIfBAAction): MOption[BTSIfBAAction] = {
    return PostResultBTSIfBAAction
  }

  def postBTSConditionalActions(o: BTSConditionalActions): MOption[BTSConditionalActions] = {
    return PostResultBTSConditionalActions
  }

  def postBTSWhileLoop(o: BTSWhileLoop): MOption[BTSWhileLoop] = {
    return PostResultBTSWhileLoop
  }

  def postBTSForLoop(o: BTSForLoop): MOption[BTSForLoop] = {
    return PostResultBTSForLoop
  }

  def postBTSDoUntilLoop(o: BTSDoUntilLoop): MOption[BTSDoUntilLoop] = {
    return PostResultBTSDoUntilLoop
  }

  def postBTSQuantificationActions(o: BTSQuantificationActions): MOption[BTSQuantificationActions] = {
    o match {
      case o: BTSExistentialLatticeQuantification =>
        val r: MOption[BTSQuantificationActions] = postBTSExistentialLatticeQuantification(o) match {
         case MSome(result: BTSQuantificationActions) => MSome[BTSQuantificationActions](result)
         case MSome(_) => halt("Can only produce object of type BTSQuantificationActions")
         case _ => MNone[BTSQuantificationActions]()
        }
        return r
      case o: BTSUniversalLatticeQuantification =>
        val r: MOption[BTSQuantificationActions] = postBTSUniversalLatticeQuantification(o) match {
         case MSome(result: BTSQuantificationActions) => MSome[BTSQuantificationActions](result)
         case MSome(_) => halt("Can only produce object of type BTSQuantificationActions")
         case _ => MNone[BTSQuantificationActions]()
        }
        return r
    }
  }

  def postBTSExistentialLatticeQuantification(o: BTSExistentialLatticeQuantification): MOption[BTSExistentialLatticeQuantification] = {
    return PostResultBTSExistentialLatticeQuantification
  }

  def postBTSCatchClauseTerm(o: BTSCatchClauseTerm): MOption[BTSCatchClauseTerm] = {
    return PostResultBTSCatchClauseTerm
  }

  def postBTSUniversalLatticeQuantification(o: BTSUniversalLatticeQuantification): MOption[BTSUniversalLatticeQuantification] = {
    return PostResultBTSUniversalLatticeQuantification
  }

  def postBTSExp(o: BTSExp): MOption[BTSExp] = {
    o match {
      case o: BTSUnaryExp =>
        val r: MOption[BTSExp] = postBTSUnaryExp(o) match {
         case MSome(result: BTSExp) => MSome[BTSExp](result)
         case MSome(_) => halt("Can only produce object of type BTSExp")
         case _ => MNone[BTSExp]()
        }
        return r
      case o: BTSBinaryExp =>
        val r: MOption[BTSExp] = postBTSBinaryExp(o) match {
         case MSome(result: BTSExp) => MSome[BTSExp](result)
         case MSome(_) => halt("Can only produce object of type BTSExp")
         case _ => MNone[BTSExp]()
        }
        return r
      case o: BTSLiteralExp =>
        val r: MOption[BTSExp] = postBTSLiteralExp(o) match {
         case MSome(result: BTSExp) => MSome[BTSExp](result)
         case MSome(_) => halt("Can only produce object of type BTSExp")
         case _ => MNone[BTSExp]()
        }
        return r
      case o: BTSVariableNameExp =>
        val r: MOption[BTSExp] = postBTSVariableNameExp(o) match {
         case MSome(result: BTSExp) => MSome[BTSExp](result)
         case MSome(_) => halt("Can only produce object of type BTSExp")
         case _ => MNone[BTSExp]()
        }
        return r
      case o: BTSIndexingExp =>
        val r: MOption[BTSExp] = postBTSIndexingExp(o) match {
         case MSome(result: BTSExp) => MSome[BTSExp](result)
         case MSome(_) => halt("Can only produce object of type BTSExp")
         case _ => MNone[BTSExp]()
        }
        return r
      case o: BTSAccessExp =>
        val r: MOption[BTSExp] = postBTSAccessExp(o) match {
         case MSome(result: BTSExp) => MSome[BTSExp](result)
         case MSome(_) => halt("Can only produce object of type BTSExp")
         case _ => MNone[BTSExp]()
        }
        return r
      case o: BTSFunctionCall =>
        val r: MOption[BTSExp] = postBTSFunctionCall(o) match {
         case MSome(result: BTSExp) => MSome[BTSExp](result)
         case MSome(_) => halt("Can only produce object of type BTSExp")
         case _ => MNone[BTSExp]()
        }
        return r
      case o: BTSConditionalExpression =>
        val r: MOption[BTSExp] = postBTSConditionalExpression(o) match {
         case MSome(result: BTSExp) => MSome[BTSExp](result)
         case MSome(_) => halt("Can only produce object of type BTSExp")
         case _ => MNone[BTSExp]()
        }
        return r
      case o: BTSRange =>
        val r: MOption[BTSExp] = postBTSRange(o) match {
         case MSome(result: BTSExp) => MSome[BTSExp](result)
         case MSome(_) => halt("Can only produce object of type BTSExp")
         case _ => MNone[BTSExp]()
        }
        return r
    }
  }

  def postBTSUnaryExp(o: BTSUnaryExp): MOption[BTSUnaryExp] = {
    return PostResultBTSUnaryExp
  }

  def postBTSBinaryExp(o: BTSBinaryExp): MOption[BTSBinaryExp] = {
    return PostResultBTSBinaryExp
  }

  def postBTSLiteralExp(o: BTSLiteralExp): MOption[BTSLiteralExp] = {
    return PostResultBTSLiteralExp
  }

  def postBTSValueName(o: BTSValueName): MOption[BTSValueName] = {
    o match {
      case o: BTSVariableNameExp =>
        val r: MOption[BTSValueName] = postBTSVariableNameExp(o) match {
         case MSome(result: BTSValueName) => MSome[BTSValueName](result)
         case MSome(_) => halt("Can only produce object of type BTSValueName")
         case _ => MNone[BTSValueName]()
        }
        return r
      case o: BTSFunctionCall =>
        val r: MOption[BTSValueName] = postBTSFunctionCall(o) match {
         case MSome(result: BTSValueName) => MSome[BTSValueName](result)
         case MSome(_) => halt("Can only produce object of type BTSValueName")
         case _ => MNone[BTSValueName]()
        }
        return r
    }
  }

  def postBTSVariableNameExp(o: BTSVariableNameExp): MOption[BTSVariableNameExp] = {
    return PostResultBTSVariableNameExp
  }

  def postBTSPartialName(o: BTSPartialName): MOption[BTSPartialName] = {
    return PostResultBTSPartialName
  }

  def postBTSIndexingExp(o: BTSIndexingExp): MOption[BTSIndexingExp] = {
    return PostResultBTSIndexingExp
  }

  def postBTSAccessExp(o: BTSAccessExp): MOption[BTSAccessExp] = {
    return PostResultBTSAccessExp
  }

  def postBTSFunctionCall(o: BTSFunctionCall): MOption[BTSFunctionCall] = {
    return PostResultBTSFunctionCall
  }

  def postBTSPortValue(o: BTSPortValue): MOption[BTSPortValue] = {
    return PostResultBTSPortValue
  }

  def postBTSConditionalExpression(o: BTSConditionalExpression): MOption[BTSConditionalExpression] = {
    return PostResultBTSConditionalExpression
  }

  def postBTSRange(o: BTSRange): MOption[BTSRange] = {
    return PostResultBTSRange
  }

  def postBTSBehaviorTime(o: BTSBehaviorTime): MOption[BTSBehaviorTime] = {
    return PostResultBTSBehaviorTime
  }

  def postBTSType(o: BTSType): MOption[BTSType] = {
    o match {
      case o: BTSClassifier =>
        val r: MOption[BTSType] = postBTSClassifier(o) match {
         case MSome(result: BTSType) => MSome[BTSType](result)
         case MSome(_) => halt("Can only produce object of type BTSType")
         case _ => MNone[BTSType]()
        }
        return r
    }
  }

  def postTODO(o: TODO): MOption[TODO] = {
    return PostResultTODO
  }

  def transformSmfAnnex(o: SmfAnnex): MOption[SmfAnnex] = {
    val preR: PreResult[SmfAnnex] = preSmfAnnex(o)
    val r: MOption[SmfAnnex] = if (preR.continu) {
      val o2: SmfAnnex = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val rOpt: MOption[SmfAnnex] = o2 match {
        case o2: SmfClause =>
          val r0: MOption[IS[Z, SmfClassification]] = transformISZ(o2.classification, transformSmfClassification _)
          val r1: MOption[IS[Z, SmfDeclass]] = transformISZ(o2.declass, transformSmfDeclass _)
          if (hasChanged || r0.nonEmpty || r1.nonEmpty)
            MSome(o2(classification = r0.getOrElse(o2.classification), declass = r1.getOrElse(o2.declass)))
          else
            MNone()
        case o2: SmfClassification =>
          val r0: MOption[Name] = transformName(o2.portName)
          val r1: MOption[Name] = transformName(o2.typeName)
          if (hasChanged || r0.nonEmpty || r1.nonEmpty)
            MSome(o2(portName = r0.getOrElse(o2.portName), typeName = r1.getOrElse(o2.typeName)))
          else
            MNone()
        case o2: SmfDeclass =>
          val r0: MOption[Name] = transformName(o2.flowName)
          val r1: MOption[Option[Name]] = transformOption(o2.srcType, transformName _)
          val r2: MOption[Name] = transformName(o2.snkType)
          if (hasChanged || r0.nonEmpty || r1.nonEmpty || r2.nonEmpty)
            MSome(o2(flowName = r0.getOrElse(o2.flowName), srcType = r1.getOrElse(o2.srcType), snkType = r2.getOrElse(o2.snkType)))
          else
            MNone()
        case o2: SmfType =>
          val r0: MOption[Name] = transformName(o2.typeName)
          val r1: MOption[IS[Z, Name]] = transformISZ(o2.parentType, transformName _)
          if (hasChanged || r0.nonEmpty || r1.nonEmpty)
            MSome(o2(typeName = r0.getOrElse(o2.typeName), parentType = r1.getOrElse(o2.parentType)))
          else
            MNone()
      }
      rOpt
    } else if (preR.resultOpt.nonEmpty) {
      MSome(preR.resultOpt.getOrElse(o))
    } else {
      MNone()
    }
    val hasChanged: B = r.nonEmpty
    val o2: SmfAnnex = r.getOrElse(o)
    val postR: MOption[SmfAnnex] = postSmfAnnex(o2)
    if (postR.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return MSome(o2)
    } else {
      return MNone()
    }
  }

  def transformSmfLib(o: SmfLib): MOption[SmfLib] = {
    val preR: PreResult[SmfLib] = preSmfLib(o)
    val r: MOption[SmfLib] = if (preR.continu) {
      val o2: SmfLib = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val rOpt: MOption[SmfLib] = o2 match {
        case o2: SmfLibrary =>
          val r0: MOption[IS[Z, SmfType]] = transformISZ(o2.types, transformSmfType _)
          if (hasChanged || r0.nonEmpty)
            MSome(o2(types = r0.getOrElse(o2.types)))
          else
            MNone()
      }
      rOpt
    } else if (preR.resultOpt.nonEmpty) {
      MSome(preR.resultOpt.getOrElse(o))
    } else {
      MNone()
    }
    val hasChanged: B = r.nonEmpty
    val o2: SmfLib = r.getOrElse(o)
    val postR: MOption[SmfLib] = postSmfLib(o2)
    if (postR.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return MSome(o2)
    } else {
      return MNone()
    }
  }

  def transformSmfClause(o: SmfClause): MOption[SmfClause] = {
    val preR: PreResult[SmfClause] = preSmfClause(o)
    val r: MOption[SmfClause] = if (preR.continu) {
      val o2: SmfClause = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val r0: MOption[IS[Z, SmfClassification]] = transformISZ(o2.classification, transformSmfClassification _)
      val r1: MOption[IS[Z, SmfDeclass]] = transformISZ(o2.declass, transformSmfDeclass _)
      if (hasChanged || r0.nonEmpty || r1.nonEmpty)
        MSome(o2(classification = r0.getOrElse(o2.classification), declass = r1.getOrElse(o2.declass)))
      else
        MNone()
    } else if (preR.resultOpt.nonEmpty) {
      MSome(preR.resultOpt.getOrElse(o))
    } else {
      MNone()
    }
    val hasChanged: B = r.nonEmpty
    val o2: SmfClause = r.getOrElse(o)
    val postR: MOption[SmfClause] = postSmfClause(o2)
    if (postR.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return MSome(o2)
    } else {
      return MNone()
    }
  }

  def transformSmfClassification(o: SmfClassification): MOption[SmfClassification] = {
    val preR: PreResult[SmfClassification] = preSmfClassification(o)
    val r: MOption[SmfClassification] = if (preR.continu) {
      val o2: SmfClassification = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val r0: MOption[Name] = transformName(o2.portName)
      val r1: MOption[Name] = transformName(o2.typeName)
      if (hasChanged || r0.nonEmpty || r1.nonEmpty)
        MSome(o2(portName = r0.getOrElse(o2.portName), typeName = r1.getOrElse(o2.typeName)))
      else
        MNone()
    } else if (preR.resultOpt.nonEmpty) {
      MSome(preR.resultOpt.getOrElse(o))
    } else {
      MNone()
    }
    val hasChanged: B = r.nonEmpty
    val o2: SmfClassification = r.getOrElse(o)
    val postR: MOption[SmfClassification] = postSmfClassification(o2)
    if (postR.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return MSome(o2)
    } else {
      return MNone()
    }
  }

  def transformSmfDeclass(o: SmfDeclass): MOption[SmfDeclass] = {
    val preR: PreResult[SmfDeclass] = preSmfDeclass(o)
    val r: MOption[SmfDeclass] = if (preR.continu) {
      val o2: SmfDeclass = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val r0: MOption[Name] = transformName(o2.flowName)
      val r1: MOption[Option[Name]] = transformOption(o2.srcType, transformName _)
      val r2: MOption[Name] = transformName(o2.snkType)
      if (hasChanged || r0.nonEmpty || r1.nonEmpty || r2.nonEmpty)
        MSome(o2(flowName = r0.getOrElse(o2.flowName), srcType = r1.getOrElse(o2.srcType), snkType = r2.getOrElse(o2.snkType)))
      else
        MNone()
    } else if (preR.resultOpt.nonEmpty) {
      MSome(preR.resultOpt.getOrElse(o))
    } else {
      MNone()
    }
    val hasChanged: B = r.nonEmpty
    val o2: SmfDeclass = r.getOrElse(o)
    val postR: MOption[SmfDeclass] = postSmfDeclass(o2)
    if (postR.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return MSome(o2)
    } else {
      return MNone()
    }
  }

  def transformSmfLibrary(o: SmfLibrary): MOption[SmfLibrary] = {
    val preR: PreResult[SmfLibrary] = preSmfLibrary(o)
    val r: MOption[SmfLibrary] = if (preR.continu) {
      val o2: SmfLibrary = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val r0: MOption[IS[Z, SmfType]] = transformISZ(o2.types, transformSmfType _)
      if (hasChanged || r0.nonEmpty)
        MSome(o2(types = r0.getOrElse(o2.types)))
      else
        MNone()
    } else if (preR.resultOpt.nonEmpty) {
      MSome(preR.resultOpt.getOrElse(o))
    } else {
      MNone()
    }
    val hasChanged: B = r.nonEmpty
    val o2: SmfLibrary = r.getOrElse(o)
    val postR: MOption[SmfLibrary] = postSmfLibrary(o2)
    if (postR.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return MSome(o2)
    } else {
      return MNone()
    }
  }

  def transformSmfType(o: SmfType): MOption[SmfType] = {
    val preR: PreResult[SmfType] = preSmfType(o)
    val r: MOption[SmfType] = if (preR.continu) {
      val o2: SmfType = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val r0: MOption[Name] = transformName(o2.typeName)
      val r1: MOption[IS[Z, Name]] = transformISZ(o2.parentType, transformName _)
      if (hasChanged || r0.nonEmpty || r1.nonEmpty)
        MSome(o2(typeName = r0.getOrElse(o2.typeName), parentType = r1.getOrElse(o2.parentType)))
      else
        MNone()
    } else if (preR.resultOpt.nonEmpty) {
      MSome(preR.resultOpt.getOrElse(o))
    } else {
      MNone()
    }
    val hasChanged: B = r.nonEmpty
    val o2: SmfType = r.getOrElse(o)
    val postR: MOption[SmfType] = postSmfType(o2)
    if (postR.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return MSome(o2)
    } else {
      return MNone()
    }
  }

  def transformAadlInstInfo(o: AadlInstInfo): MOption[AadlInstInfo] = {
    val preR: PreResult[AadlInstInfo] = preAadlInstInfo(o)
    val r: MOption[AadlInstInfo] = if (preR.continu) {
      val o2: AadlInstInfo = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val rOpt: MOption[AadlInstInfo] = o2 match {
        case o2: Component =>
          val r0: MOption[Name] = transformName(o2.identifier)
          val r1: MOption[Option[Classifier]] = transformOption(o2.classifier, transformClassifier _)
          val r2: MOption[IS[Z, Feature]] = transformISZ(o2.features, transformFeature _)
          val r3: MOption[IS[Z, Component]] = transformISZ(o2.subComponents, transformComponent _)
          val r4: MOption[IS[Z, Connection]] = transformISZ(o2.connections, transformConnection _)
          val r5: MOption[IS[Z, ConnectionInstance]] = transformISZ(o2.connectionInstances, transformConnectionInstance _)
          val r6: MOption[IS[Z, Property]] = transformISZ(o2.properties, transformProperty _)
          val r7: MOption[IS[Z, Flow]] = transformISZ(o2.flows, transformFlow _)
          val r8: MOption[IS[Z, Mode]] = transformISZ(o2.modes, transformMode _)
          val r9: MOption[IS[Z, Annex]] = transformISZ(o2.annexes, transformAnnex _)
          if (hasChanged || r0.nonEmpty || r1.nonEmpty || r2.nonEmpty || r3.nonEmpty || r4.nonEmpty || r5.nonEmpty || r6.nonEmpty || r7.nonEmpty || r8.nonEmpty || r9.nonEmpty)
            MSome(o2(identifier = r0.getOrElse(o2.identifier), classifier = r1.getOrElse(o2.classifier), features = r2.getOrElse(o2.features), subComponents = r3.getOrElse(o2.subComponents), connections = r4.getOrElse(o2.connections), connectionInstances = r5.getOrElse(o2.connectionInstances), properties = r6.getOrElse(o2.properties), flows = r7.getOrElse(o2.flows), modes = r8.getOrElse(o2.modes), annexes = r9.getOrElse(o2.annexes)))
          else
            MNone()
        case o2: ErrorTypeDef =>
          val r0: MOption[Name] = transformName(o2.id)
          val r1: MOption[Option[Name]] = transformOption(o2.extendType, transformName _)
          if (hasChanged || r0.nonEmpty || r1.nonEmpty)
            MSome(o2(id = r0.getOrElse(o2.id), extendType = r1.getOrElse(o2.extendType)))
          else
            MNone()
        case o2: FeatureEnd =>
          val r0: MOption[Name] = transformName(o2.identifier)
          val r1: MOption[Option[Classifier]] = transformOption(o2.classifier, transformClassifier _)
          val r2: MOption[IS[Z, Property]] = transformISZ(o2.properties, transformProperty _)
          if (hasChanged || r0.nonEmpty || r1.nonEmpty || r2.nonEmpty)
            MSome(o2(identifier = r0.getOrElse(o2.identifier), classifier = r1.getOrElse(o2.classifier), properties = r2.getOrElse(o2.properties)))
          else
            MNone()
        case o2: FeatureGroup =>
          val r0: MOption[Name] = transformName(o2.identifier)
          val r1: MOption[IS[Z, Feature]] = transformISZ(o2.features, transformFeature _)
          val r2: MOption[IS[Z, Property]] = transformISZ(o2.properties, transformProperty _)
          if (hasChanged || r0.nonEmpty || r1.nonEmpty || r2.nonEmpty)
            MSome(o2(identifier = r0.getOrElse(o2.identifier), features = r1.getOrElse(o2.features), properties = r2.getOrElse(o2.properties)))
          else
            MNone()
        case o2: FeatureAccess =>
          val r0: MOption[Name] = transformName(o2.identifier)
          val r1: MOption[Option[Classifier]] = transformOption(o2.classifier, transformClassifier _)
          val r2: MOption[IS[Z, Property]] = transformISZ(o2.properties, transformProperty _)
          if (hasChanged || r0.nonEmpty || r1.nonEmpty || r2.nonEmpty)
            MSome(o2(identifier = r0.getOrElse(o2.identifier), classifier = r1.getOrElse(o2.classifier), properties = r2.getOrElse(o2.properties)))
          else
            MNone()
        case o2: Connection =>
          val r0: MOption[Name] = transformName(o2.name)
          val r1: MOption[IS[Z, EndPoint]] = transformISZ(o2.src, transformEndPoint _)
          val r2: MOption[IS[Z, EndPoint]] = transformISZ(o2.dst, transformEndPoint _)
          val r3: MOption[IS[Z, Name]] = transformISZ(o2.connectionInstances, transformName _)
          val r4: MOption[IS[Z, Property]] = transformISZ(o2.properties, transformProperty _)
          if (hasChanged || r0.nonEmpty || r1.nonEmpty || r2.nonEmpty || r3.nonEmpty || r4.nonEmpty)
            MSome(o2(name = r0.getOrElse(o2.name), src = r1.getOrElse(o2.src), dst = r2.getOrElse(o2.dst), connectionInstances = r3.getOrElse(o2.connectionInstances), properties = r4.getOrElse(o2.properties)))
          else
            MNone()
        case o2: Emv2Flow =>
          val r0: MOption[Name] = transformName(o2.identifier)
          val r1: MOption[Option[Emv2Propagation]] = transformOption(o2.sourcePropagation, transformEmv2Propagation _)
          val r2: MOption[Option[Emv2Propagation]] = transformOption(o2.sinkPropagation, transformEmv2Propagation _)
          if (hasChanged || r0.nonEmpty || r1.nonEmpty || r2.nonEmpty)
            MSome(o2(identifier = r0.getOrElse(o2.identifier), sourcePropagation = r1.getOrElse(o2.sourcePropagation), sinkPropagation = r2.getOrElse(o2.sinkPropagation)))
          else
            MNone()
        case o2: Flow =>
          val r0: MOption[Name] = transformName(o2.name)
          val r1: MOption[Option[Name]] = transformOption(o2.source, transformName _)
          val r2: MOption[Option[Name]] = transformOption(o2.sink, transformName _)
          if (hasChanged || r0.nonEmpty || r1.nonEmpty || r2.nonEmpty)
            MSome(o2(name = r0.getOrElse(o2.name), source = r1.getOrElse(o2.source), sink = r2.getOrElse(o2.sink)))
          else
            MNone()
      }
      rOpt
    } else if (preR.resultOpt.nonEmpty) {
      MSome(preR.resultOpt.getOrElse(o))
    } else {
      MNone()
    }
    val hasChanged: B = r.nonEmpty
    val o2: AadlInstInfo = r.getOrElse(o)
    val postR: MOption[AadlInstInfo] = postAadlInstInfo(o2)
    if (postR.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return MSome(o2)
    } else {
      return MNone()
    }
  }

  def transformEmv2Annex(o: Emv2Annex): MOption[Emv2Annex] = {
    val preR: PreResult[Emv2Annex] = preEmv2Annex(o)
    val r: MOption[Emv2Annex] = if (preR.continu) {
      val o2: Emv2Annex = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val rOpt: MOption[Emv2Annex] = o2 match {
        case o2: ErrorTypeDef =>
          val r0: MOption[Name] = transformName(o2.id)
          val r1: MOption[Option[Name]] = transformOption(o2.extendType, transformName _)
          if (hasChanged || r0.nonEmpty || r1.nonEmpty)
            MSome(o2(id = r0.getOrElse(o2.id), extendType = r1.getOrElse(o2.extendType)))
          else
            MNone()
        case o2: ErrorAliasDef =>
          val r0: MOption[Name] = transformName(o2.errorType)
          val r1: MOption[Name] = transformName(o2.aliseType)
          if (hasChanged || r0.nonEmpty || r1.nonEmpty)
            MSome(o2(errorType = r0.getOrElse(o2.errorType), aliseType = r1.getOrElse(o2.aliseType)))
          else
            MNone()
        case o2: ErrorTypeSetDef =>
          val r0: MOption[Name] = transformName(o2.id)
          val r1: MOption[IS[Z, Name]] = transformISZ(o2.errorTypes, transformName _)
          if (hasChanged || r0.nonEmpty || r1.nonEmpty)
            MSome(o2(id = r0.getOrElse(o2.id), errorTypes = r1.getOrElse(o2.errorTypes)))
          else
            MNone()
        case o2: BehaveStateMachine =>
          val r0: MOption[Name] = transformName(o2.id)
          val r1: MOption[IS[Z, ErrorEvent]] = transformISZ(o2.events, transformErrorEvent _)
          val r2: MOption[IS[Z, ErrorState]] = transformISZ(o2.states, transformErrorState _)
          val r3: MOption[IS[Z, ErrorTransition]] = transformISZ(o2.transitions, transformErrorTransition _)
          val r4: MOption[IS[Z, Property]] = transformISZ(o2.properties, transformProperty _)
          if (hasChanged || r0.nonEmpty || r1.nonEmpty || r2.nonEmpty || r3.nonEmpty || r4.nonEmpty)
            MSome(o2(id = r0.getOrElse(o2.id), events = r1.getOrElse(o2.events), states = r2.getOrElse(o2.states), transitions = r3.getOrElse(o2.transitions), properties = r4.getOrElse(o2.properties)))
          else
            MNone()
        case o2: ErrorEvent =>
          val r0: MOption[Name] = transformName(o2.id)
          if (hasChanged || r0.nonEmpty)
            MSome(o2(id = r0.getOrElse(o2.id)))
          else
            MNone()
        case o2: ErrorState =>
          val r0: MOption[Name] = transformName(o2.id)
          if (hasChanged || r0.nonEmpty)
            MSome(o2(id = r0.getOrElse(o2.id)))
          else
            MNone()
        case o2: ErrorTransition =>
          val r0: MOption[Option[Name]] = transformOption(o2.id, transformName _)
          val r1: MOption[Name] = transformName(o2.sourceState)
          val r2: MOption[ErrorCondition] = transformErrorCondition(o2.condition)
          val r3: MOption[Name] = transformName(o2.targetState)
          if (hasChanged || r0.nonEmpty || r1.nonEmpty || r2.nonEmpty || r3.nonEmpty)
            MSome(o2(id = r0.getOrElse(o2.id), sourceState = r1.getOrElse(o2.sourceState), condition = r2.getOrElse(o2.condition), targetState = r3.getOrElse(o2.targetState)))
          else
            MNone()
        case o2: ConditionTrigger =>
          val r0: MOption[IS[Z, Name]] = transformISZ(o2.events, transformName _)
          val r1: MOption[IS[Z, Emv2Propagation]] = transformISZ(o2.propagationPoints, transformEmv2Propagation _)
          if (hasChanged || r0.nonEmpty || r1.nonEmpty)
            MSome(o2(events = r0.getOrElse(o2.events), propagationPoints = r1.getOrElse(o2.propagationPoints)))
          else
            MNone()
        case o2: AndCondition =>
          val r0: MOption[IS[Z, ErrorCondition]] = transformISZ(o2.op, transformErrorCondition _)
          if (hasChanged || r0.nonEmpty)
            MSome(o2(op = r0.getOrElse(o2.op)))
          else
            MNone()
        case o2: OrCondition =>
          val r0: MOption[IS[Z, ErrorCondition]] = transformISZ(o2.op, transformErrorCondition _)
          if (hasChanged || r0.nonEmpty)
            MSome(o2(op = r0.getOrElse(o2.op)))
          else
            MNone()
        case o2: AllCondition =>
          val r0: MOption[IS[Z, ErrorCondition]] = transformISZ(o2.op, transformErrorCondition _)
          if (hasChanged || r0.nonEmpty)
            MSome(o2(op = r0.getOrElse(o2.op)))
          else
            MNone()
        case o2: OrMoreCondition =>
          val r0: MOption[IS[Z, ErrorCondition]] = transformISZ(o2.conditions, transformErrorCondition _)
          if (hasChanged || r0.nonEmpty)
            MSome(o2(conditions = r0.getOrElse(o2.conditions)))
          else
            MNone()
        case o2: OrLessCondition =>
          val r0: MOption[IS[Z, ErrorCondition]] = transformISZ(o2.conditions, transformErrorCondition _)
          if (hasChanged || r0.nonEmpty)
            MSome(o2(conditions = r0.getOrElse(o2.conditions)))
          else
            MNone()
        case o2: Emv2Clause =>
          val r0: MOption[IS[Z, Name]] = transformISZ(o2.libraries, transformName _)
          val r1: MOption[IS[Z, Emv2Propagation]] = transformISZ(o2.propagations, transformEmv2Propagation _)
          val r2: MOption[IS[Z, Emv2Flow]] = transformISZ(o2.flows, transformEmv2Flow _)
          val r3: MOption[Option[Emv2BehaviorSection]] = transformOption(o2.componentBehavior, transformEmv2BehaviorSection _)
          val r4: MOption[IS[Z, Property]] = transformISZ(o2.properties, transformProperty _)
          if (hasChanged || r0.nonEmpty || r1.nonEmpty || r2.nonEmpty || r3.nonEmpty || r4.nonEmpty)
            MSome(o2(libraries = r0.getOrElse(o2.libraries), propagations = r1.getOrElse(o2.propagations), flows = r2.getOrElse(o2.flows), componentBehavior = r3.getOrElse(o2.componentBehavior), properties = r4.getOrElse(o2.properties)))
          else
            MNone()
        case o2: Emv2Propagation =>
          val r0: MOption[Name] = transformName(o2.propagationPoint)
          val r1: MOption[IS[Z, Name]] = transformISZ(o2.errorTokens, transformName _)
          if (hasChanged || r0.nonEmpty || r1.nonEmpty)
            MSome(o2(propagationPoint = r0.getOrElse(o2.propagationPoint), errorTokens = r1.getOrElse(o2.errorTokens)))
          else
            MNone()
        case o2: Emv2Flow =>
          val r0: MOption[Name] = transformName(o2.identifier)
          val r1: MOption[Option[Emv2Propagation]] = transformOption(o2.sourcePropagation, transformEmv2Propagation _)
          val r2: MOption[Option[Emv2Propagation]] = transformOption(o2.sinkPropagation, transformEmv2Propagation _)
          if (hasChanged || r0.nonEmpty || r1.nonEmpty || r2.nonEmpty)
            MSome(o2(identifier = r0.getOrElse(o2.identifier), sourcePropagation = r1.getOrElse(o2.sourcePropagation), sinkPropagation = r2.getOrElse(o2.sinkPropagation)))
          else
            MNone()
        case o2: Emv2BehaviorSection =>
          val r0: MOption[IS[Z, ErrorEvent]] = transformISZ(o2.events, transformErrorEvent _)
          val r1: MOption[IS[Z, ErrorTransition]] = transformISZ(o2.transitions, transformErrorTransition _)
          val r2: MOption[IS[Z, ErrorPropagation]] = transformISZ(o2.propagations, transformErrorPropagation _)
          if (hasChanged || r0.nonEmpty || r1.nonEmpty || r2.nonEmpty)
            MSome(o2(events = r0.getOrElse(o2.events), transitions = r1.getOrElse(o2.transitions), propagations = r2.getOrElse(o2.propagations)))
          else
            MNone()
        case o2: ErrorPropagation =>
          val r0: MOption[Option[Name]] = transformOption(o2.id, transformName _)
          val r1: MOption[IS[Z, Name]] = transformISZ(o2.source, transformName _)
          val r2: MOption[Option[ErrorCondition]] = transformOption(o2.condition, transformErrorCondition _)
          val r3: MOption[IS[Z, Emv2Propagation]] = transformISZ(o2.target, transformEmv2Propagation _)
          if (hasChanged || r0.nonEmpty || r1.nonEmpty || r2.nonEmpty || r3.nonEmpty)
            MSome(o2(id = r0.getOrElse(o2.id), source = r1.getOrElse(o2.source), condition = r2.getOrElse(o2.condition), target = r3.getOrElse(o2.target)))
          else
            MNone()
      }
      rOpt
    } else if (preR.resultOpt.nonEmpty) {
      MSome(preR.resultOpt.getOrElse(o))
    } else {
      MNone()
    }
    val hasChanged: B = r.nonEmpty
    val o2: Emv2Annex = r.getOrElse(o)
    val postR: MOption[Emv2Annex] = postEmv2Annex(o2)
    if (postR.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return MSome(o2)
    } else {
      return MNone()
    }
  }

  def transformEmv2Lib(o: Emv2Lib): MOption[Emv2Lib] = {
    val preR: PreResult[Emv2Lib] = preEmv2Lib(o)
    val r: MOption[Emv2Lib] = if (preR.continu) {
      val o2: Emv2Lib = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val rOpt: MOption[Emv2Lib] = o2 match {
        case o2: Emv2Library =>
          val r0: MOption[Name] = transformName(o2.name)
          val r1: MOption[IS[Z, ErrorTypeDef]] = transformISZ(o2.errorTypeDef, transformErrorTypeDef _)
          val r2: MOption[IS[Z, ErrorTypeSetDef]] = transformISZ(o2.errorTypeSetDef, transformErrorTypeSetDef _)
          val r3: MOption[IS[Z, ErrorAliasDef]] = transformISZ(o2.alias, transformErrorAliasDef _)
          val r4: MOption[IS[Z, BehaveStateMachine]] = transformISZ(o2.behaveStateMachine, transformBehaveStateMachine _)
          if (hasChanged || r0.nonEmpty || r1.nonEmpty || r2.nonEmpty || r3.nonEmpty || r4.nonEmpty)
            MSome(o2(name = r0.getOrElse(o2.name), errorTypeDef = r1.getOrElse(o2.errorTypeDef), errorTypeSetDef = r2.getOrElse(o2.errorTypeSetDef), alias = r3.getOrElse(o2.alias), behaveStateMachine = r4.getOrElse(o2.behaveStateMachine)))
          else
            MNone()
      }
      rOpt
    } else if (preR.resultOpt.nonEmpty) {
      MSome(preR.resultOpt.getOrElse(o))
    } else {
      MNone()
    }
    val hasChanged: B = r.nonEmpty
    val o2: Emv2Lib = r.getOrElse(o)
    val postR: MOption[Emv2Lib] = postEmv2Lib(o2)
    if (postR.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return MSome(o2)
    } else {
      return MNone()
    }
  }

  def transformAadl(o: Aadl): MOption[Aadl] = {
    val preR: PreResult[Aadl] = preAadl(o)
    val r: MOption[Aadl] = if (preR.continu) {
      val o2: Aadl = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val r0: MOption[IS[Z, Component]] = transformISZ(o2.components, transformComponent _)
      val r1: MOption[IS[Z, AnnexLib]] = transformISZ(o2.annexLib, transformAnnexLib _)
      val r2: MOption[IS[Z, Component]] = transformISZ(o2.dataComponents, transformComponent _)
      if (hasChanged || r0.nonEmpty || r1.nonEmpty || r2.nonEmpty)
        MSome(o2(components = r0.getOrElse(o2.components), annexLib = r1.getOrElse(o2.annexLib), dataComponents = r2.getOrElse(o2.dataComponents)))
      else
        MNone()
    } else if (preR.resultOpt.nonEmpty) {
      MSome(preR.resultOpt.getOrElse(o))
    } else {
      MNone()
    }
    val hasChanged: B = r.nonEmpty
    val o2: Aadl = r.getOrElse(o)
    val postR: MOption[Aadl] = postAadl(o2)
    if (postR.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return MSome(o2)
    } else {
      return MNone()
    }
  }

  def transformEmv2ElementRef(o: Emv2ElementRef): MOption[Emv2ElementRef] = {
    val preR: PreResult[Emv2ElementRef] = preEmv2ElementRef(o)
    val r: MOption[Emv2ElementRef] = if (preR.continu) {
      val o2: Emv2ElementRef = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val r0: MOption[Name] = transformName(o2.name)
      val r1: MOption[IS[Z, Name]] = transformISZ(o2.errorTypes, transformName _)
      if (hasChanged || r0.nonEmpty || r1.nonEmpty)
        MSome(o2(name = r0.getOrElse(o2.name), errorTypes = r1.getOrElse(o2.errorTypes)))
      else
        MNone()
    } else if (preR.resultOpt.nonEmpty) {
      MSome(preR.resultOpt.getOrElse(o))
    } else {
      MNone()
    }
    val hasChanged: B = r.nonEmpty
    val o2: Emv2ElementRef = r.getOrElse(o)
    val postR: MOption[Emv2ElementRef] = postEmv2ElementRef(o2)
    if (postR.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return MSome(o2)
    } else {
      return MNone()
    }
  }

  def transformName(o: Name): MOption[Name] = {
    val preR: PreResult[Name] = preName(o)
    val r: MOption[Name] = if (preR.continu) {
      val o2: Name = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      if (hasChanged)
        MSome(o2)
      else
        MNone()
    } else if (preR.resultOpt.nonEmpty) {
      MSome(preR.resultOpt.getOrElse(o))
    } else {
      MNone()
    }
    val hasChanged: B = r.nonEmpty
    val o2: Name = r.getOrElse(o)
    val postR: MOption[Name] = postName(o2)
    if (postR.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return MSome(o2)
    } else {
      return MNone()
    }
  }

  def transformComponent(o: Component): MOption[Component] = {
    val preR: PreResult[Component] = preComponent(o)
    val r: MOption[Component] = if (preR.continu) {
      val o2: Component = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val r0: MOption[Name] = transformName(o2.identifier)
      val r1: MOption[Option[Classifier]] = transformOption(o2.classifier, transformClassifier _)
      val r2: MOption[IS[Z, Feature]] = transformISZ(o2.features, transformFeature _)
      val r3: MOption[IS[Z, Component]] = transformISZ(o2.subComponents, transformComponent _)
      val r4: MOption[IS[Z, Connection]] = transformISZ(o2.connections, transformConnection _)
      val r5: MOption[IS[Z, ConnectionInstance]] = transformISZ(o2.connectionInstances, transformConnectionInstance _)
      val r6: MOption[IS[Z, Property]] = transformISZ(o2.properties, transformProperty _)
      val r7: MOption[IS[Z, Flow]] = transformISZ(o2.flows, transformFlow _)
      val r8: MOption[IS[Z, Mode]] = transformISZ(o2.modes, transformMode _)
      val r9: MOption[IS[Z, Annex]] = transformISZ(o2.annexes, transformAnnex _)
      if (hasChanged || r0.nonEmpty || r1.nonEmpty || r2.nonEmpty || r3.nonEmpty || r4.nonEmpty || r5.nonEmpty || r6.nonEmpty || r7.nonEmpty || r8.nonEmpty || r9.nonEmpty)
        MSome(o2(identifier = r0.getOrElse(o2.identifier), classifier = r1.getOrElse(o2.classifier), features = r2.getOrElse(o2.features), subComponents = r3.getOrElse(o2.subComponents), connections = r4.getOrElse(o2.connections), connectionInstances = r5.getOrElse(o2.connectionInstances), properties = r6.getOrElse(o2.properties), flows = r7.getOrElse(o2.flows), modes = r8.getOrElse(o2.modes), annexes = r9.getOrElse(o2.annexes)))
      else
        MNone()
    } else if (preR.resultOpt.nonEmpty) {
      MSome(preR.resultOpt.getOrElse(o))
    } else {
      MNone()
    }
    val hasChanged: B = r.nonEmpty
    val o2: Component = r.getOrElse(o)
    val postR: MOption[Component] = postComponent(o2)
    if (postR.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return MSome(o2)
    } else {
      return MNone()
    }
  }

  def transformEmv2Library(o: Emv2Library): MOption[Emv2Library] = {
    val preR: PreResult[Emv2Library] = preEmv2Library(o)
    val r: MOption[Emv2Library] = if (preR.continu) {
      val o2: Emv2Library = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val r0: MOption[Name] = transformName(o2.name)
      val r1: MOption[IS[Z, ErrorTypeDef]] = transformISZ(o2.errorTypeDef, transformErrorTypeDef _)
      val r2: MOption[IS[Z, ErrorTypeSetDef]] = transformISZ(o2.errorTypeSetDef, transformErrorTypeSetDef _)
      val r3: MOption[IS[Z, ErrorAliasDef]] = transformISZ(o2.alias, transformErrorAliasDef _)
      val r4: MOption[IS[Z, BehaveStateMachine]] = transformISZ(o2.behaveStateMachine, transformBehaveStateMachine _)
      if (hasChanged || r0.nonEmpty || r1.nonEmpty || r2.nonEmpty || r3.nonEmpty || r4.nonEmpty)
        MSome(o2(name = r0.getOrElse(o2.name), errorTypeDef = r1.getOrElse(o2.errorTypeDef), errorTypeSetDef = r2.getOrElse(o2.errorTypeSetDef), alias = r3.getOrElse(o2.alias), behaveStateMachine = r4.getOrElse(o2.behaveStateMachine)))
      else
        MNone()
    } else if (preR.resultOpt.nonEmpty) {
      MSome(preR.resultOpt.getOrElse(o))
    } else {
      MNone()
    }
    val hasChanged: B = r.nonEmpty
    val o2: Emv2Library = r.getOrElse(o)
    val postR: MOption[Emv2Library] = postEmv2Library(o2)
    if (postR.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return MSome(o2)
    } else {
      return MNone()
    }
  }

  def transformErrorTypeDef(o: ErrorTypeDef): MOption[ErrorTypeDef] = {
    val preR: PreResult[ErrorTypeDef] = preErrorTypeDef(o)
    val r: MOption[ErrorTypeDef] = if (preR.continu) {
      val o2: ErrorTypeDef = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val r0: MOption[Name] = transformName(o2.id)
      val r1: MOption[Option[Name]] = transformOption(o2.extendType, transformName _)
      if (hasChanged || r0.nonEmpty || r1.nonEmpty)
        MSome(o2(id = r0.getOrElse(o2.id), extendType = r1.getOrElse(o2.extendType)))
      else
        MNone()
    } else if (preR.resultOpt.nonEmpty) {
      MSome(preR.resultOpt.getOrElse(o))
    } else {
      MNone()
    }
    val hasChanged: B = r.nonEmpty
    val o2: ErrorTypeDef = r.getOrElse(o)
    val postR: MOption[ErrorTypeDef] = postErrorTypeDef(o2)
    if (postR.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return MSome(o2)
    } else {
      return MNone()
    }
  }

  def transformClassifier(o: Classifier): MOption[Classifier] = {
    val preR: PreResult[Classifier] = preClassifier(o)
    val r: MOption[Classifier] = if (preR.continu) {
      val o2: Classifier = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      if (hasChanged)
        MSome(o2)
      else
        MNone()
    } else if (preR.resultOpt.nonEmpty) {
      MSome(preR.resultOpt.getOrElse(o))
    } else {
      MNone()
    }
    val hasChanged: B = r.nonEmpty
    val o2: Classifier = r.getOrElse(o)
    val postR: MOption[Classifier] = postClassifier(o2)
    if (postR.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return MSome(o2)
    } else {
      return MNone()
    }
  }

  def transformErrorAliasDef(o: ErrorAliasDef): MOption[ErrorAliasDef] = {
    val preR: PreResult[ErrorAliasDef] = preErrorAliasDef(o)
    val r: MOption[ErrorAliasDef] = if (preR.continu) {
      val o2: ErrorAliasDef = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val r0: MOption[Name] = transformName(o2.errorType)
      val r1: MOption[Name] = transformName(o2.aliseType)
      if (hasChanged || r0.nonEmpty || r1.nonEmpty)
        MSome(o2(errorType = r0.getOrElse(o2.errorType), aliseType = r1.getOrElse(o2.aliseType)))
      else
        MNone()
    } else if (preR.resultOpt.nonEmpty) {
      MSome(preR.resultOpt.getOrElse(o))
    } else {
      MNone()
    }
    val hasChanged: B = r.nonEmpty
    val o2: ErrorAliasDef = r.getOrElse(o)
    val postR: MOption[ErrorAliasDef] = postErrorAliasDef(o2)
    if (postR.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return MSome(o2)
    } else {
      return MNone()
    }
  }

  def transformErrorTypeSetDef(o: ErrorTypeSetDef): MOption[ErrorTypeSetDef] = {
    val preR: PreResult[ErrorTypeSetDef] = preErrorTypeSetDef(o)
    val r: MOption[ErrorTypeSetDef] = if (preR.continu) {
      val o2: ErrorTypeSetDef = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val r0: MOption[Name] = transformName(o2.id)
      val r1: MOption[IS[Z, Name]] = transformISZ(o2.errorTypes, transformName _)
      if (hasChanged || r0.nonEmpty || r1.nonEmpty)
        MSome(o2(id = r0.getOrElse(o2.id), errorTypes = r1.getOrElse(o2.errorTypes)))
      else
        MNone()
    } else if (preR.resultOpt.nonEmpty) {
      MSome(preR.resultOpt.getOrElse(o))
    } else {
      MNone()
    }
    val hasChanged: B = r.nonEmpty
    val o2: ErrorTypeSetDef = r.getOrElse(o)
    val postR: MOption[ErrorTypeSetDef] = postErrorTypeSetDef(o2)
    if (postR.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return MSome(o2)
    } else {
      return MNone()
    }
  }

  def transformFeature(o: Feature): MOption[Feature] = {
    val preR: PreResult[Feature] = preFeature(o)
    val r: MOption[Feature] = if (preR.continu) {
      val o2: Feature = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val rOpt: MOption[Feature] = o2 match {
        case o2: FeatureEnd =>
          val r0: MOption[Name] = transformName(o2.identifier)
          val r1: MOption[Option[Classifier]] = transformOption(o2.classifier, transformClassifier _)
          val r2: MOption[IS[Z, Property]] = transformISZ(o2.properties, transformProperty _)
          if (hasChanged || r0.nonEmpty || r1.nonEmpty || r2.nonEmpty)
            MSome(o2(identifier = r0.getOrElse(o2.identifier), classifier = r1.getOrElse(o2.classifier), properties = r2.getOrElse(o2.properties)))
          else
            MNone()
        case o2: FeatureGroup =>
          val r0: MOption[Name] = transformName(o2.identifier)
          val r1: MOption[IS[Z, Feature]] = transformISZ(o2.features, transformFeature _)
          val r2: MOption[IS[Z, Property]] = transformISZ(o2.properties, transformProperty _)
          if (hasChanged || r0.nonEmpty || r1.nonEmpty || r2.nonEmpty)
            MSome(o2(identifier = r0.getOrElse(o2.identifier), features = r1.getOrElse(o2.features), properties = r2.getOrElse(o2.properties)))
          else
            MNone()
        case o2: FeatureAccess =>
          val r0: MOption[Name] = transformName(o2.identifier)
          val r1: MOption[Option[Classifier]] = transformOption(o2.classifier, transformClassifier _)
          val r2: MOption[IS[Z, Property]] = transformISZ(o2.properties, transformProperty _)
          if (hasChanged || r0.nonEmpty || r1.nonEmpty || r2.nonEmpty)
            MSome(o2(identifier = r0.getOrElse(o2.identifier), classifier = r1.getOrElse(o2.classifier), properties = r2.getOrElse(o2.properties)))
          else
            MNone()
      }
      rOpt
    } else if (preR.resultOpt.nonEmpty) {
      MSome(preR.resultOpt.getOrElse(o))
    } else {
      MNone()
    }
    val hasChanged: B = r.nonEmpty
    val o2: Feature = r.getOrElse(o)
    val postR: MOption[Feature] = postFeature(o2)
    if (postR.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return MSome(o2)
    } else {
      return MNone()
    }
  }

  def transformBehaveStateMachine(o: BehaveStateMachine): MOption[BehaveStateMachine] = {
    val preR: PreResult[BehaveStateMachine] = preBehaveStateMachine(o)
    val r: MOption[BehaveStateMachine] = if (preR.continu) {
      val o2: BehaveStateMachine = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val r0: MOption[Name] = transformName(o2.id)
      val r1: MOption[IS[Z, ErrorEvent]] = transformISZ(o2.events, transformErrorEvent _)
      val r2: MOption[IS[Z, ErrorState]] = transformISZ(o2.states, transformErrorState _)
      val r3: MOption[IS[Z, ErrorTransition]] = transformISZ(o2.transitions, transformErrorTransition _)
      val r4: MOption[IS[Z, Property]] = transformISZ(o2.properties, transformProperty _)
      if (hasChanged || r0.nonEmpty || r1.nonEmpty || r2.nonEmpty || r3.nonEmpty || r4.nonEmpty)
        MSome(o2(id = r0.getOrElse(o2.id), events = r1.getOrElse(o2.events), states = r2.getOrElse(o2.states), transitions = r3.getOrElse(o2.transitions), properties = r4.getOrElse(o2.properties)))
      else
        MNone()
    } else if (preR.resultOpt.nonEmpty) {
      MSome(preR.resultOpt.getOrElse(o))
    } else {
      MNone()
    }
    val hasChanged: B = r.nonEmpty
    val o2: BehaveStateMachine = r.getOrElse(o)
    val postR: MOption[BehaveStateMachine] = postBehaveStateMachine(o2)
    if (postR.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return MSome(o2)
    } else {
      return MNone()
    }
  }

  def transformFeatureEnd(o: FeatureEnd): MOption[FeatureEnd] = {
    val preR: PreResult[FeatureEnd] = preFeatureEnd(o)
    val r: MOption[FeatureEnd] = if (preR.continu) {
      val o2: FeatureEnd = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val r0: MOption[Name] = transformName(o2.identifier)
      val r1: MOption[Option[Classifier]] = transformOption(o2.classifier, transformClassifier _)
      val r2: MOption[IS[Z, Property]] = transformISZ(o2.properties, transformProperty _)
      if (hasChanged || r0.nonEmpty || r1.nonEmpty || r2.nonEmpty)
        MSome(o2(identifier = r0.getOrElse(o2.identifier), classifier = r1.getOrElse(o2.classifier), properties = r2.getOrElse(o2.properties)))
      else
        MNone()
    } else if (preR.resultOpt.nonEmpty) {
      MSome(preR.resultOpt.getOrElse(o))
    } else {
      MNone()
    }
    val hasChanged: B = r.nonEmpty
    val o2: FeatureEnd = r.getOrElse(o)
    val postR: MOption[FeatureEnd] = postFeatureEnd(o2)
    if (postR.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return MSome(o2)
    } else {
      return MNone()
    }
  }

  def transformErrorEvent(o: ErrorEvent): MOption[ErrorEvent] = {
    val preR: PreResult[ErrorEvent] = preErrorEvent(o)
    val r: MOption[ErrorEvent] = if (preR.continu) {
      val o2: ErrorEvent = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val r0: MOption[Name] = transformName(o2.id)
      if (hasChanged || r0.nonEmpty)
        MSome(o2(id = r0.getOrElse(o2.id)))
      else
        MNone()
    } else if (preR.resultOpt.nonEmpty) {
      MSome(preR.resultOpt.getOrElse(o))
    } else {
      MNone()
    }
    val hasChanged: B = r.nonEmpty
    val o2: ErrorEvent = r.getOrElse(o)
    val postR: MOption[ErrorEvent] = postErrorEvent(o2)
    if (postR.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return MSome(o2)
    } else {
      return MNone()
    }
  }

  def transformErrorState(o: ErrorState): MOption[ErrorState] = {
    val preR: PreResult[ErrorState] = preErrorState(o)
    val r: MOption[ErrorState] = if (preR.continu) {
      val o2: ErrorState = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val r0: MOption[Name] = transformName(o2.id)
      if (hasChanged || r0.nonEmpty)
        MSome(o2(id = r0.getOrElse(o2.id)))
      else
        MNone()
    } else if (preR.resultOpt.nonEmpty) {
      MSome(preR.resultOpt.getOrElse(o))
    } else {
      MNone()
    }
    val hasChanged: B = r.nonEmpty
    val o2: ErrorState = r.getOrElse(o)
    val postR: MOption[ErrorState] = postErrorState(o2)
    if (postR.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return MSome(o2)
    } else {
      return MNone()
    }
  }

  def transformErrorTransition(o: ErrorTransition): MOption[ErrorTransition] = {
    val preR: PreResult[ErrorTransition] = preErrorTransition(o)
    val r: MOption[ErrorTransition] = if (preR.continu) {
      val o2: ErrorTransition = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val r0: MOption[Option[Name]] = transformOption(o2.id, transformName _)
      val r1: MOption[Name] = transformName(o2.sourceState)
      val r2: MOption[ErrorCondition] = transformErrorCondition(o2.condition)
      val r3: MOption[Name] = transformName(o2.targetState)
      if (hasChanged || r0.nonEmpty || r1.nonEmpty || r2.nonEmpty || r3.nonEmpty)
        MSome(o2(id = r0.getOrElse(o2.id), sourceState = r1.getOrElse(o2.sourceState), condition = r2.getOrElse(o2.condition), targetState = r3.getOrElse(o2.targetState)))
      else
        MNone()
    } else if (preR.resultOpt.nonEmpty) {
      MSome(preR.resultOpt.getOrElse(o))
    } else {
      MNone()
    }
    val hasChanged: B = r.nonEmpty
    val o2: ErrorTransition = r.getOrElse(o)
    val postR: MOption[ErrorTransition] = postErrorTransition(o2)
    if (postR.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return MSome(o2)
    } else {
      return MNone()
    }
  }

  def transformFeatureGroup(o: FeatureGroup): MOption[FeatureGroup] = {
    val preR: PreResult[FeatureGroup] = preFeatureGroup(o)
    val r: MOption[FeatureGroup] = if (preR.continu) {
      val o2: FeatureGroup = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val r0: MOption[Name] = transformName(o2.identifier)
      val r1: MOption[IS[Z, Feature]] = transformISZ(o2.features, transformFeature _)
      val r2: MOption[IS[Z, Property]] = transformISZ(o2.properties, transformProperty _)
      if (hasChanged || r0.nonEmpty || r1.nonEmpty || r2.nonEmpty)
        MSome(o2(identifier = r0.getOrElse(o2.identifier), features = r1.getOrElse(o2.features), properties = r2.getOrElse(o2.properties)))
      else
        MNone()
    } else if (preR.resultOpt.nonEmpty) {
      MSome(preR.resultOpt.getOrElse(o))
    } else {
      MNone()
    }
    val hasChanged: B = r.nonEmpty
    val o2: FeatureGroup = r.getOrElse(o)
    val postR: MOption[FeatureGroup] = postFeatureGroup(o2)
    if (postR.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return MSome(o2)
    } else {
      return MNone()
    }
  }

  def transformErrorCondition(o: ErrorCondition): MOption[ErrorCondition] = {
    val preR: PreResult[ErrorCondition] = preErrorCondition(o)
    val r: MOption[ErrorCondition] = if (preR.continu) {
      val o2: ErrorCondition = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val rOpt: MOption[ErrorCondition] = o2 match {
        case o2: ConditionTrigger =>
          val r0: MOption[IS[Z, Name]] = transformISZ(o2.events, transformName _)
          val r1: MOption[IS[Z, Emv2Propagation]] = transformISZ(o2.propagationPoints, transformEmv2Propagation _)
          if (hasChanged || r0.nonEmpty || r1.nonEmpty)
            MSome(o2(events = r0.getOrElse(o2.events), propagationPoints = r1.getOrElse(o2.propagationPoints)))
          else
            MNone()
        case o2: AndCondition =>
          val r0: MOption[IS[Z, ErrorCondition]] = transformISZ(o2.op, transformErrorCondition _)
          if (hasChanged || r0.nonEmpty)
            MSome(o2(op = r0.getOrElse(o2.op)))
          else
            MNone()
        case o2: OrCondition =>
          val r0: MOption[IS[Z, ErrorCondition]] = transformISZ(o2.op, transformErrorCondition _)
          if (hasChanged || r0.nonEmpty)
            MSome(o2(op = r0.getOrElse(o2.op)))
          else
            MNone()
        case o2: AllCondition =>
          val r0: MOption[IS[Z, ErrorCondition]] = transformISZ(o2.op, transformErrorCondition _)
          if (hasChanged || r0.nonEmpty)
            MSome(o2(op = r0.getOrElse(o2.op)))
          else
            MNone()
        case o2: OrMoreCondition =>
          val r0: MOption[IS[Z, ErrorCondition]] = transformISZ(o2.conditions, transformErrorCondition _)
          if (hasChanged || r0.nonEmpty)
            MSome(o2(conditions = r0.getOrElse(o2.conditions)))
          else
            MNone()
        case o2: OrLessCondition =>
          val r0: MOption[IS[Z, ErrorCondition]] = transformISZ(o2.conditions, transformErrorCondition _)
          if (hasChanged || r0.nonEmpty)
            MSome(o2(conditions = r0.getOrElse(o2.conditions)))
          else
            MNone()
      }
      rOpt
    } else if (preR.resultOpt.nonEmpty) {
      MSome(preR.resultOpt.getOrElse(o))
    } else {
      MNone()
    }
    val hasChanged: B = r.nonEmpty
    val o2: ErrorCondition = r.getOrElse(o)
    val postR: MOption[ErrorCondition] = postErrorCondition(o2)
    if (postR.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return MSome(o2)
    } else {
      return MNone()
    }
  }

  def transformConditionTrigger(o: ConditionTrigger): MOption[ConditionTrigger] = {
    val preR: PreResult[ConditionTrigger] = preConditionTrigger(o)
    val r: MOption[ConditionTrigger] = if (preR.continu) {
      val o2: ConditionTrigger = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val r0: MOption[IS[Z, Name]] = transformISZ(o2.events, transformName _)
      val r1: MOption[IS[Z, Emv2Propagation]] = transformISZ(o2.propagationPoints, transformEmv2Propagation _)
      if (hasChanged || r0.nonEmpty || r1.nonEmpty)
        MSome(o2(events = r0.getOrElse(o2.events), propagationPoints = r1.getOrElse(o2.propagationPoints)))
      else
        MNone()
    } else if (preR.resultOpt.nonEmpty) {
      MSome(preR.resultOpt.getOrElse(o))
    } else {
      MNone()
    }
    val hasChanged: B = r.nonEmpty
    val o2: ConditionTrigger = r.getOrElse(o)
    val postR: MOption[ConditionTrigger] = postConditionTrigger(o2)
    if (postR.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return MSome(o2)
    } else {
      return MNone()
    }
  }

  def transformAndCondition(o: AndCondition): MOption[AndCondition] = {
    val preR: PreResult[AndCondition] = preAndCondition(o)
    val r: MOption[AndCondition] = if (preR.continu) {
      val o2: AndCondition = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val r0: MOption[IS[Z, ErrorCondition]] = transformISZ(o2.op, transformErrorCondition _)
      if (hasChanged || r0.nonEmpty)
        MSome(o2(op = r0.getOrElse(o2.op)))
      else
        MNone()
    } else if (preR.resultOpt.nonEmpty) {
      MSome(preR.resultOpt.getOrElse(o))
    } else {
      MNone()
    }
    val hasChanged: B = r.nonEmpty
    val o2: AndCondition = r.getOrElse(o)
    val postR: MOption[AndCondition] = postAndCondition(o2)
    if (postR.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return MSome(o2)
    } else {
      return MNone()
    }
  }

  def transformFeatureAccess(o: FeatureAccess): MOption[FeatureAccess] = {
    val preR: PreResult[FeatureAccess] = preFeatureAccess(o)
    val r: MOption[FeatureAccess] = if (preR.continu) {
      val o2: FeatureAccess = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val r0: MOption[Name] = transformName(o2.identifier)
      val r1: MOption[Option[Classifier]] = transformOption(o2.classifier, transformClassifier _)
      val r2: MOption[IS[Z, Property]] = transformISZ(o2.properties, transformProperty _)
      if (hasChanged || r0.nonEmpty || r1.nonEmpty || r2.nonEmpty)
        MSome(o2(identifier = r0.getOrElse(o2.identifier), classifier = r1.getOrElse(o2.classifier), properties = r2.getOrElse(o2.properties)))
      else
        MNone()
    } else if (preR.resultOpt.nonEmpty) {
      MSome(preR.resultOpt.getOrElse(o))
    } else {
      MNone()
    }
    val hasChanged: B = r.nonEmpty
    val o2: FeatureAccess = r.getOrElse(o)
    val postR: MOption[FeatureAccess] = postFeatureAccess(o2)
    if (postR.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return MSome(o2)
    } else {
      return MNone()
    }
  }

  def transformOrCondition(o: OrCondition): MOption[OrCondition] = {
    val preR: PreResult[OrCondition] = preOrCondition(o)
    val r: MOption[OrCondition] = if (preR.continu) {
      val o2: OrCondition = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val r0: MOption[IS[Z, ErrorCondition]] = transformISZ(o2.op, transformErrorCondition _)
      if (hasChanged || r0.nonEmpty)
        MSome(o2(op = r0.getOrElse(o2.op)))
      else
        MNone()
    } else if (preR.resultOpt.nonEmpty) {
      MSome(preR.resultOpt.getOrElse(o))
    } else {
      MNone()
    }
    val hasChanged: B = r.nonEmpty
    val o2: OrCondition = r.getOrElse(o)
    val postR: MOption[OrCondition] = postOrCondition(o2)
    if (postR.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return MSome(o2)
    } else {
      return MNone()
    }
  }

  def transformAllCondition(o: AllCondition): MOption[AllCondition] = {
    val preR: PreResult[AllCondition] = preAllCondition(o)
    val r: MOption[AllCondition] = if (preR.continu) {
      val o2: AllCondition = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val r0: MOption[IS[Z, ErrorCondition]] = transformISZ(o2.op, transformErrorCondition _)
      if (hasChanged || r0.nonEmpty)
        MSome(o2(op = r0.getOrElse(o2.op)))
      else
        MNone()
    } else if (preR.resultOpt.nonEmpty) {
      MSome(preR.resultOpt.getOrElse(o))
    } else {
      MNone()
    }
    val hasChanged: B = r.nonEmpty
    val o2: AllCondition = r.getOrElse(o)
    val postR: MOption[AllCondition] = postAllCondition(o2)
    if (postR.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return MSome(o2)
    } else {
      return MNone()
    }
  }

  def transformOrMoreCondition(o: OrMoreCondition): MOption[OrMoreCondition] = {
    val preR: PreResult[OrMoreCondition] = preOrMoreCondition(o)
    val r: MOption[OrMoreCondition] = if (preR.continu) {
      val o2: OrMoreCondition = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val r0: MOption[IS[Z, ErrorCondition]] = transformISZ(o2.conditions, transformErrorCondition _)
      if (hasChanged || r0.nonEmpty)
        MSome(o2(conditions = r0.getOrElse(o2.conditions)))
      else
        MNone()
    } else if (preR.resultOpt.nonEmpty) {
      MSome(preR.resultOpt.getOrElse(o))
    } else {
      MNone()
    }
    val hasChanged: B = r.nonEmpty
    val o2: OrMoreCondition = r.getOrElse(o)
    val postR: MOption[OrMoreCondition] = postOrMoreCondition(o2)
    if (postR.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return MSome(o2)
    } else {
      return MNone()
    }
  }

  def transformOrLessCondition(o: OrLessCondition): MOption[OrLessCondition] = {
    val preR: PreResult[OrLessCondition] = preOrLessCondition(o)
    val r: MOption[OrLessCondition] = if (preR.continu) {
      val o2: OrLessCondition = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val r0: MOption[IS[Z, ErrorCondition]] = transformISZ(o2.conditions, transformErrorCondition _)
      if (hasChanged || r0.nonEmpty)
        MSome(o2(conditions = r0.getOrElse(o2.conditions)))
      else
        MNone()
    } else if (preR.resultOpt.nonEmpty) {
      MSome(preR.resultOpt.getOrElse(o))
    } else {
      MNone()
    }
    val hasChanged: B = r.nonEmpty
    val o2: OrLessCondition = r.getOrElse(o)
    val postR: MOption[OrLessCondition] = postOrLessCondition(o2)
    if (postR.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return MSome(o2)
    } else {
      return MNone()
    }
  }

  def transformEmv2Clause(o: Emv2Clause): MOption[Emv2Clause] = {
    val preR: PreResult[Emv2Clause] = preEmv2Clause(o)
    val r: MOption[Emv2Clause] = if (preR.continu) {
      val o2: Emv2Clause = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val r0: MOption[IS[Z, Name]] = transformISZ(o2.libraries, transformName _)
      val r1: MOption[IS[Z, Emv2Propagation]] = transformISZ(o2.propagations, transformEmv2Propagation _)
      val r2: MOption[IS[Z, Emv2Flow]] = transformISZ(o2.flows, transformEmv2Flow _)
      val r3: MOption[Option[Emv2BehaviorSection]] = transformOption(o2.componentBehavior, transformEmv2BehaviorSection _)
      val r4: MOption[IS[Z, Property]] = transformISZ(o2.properties, transformProperty _)
      if (hasChanged || r0.nonEmpty || r1.nonEmpty || r2.nonEmpty || r3.nonEmpty || r4.nonEmpty)
        MSome(o2(libraries = r0.getOrElse(o2.libraries), propagations = r1.getOrElse(o2.propagations), flows = r2.getOrElse(o2.flows), componentBehavior = r3.getOrElse(o2.componentBehavior), properties = r4.getOrElse(o2.properties)))
      else
        MNone()
    } else if (preR.resultOpt.nonEmpty) {
      MSome(preR.resultOpt.getOrElse(o))
    } else {
      MNone()
    }
    val hasChanged: B = r.nonEmpty
    val o2: Emv2Clause = r.getOrElse(o)
    val postR: MOption[Emv2Clause] = postEmv2Clause(o2)
    if (postR.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return MSome(o2)
    } else {
      return MNone()
    }
  }

  def transformEmv2Propagation(o: Emv2Propagation): MOption[Emv2Propagation] = {
    val preR: PreResult[Emv2Propagation] = preEmv2Propagation(o)
    val r: MOption[Emv2Propagation] = if (preR.continu) {
      val o2: Emv2Propagation = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val r0: MOption[Name] = transformName(o2.propagationPoint)
      val r1: MOption[IS[Z, Name]] = transformISZ(o2.errorTokens, transformName _)
      if (hasChanged || r0.nonEmpty || r1.nonEmpty)
        MSome(o2(propagationPoint = r0.getOrElse(o2.propagationPoint), errorTokens = r1.getOrElse(o2.errorTokens)))
      else
        MNone()
    } else if (preR.resultOpt.nonEmpty) {
      MSome(preR.resultOpt.getOrElse(o))
    } else {
      MNone()
    }
    val hasChanged: B = r.nonEmpty
    val o2: Emv2Propagation = r.getOrElse(o)
    val postR: MOption[Emv2Propagation] = postEmv2Propagation(o2)
    if (postR.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return MSome(o2)
    } else {
      return MNone()
    }
  }

  def transformConnection(o: Connection): MOption[Connection] = {
    val preR: PreResult[Connection] = preConnection(o)
    val r: MOption[Connection] = if (preR.continu) {
      val o2: Connection = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val r0: MOption[Name] = transformName(o2.name)
      val r1: MOption[IS[Z, EndPoint]] = transformISZ(o2.src, transformEndPoint _)
      val r2: MOption[IS[Z, EndPoint]] = transformISZ(o2.dst, transformEndPoint _)
      val r3: MOption[IS[Z, Name]] = transformISZ(o2.connectionInstances, transformName _)
      val r4: MOption[IS[Z, Property]] = transformISZ(o2.properties, transformProperty _)
      if (hasChanged || r0.nonEmpty || r1.nonEmpty || r2.nonEmpty || r3.nonEmpty || r4.nonEmpty)
        MSome(o2(name = r0.getOrElse(o2.name), src = r1.getOrElse(o2.src), dst = r2.getOrElse(o2.dst), connectionInstances = r3.getOrElse(o2.connectionInstances), properties = r4.getOrElse(o2.properties)))
      else
        MNone()
    } else if (preR.resultOpt.nonEmpty) {
      MSome(preR.resultOpt.getOrElse(o))
    } else {
      MNone()
    }
    val hasChanged: B = r.nonEmpty
    val o2: Connection = r.getOrElse(o)
    val postR: MOption[Connection] = postConnection(o2)
    if (postR.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return MSome(o2)
    } else {
      return MNone()
    }
  }

  def transformEmv2Flow(o: Emv2Flow): MOption[Emv2Flow] = {
    val preR: PreResult[Emv2Flow] = preEmv2Flow(o)
    val r: MOption[Emv2Flow] = if (preR.continu) {
      val o2: Emv2Flow = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val r0: MOption[Name] = transformName(o2.identifier)
      val r1: MOption[Option[Emv2Propagation]] = transformOption(o2.sourcePropagation, transformEmv2Propagation _)
      val r2: MOption[Option[Emv2Propagation]] = transformOption(o2.sinkPropagation, transformEmv2Propagation _)
      if (hasChanged || r0.nonEmpty || r1.nonEmpty || r2.nonEmpty)
        MSome(o2(identifier = r0.getOrElse(o2.identifier), sourcePropagation = r1.getOrElse(o2.sourcePropagation), sinkPropagation = r2.getOrElse(o2.sinkPropagation)))
      else
        MNone()
    } else if (preR.resultOpt.nonEmpty) {
      MSome(preR.resultOpt.getOrElse(o))
    } else {
      MNone()
    }
    val hasChanged: B = r.nonEmpty
    val o2: Emv2Flow = r.getOrElse(o)
    val postR: MOption[Emv2Flow] = postEmv2Flow(o2)
    if (postR.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return MSome(o2)
    } else {
      return MNone()
    }
  }

  def transformEmv2BehaviorSection(o: Emv2BehaviorSection): MOption[Emv2BehaviorSection] = {
    val preR: PreResult[Emv2BehaviorSection] = preEmv2BehaviorSection(o)
    val r: MOption[Emv2BehaviorSection] = if (preR.continu) {
      val o2: Emv2BehaviorSection = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val r0: MOption[IS[Z, ErrorEvent]] = transformISZ(o2.events, transformErrorEvent _)
      val r1: MOption[IS[Z, ErrorTransition]] = transformISZ(o2.transitions, transformErrorTransition _)
      val r2: MOption[IS[Z, ErrorPropagation]] = transformISZ(o2.propagations, transformErrorPropagation _)
      if (hasChanged || r0.nonEmpty || r1.nonEmpty || r2.nonEmpty)
        MSome(o2(events = r0.getOrElse(o2.events), transitions = r1.getOrElse(o2.transitions), propagations = r2.getOrElse(o2.propagations)))
      else
        MNone()
    } else if (preR.resultOpt.nonEmpty) {
      MSome(preR.resultOpt.getOrElse(o))
    } else {
      MNone()
    }
    val hasChanged: B = r.nonEmpty
    val o2: Emv2BehaviorSection = r.getOrElse(o)
    val postR: MOption[Emv2BehaviorSection] = postEmv2BehaviorSection(o2)
    if (postR.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return MSome(o2)
    } else {
      return MNone()
    }
  }

  def transformConnectionInstance(o: ConnectionInstance): MOption[ConnectionInstance] = {
    val preR: PreResult[ConnectionInstance] = preConnectionInstance(o)
    val r: MOption[ConnectionInstance] = if (preR.continu) {
      val o2: ConnectionInstance = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val r0: MOption[Name] = transformName(o2.name)
      val r1: MOption[EndPoint] = transformEndPoint(o2.src)
      val r2: MOption[EndPoint] = transformEndPoint(o2.dst)
      val r3: MOption[IS[Z, ConnectionReference]] = transformISZ(o2.connectionRefs, transformConnectionReference _)
      val r4: MOption[IS[Z, Property]] = transformISZ(o2.properties, transformProperty _)
      if (hasChanged || r0.nonEmpty || r1.nonEmpty || r2.nonEmpty || r3.nonEmpty || r4.nonEmpty)
        MSome(o2(name = r0.getOrElse(o2.name), src = r1.getOrElse(o2.src), dst = r2.getOrElse(o2.dst), connectionRefs = r3.getOrElse(o2.connectionRefs), properties = r4.getOrElse(o2.properties)))
      else
        MNone()
    } else if (preR.resultOpt.nonEmpty) {
      MSome(preR.resultOpt.getOrElse(o))
    } else {
      MNone()
    }
    val hasChanged: B = r.nonEmpty
    val o2: ConnectionInstance = r.getOrElse(o)
    val postR: MOption[ConnectionInstance] = postConnectionInstance(o2)
    if (postR.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return MSome(o2)
    } else {
      return MNone()
    }
  }

  def transformErrorPropagation(o: ErrorPropagation): MOption[ErrorPropagation] = {
    val preR: PreResult[ErrorPropagation] = preErrorPropagation(o)
    val r: MOption[ErrorPropagation] = if (preR.continu) {
      val o2: ErrorPropagation = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val r0: MOption[Option[Name]] = transformOption(o2.id, transformName _)
      val r1: MOption[IS[Z, Name]] = transformISZ(o2.source, transformName _)
      val r2: MOption[Option[ErrorCondition]] = transformOption(o2.condition, transformErrorCondition _)
      val r3: MOption[IS[Z, Emv2Propagation]] = transformISZ(o2.target, transformEmv2Propagation _)
      if (hasChanged || r0.nonEmpty || r1.nonEmpty || r2.nonEmpty || r3.nonEmpty)
        MSome(o2(id = r0.getOrElse(o2.id), source = r1.getOrElse(o2.source), condition = r2.getOrElse(o2.condition), target = r3.getOrElse(o2.target)))
      else
        MNone()
    } else if (preR.resultOpt.nonEmpty) {
      MSome(preR.resultOpt.getOrElse(o))
    } else {
      MNone()
    }
    val hasChanged: B = r.nonEmpty
    val o2: ErrorPropagation = r.getOrElse(o)
    val postR: MOption[ErrorPropagation] = postErrorPropagation(o2)
    if (postR.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return MSome(o2)
    } else {
      return MNone()
    }
  }

  def transformConnectionReference(o: ConnectionReference): MOption[ConnectionReference] = {
    val preR: PreResult[ConnectionReference] = preConnectionReference(o)
    val r: MOption[ConnectionReference] = if (preR.continu) {
      val o2: ConnectionReference = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val r0: MOption[Name] = transformName(o2.name)
      val r1: MOption[Name] = transformName(o2.context)
      if (hasChanged || r0.nonEmpty || r1.nonEmpty)
        MSome(o2(name = r0.getOrElse(o2.name), context = r1.getOrElse(o2.context)))
      else
        MNone()
    } else if (preR.resultOpt.nonEmpty) {
      MSome(preR.resultOpt.getOrElse(o))
    } else {
      MNone()
    }
    val hasChanged: B = r.nonEmpty
    val o2: ConnectionReference = r.getOrElse(o)
    val postR: MOption[ConnectionReference] = postConnectionReference(o2)
    if (postR.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return MSome(o2)
    } else {
      return MNone()
    }
  }

  def transformEndPoint(o: EndPoint): MOption[EndPoint] = {
    val preR: PreResult[EndPoint] = preEndPoint(o)
    val r: MOption[EndPoint] = if (preR.continu) {
      val o2: EndPoint = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val r0: MOption[Name] = transformName(o2.component)
      val r1: MOption[Option[Name]] = transformOption(o2.feature, transformName _)
      if (hasChanged || r0.nonEmpty || r1.nonEmpty)
        MSome(o2(component = r0.getOrElse(o2.component), feature = r1.getOrElse(o2.feature)))
      else
        MNone()
    } else if (preR.resultOpt.nonEmpty) {
      MSome(preR.resultOpt.getOrElse(o))
    } else {
      MNone()
    }
    val hasChanged: B = r.nonEmpty
    val o2: EndPoint = r.getOrElse(o)
    val postR: MOption[EndPoint] = postEndPoint(o2)
    if (postR.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return MSome(o2)
    } else {
      return MNone()
    }
  }

  def transformProperty(o: Property): MOption[Property] = {
    val preR: PreResult[Property] = preProperty(o)
    val r: MOption[Property] = if (preR.continu) {
      val o2: Property = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val r0: MOption[Name] = transformName(o2.name)
      val r1: MOption[IS[Z, PropertyValue]] = transformISZ(o2.propertyValues, transformPropertyValue _)
      val r2: MOption[IS[Z, ElementRef]] = transformISZ(o2.appliesTo, transformElementRef _)
      if (hasChanged || r0.nonEmpty || r1.nonEmpty || r2.nonEmpty)
        MSome(o2(name = r0.getOrElse(o2.name), propertyValues = r1.getOrElse(o2.propertyValues), appliesTo = r2.getOrElse(o2.appliesTo)))
      else
        MNone()
    } else if (preR.resultOpt.nonEmpty) {
      MSome(preR.resultOpt.getOrElse(o))
    } else {
      MNone()
    }
    val hasChanged: B = r.nonEmpty
    val o2: Property = r.getOrElse(o)
    val postR: MOption[Property] = postProperty(o2)
    if (postR.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return MSome(o2)
    } else {
      return MNone()
    }
  }

  def transformElementRef(o: ElementRef): MOption[ElementRef] = {
    val preR: PreResult[ElementRef] = preElementRef(o)
    val r: MOption[ElementRef] = if (preR.continu) {
      val o2: ElementRef = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val rOpt: MOption[ElementRef] = o2 match {
        case o2: Emv2ElementRef =>
          val r0: MOption[Name] = transformName(o2.name)
          val r1: MOption[IS[Z, Name]] = transformISZ(o2.errorTypes, transformName _)
          if (hasChanged || r0.nonEmpty || r1.nonEmpty)
            MSome(o2(name = r0.getOrElse(o2.name), errorTypes = r1.getOrElse(o2.errorTypes)))
          else
            MNone()
        case o2: AadlElementRef =>
          val r0: MOption[Name] = transformName(o2.name)
          if (hasChanged || r0.nonEmpty)
            MSome(o2(name = r0.getOrElse(o2.name)))
          else
            MNone()
      }
      rOpt
    } else if (preR.resultOpt.nonEmpty) {
      MSome(preR.resultOpt.getOrElse(o))
    } else {
      MNone()
    }
    val hasChanged: B = r.nonEmpty
    val o2: ElementRef = r.getOrElse(o)
    val postR: MOption[ElementRef] = postElementRef(o2)
    if (postR.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return MSome(o2)
    } else {
      return MNone()
    }
  }

  def transformAadlElementRef(o: AadlElementRef): MOption[AadlElementRef] = {
    val preR: PreResult[AadlElementRef] = preAadlElementRef(o)
    val r: MOption[AadlElementRef] = if (preR.continu) {
      val o2: AadlElementRef = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val r0: MOption[Name] = transformName(o2.name)
      if (hasChanged || r0.nonEmpty)
        MSome(o2(name = r0.getOrElse(o2.name)))
      else
        MNone()
    } else if (preR.resultOpt.nonEmpty) {
      MSome(preR.resultOpt.getOrElse(o))
    } else {
      MNone()
    }
    val hasChanged: B = r.nonEmpty
    val o2: AadlElementRef = r.getOrElse(o)
    val postR: MOption[AadlElementRef] = postAadlElementRef(o2)
    if (postR.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return MSome(o2)
    } else {
      return MNone()
    }
  }

  def transformPropertyValue(o: PropertyValue): MOption[PropertyValue] = {
    val preR: PreResult[PropertyValue] = prePropertyValue(o)
    val r: MOption[PropertyValue] = if (preR.continu) {
      val o2: PropertyValue = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val rOpt: MOption[PropertyValue] = o2 match {
        case o2: ClassifierProp =>
          if (hasChanged)
            MSome(o2)
          else
            MNone()
        case o2: RangeProp =>
          val r0: MOption[UnitProp] = transformUnitProp(o2.low)
          val r1: MOption[UnitProp] = transformUnitProp(o2.high)
          if (hasChanged || r0.nonEmpty || r1.nonEmpty)
            MSome(o2(low = r0.getOrElse(o2.low), high = r1.getOrElse(o2.high)))
          else
            MNone()
        case o2: RecordProp =>
          val r0: MOption[IS[Z, Property]] = transformISZ(o2.properties, transformProperty _)
          if (hasChanged || r0.nonEmpty)
            MSome(o2(properties = r0.getOrElse(o2.properties)))
          else
            MNone()
        case o2: ReferenceProp =>
          val r0: MOption[Name] = transformName(o2.value)
          if (hasChanged || r0.nonEmpty)
            MSome(o2(value = r0.getOrElse(o2.value)))
          else
            MNone()
        case o2: UnitProp =>
          if (hasChanged)
            MSome(o2)
          else
            MNone()
        case o2: ValueProp =>
          if (hasChanged)
            MSome(o2)
          else
            MNone()
      }
      rOpt
    } else if (preR.resultOpt.nonEmpty) {
      MSome(preR.resultOpt.getOrElse(o))
    } else {
      MNone()
    }
    val hasChanged: B = r.nonEmpty
    val o2: PropertyValue = r.getOrElse(o)
    val postR: MOption[PropertyValue] = postPropertyValue(o2)
    if (postR.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return MSome(o2)
    } else {
      return MNone()
    }
  }

  def transformMode(o: Mode): MOption[Mode] = {
    val preR: PreResult[Mode] = preMode(o)
    val r: MOption[Mode] = if (preR.continu) {
      val o2: Mode = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val r0: MOption[Name] = transformName(o2.name)
      if (hasChanged || r0.nonEmpty)
        MSome(o2(name = r0.getOrElse(o2.name)))
      else
        MNone()
    } else if (preR.resultOpt.nonEmpty) {
      MSome(preR.resultOpt.getOrElse(o))
    } else {
      MNone()
    }
    val hasChanged: B = r.nonEmpty
    val o2: Mode = r.getOrElse(o)
    val postR: MOption[Mode] = postMode(o2)
    if (postR.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return MSome(o2)
    } else {
      return MNone()
    }
  }

  def transformFlow(o: Flow): MOption[Flow] = {
    val preR: PreResult[Flow] = preFlow(o)
    val r: MOption[Flow] = if (preR.continu) {
      val o2: Flow = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val r0: MOption[Name] = transformName(o2.name)
      val r1: MOption[Option[Name]] = transformOption(o2.source, transformName _)
      val r2: MOption[Option[Name]] = transformOption(o2.sink, transformName _)
      if (hasChanged || r0.nonEmpty || r1.nonEmpty || r2.nonEmpty)
        MSome(o2(name = r0.getOrElse(o2.name), source = r1.getOrElse(o2.source), sink = r2.getOrElse(o2.sink)))
      else
        MNone()
    } else if (preR.resultOpt.nonEmpty) {
      MSome(preR.resultOpt.getOrElse(o))
    } else {
      MNone()
    }
    val hasChanged: B = r.nonEmpty
    val o2: Flow = r.getOrElse(o)
    val postR: MOption[Flow] = postFlow(o2)
    if (postR.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return MSome(o2)
    } else {
      return MNone()
    }
  }

  def transformAnnex(o: Annex): MOption[Annex] = {
    val preR: PreResult[Annex] = preAnnex(o)
    val r: MOption[Annex] = if (preR.continu) {
      val o2: Annex = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val r0: MOption[AnnexClause] = transformAnnexClause(o2.clause)
      if (hasChanged || r0.nonEmpty)
        MSome(o2(clause = r0.getOrElse(o2.clause)))
      else
        MNone()
    } else if (preR.resultOpt.nonEmpty) {
      MSome(preR.resultOpt.getOrElse(o))
    } else {
      MNone()
    }
    val hasChanged: B = r.nonEmpty
    val o2: Annex = r.getOrElse(o)
    val postR: MOption[Annex] = postAnnex(o2)
    if (postR.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return MSome(o2)
    } else {
      return MNone()
    }
  }

  def transformAnnexClause(o: AnnexClause): MOption[AnnexClause] = {
    val preR: PreResult[AnnexClause] = preAnnexClause(o)
    val r: MOption[AnnexClause] = if (preR.continu) {
      val o2: AnnexClause = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val rOpt: MOption[AnnexClause] = o2 match {
        case o2: SmfClause =>
          val r0: MOption[IS[Z, SmfClassification]] = transformISZ(o2.classification, transformSmfClassification _)
          val r1: MOption[IS[Z, SmfDeclass]] = transformISZ(o2.declass, transformSmfDeclass _)
          if (hasChanged || r0.nonEmpty || r1.nonEmpty)
            MSome(o2(classification = r0.getOrElse(o2.classification), declass = r1.getOrElse(o2.declass)))
          else
            MNone()
        case o2: SmfClassification =>
          val r0: MOption[Name] = transformName(o2.portName)
          val r1: MOption[Name] = transformName(o2.typeName)
          if (hasChanged || r0.nonEmpty || r1.nonEmpty)
            MSome(o2(portName = r0.getOrElse(o2.portName), typeName = r1.getOrElse(o2.typeName)))
          else
            MNone()
        case o2: SmfDeclass =>
          val r0: MOption[Name] = transformName(o2.flowName)
          val r1: MOption[Option[Name]] = transformOption(o2.srcType, transformName _)
          val r2: MOption[Name] = transformName(o2.snkType)
          if (hasChanged || r0.nonEmpty || r1.nonEmpty || r2.nonEmpty)
            MSome(o2(flowName = r0.getOrElse(o2.flowName), srcType = r1.getOrElse(o2.srcType), snkType = r2.getOrElse(o2.snkType)))
          else
            MNone()
        case o2: SmfType =>
          val r0: MOption[Name] = transformName(o2.typeName)
          val r1: MOption[IS[Z, Name]] = transformISZ(o2.parentType, transformName _)
          if (hasChanged || r0.nonEmpty || r1.nonEmpty)
            MSome(o2(typeName = r0.getOrElse(o2.typeName), parentType = r1.getOrElse(o2.parentType)))
          else
            MNone()
        case o2: ErrorTypeDef =>
          val r0: MOption[Name] = transformName(o2.id)
          val r1: MOption[Option[Name]] = transformOption(o2.extendType, transformName _)
          if (hasChanged || r0.nonEmpty || r1.nonEmpty)
            MSome(o2(id = r0.getOrElse(o2.id), extendType = r1.getOrElse(o2.extendType)))
          else
            MNone()
        case o2: ErrorAliasDef =>
          val r0: MOption[Name] = transformName(o2.errorType)
          val r1: MOption[Name] = transformName(o2.aliseType)
          if (hasChanged || r0.nonEmpty || r1.nonEmpty)
            MSome(o2(errorType = r0.getOrElse(o2.errorType), aliseType = r1.getOrElse(o2.aliseType)))
          else
            MNone()
        case o2: ErrorTypeSetDef =>
          val r0: MOption[Name] = transformName(o2.id)
          val r1: MOption[IS[Z, Name]] = transformISZ(o2.errorTypes, transformName _)
          if (hasChanged || r0.nonEmpty || r1.nonEmpty)
            MSome(o2(id = r0.getOrElse(o2.id), errorTypes = r1.getOrElse(o2.errorTypes)))
          else
            MNone()
        case o2: BehaveStateMachine =>
          val r0: MOption[Name] = transformName(o2.id)
          val r1: MOption[IS[Z, ErrorEvent]] = transformISZ(o2.events, transformErrorEvent _)
          val r2: MOption[IS[Z, ErrorState]] = transformISZ(o2.states, transformErrorState _)
          val r3: MOption[IS[Z, ErrorTransition]] = transformISZ(o2.transitions, transformErrorTransition _)
          val r4: MOption[IS[Z, Property]] = transformISZ(o2.properties, transformProperty _)
          if (hasChanged || r0.nonEmpty || r1.nonEmpty || r2.nonEmpty || r3.nonEmpty || r4.nonEmpty)
            MSome(o2(id = r0.getOrElse(o2.id), events = r1.getOrElse(o2.events), states = r2.getOrElse(o2.states), transitions = r3.getOrElse(o2.transitions), properties = r4.getOrElse(o2.properties)))
          else
            MNone()
        case o2: ErrorEvent =>
          val r0: MOption[Name] = transformName(o2.id)
          if (hasChanged || r0.nonEmpty)
            MSome(o2(id = r0.getOrElse(o2.id)))
          else
            MNone()
        case o2: ErrorState =>
          val r0: MOption[Name] = transformName(o2.id)
          if (hasChanged || r0.nonEmpty)
            MSome(o2(id = r0.getOrElse(o2.id)))
          else
            MNone()
        case o2: ErrorTransition =>
          val r0: MOption[Option[Name]] = transformOption(o2.id, transformName _)
          val r1: MOption[Name] = transformName(o2.sourceState)
          val r2: MOption[ErrorCondition] = transformErrorCondition(o2.condition)
          val r3: MOption[Name] = transformName(o2.targetState)
          if (hasChanged || r0.nonEmpty || r1.nonEmpty || r2.nonEmpty || r3.nonEmpty)
            MSome(o2(id = r0.getOrElse(o2.id), sourceState = r1.getOrElse(o2.sourceState), condition = r2.getOrElse(o2.condition), targetState = r3.getOrElse(o2.targetState)))
          else
            MNone()
        case o2: ConditionTrigger =>
          val r0: MOption[IS[Z, Name]] = transformISZ(o2.events, transformName _)
          val r1: MOption[IS[Z, Emv2Propagation]] = transformISZ(o2.propagationPoints, transformEmv2Propagation _)
          if (hasChanged || r0.nonEmpty || r1.nonEmpty)
            MSome(o2(events = r0.getOrElse(o2.events), propagationPoints = r1.getOrElse(o2.propagationPoints)))
          else
            MNone()
        case o2: AndCondition =>
          val r0: MOption[IS[Z, ErrorCondition]] = transformISZ(o2.op, transformErrorCondition _)
          if (hasChanged || r0.nonEmpty)
            MSome(o2(op = r0.getOrElse(o2.op)))
          else
            MNone()
        case o2: OrCondition =>
          val r0: MOption[IS[Z, ErrorCondition]] = transformISZ(o2.op, transformErrorCondition _)
          if (hasChanged || r0.nonEmpty)
            MSome(o2(op = r0.getOrElse(o2.op)))
          else
            MNone()
        case o2: AllCondition =>
          val r0: MOption[IS[Z, ErrorCondition]] = transformISZ(o2.op, transformErrorCondition _)
          if (hasChanged || r0.nonEmpty)
            MSome(o2(op = r0.getOrElse(o2.op)))
          else
            MNone()
        case o2: OrMoreCondition =>
          val r0: MOption[IS[Z, ErrorCondition]] = transformISZ(o2.conditions, transformErrorCondition _)
          if (hasChanged || r0.nonEmpty)
            MSome(o2(conditions = r0.getOrElse(o2.conditions)))
          else
            MNone()
        case o2: OrLessCondition =>
          val r0: MOption[IS[Z, ErrorCondition]] = transformISZ(o2.conditions, transformErrorCondition _)
          if (hasChanged || r0.nonEmpty)
            MSome(o2(conditions = r0.getOrElse(o2.conditions)))
          else
            MNone()
        case o2: Emv2Clause =>
          val r0: MOption[IS[Z, Name]] = transformISZ(o2.libraries, transformName _)
          val r1: MOption[IS[Z, Emv2Propagation]] = transformISZ(o2.propagations, transformEmv2Propagation _)
          val r2: MOption[IS[Z, Emv2Flow]] = transformISZ(o2.flows, transformEmv2Flow _)
          val r3: MOption[Option[Emv2BehaviorSection]] = transformOption(o2.componentBehavior, transformEmv2BehaviorSection _)
          val r4: MOption[IS[Z, Property]] = transformISZ(o2.properties, transformProperty _)
          if (hasChanged || r0.nonEmpty || r1.nonEmpty || r2.nonEmpty || r3.nonEmpty || r4.nonEmpty)
            MSome(o2(libraries = r0.getOrElse(o2.libraries), propagations = r1.getOrElse(o2.propagations), flows = r2.getOrElse(o2.flows), componentBehavior = r3.getOrElse(o2.componentBehavior), properties = r4.getOrElse(o2.properties)))
          else
            MNone()
        case o2: Emv2Propagation =>
          val r0: MOption[Name] = transformName(o2.propagationPoint)
          val r1: MOption[IS[Z, Name]] = transformISZ(o2.errorTokens, transformName _)
          if (hasChanged || r0.nonEmpty || r1.nonEmpty)
            MSome(o2(propagationPoint = r0.getOrElse(o2.propagationPoint), errorTokens = r1.getOrElse(o2.errorTokens)))
          else
            MNone()
        case o2: Emv2Flow =>
          val r0: MOption[Name] = transformName(o2.identifier)
          val r1: MOption[Option[Emv2Propagation]] = transformOption(o2.sourcePropagation, transformEmv2Propagation _)
          val r2: MOption[Option[Emv2Propagation]] = transformOption(o2.sinkPropagation, transformEmv2Propagation _)
          if (hasChanged || r0.nonEmpty || r1.nonEmpty || r2.nonEmpty)
            MSome(o2(identifier = r0.getOrElse(o2.identifier), sourcePropagation = r1.getOrElse(o2.sourcePropagation), sinkPropagation = r2.getOrElse(o2.sinkPropagation)))
          else
            MNone()
        case o2: Emv2BehaviorSection =>
          val r0: MOption[IS[Z, ErrorEvent]] = transformISZ(o2.events, transformErrorEvent _)
          val r1: MOption[IS[Z, ErrorTransition]] = transformISZ(o2.transitions, transformErrorTransition _)
          val r2: MOption[IS[Z, ErrorPropagation]] = transformISZ(o2.propagations, transformErrorPropagation _)
          if (hasChanged || r0.nonEmpty || r1.nonEmpty || r2.nonEmpty)
            MSome(o2(events = r0.getOrElse(o2.events), transitions = r1.getOrElse(o2.transitions), propagations = r2.getOrElse(o2.propagations)))
          else
            MNone()
        case o2: ErrorPropagation =>
          val r0: MOption[Option[Name]] = transformOption(o2.id, transformName _)
          val r1: MOption[IS[Z, Name]] = transformISZ(o2.source, transformName _)
          val r2: MOption[Option[ErrorCondition]] = transformOption(o2.condition, transformErrorCondition _)
          val r3: MOption[IS[Z, Emv2Propagation]] = transformISZ(o2.target, transformEmv2Propagation _)
          if (hasChanged || r0.nonEmpty || r1.nonEmpty || r2.nonEmpty || r3.nonEmpty)
            MSome(o2(id = r0.getOrElse(o2.id), source = r1.getOrElse(o2.source), condition = r2.getOrElse(o2.condition), target = r3.getOrElse(o2.target)))
          else
            MNone()
        case o2: OtherAnnex =>
          if (hasChanged)
            MSome(o2)
          else
            MNone()
        case o2: BTSBLESSAnnexClause =>
          val r0: MOption[IS[Z, BTSAssertion]] = transformISZ(o2.assertions, transformBTSAssertion _)
          val r1: MOption[Option[BTSAssertion]] = transformOption(o2.invariant, transformBTSAssertion _)
          val r2: MOption[IS[Z, BTSVariableDeclaration]] = transformISZ(o2.variables, transformBTSVariableDeclaration _)
          val r3: MOption[IS[Z, BTSStateDeclaration]] = transformISZ(o2.states, transformBTSStateDeclaration _)
          val r4: MOption[IS[Z, BTSTransition]] = transformISZ(o2.transitions, transformBTSTransition _)
          if (hasChanged || r0.nonEmpty || r1.nonEmpty || r2.nonEmpty || r3.nonEmpty || r4.nonEmpty)
            MSome(o2(assertions = r0.getOrElse(o2.assertions), invariant = r1.getOrElse(o2.invariant), variables = r2.getOrElse(o2.variables), states = r3.getOrElse(o2.states), transitions = r4.getOrElse(o2.transitions)))
          else
            MNone()
      }
      rOpt
    } else if (preR.resultOpt.nonEmpty) {
      MSome(preR.resultOpt.getOrElse(o))
    } else {
      MNone()
    }
    val hasChanged: B = r.nonEmpty
    val o2: AnnexClause = r.getOrElse(o)
    val postR: MOption[AnnexClause] = postAnnexClause(o2)
    if (postR.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return MSome(o2)
    } else {
      return MNone()
    }
  }

  def transformAnnexLib(o: AnnexLib): MOption[AnnexLib] = {
    val preR: PreResult[AnnexLib] = preAnnexLib(o)
    val r: MOption[AnnexLib] = if (preR.continu) {
      val o2: AnnexLib = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val rOpt: MOption[AnnexLib] = o2 match {
        case o2: SmfLibrary =>
          val r0: MOption[IS[Z, SmfType]] = transformISZ(o2.types, transformSmfType _)
          if (hasChanged || r0.nonEmpty)
            MSome(o2(types = r0.getOrElse(o2.types)))
          else
            MNone()
        case o2: Emv2Library =>
          val r0: MOption[Name] = transformName(o2.name)
          val r1: MOption[IS[Z, ErrorTypeDef]] = transformISZ(o2.errorTypeDef, transformErrorTypeDef _)
          val r2: MOption[IS[Z, ErrorTypeSetDef]] = transformISZ(o2.errorTypeSetDef, transformErrorTypeSetDef _)
          val r3: MOption[IS[Z, ErrorAliasDef]] = transformISZ(o2.alias, transformErrorAliasDef _)
          val r4: MOption[IS[Z, BehaveStateMachine]] = transformISZ(o2.behaveStateMachine, transformBehaveStateMachine _)
          if (hasChanged || r0.nonEmpty || r1.nonEmpty || r2.nonEmpty || r3.nonEmpty || r4.nonEmpty)
            MSome(o2(name = r0.getOrElse(o2.name), errorTypeDef = r1.getOrElse(o2.errorTypeDef), errorTypeSetDef = r2.getOrElse(o2.errorTypeSetDef), alias = r3.getOrElse(o2.alias), behaveStateMachine = r4.getOrElse(o2.behaveStateMachine)))
          else
            MNone()
        case o2: OtherLib =>
          if (hasChanged)
            MSome(o2)
          else
            MNone()
      }
      rOpt
    } else if (preR.resultOpt.nonEmpty) {
      MSome(preR.resultOpt.getOrElse(o))
    } else {
      MNone()
    }
    val hasChanged: B = r.nonEmpty
    val o2: AnnexLib = r.getOrElse(o)
    val postR: MOption[AnnexLib] = postAnnexLib(o2)
    if (postR.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return MSome(o2)
    } else {
      return MNone()
    }
  }

  def transformOtherAnnex(o: OtherAnnex): MOption[OtherAnnex] = {
    val preR: PreResult[OtherAnnex] = preOtherAnnex(o)
    val r: MOption[OtherAnnex] = if (preR.continu) {
      val o2: OtherAnnex = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      if (hasChanged)
        MSome(o2)
      else
        MNone()
    } else if (preR.resultOpt.nonEmpty) {
      MSome(preR.resultOpt.getOrElse(o))
    } else {
      MNone()
    }
    val hasChanged: B = r.nonEmpty
    val o2: OtherAnnex = r.getOrElse(o)
    val postR: MOption[OtherAnnex] = postOtherAnnex(o2)
    if (postR.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return MSome(o2)
    } else {
      return MNone()
    }
  }

  def transformOtherLib(o: OtherLib): MOption[OtherLib] = {
    val preR: PreResult[OtherLib] = preOtherLib(o)
    val r: MOption[OtherLib] = if (preR.continu) {
      val o2: OtherLib = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      if (hasChanged)
        MSome(o2)
      else
        MNone()
    } else if (preR.resultOpt.nonEmpty) {
      MSome(preR.resultOpt.getOrElse(o))
    } else {
      MNone()
    }
    val hasChanged: B = r.nonEmpty
    val o2: OtherLib = r.getOrElse(o)
    val postR: MOption[OtherLib] = postOtherLib(o2)
    if (postR.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return MSome(o2)
    } else {
      return MNone()
    }
  }

  def transformBLESSAnnex(o: BLESSAnnex): MOption[BLESSAnnex] = {
    val preR: PreResult[BLESSAnnex] = preBLESSAnnex(o)
    val r: MOption[BLESSAnnex] = if (preR.continu) {
      val o2: BLESSAnnex = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val rOpt: MOption[BLESSAnnex] = o2 match {
        case o2: BTSBLESSAnnexClause =>
          val r0: MOption[IS[Z, BTSAssertion]] = transformISZ(o2.assertions, transformBTSAssertion _)
          val r1: MOption[Option[BTSAssertion]] = transformOption(o2.invariant, transformBTSAssertion _)
          val r2: MOption[IS[Z, BTSVariableDeclaration]] = transformISZ(o2.variables, transformBTSVariableDeclaration _)
          val r3: MOption[IS[Z, BTSStateDeclaration]] = transformISZ(o2.states, transformBTSStateDeclaration _)
          val r4: MOption[IS[Z, BTSTransition]] = transformISZ(o2.transitions, transformBTSTransition _)
          if (hasChanged || r0.nonEmpty || r1.nonEmpty || r2.nonEmpty || r3.nonEmpty || r4.nonEmpty)
            MSome(o2(assertions = r0.getOrElse(o2.assertions), invariant = r1.getOrElse(o2.invariant), variables = r2.getOrElse(o2.variables), states = r3.getOrElse(o2.states), transitions = r4.getOrElse(o2.transitions)))
          else
            MNone()
      }
      rOpt
    } else if (preR.resultOpt.nonEmpty) {
      MSome(preR.resultOpt.getOrElse(o))
    } else {
      MNone()
    }
    val hasChanged: B = r.nonEmpty
    val o2: BLESSAnnex = r.getOrElse(o)
    val postR: MOption[BLESSAnnex] = postBLESSAnnex(o2)
    if (postR.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return MSome(o2)
    } else {
      return MNone()
    }
  }

  def transformBTSBLESSAnnexClause(o: BTSBLESSAnnexClause): MOption[BTSBLESSAnnexClause] = {
    val preR: PreResult[BTSBLESSAnnexClause] = preBTSBLESSAnnexClause(o)
    val r: MOption[BTSBLESSAnnexClause] = if (preR.continu) {
      val o2: BTSBLESSAnnexClause = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val r0: MOption[IS[Z, BTSAssertion]] = transformISZ(o2.assertions, transformBTSAssertion _)
      val r1: MOption[Option[BTSAssertion]] = transformOption(o2.invariant, transformBTSAssertion _)
      val r2: MOption[IS[Z, BTSVariableDeclaration]] = transformISZ(o2.variables, transformBTSVariableDeclaration _)
      val r3: MOption[IS[Z, BTSStateDeclaration]] = transformISZ(o2.states, transformBTSStateDeclaration _)
      val r4: MOption[IS[Z, BTSTransition]] = transformISZ(o2.transitions, transformBTSTransition _)
      if (hasChanged || r0.nonEmpty || r1.nonEmpty || r2.nonEmpty || r3.nonEmpty || r4.nonEmpty)
        MSome(o2(assertions = r0.getOrElse(o2.assertions), invariant = r1.getOrElse(o2.invariant), variables = r2.getOrElse(o2.variables), states = r3.getOrElse(o2.states), transitions = r4.getOrElse(o2.transitions)))
      else
        MNone()
    } else if (preR.resultOpt.nonEmpty) {
      MSome(preR.resultOpt.getOrElse(o))
    } else {
      MNone()
    }
    val hasChanged: B = r.nonEmpty
    val o2: BTSBLESSAnnexClause = r.getOrElse(o)
    val postR: MOption[BTSBLESSAnnexClause] = postBTSBLESSAnnexClause(o2)
    if (postR.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return MSome(o2)
    } else {
      return MNone()
    }
  }

  def transformBTSVariableDeclaration(o: BTSVariableDeclaration): MOption[BTSVariableDeclaration] = {
    val preR: PreResult[BTSVariableDeclaration] = preBTSVariableDeclaration(o)
    val r: MOption[BTSVariableDeclaration] = if (preR.continu) {
      val o2: BTSVariableDeclaration = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val r0: MOption[Name] = transformName(o2.name)
      val r1: MOption[BTSType] = transformBTSType(o2.varType)
      val r2: MOption[Option[BTSExp]] = transformOption(o2.assignExpression, transformBTSExp _)
      val r3: MOption[Option[BLESSIntConst]] = transformOption(o2.arraySize, transformBLESSIntConst _)
      val r4: MOption[Option[BTSAssertion]] = transformOption(o2.variableAssertion, transformBTSAssertion _)
      if (hasChanged || r0.nonEmpty || r1.nonEmpty || r2.nonEmpty || r3.nonEmpty || r4.nonEmpty)
        MSome(o2(name = r0.getOrElse(o2.name), varType = r1.getOrElse(o2.varType), assignExpression = r2.getOrElse(o2.assignExpression), arraySize = r3.getOrElse(o2.arraySize), variableAssertion = r4.getOrElse(o2.variableAssertion)))
      else
        MNone()
    } else if (preR.resultOpt.nonEmpty) {
      MSome(preR.resultOpt.getOrElse(o))
    } else {
      MNone()
    }
    val hasChanged: B = r.nonEmpty
    val o2: BTSVariableDeclaration = r.getOrElse(o)
    val postR: MOption[BTSVariableDeclaration] = postBTSVariableDeclaration(o2)
    if (postR.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return MSome(o2)
    } else {
      return MNone()
    }
  }

  def transformBTSClassifier(o: BTSClassifier): MOption[BTSClassifier] = {
    val preR: PreResult[BTSClassifier] = preBTSClassifier(o)
    val r: MOption[BTSClassifier] = if (preR.continu) {
      val o2: BTSClassifier = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val r0: MOption[Classifier] = transformClassifier(o2.classifier)
      if (hasChanged || r0.nonEmpty)
        MSome(o2(classifier = r0.getOrElse(o2.classifier)))
      else
        MNone()
    } else if (preR.resultOpt.nonEmpty) {
      MSome(preR.resultOpt.getOrElse(o))
    } else {
      MNone()
    }
    val hasChanged: B = r.nonEmpty
    val o2: BTSClassifier = r.getOrElse(o)
    val postR: MOption[BTSClassifier] = postBTSClassifier(o2)
    if (postR.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return MSome(o2)
    } else {
      return MNone()
    }
  }

  def transformBLESSIntConst(o: BLESSIntConst): MOption[BLESSIntConst] = {
    val preR: PreResult[BLESSIntConst] = preBLESSIntConst(o)
    val r: MOption[BLESSIntConst] = if (preR.continu) {
      val o2: BLESSIntConst = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      if (hasChanged)
        MSome(o2)
      else
        MNone()
    } else if (preR.resultOpt.nonEmpty) {
      MSome(preR.resultOpt.getOrElse(o))
    } else {
      MNone()
    }
    val hasChanged: B = r.nonEmpty
    val o2: BLESSIntConst = r.getOrElse(o)
    val postR: MOption[BLESSIntConst] = postBLESSIntConst(o2)
    if (postR.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return MSome(o2)
    } else {
      return MNone()
    }
  }

  def transformBTSStateDeclaration(o: BTSStateDeclaration): MOption[BTSStateDeclaration] = {
    val preR: PreResult[BTSStateDeclaration] = preBTSStateDeclaration(o)
    val r: MOption[BTSStateDeclaration] = if (preR.continu) {
      val o2: BTSStateDeclaration = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val r0: MOption[Name] = transformName(o2.id)
      val r1: MOption[Option[BTSAssertion]] = transformOption(o2.assertion, transformBTSAssertion _)
      if (hasChanged || r0.nonEmpty || r1.nonEmpty)
        MSome(o2(id = r0.getOrElse(o2.id), assertion = r1.getOrElse(o2.assertion)))
      else
        MNone()
    } else if (preR.resultOpt.nonEmpty) {
      MSome(preR.resultOpt.getOrElse(o))
    } else {
      MNone()
    }
    val hasChanged: B = r.nonEmpty
    val o2: BTSStateDeclaration = r.getOrElse(o)
    val postR: MOption[BTSStateDeclaration] = postBTSStateDeclaration(o2)
    if (postR.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return MSome(o2)
    } else {
      return MNone()
    }
  }

  def transformBTSTransition(o: BTSTransition): MOption[BTSTransition] = {
    val preR: PreResult[BTSTransition] = preBTSTransition(o)
    val r: MOption[BTSTransition] = if (preR.continu) {
      val o2: BTSTransition = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val r0: MOption[BTSTransitionLabel] = transformBTSTransitionLabel(o2.label)
      val r1: MOption[IS[Z, Name]] = transformISZ(o2.sourceStates, transformName _)
      val r2: MOption[Name] = transformName(o2.destState)
      val r3: MOption[Option[BTSTransitionCondition]] = transformOption(o2.transitionCondition, transformBTSTransitionCondition _)
      val r4: MOption[Option[BTSBehaviorActions]] = transformOption(o2.actions, transformBTSBehaviorActions _)
      val r5: MOption[Option[BTSAssertion]] = transformOption(o2.assertion, transformBTSAssertion _)
      if (hasChanged || r0.nonEmpty || r1.nonEmpty || r2.nonEmpty || r3.nonEmpty || r4.nonEmpty || r5.nonEmpty)
        MSome(o2(label = r0.getOrElse(o2.label), sourceStates = r1.getOrElse(o2.sourceStates), destState = r2.getOrElse(o2.destState), transitionCondition = r3.getOrElse(o2.transitionCondition), actions = r4.getOrElse(o2.actions), assertion = r5.getOrElse(o2.assertion)))
      else
        MNone()
    } else if (preR.resultOpt.nonEmpty) {
      MSome(preR.resultOpt.getOrElse(o))
    } else {
      MNone()
    }
    val hasChanged: B = r.nonEmpty
    val o2: BTSTransition = r.getOrElse(o)
    val postR: MOption[BTSTransition] = postBTSTransition(o2)
    if (postR.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return MSome(o2)
    } else {
      return MNone()
    }
  }

  def transformBTSTransitionLabel(o: BTSTransitionLabel): MOption[BTSTransitionLabel] = {
    val preR: PreResult[BTSTransitionLabel] = preBTSTransitionLabel(o)
    val r: MOption[BTSTransitionLabel] = if (preR.continu) {
      val o2: BTSTransitionLabel = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val r0: MOption[Name] = transformName(o2.id)
      if (hasChanged || r0.nonEmpty)
        MSome(o2(id = r0.getOrElse(o2.id)))
      else
        MNone()
    } else if (preR.resultOpt.nonEmpty) {
      MSome(preR.resultOpt.getOrElse(o))
    } else {
      MNone()
    }
    val hasChanged: B = r.nonEmpty
    val o2: BTSTransitionLabel = r.getOrElse(o)
    val postR: MOption[BTSTransitionLabel] = postBTSTransitionLabel(o2)
    if (postR.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return MSome(o2)
    } else {
      return MNone()
    }
  }

  def transformBTSTransitionCondition(o: BTSTransitionCondition): MOption[BTSTransitionCondition] = {
    val preR: PreResult[BTSTransitionCondition] = preBTSTransitionCondition(o)
    val r: MOption[BTSTransitionCondition] = if (preR.continu) {
      val o2: BTSTransitionCondition = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val rOpt: MOption[BTSTransitionCondition] = o2 match {
        case o2: BTSDispatchCondition =>
          val r0: MOption[IS[Z, BTSDispatchConjunction]] = transformISZ(o2.dispatchTriggers, transformBTSDispatchConjunction _)
          val r1: MOption[IS[Z, Name]] = transformISZ(o2.frozenPorts, transformName _)
          if (hasChanged || r0.nonEmpty || r1.nonEmpty)
            MSome(o2(dispatchTriggers = r0.getOrElse(o2.dispatchTriggers), frozenPorts = r1.getOrElse(o2.frozenPorts)))
          else
            MNone()
        case o2: BTSExecuteConditionExp =>
          val r0: MOption[BTSExp] = transformBTSExp(o2.exp)
          if (hasChanged || r0.nonEmpty)
            MSome(o2(exp = r0.getOrElse(o2.exp)))
          else
            MNone()
        case o2: BTSExecuteConditionTimeout =>
          if (hasChanged)
            MSome(o2)
          else
            MNone()
        case o2: BTSExecuteConditionOtherwise =>
          if (hasChanged)
            MSome(o2)
          else
            MNone()
        case o2: BTSModeCondition =>
          val r0: MOption[BTSTriggerLogicalExpression] = transformBTSTriggerLogicalExpression(o2.tla)
          if (hasChanged || r0.nonEmpty)
            MSome(o2(tla = r0.getOrElse(o2.tla)))
          else
            MNone()
        case o2: BTSInternalCondition =>
          val r0: MOption[IS[Z, Name]] = transformISZ(o2.internalports, transformName _)
          if (hasChanged || r0.nonEmpty)
            MSome(o2(internalports = r0.getOrElse(o2.internalports)))
          else
            MNone()
      }
      rOpt
    } else if (preR.resultOpt.nonEmpty) {
      MSome(preR.resultOpt.getOrElse(o))
    } else {
      MNone()
    }
    val hasChanged: B = r.nonEmpty
    val o2: BTSTransitionCondition = r.getOrElse(o)
    val postR: MOption[BTSTransitionCondition] = postBTSTransitionCondition(o2)
    if (postR.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return MSome(o2)
    } else {
      return MNone()
    }
  }

  def transformBTSDispatchCondition(o: BTSDispatchCondition): MOption[BTSDispatchCondition] = {
    val preR: PreResult[BTSDispatchCondition] = preBTSDispatchCondition(o)
    val r: MOption[BTSDispatchCondition] = if (preR.continu) {
      val o2: BTSDispatchCondition = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val r0: MOption[IS[Z, BTSDispatchConjunction]] = transformISZ(o2.dispatchTriggers, transformBTSDispatchConjunction _)
      val r1: MOption[IS[Z, Name]] = transformISZ(o2.frozenPorts, transformName _)
      if (hasChanged || r0.nonEmpty || r1.nonEmpty)
        MSome(o2(dispatchTriggers = r0.getOrElse(o2.dispatchTriggers), frozenPorts = r1.getOrElse(o2.frozenPorts)))
      else
        MNone()
    } else if (preR.resultOpt.nonEmpty) {
      MSome(preR.resultOpt.getOrElse(o))
    } else {
      MNone()
    }
    val hasChanged: B = r.nonEmpty
    val o2: BTSDispatchCondition = r.getOrElse(o)
    val postR: MOption[BTSDispatchCondition] = postBTSDispatchCondition(o2)
    if (postR.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return MSome(o2)
    } else {
      return MNone()
    }
  }

  def transformBTSDispatchConjunction(o: BTSDispatchConjunction): MOption[BTSDispatchConjunction] = {
    val preR: PreResult[BTSDispatchConjunction] = preBTSDispatchConjunction(o)
    val r: MOption[BTSDispatchConjunction] = if (preR.continu) {
      val o2: BTSDispatchConjunction = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val r0: MOption[IS[Z, BTSDispatchTrigger]] = transformISZ(o2.conjunction, transformBTSDispatchTrigger _)
      if (hasChanged || r0.nonEmpty)
        MSome(o2(conjunction = r0.getOrElse(o2.conjunction)))
      else
        MNone()
    } else if (preR.resultOpt.nonEmpty) {
      MSome(preR.resultOpt.getOrElse(o))
    } else {
      MNone()
    }
    val hasChanged: B = r.nonEmpty
    val o2: BTSDispatchConjunction = r.getOrElse(o)
    val postR: MOption[BTSDispatchConjunction] = postBTSDispatchConjunction(o2)
    if (postR.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return MSome(o2)
    } else {
      return MNone()
    }
  }

  def transformBTSDispatchTrigger(o: BTSDispatchTrigger): MOption[BTSDispatchTrigger] = {
    val preR: PreResult[BTSDispatchTrigger] = preBTSDispatchTrigger(o)
    val r: MOption[BTSDispatchTrigger] = if (preR.continu) {
      val o2: BTSDispatchTrigger = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val rOpt: MOption[BTSDispatchTrigger] = o2 match {
        case o2: BTSDispatchTriggerStop =>
          if (hasChanged)
            MSome(o2)
          else
            MNone()
        case o2: BTSDispatchTriggerPort =>
          val r0: MOption[Name] = transformName(o2.port)
          if (hasChanged || r0.nonEmpty)
            MSome(o2(port = r0.getOrElse(o2.port)))
          else
            MNone()
        case o2: BTSDispatchTriggerTimeout =>
          val r0: MOption[IS[Z, Name]] = transformISZ(o2.ports, transformName _)
          val r1: MOption[Option[BTSBehaviorTime]] = transformOption(o2.time, transformBTSBehaviorTime _)
          if (hasChanged || r0.nonEmpty || r1.nonEmpty)
            MSome(o2(ports = r0.getOrElse(o2.ports), time = r1.getOrElse(o2.time)))
          else
            MNone()
      }
      rOpt
    } else if (preR.resultOpt.nonEmpty) {
      MSome(preR.resultOpt.getOrElse(o))
    } else {
      MNone()
    }
    val hasChanged: B = r.nonEmpty
    val o2: BTSDispatchTrigger = r.getOrElse(o)
    val postR: MOption[BTSDispatchTrigger] = postBTSDispatchTrigger(o2)
    if (postR.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return MSome(o2)
    } else {
      return MNone()
    }
  }

  def transformBTSDispatchTriggerStop(o: BTSDispatchTriggerStop): MOption[BTSDispatchTriggerStop] = {
    val preR: PreResult[BTSDispatchTriggerStop] = preBTSDispatchTriggerStop(o)
    val r: MOption[BTSDispatchTriggerStop] = if (preR.continu) {
      val o2: BTSDispatchTriggerStop = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      if (hasChanged)
        MSome(o2)
      else
        MNone()
    } else if (preR.resultOpt.nonEmpty) {
      MSome(preR.resultOpt.getOrElse(o))
    } else {
      MNone()
    }
    val hasChanged: B = r.nonEmpty
    val o2: BTSDispatchTriggerStop = r.getOrElse(o)
    val postR: MOption[BTSDispatchTriggerStop] = postBTSDispatchTriggerStop(o2)
    if (postR.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return MSome(o2)
    } else {
      return MNone()
    }
  }

  def transformBTSDispatchTriggerPort(o: BTSDispatchTriggerPort): MOption[BTSDispatchTriggerPort] = {
    val preR: PreResult[BTSDispatchTriggerPort] = preBTSDispatchTriggerPort(o)
    val r: MOption[BTSDispatchTriggerPort] = if (preR.continu) {
      val o2: BTSDispatchTriggerPort = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val r0: MOption[Name] = transformName(o2.port)
      if (hasChanged || r0.nonEmpty)
        MSome(o2(port = r0.getOrElse(o2.port)))
      else
        MNone()
    } else if (preR.resultOpt.nonEmpty) {
      MSome(preR.resultOpt.getOrElse(o))
    } else {
      MNone()
    }
    val hasChanged: B = r.nonEmpty
    val o2: BTSDispatchTriggerPort = r.getOrElse(o)
    val postR: MOption[BTSDispatchTriggerPort] = postBTSDispatchTriggerPort(o2)
    if (postR.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return MSome(o2)
    } else {
      return MNone()
    }
  }

  def transformBTSDispatchTriggerTimeout(o: BTSDispatchTriggerTimeout): MOption[BTSDispatchTriggerTimeout] = {
    val preR: PreResult[BTSDispatchTriggerTimeout] = preBTSDispatchTriggerTimeout(o)
    val r: MOption[BTSDispatchTriggerTimeout] = if (preR.continu) {
      val o2: BTSDispatchTriggerTimeout = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val r0: MOption[IS[Z, Name]] = transformISZ(o2.ports, transformName _)
      val r1: MOption[Option[BTSBehaviorTime]] = transformOption(o2.time, transformBTSBehaviorTime _)
      if (hasChanged || r0.nonEmpty || r1.nonEmpty)
        MSome(o2(ports = r0.getOrElse(o2.ports), time = r1.getOrElse(o2.time)))
      else
        MNone()
    } else if (preR.resultOpt.nonEmpty) {
      MSome(preR.resultOpt.getOrElse(o))
    } else {
      MNone()
    }
    val hasChanged: B = r.nonEmpty
    val o2: BTSDispatchTriggerTimeout = r.getOrElse(o)
    val postR: MOption[BTSDispatchTriggerTimeout] = postBTSDispatchTriggerTimeout(o2)
    if (postR.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return MSome(o2)
    } else {
      return MNone()
    }
  }

  def transformBTSExecuteCondition(o: BTSExecuteCondition): MOption[BTSExecuteCondition] = {
    val preR: PreResult[BTSExecuteCondition] = preBTSExecuteCondition(o)
    val r: MOption[BTSExecuteCondition] = if (preR.continu) {
      val o2: BTSExecuteCondition = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val rOpt: MOption[BTSExecuteCondition] = o2 match {
        case o2: BTSExecuteConditionExp =>
          val r0: MOption[BTSExp] = transformBTSExp(o2.exp)
          if (hasChanged || r0.nonEmpty)
            MSome(o2(exp = r0.getOrElse(o2.exp)))
          else
            MNone()
        case o2: BTSExecuteConditionTimeout =>
          if (hasChanged)
            MSome(o2)
          else
            MNone()
        case o2: BTSExecuteConditionOtherwise =>
          if (hasChanged)
            MSome(o2)
          else
            MNone()
      }
      rOpt
    } else if (preR.resultOpt.nonEmpty) {
      MSome(preR.resultOpt.getOrElse(o))
    } else {
      MNone()
    }
    val hasChanged: B = r.nonEmpty
    val o2: BTSExecuteCondition = r.getOrElse(o)
    val postR: MOption[BTSExecuteCondition] = postBTSExecuteCondition(o2)
    if (postR.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return MSome(o2)
    } else {
      return MNone()
    }
  }

  def transformBTSExecuteConditionExp(o: BTSExecuteConditionExp): MOption[BTSExecuteConditionExp] = {
    val preR: PreResult[BTSExecuteConditionExp] = preBTSExecuteConditionExp(o)
    val r: MOption[BTSExecuteConditionExp] = if (preR.continu) {
      val o2: BTSExecuteConditionExp = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val r0: MOption[BTSExp] = transformBTSExp(o2.exp)
      if (hasChanged || r0.nonEmpty)
        MSome(o2(exp = r0.getOrElse(o2.exp)))
      else
        MNone()
    } else if (preR.resultOpt.nonEmpty) {
      MSome(preR.resultOpt.getOrElse(o))
    } else {
      MNone()
    }
    val hasChanged: B = r.nonEmpty
    val o2: BTSExecuteConditionExp = r.getOrElse(o)
    val postR: MOption[BTSExecuteConditionExp] = postBTSExecuteConditionExp(o2)
    if (postR.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return MSome(o2)
    } else {
      return MNone()
    }
  }

  def transformBTSExecuteConditionTimeout(o: BTSExecuteConditionTimeout): MOption[BTSExecuteConditionTimeout] = {
    val preR: PreResult[BTSExecuteConditionTimeout] = preBTSExecuteConditionTimeout(o)
    val r: MOption[BTSExecuteConditionTimeout] = if (preR.continu) {
      val o2: BTSExecuteConditionTimeout = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      if (hasChanged)
        MSome(o2)
      else
        MNone()
    } else if (preR.resultOpt.nonEmpty) {
      MSome(preR.resultOpt.getOrElse(o))
    } else {
      MNone()
    }
    val hasChanged: B = r.nonEmpty
    val o2: BTSExecuteConditionTimeout = r.getOrElse(o)
    val postR: MOption[BTSExecuteConditionTimeout] = postBTSExecuteConditionTimeout(o2)
    if (postR.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return MSome(o2)
    } else {
      return MNone()
    }
  }

  def transformBTSExecuteConditionOtherwise(o: BTSExecuteConditionOtherwise): MOption[BTSExecuteConditionOtherwise] = {
    val preR: PreResult[BTSExecuteConditionOtherwise] = preBTSExecuteConditionOtherwise(o)
    val r: MOption[BTSExecuteConditionOtherwise] = if (preR.continu) {
      val o2: BTSExecuteConditionOtherwise = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      if (hasChanged)
        MSome(o2)
      else
        MNone()
    } else if (preR.resultOpt.nonEmpty) {
      MSome(preR.resultOpt.getOrElse(o))
    } else {
      MNone()
    }
    val hasChanged: B = r.nonEmpty
    val o2: BTSExecuteConditionOtherwise = r.getOrElse(o)
    val postR: MOption[BTSExecuteConditionOtherwise] = postBTSExecuteConditionOtherwise(o2)
    if (postR.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return MSome(o2)
    } else {
      return MNone()
    }
  }

  def transformBTSModeCondition(o: BTSModeCondition): MOption[BTSModeCondition] = {
    val preR: PreResult[BTSModeCondition] = preBTSModeCondition(o)
    val r: MOption[BTSModeCondition] = if (preR.continu) {
      val o2: BTSModeCondition = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val r0: MOption[BTSTriggerLogicalExpression] = transformBTSTriggerLogicalExpression(o2.tla)
      if (hasChanged || r0.nonEmpty)
        MSome(o2(tla = r0.getOrElse(o2.tla)))
      else
        MNone()
    } else if (preR.resultOpt.nonEmpty) {
      MSome(preR.resultOpt.getOrElse(o))
    } else {
      MNone()
    }
    val hasChanged: B = r.nonEmpty
    val o2: BTSModeCondition = r.getOrElse(o)
    val postR: MOption[BTSModeCondition] = postBTSModeCondition(o2)
    if (postR.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return MSome(o2)
    } else {
      return MNone()
    }
  }

  def transformBTSTriggerLogicalExpression(o: BTSTriggerLogicalExpression): MOption[BTSTriggerLogicalExpression] = {
    val preR: PreResult[BTSTriggerLogicalExpression] = preBTSTriggerLogicalExpression(o)
    val r: MOption[BTSTriggerLogicalExpression] = if (preR.continu) {
      val o2: BTSTriggerLogicalExpression = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val r0: MOption[IS[Z, BTSEventTrigger]] = transformISZ(o2.triggers, transformBTSEventTrigger _)
      if (hasChanged || r0.nonEmpty)
        MSome(o2(triggers = r0.getOrElse(o2.triggers)))
      else
        MNone()
    } else if (preR.resultOpt.nonEmpty) {
      MSome(preR.resultOpt.getOrElse(o))
    } else {
      MNone()
    }
    val hasChanged: B = r.nonEmpty
    val o2: BTSTriggerLogicalExpression = r.getOrElse(o)
    val postR: MOption[BTSTriggerLogicalExpression] = postBTSTriggerLogicalExpression(o2)
    if (postR.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return MSome(o2)
    } else {
      return MNone()
    }
  }

  def transformBTSEventTrigger(o: BTSEventTrigger): MOption[BTSEventTrigger] = {
    val preR: PreResult[BTSEventTrigger] = preBTSEventTrigger(o)
    val r: MOption[BTSEventTrigger] = if (preR.continu) {
      val o2: BTSEventTrigger = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val rOpt: MOption[BTSEventTrigger] = o2 match {
        case o2: BTSTriggerLogicalExpression =>
          val r0: MOption[IS[Z, BTSEventTrigger]] = transformISZ(o2.triggers, transformBTSEventTrigger _)
          if (hasChanged || r0.nonEmpty)
            MSome(o2(triggers = r0.getOrElse(o2.triggers)))
          else
            MNone()
        case o2: BTSSubcomponentPort =>
          val r0: MOption[IS[Z, Name]] = transformISZ(o2.sub, transformName _)
          val r1: MOption[Name] = transformName(o2.port)
          if (hasChanged || r0.nonEmpty || r1.nonEmpty)
            MSome(o2(sub = r0.getOrElse(o2.sub), port = r1.getOrElse(o2.port)))
          else
            MNone()
      }
      rOpt
    } else if (preR.resultOpt.nonEmpty) {
      MSome(preR.resultOpt.getOrElse(o))
    } else {
      MNone()
    }
    val hasChanged: B = r.nonEmpty
    val o2: BTSEventTrigger = r.getOrElse(o)
    val postR: MOption[BTSEventTrigger] = postBTSEventTrigger(o2)
    if (postR.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return MSome(o2)
    } else {
      return MNone()
    }
  }

  def transformBTSSubcomponentPort(o: BTSSubcomponentPort): MOption[BTSSubcomponentPort] = {
    val preR: PreResult[BTSSubcomponentPort] = preBTSSubcomponentPort(o)
    val r: MOption[BTSSubcomponentPort] = if (preR.continu) {
      val o2: BTSSubcomponentPort = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val r0: MOption[IS[Z, Name]] = transformISZ(o2.sub, transformName _)
      val r1: MOption[Name] = transformName(o2.port)
      if (hasChanged || r0.nonEmpty || r1.nonEmpty)
        MSome(o2(sub = r0.getOrElse(o2.sub), port = r1.getOrElse(o2.port)))
      else
        MNone()
    } else if (preR.resultOpt.nonEmpty) {
      MSome(preR.resultOpt.getOrElse(o))
    } else {
      MNone()
    }
    val hasChanged: B = r.nonEmpty
    val o2: BTSSubcomponentPort = r.getOrElse(o)
    val postR: MOption[BTSSubcomponentPort] = postBTSSubcomponentPort(o2)
    if (postR.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return MSome(o2)
    } else {
      return MNone()
    }
  }

  def transformBTSInternalCondition(o: BTSInternalCondition): MOption[BTSInternalCondition] = {
    val preR: PreResult[BTSInternalCondition] = preBTSInternalCondition(o)
    val r: MOption[BTSInternalCondition] = if (preR.continu) {
      val o2: BTSInternalCondition = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val r0: MOption[IS[Z, Name]] = transformISZ(o2.internalports, transformName _)
      if (hasChanged || r0.nonEmpty)
        MSome(o2(internalports = r0.getOrElse(o2.internalports)))
      else
        MNone()
    } else if (preR.resultOpt.nonEmpty) {
      MSome(preR.resultOpt.getOrElse(o))
    } else {
      MNone()
    }
    val hasChanged: B = r.nonEmpty
    val o2: BTSInternalCondition = r.getOrElse(o)
    val postR: MOption[BTSInternalCondition] = postBTSInternalCondition(o2)
    if (postR.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return MSome(o2)
    } else {
      return MNone()
    }
  }

  def transformBTSAssertion(o: BTSAssertion): MOption[BTSAssertion] = {
    val preR: PreResult[BTSAssertion] = preBTSAssertion(o)
    val r: MOption[BTSAssertion] = if (preR.continu) {
      val o2: BTSAssertion = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val rOpt: MOption[BTSAssertion] = o2 match {
        case o2: BTSNamedAssertion =>
          val r0: MOption[Name] = transformName(o2.label)
          val r1: MOption[IS[Z, BTSVariable]] = transformISZ(o2.formals, transformBTSVariable _)
          val r2: MOption[BTSExp] = transformBTSExp(o2.predicate)
          if (hasChanged || r0.nonEmpty || r1.nonEmpty || r2.nonEmpty)
            MSome(o2(label = r0.getOrElse(o2.label), formals = r1.getOrElse(o2.formals), predicate = r2.getOrElse(o2.predicate)))
          else
            MNone()
        case o2: BTSNamedFunction =>
          val r0: MOption[Name] = transformName(o2.label)
          val r1: MOption[IS[Z, BTSVariable]] = transformISZ(o2.formals, transformBTSVariable _)
          val r2: MOption[BTSType] = transformBTSType(o2.returns)
          val r3: MOption[BTSExp] = transformBTSExp(o2.functionvalue)
          if (hasChanged || r0.nonEmpty || r1.nonEmpty || r2.nonEmpty || r3.nonEmpty)
            MSome(o2(label = r0.getOrElse(o2.label), formals = r1.getOrElse(o2.formals), returns = r2.getOrElse(o2.returns), functionvalue = r3.getOrElse(o2.functionvalue)))
          else
            MNone()
        case o2: BTSNamedEnumeration =>
          val r0: MOption[Name] = transformName(o2.label)
          val r1: MOption[Name] = transformName(o2.assertionvariable)
          val r2: MOption[BTSType] = transformBTSType(o2.enumerationtype)
          val r3: MOption[BTSAssertionEnumeration] = transformBTSAssertionEnumeration(o2.enumeration)
          if (hasChanged || r0.nonEmpty || r1.nonEmpty || r2.nonEmpty || r3.nonEmpty)
            MSome(o2(label = r0.getOrElse(o2.label), assertionvariable = r1.getOrElse(o2.assertionvariable), enumerationtype = r2.getOrElse(o2.enumerationtype), enumeration = r3.getOrElse(o2.enumeration)))
          else
            MNone()
        case o2: BTSNamelessAssertion =>
          val r0: MOption[BTSExp] = transformBTSExp(o2.predicate)
          if (hasChanged || r0.nonEmpty)
            MSome(o2(predicate = r0.getOrElse(o2.predicate)))
          else
            MNone()
        case o2: BTSNamelessFunction =>
          val r0: MOption[BTSType] = transformBTSType(o2.returns)
          val r1: MOption[BTSExp] = transformBTSExp(o2.functionvalue)
          if (hasChanged || r0.nonEmpty || r1.nonEmpty)
            MSome(o2(returns = r0.getOrElse(o2.returns), functionvalue = r1.getOrElse(o2.functionvalue)))
          else
            MNone()
        case o2: BTSNamelessEnumeration =>
          val r0: MOption[BTSInvocation] = transformBTSInvocation(o2.enumeration)
          if (hasChanged || r0.nonEmpty)
            MSome(o2(enumeration = r0.getOrElse(o2.enumeration)))
          else
            MNone()
      }
      rOpt
    } else if (preR.resultOpt.nonEmpty) {
      MSome(preR.resultOpt.getOrElse(o))
    } else {
      MNone()
    }
    val hasChanged: B = r.nonEmpty
    val o2: BTSAssertion = r.getOrElse(o)
    val postR: MOption[BTSAssertion] = postBTSAssertion(o2)
    if (postR.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return MSome(o2)
    } else {
      return MNone()
    }
  }

  def transformBTSNamedAssertion(o: BTSNamedAssertion): MOption[BTSNamedAssertion] = {
    val preR: PreResult[BTSNamedAssertion] = preBTSNamedAssertion(o)
    val r: MOption[BTSNamedAssertion] = if (preR.continu) {
      val o2: BTSNamedAssertion = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val r0: MOption[Name] = transformName(o2.label)
      val r1: MOption[IS[Z, BTSVariable]] = transformISZ(o2.formals, transformBTSVariable _)
      val r2: MOption[BTSExp] = transformBTSExp(o2.predicate)
      if (hasChanged || r0.nonEmpty || r1.nonEmpty || r2.nonEmpty)
        MSome(o2(label = r0.getOrElse(o2.label), formals = r1.getOrElse(o2.formals), predicate = r2.getOrElse(o2.predicate)))
      else
        MNone()
    } else if (preR.resultOpt.nonEmpty) {
      MSome(preR.resultOpt.getOrElse(o))
    } else {
      MNone()
    }
    val hasChanged: B = r.nonEmpty
    val o2: BTSNamedAssertion = r.getOrElse(o)
    val postR: MOption[BTSNamedAssertion] = postBTSNamedAssertion(o2)
    if (postR.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return MSome(o2)
    } else {
      return MNone()
    }
  }

  def transformBTSNamedFunction(o: BTSNamedFunction): MOption[BTSNamedFunction] = {
    val preR: PreResult[BTSNamedFunction] = preBTSNamedFunction(o)
    val r: MOption[BTSNamedFunction] = if (preR.continu) {
      val o2: BTSNamedFunction = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val r0: MOption[Name] = transformName(o2.label)
      val r1: MOption[IS[Z, BTSVariable]] = transformISZ(o2.formals, transformBTSVariable _)
      val r2: MOption[BTSType] = transformBTSType(o2.returns)
      val r3: MOption[BTSExp] = transformBTSExp(o2.functionvalue)
      if (hasChanged || r0.nonEmpty || r1.nonEmpty || r2.nonEmpty || r3.nonEmpty)
        MSome(o2(label = r0.getOrElse(o2.label), formals = r1.getOrElse(o2.formals), returns = r2.getOrElse(o2.returns), functionvalue = r3.getOrElse(o2.functionvalue)))
      else
        MNone()
    } else if (preR.resultOpt.nonEmpty) {
      MSome(preR.resultOpt.getOrElse(o))
    } else {
      MNone()
    }
    val hasChanged: B = r.nonEmpty
    val o2: BTSNamedFunction = r.getOrElse(o)
    val postR: MOption[BTSNamedFunction] = postBTSNamedFunction(o2)
    if (postR.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return MSome(o2)
    } else {
      return MNone()
    }
  }

  def transformBTSNamedEnumeration(o: BTSNamedEnumeration): MOption[BTSNamedEnumeration] = {
    val preR: PreResult[BTSNamedEnumeration] = preBTSNamedEnumeration(o)
    val r: MOption[BTSNamedEnumeration] = if (preR.continu) {
      val o2: BTSNamedEnumeration = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val r0: MOption[Name] = transformName(o2.label)
      val r1: MOption[Name] = transformName(o2.assertionvariable)
      val r2: MOption[BTSType] = transformBTSType(o2.enumerationtype)
      val r3: MOption[BTSAssertionEnumeration] = transformBTSAssertionEnumeration(o2.enumeration)
      if (hasChanged || r0.nonEmpty || r1.nonEmpty || r2.nonEmpty || r3.nonEmpty)
        MSome(o2(label = r0.getOrElse(o2.label), assertionvariable = r1.getOrElse(o2.assertionvariable), enumerationtype = r2.getOrElse(o2.enumerationtype), enumeration = r3.getOrElse(o2.enumeration)))
      else
        MNone()
    } else if (preR.resultOpt.nonEmpty) {
      MSome(preR.resultOpt.getOrElse(o))
    } else {
      MNone()
    }
    val hasChanged: B = r.nonEmpty
    val o2: BTSNamedEnumeration = r.getOrElse(o)
    val postR: MOption[BTSNamedEnumeration] = postBTSNamedEnumeration(o2)
    if (postR.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return MSome(o2)
    } else {
      return MNone()
    }
  }

  def transformBTSNamelessAssertion(o: BTSNamelessAssertion): MOption[BTSNamelessAssertion] = {
    val preR: PreResult[BTSNamelessAssertion] = preBTSNamelessAssertion(o)
    val r: MOption[BTSNamelessAssertion] = if (preR.continu) {
      val o2: BTSNamelessAssertion = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val r0: MOption[BTSExp] = transformBTSExp(o2.predicate)
      if (hasChanged || r0.nonEmpty)
        MSome(o2(predicate = r0.getOrElse(o2.predicate)))
      else
        MNone()
    } else if (preR.resultOpt.nonEmpty) {
      MSome(preR.resultOpt.getOrElse(o))
    } else {
      MNone()
    }
    val hasChanged: B = r.nonEmpty
    val o2: BTSNamelessAssertion = r.getOrElse(o)
    val postR: MOption[BTSNamelessAssertion] = postBTSNamelessAssertion(o2)
    if (postR.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return MSome(o2)
    } else {
      return MNone()
    }
  }

  def transformBTSNamelessFunction(o: BTSNamelessFunction): MOption[BTSNamelessFunction] = {
    val preR: PreResult[BTSNamelessFunction] = preBTSNamelessFunction(o)
    val r: MOption[BTSNamelessFunction] = if (preR.continu) {
      val o2: BTSNamelessFunction = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val r0: MOption[BTSType] = transformBTSType(o2.returns)
      val r1: MOption[BTSExp] = transformBTSExp(o2.functionvalue)
      if (hasChanged || r0.nonEmpty || r1.nonEmpty)
        MSome(o2(returns = r0.getOrElse(o2.returns), functionvalue = r1.getOrElse(o2.functionvalue)))
      else
        MNone()
    } else if (preR.resultOpt.nonEmpty) {
      MSome(preR.resultOpt.getOrElse(o))
    } else {
      MNone()
    }
    val hasChanged: B = r.nonEmpty
    val o2: BTSNamelessFunction = r.getOrElse(o)
    val postR: MOption[BTSNamelessFunction] = postBTSNamelessFunction(o2)
    if (postR.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return MSome(o2)
    } else {
      return MNone()
    }
  }

  def transformBTSNamelessEnumeration(o: BTSNamelessEnumeration): MOption[BTSNamelessEnumeration] = {
    val preR: PreResult[BTSNamelessEnumeration] = preBTSNamelessEnumeration(o)
    val r: MOption[BTSNamelessEnumeration] = if (preR.continu) {
      val o2: BTSNamelessEnumeration = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val r0: MOption[BTSInvocation] = transformBTSInvocation(o2.enumeration)
      if (hasChanged || r0.nonEmpty)
        MSome(o2(enumeration = r0.getOrElse(o2.enumeration)))
      else
        MNone()
    } else if (preR.resultOpt.nonEmpty) {
      MSome(preR.resultOpt.getOrElse(o))
    } else {
      MNone()
    }
    val hasChanged: B = r.nonEmpty
    val o2: BTSNamelessEnumeration = r.getOrElse(o)
    val postR: MOption[BTSNamelessEnumeration] = postBTSNamelessEnumeration(o2)
    if (postR.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return MSome(o2)
    } else {
      return MNone()
    }
  }

  def transformBTSAssertionEnumeration(o: BTSAssertionEnumeration): MOption[BTSAssertionEnumeration] = {
    val preR: PreResult[BTSAssertionEnumeration] = preBTSAssertionEnumeration(o)
    val r: MOption[BTSAssertionEnumeration] = if (preR.continu) {
      val o2: BTSAssertionEnumeration = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val rOpt: MOption[BTSAssertionEnumeration] = o2 match {
        case o2: BTSEnumerationPairs =>
          val r0: MOption[IS[Z, BTSEnumerationPair]] = transformISZ(o2.pairs, transformBTSEnumerationPair _)
          if (hasChanged || r0.nonEmpty)
            MSome(o2(pairs = r0.getOrElse(o2.pairs)))
          else
            MNone()
        case o2: BTSInvocation =>
          val r0: MOption[Name] = transformName(o2.label)
          val r1: MOption[IS[Z, BTSActualParameter]] = transformISZ(o2.params, transformBTSActualParameter _)
          val r2: MOption[Option[BTSExp]] = transformOption(o2.actual, transformBTSExp _)
          if (hasChanged || r0.nonEmpty || r1.nonEmpty || r2.nonEmpty)
            MSome(o2(label = r0.getOrElse(o2.label), params = r1.getOrElse(o2.params), actual = r2.getOrElse(o2.actual)))
          else
            MNone()
      }
      rOpt
    } else if (preR.resultOpt.nonEmpty) {
      MSome(preR.resultOpt.getOrElse(o))
    } else {
      MNone()
    }
    val hasChanged: B = r.nonEmpty
    val o2: BTSAssertionEnumeration = r.getOrElse(o)
    val postR: MOption[BTSAssertionEnumeration] = postBTSAssertionEnumeration(o2)
    if (postR.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return MSome(o2)
    } else {
      return MNone()
    }
  }

  def transformBTSEnumerationPairs(o: BTSEnumerationPairs): MOption[BTSEnumerationPairs] = {
    val preR: PreResult[BTSEnumerationPairs] = preBTSEnumerationPairs(o)
    val r: MOption[BTSEnumerationPairs] = if (preR.continu) {
      val o2: BTSEnumerationPairs = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val r0: MOption[IS[Z, BTSEnumerationPair]] = transformISZ(o2.pairs, transformBTSEnumerationPair _)
      if (hasChanged || r0.nonEmpty)
        MSome(o2(pairs = r0.getOrElse(o2.pairs)))
      else
        MNone()
    } else if (preR.resultOpt.nonEmpty) {
      MSome(preR.resultOpt.getOrElse(o))
    } else {
      MNone()
    }
    val hasChanged: B = r.nonEmpty
    val o2: BTSEnumerationPairs = r.getOrElse(o)
    val postR: MOption[BTSEnumerationPairs] = postBTSEnumerationPairs(o2)
    if (postR.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return MSome(o2)
    } else {
      return MNone()
    }
  }

  def transformBTSEnumerationPair(o: BTSEnumerationPair): MOption[BTSEnumerationPair] = {
    val preR: PreResult[BTSEnumerationPair] = preBTSEnumerationPair(o)
    val r: MOption[BTSEnumerationPair] = if (preR.continu) {
      val o2: BTSEnumerationPair = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val r0: MOption[Name] = transformName(o2.literal)
      val r1: MOption[BTSExp] = transformBTSExp(o2.predicate)
      if (hasChanged || r0.nonEmpty || r1.nonEmpty)
        MSome(o2(literal = r0.getOrElse(o2.literal), predicate = r1.getOrElse(o2.predicate)))
      else
        MNone()
    } else if (preR.resultOpt.nonEmpty) {
      MSome(preR.resultOpt.getOrElse(o))
    } else {
      MNone()
    }
    val hasChanged: B = r.nonEmpty
    val o2: BTSEnumerationPair = r.getOrElse(o)
    val postR: MOption[BTSEnumerationPair] = postBTSEnumerationPair(o2)
    if (postR.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return MSome(o2)
    } else {
      return MNone()
    }
  }

  def transformBTSInvocation(o: BTSInvocation): MOption[BTSInvocation] = {
    val preR: PreResult[BTSInvocation] = preBTSInvocation(o)
    val r: MOption[BTSInvocation] = if (preR.continu) {
      val o2: BTSInvocation = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val r0: MOption[Name] = transformName(o2.label)
      val r1: MOption[IS[Z, BTSActualParameter]] = transformISZ(o2.params, transformBTSActualParameter _)
      val r2: MOption[Option[BTSExp]] = transformOption(o2.actual, transformBTSExp _)
      if (hasChanged || r0.nonEmpty || r1.nonEmpty || r2.nonEmpty)
        MSome(o2(label = r0.getOrElse(o2.label), params = r1.getOrElse(o2.params), actual = r2.getOrElse(o2.actual)))
      else
        MNone()
    } else if (preR.resultOpt.nonEmpty) {
      MSome(preR.resultOpt.getOrElse(o))
    } else {
      MNone()
    }
    val hasChanged: B = r.nonEmpty
    val o2: BTSInvocation = r.getOrElse(o)
    val postR: MOption[BTSInvocation] = postBTSInvocation(o2)
    if (postR.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return MSome(o2)
    } else {
      return MNone()
    }
  }

  def transformBTSActualParameter(o: BTSActualParameter): MOption[BTSActualParameter] = {
    val preR: PreResult[BTSActualParameter] = preBTSActualParameter(o)
    val r: MOption[BTSActualParameter] = if (preR.continu) {
      val o2: BTSActualParameter = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val r0: MOption[Name] = transformName(o2.formal)
      val r1: MOption[BTSExp] = transformBTSExp(o2.actual)
      if (hasChanged || r0.nonEmpty || r1.nonEmpty)
        MSome(o2(formal = r0.getOrElse(o2.formal), actual = r1.getOrElse(o2.actual)))
      else
        MNone()
    } else if (preR.resultOpt.nonEmpty) {
      MSome(preR.resultOpt.getOrElse(o))
    } else {
      MNone()
    }
    val hasChanged: B = r.nonEmpty
    val o2: BTSActualParameter = r.getOrElse(o)
    val postR: MOption[BTSActualParameter] = postBTSActualParameter(o2)
    if (postR.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return MSome(o2)
    } else {
      return MNone()
    }
  }

  def transformBTSVariable(o: BTSVariable): MOption[BTSVariable] = {
    val preR: PreResult[BTSVariable] = preBTSVariable(o)
    val r: MOption[BTSVariable] = if (preR.continu) {
      val o2: BTSVariable = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val r0: MOption[Name] = transformName(o2.name)
      val r1: MOption[BTSType] = transformBTSType(o2.typ)
      if (hasChanged || r0.nonEmpty || r1.nonEmpty)
        MSome(o2(name = r0.getOrElse(o2.name), typ = r1.getOrElse(o2.typ)))
      else
        MNone()
    } else if (preR.resultOpt.nonEmpty) {
      MSome(preR.resultOpt.getOrElse(o))
    } else {
      MNone()
    }
    val hasChanged: B = r.nonEmpty
    val o2: BTSVariable = r.getOrElse(o)
    val postR: MOption[BTSVariable] = postBTSVariable(o2)
    if (postR.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return MSome(o2)
    } else {
      return MNone()
    }
  }

  def transformBTSBehaviorActions(o: BTSBehaviorActions): MOption[BTSBehaviorActions] = {
    val preR: PreResult[BTSBehaviorActions] = preBTSBehaviorActions(o)
    val r: MOption[BTSBehaviorActions] = if (preR.continu) {
      val o2: BTSBehaviorActions = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val r0: MOption[IS[Z, BTSAssertedAction]] = transformISZ(o2.actions, transformBTSAssertedAction _)
      if (hasChanged || r0.nonEmpty)
        MSome(o2(actions = r0.getOrElse(o2.actions)))
      else
        MNone()
    } else if (preR.resultOpt.nonEmpty) {
      MSome(preR.resultOpt.getOrElse(o))
    } else {
      MNone()
    }
    val hasChanged: B = r.nonEmpty
    val o2: BTSBehaviorActions = r.getOrElse(o)
    val postR: MOption[BTSBehaviorActions] = postBTSBehaviorActions(o2)
    if (postR.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return MSome(o2)
    } else {
      return MNone()
    }
  }

  def transformBTSAssertedAction(o: BTSAssertedAction): MOption[BTSAssertedAction] = {
    val preR: PreResult[BTSAssertedAction] = preBTSAssertedAction(o)
    val r: MOption[BTSAssertedAction] = if (preR.continu) {
      val o2: BTSAssertedAction = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val r0: MOption[Option[BTSAssertion]] = transformOption(o2.precondition, transformBTSAssertion _)
      val r1: MOption[BTSAction] = transformBTSAction(o2.action)
      val r2: MOption[Option[BTSAssertion]] = transformOption(o2.postcondition, transformBTSAssertion _)
      if (hasChanged || r0.nonEmpty || r1.nonEmpty || r2.nonEmpty)
        MSome(o2(precondition = r0.getOrElse(o2.precondition), action = r1.getOrElse(o2.action), postcondition = r2.getOrElse(o2.postcondition)))
      else
        MNone()
    } else if (preR.resultOpt.nonEmpty) {
      MSome(preR.resultOpt.getOrElse(o))
    } else {
      MNone()
    }
    val hasChanged: B = r.nonEmpty
    val o2: BTSAssertedAction = r.getOrElse(o)
    val postR: MOption[BTSAssertedAction] = postBTSAssertedAction(o2)
    if (postR.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return MSome(o2)
    } else {
      return MNone()
    }
  }

  def transformBTSAction(o: BTSAction): MOption[BTSAction] = {
    val preR: PreResult[BTSAction] = preBTSAction(o)
    val r: MOption[BTSAction] = if (preR.continu) {
      val o2: BTSAction = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val rOpt: MOption[BTSAction] = o2 match {
        case o2: BTSSkipAction =>
          if (hasChanged)
            MSome(o2)
          else
            MNone()
        case o2: BTSAssignmentAction =>
          val r0: MOption[BTSValueName] = transformBTSValueName(o2.lhs)
          val r1: MOption[BTSExp] = transformBTSExp(o2.rhs)
          if (hasChanged || r0.nonEmpty || r1.nonEmpty)
            MSome(o2(lhs = r0.getOrElse(o2.lhs), rhs = r1.getOrElse(o2.rhs)))
          else
            MNone()
        case o2: BTSSetMode =>
          val r0: MOption[Name] = transformName(o2.mode)
          if (hasChanged || r0.nonEmpty)
            MSome(o2(mode = r0.getOrElse(o2.mode)))
          else
            MNone()
        case o2: BTSWhenThrow =>
          val r0: MOption[BTSExp] = transformBTSExp(o2.exp)
          val r1: MOption[Name] = transformName(o2.exception)
          if (hasChanged || r0.nonEmpty || r1.nonEmpty)
            MSome(o2(exp = r0.getOrElse(o2.exp), exception = r1.getOrElse(o2.exception)))
          else
            MNone()
        case o2: BTSFetchAdd =>
          val r0: MOption[Name] = transformName(o2.target)
          val r1: MOption[BTSExp] = transformBTSExp(o2.arithmetic)
          val r2: MOption[Name] = transformName(o2.result)
          if (hasChanged || r0.nonEmpty || r1.nonEmpty || r2.nonEmpty)
            MSome(o2(target = r0.getOrElse(o2.target), arithmetic = r1.getOrElse(o2.arithmetic), result = r2.getOrElse(o2.result)))
          else
            MNone()
        case o2: BTSFetchOr =>
          val r0: MOption[Name] = transformName(o2.target)
          val r1: MOption[BTSExp] = transformBTSExp(o2.bool)
          val r2: MOption[Option[Name]] = transformOption(o2.result, transformName _)
          if (hasChanged || r0.nonEmpty || r1.nonEmpty || r2.nonEmpty)
            MSome(o2(target = r0.getOrElse(o2.target), bool = r1.getOrElse(o2.bool), result = r2.getOrElse(o2.result)))
          else
            MNone()
        case o2: BTSFetchAnd =>
          val r0: MOption[Name] = transformName(o2.target)
          val r1: MOption[BTSExp] = transformBTSExp(o2.bool)
          val r2: MOption[Option[Name]] = transformOption(o2.result, transformName _)
          if (hasChanged || r0.nonEmpty || r1.nonEmpty || r2.nonEmpty)
            MSome(o2(target = r0.getOrElse(o2.target), bool = r1.getOrElse(o2.bool), result = r2.getOrElse(o2.result)))
          else
            MNone()
        case o2: BTSFetchXor =>
          val r0: MOption[Name] = transformName(o2.target)
          val r1: MOption[BTSExp] = transformBTSExp(o2.bool)
          val r2: MOption[Option[Name]] = transformOption(o2.result, transformName _)
          if (hasChanged || r0.nonEmpty || r1.nonEmpty || r2.nonEmpty)
            MSome(o2(target = r0.getOrElse(o2.target), bool = r1.getOrElse(o2.bool), result = r2.getOrElse(o2.result)))
          else
            MNone()
        case o2: BTSSwap =>
          val r0: MOption[Name] = transformName(o2.target)
          val r1: MOption[Name] = transformName(o2.reference)
          val r2: MOption[Name] = transformName(o2.result)
          if (hasChanged || r0.nonEmpty || r1.nonEmpty || r2.nonEmpty)
            MSome(o2(target = r0.getOrElse(o2.target), reference = r1.getOrElse(o2.reference), result = r2.getOrElse(o2.result)))
          else
            MNone()
        case o2: BTSSubprogramCallAction =>
          val r0: MOption[Name] = transformName(o2.name)
          val r1: MOption[IS[Z, BTSFormalActual]] = transformISZ(o2.params, transformBTSFormalActual _)
          if (hasChanged || r0.nonEmpty || r1.nonEmpty)
            MSome(o2(name = r0.getOrElse(o2.name), params = r1.getOrElse(o2.params)))
          else
            MNone()
        case o2: BTSPortOutput =>
          val r0: MOption[Name] = transformName(o2.port)
          val r1: MOption[Option[BTSExp]] = transformOption(o2.exp, transformBTSExp _)
          if (hasChanged || r0.nonEmpty || r1.nonEmpty)
            MSome(o2(port = r0.getOrElse(o2.port), exp = r1.getOrElse(o2.exp)))
          else
            MNone()
        case o2: BTSPortInput =>
          val r0: MOption[Name] = transformName(o2.port)
          val r1: MOption[BTSValueName] = transformBTSValueName(o2.variable)
          if (hasChanged || r0.nonEmpty || r1.nonEmpty)
            MSome(o2(port = r0.getOrElse(o2.port), variable = r1.getOrElse(o2.variable)))
          else
            MNone()
        case o2: BTSFrozenPortAction =>
          val r0: MOption[IS[Z, Name]] = transformISZ(o2.ports, transformName _)
          if (hasChanged || r0.nonEmpty)
            MSome(o2(ports = r0.getOrElse(o2.ports)))
          else
            MNone()
        case o2: BTSPause =>
          if (hasChanged)
            MSome(o2)
          else
            MNone()
        case o2: BTSIfBLESSAction =>
          val r0: MOption[Option[TODO]] = transformOption(o2.availability, transformTODO _)
          val r1: MOption[IS[Z, BTSGuardedAction]] = transformISZ(o2.alternatives, transformBTSGuardedAction _)
          if (hasChanged || r0.nonEmpty || r1.nonEmpty)
            MSome(o2(availability = r0.getOrElse(o2.availability), alternatives = r1.getOrElse(o2.alternatives)))
          else
            MNone()
        case o2: BTSIfBAAction =>
          val r0: MOption[BTSConditionalActions] = transformBTSConditionalActions(o2.ifBranch)
          val r1: MOption[IS[Z, BTSConditionalActions]] = transformISZ(o2.elseIfBranches, transformBTSConditionalActions _)
          val r2: MOption[Option[BTSBehaviorActions]] = transformOption(o2.elseBranch, transformBTSBehaviorActions _)
          if (hasChanged || r0.nonEmpty || r1.nonEmpty || r2.nonEmpty)
            MSome(o2(ifBranch = r0.getOrElse(o2.ifBranch), elseIfBranches = r1.getOrElse(o2.elseIfBranches), elseBranch = r2.getOrElse(o2.elseBranch)))
          else
            MNone()
        case o2: BTSWhileLoop =>
          val r0: MOption[BTSExp] = transformBTSExp(o2.test)
          val r1: MOption[Option[BTSNamelessAssertion]] = transformOption(o2.invariant, transformBTSNamelessAssertion _)
          val r2: MOption[Option[BTSExp]] = transformOption(o2.bound, transformBTSExp _)
          val r3: MOption[BTSExistentialLatticeQuantification] = transformBTSExistentialLatticeQuantification(o2.elq)
          if (hasChanged || r0.nonEmpty || r1.nonEmpty || r2.nonEmpty || r3.nonEmpty)
            MSome(o2(test = r0.getOrElse(o2.test), invariant = r1.getOrElse(o2.invariant), bound = r2.getOrElse(o2.bound), elq = r3.getOrElse(o2.elq)))
          else
            MNone()
        case o2: BTSForLoop =>
          val r0: MOption[Name] = transformName(o2.count)
          val r1: MOption[BTSExp] = transformBTSExp(o2.lowerbound)
          val r2: MOption[BTSExp] = transformBTSExp(o2.upperbound)
          val r3: MOption[Option[BTSNamelessAssertion]] = transformOption(o2.invariant, transformBTSNamelessAssertion _)
          val r4: MOption[BTSBehaviorActions] = transformBTSBehaviorActions(o2.actions)
          if (hasChanged || r0.nonEmpty || r1.nonEmpty || r2.nonEmpty || r3.nonEmpty || r4.nonEmpty)
            MSome(o2(count = r0.getOrElse(o2.count), lowerbound = r1.getOrElse(o2.lowerbound), upperbound = r2.getOrElse(o2.upperbound), invariant = r3.getOrElse(o2.invariant), actions = r4.getOrElse(o2.actions)))
          else
            MNone()
        case o2: BTSDoUntilLoop =>
          val r0: MOption[Option[BTSNamelessAssertion]] = transformOption(o2.invariant, transformBTSNamelessAssertion _)
          val r1: MOption[Option[BTSExp]] = transformOption(o2.bound, transformBTSExp _)
          val r2: MOption[BTSBehaviorActions] = transformBTSBehaviorActions(o2.actions)
          val r3: MOption[BTSExp] = transformBTSExp(o2.guard)
          if (hasChanged || r0.nonEmpty || r1.nonEmpty || r2.nonEmpty || r3.nonEmpty)
            MSome(o2(invariant = r0.getOrElse(o2.invariant), bound = r1.getOrElse(o2.bound), actions = r2.getOrElse(o2.actions), guard = r3.getOrElse(o2.guard)))
          else
            MNone()
        case o2: BTSExistentialLatticeQuantification =>
          val r0: MOption[IS[Z, BTSVariableDeclaration]] = transformISZ(o2.quantifiedVariables, transformBTSVariableDeclaration _)
          val r1: MOption[BTSBehaviorActions] = transformBTSBehaviorActions(o2.actions)
          val r2: MOption[Option[BTSBehaviorTime]] = transformOption(o2.timeout, transformBTSBehaviorTime _)
          val r3: MOption[IS[Z, BTSCatchClauseTerm]] = transformISZ(o2.catchClause, transformBTSCatchClauseTerm _)
          if (hasChanged || r0.nonEmpty || r1.nonEmpty || r2.nonEmpty || r3.nonEmpty)
            MSome(o2(quantifiedVariables = r0.getOrElse(o2.quantifiedVariables), actions = r1.getOrElse(o2.actions), timeout = r2.getOrElse(o2.timeout), catchClause = r3.getOrElse(o2.catchClause)))
          else
            MNone()
        case o2: BTSUniversalLatticeQuantification =>
          val r0: MOption[IS[Z, Name]] = transformISZ(o2.latticeVariables, transformName _)
          val r1: MOption[BTSExp] = transformBTSExp(o2.lowerbound)
          val r2: MOption[BTSExp] = transformBTSExp(o2.upperbound)
          val r3: MOption[BTSExistentialLatticeQuantification] = transformBTSExistentialLatticeQuantification(o2.elq)
          if (hasChanged || r0.nonEmpty || r1.nonEmpty || r2.nonEmpty || r3.nonEmpty)
            MSome(o2(latticeVariables = r0.getOrElse(o2.latticeVariables), lowerbound = r1.getOrElse(o2.lowerbound), upperbound = r2.getOrElse(o2.upperbound), elq = r3.getOrElse(o2.elq)))
          else
            MNone()
      }
      rOpt
    } else if (preR.resultOpt.nonEmpty) {
      MSome(preR.resultOpt.getOrElse(o))
    } else {
      MNone()
    }
    val hasChanged: B = r.nonEmpty
    val o2: BTSAction = r.getOrElse(o)
    val postR: MOption[BTSAction] = postBTSAction(o2)
    if (postR.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return MSome(o2)
    } else {
      return MNone()
    }
  }

  def transformBTSBasicAction(o: BTSBasicAction): MOption[BTSBasicAction] = {
    val preR: PreResult[BTSBasicAction] = preBTSBasicAction(o)
    val r: MOption[BTSBasicAction] = if (preR.continu) {
      val o2: BTSBasicAction = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val rOpt: MOption[BTSBasicAction] = o2 match {
        case o2: BTSSkipAction =>
          if (hasChanged)
            MSome(o2)
          else
            MNone()
        case o2: BTSAssignmentAction =>
          val r0: MOption[BTSValueName] = transformBTSValueName(o2.lhs)
          val r1: MOption[BTSExp] = transformBTSExp(o2.rhs)
          if (hasChanged || r0.nonEmpty || r1.nonEmpty)
            MSome(o2(lhs = r0.getOrElse(o2.lhs), rhs = r1.getOrElse(o2.rhs)))
          else
            MNone()
        case o2: BTSSetMode =>
          val r0: MOption[Name] = transformName(o2.mode)
          if (hasChanged || r0.nonEmpty)
            MSome(o2(mode = r0.getOrElse(o2.mode)))
          else
            MNone()
        case o2: BTSWhenThrow =>
          val r0: MOption[BTSExp] = transformBTSExp(o2.exp)
          val r1: MOption[Name] = transformName(o2.exception)
          if (hasChanged || r0.nonEmpty || r1.nonEmpty)
            MSome(o2(exp = r0.getOrElse(o2.exp), exception = r1.getOrElse(o2.exception)))
          else
            MNone()
        case o2: BTSFetchAdd =>
          val r0: MOption[Name] = transformName(o2.target)
          val r1: MOption[BTSExp] = transformBTSExp(o2.arithmetic)
          val r2: MOption[Name] = transformName(o2.result)
          if (hasChanged || r0.nonEmpty || r1.nonEmpty || r2.nonEmpty)
            MSome(o2(target = r0.getOrElse(o2.target), arithmetic = r1.getOrElse(o2.arithmetic), result = r2.getOrElse(o2.result)))
          else
            MNone()
        case o2: BTSFetchOr =>
          val r0: MOption[Name] = transformName(o2.target)
          val r1: MOption[BTSExp] = transformBTSExp(o2.bool)
          val r2: MOption[Option[Name]] = transformOption(o2.result, transformName _)
          if (hasChanged || r0.nonEmpty || r1.nonEmpty || r2.nonEmpty)
            MSome(o2(target = r0.getOrElse(o2.target), bool = r1.getOrElse(o2.bool), result = r2.getOrElse(o2.result)))
          else
            MNone()
        case o2: BTSFetchAnd =>
          val r0: MOption[Name] = transformName(o2.target)
          val r1: MOption[BTSExp] = transformBTSExp(o2.bool)
          val r2: MOption[Option[Name]] = transformOption(o2.result, transformName _)
          if (hasChanged || r0.nonEmpty || r1.nonEmpty || r2.nonEmpty)
            MSome(o2(target = r0.getOrElse(o2.target), bool = r1.getOrElse(o2.bool), result = r2.getOrElse(o2.result)))
          else
            MNone()
        case o2: BTSFetchXor =>
          val r0: MOption[Name] = transformName(o2.target)
          val r1: MOption[BTSExp] = transformBTSExp(o2.bool)
          val r2: MOption[Option[Name]] = transformOption(o2.result, transformName _)
          if (hasChanged || r0.nonEmpty || r1.nonEmpty || r2.nonEmpty)
            MSome(o2(target = r0.getOrElse(o2.target), bool = r1.getOrElse(o2.bool), result = r2.getOrElse(o2.result)))
          else
            MNone()
        case o2: BTSSwap =>
          val r0: MOption[Name] = transformName(o2.target)
          val r1: MOption[Name] = transformName(o2.reference)
          val r2: MOption[Name] = transformName(o2.result)
          if (hasChanged || r0.nonEmpty || r1.nonEmpty || r2.nonEmpty)
            MSome(o2(target = r0.getOrElse(o2.target), reference = r1.getOrElse(o2.reference), result = r2.getOrElse(o2.result)))
          else
            MNone()
        case o2: BTSSubprogramCallAction =>
          val r0: MOption[Name] = transformName(o2.name)
          val r1: MOption[IS[Z, BTSFormalActual]] = transformISZ(o2.params, transformBTSFormalActual _)
          if (hasChanged || r0.nonEmpty || r1.nonEmpty)
            MSome(o2(name = r0.getOrElse(o2.name), params = r1.getOrElse(o2.params)))
          else
            MNone()
        case o2: BTSPortOutput =>
          val r0: MOption[Name] = transformName(o2.port)
          val r1: MOption[Option[BTSExp]] = transformOption(o2.exp, transformBTSExp _)
          if (hasChanged || r0.nonEmpty || r1.nonEmpty)
            MSome(o2(port = r0.getOrElse(o2.port), exp = r1.getOrElse(o2.exp)))
          else
            MNone()
        case o2: BTSPortInput =>
          val r0: MOption[Name] = transformName(o2.port)
          val r1: MOption[BTSValueName] = transformBTSValueName(o2.variable)
          if (hasChanged || r0.nonEmpty || r1.nonEmpty)
            MSome(o2(port = r0.getOrElse(o2.port), variable = r1.getOrElse(o2.variable)))
          else
            MNone()
        case o2: BTSFrozenPortAction =>
          val r0: MOption[IS[Z, Name]] = transformISZ(o2.ports, transformName _)
          if (hasChanged || r0.nonEmpty)
            MSome(o2(ports = r0.getOrElse(o2.ports)))
          else
            MNone()
        case o2: BTSPause =>
          if (hasChanged)
            MSome(o2)
          else
            MNone()
      }
      rOpt
    } else if (preR.resultOpt.nonEmpty) {
      MSome(preR.resultOpt.getOrElse(o))
    } else {
      MNone()
    }
    val hasChanged: B = r.nonEmpty
    val o2: BTSBasicAction = r.getOrElse(o)
    val postR: MOption[BTSBasicAction] = postBTSBasicAction(o2)
    if (postR.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return MSome(o2)
    } else {
      return MNone()
    }
  }

  def transformBTSSkipAction(o: BTSSkipAction): MOption[BTSSkipAction] = {
    val preR: PreResult[BTSSkipAction] = preBTSSkipAction(o)
    val r: MOption[BTSSkipAction] = if (preR.continu) {
      val o2: BTSSkipAction = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      if (hasChanged)
        MSome(o2)
      else
        MNone()
    } else if (preR.resultOpt.nonEmpty) {
      MSome(preR.resultOpt.getOrElse(o))
    } else {
      MNone()
    }
    val hasChanged: B = r.nonEmpty
    val o2: BTSSkipAction = r.getOrElse(o)
    val postR: MOption[BTSSkipAction] = postBTSSkipAction(o2)
    if (postR.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return MSome(o2)
    } else {
      return MNone()
    }
  }

  def transformBTSAssignmentAction(o: BTSAssignmentAction): MOption[BTSAssignmentAction] = {
    val preR: PreResult[BTSAssignmentAction] = preBTSAssignmentAction(o)
    val r: MOption[BTSAssignmentAction] = if (preR.continu) {
      val o2: BTSAssignmentAction = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val r0: MOption[BTSValueName] = transformBTSValueName(o2.lhs)
      val r1: MOption[BTSExp] = transformBTSExp(o2.rhs)
      if (hasChanged || r0.nonEmpty || r1.nonEmpty)
        MSome(o2(lhs = r0.getOrElse(o2.lhs), rhs = r1.getOrElse(o2.rhs)))
      else
        MNone()
    } else if (preR.resultOpt.nonEmpty) {
      MSome(preR.resultOpt.getOrElse(o))
    } else {
      MNone()
    }
    val hasChanged: B = r.nonEmpty
    val o2: BTSAssignmentAction = r.getOrElse(o)
    val postR: MOption[BTSAssignmentAction] = postBTSAssignmentAction(o2)
    if (postR.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return MSome(o2)
    } else {
      return MNone()
    }
  }

  def transformBTSSetMode(o: BTSSetMode): MOption[BTSSetMode] = {
    val preR: PreResult[BTSSetMode] = preBTSSetMode(o)
    val r: MOption[BTSSetMode] = if (preR.continu) {
      val o2: BTSSetMode = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val r0: MOption[Name] = transformName(o2.mode)
      if (hasChanged || r0.nonEmpty)
        MSome(o2(mode = r0.getOrElse(o2.mode)))
      else
        MNone()
    } else if (preR.resultOpt.nonEmpty) {
      MSome(preR.resultOpt.getOrElse(o))
    } else {
      MNone()
    }
    val hasChanged: B = r.nonEmpty
    val o2: BTSSetMode = r.getOrElse(o)
    val postR: MOption[BTSSetMode] = postBTSSetMode(o2)
    if (postR.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return MSome(o2)
    } else {
      return MNone()
    }
  }

  def transformBTSWhenThrow(o: BTSWhenThrow): MOption[BTSWhenThrow] = {
    val preR: PreResult[BTSWhenThrow] = preBTSWhenThrow(o)
    val r: MOption[BTSWhenThrow] = if (preR.continu) {
      val o2: BTSWhenThrow = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val r0: MOption[BTSExp] = transformBTSExp(o2.exp)
      val r1: MOption[Name] = transformName(o2.exception)
      if (hasChanged || r0.nonEmpty || r1.nonEmpty)
        MSome(o2(exp = r0.getOrElse(o2.exp), exception = r1.getOrElse(o2.exception)))
      else
        MNone()
    } else if (preR.resultOpt.nonEmpty) {
      MSome(preR.resultOpt.getOrElse(o))
    } else {
      MNone()
    }
    val hasChanged: B = r.nonEmpty
    val o2: BTSWhenThrow = r.getOrElse(o)
    val postR: MOption[BTSWhenThrow] = postBTSWhenThrow(o2)
    if (postR.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return MSome(o2)
    } else {
      return MNone()
    }
  }

  def transformBTSCombinableOperation(o: BTSCombinableOperation): MOption[BTSCombinableOperation] = {
    val preR: PreResult[BTSCombinableOperation] = preBTSCombinableOperation(o)
    val r: MOption[BTSCombinableOperation] = if (preR.continu) {
      val o2: BTSCombinableOperation = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val rOpt: MOption[BTSCombinableOperation] = o2 match {
        case o2: BTSFetchAdd =>
          val r0: MOption[Name] = transformName(o2.target)
          val r1: MOption[BTSExp] = transformBTSExp(o2.arithmetic)
          val r2: MOption[Name] = transformName(o2.result)
          if (hasChanged || r0.nonEmpty || r1.nonEmpty || r2.nonEmpty)
            MSome(o2(target = r0.getOrElse(o2.target), arithmetic = r1.getOrElse(o2.arithmetic), result = r2.getOrElse(o2.result)))
          else
            MNone()
        case o2: BTSFetchOr =>
          val r0: MOption[Name] = transformName(o2.target)
          val r1: MOption[BTSExp] = transformBTSExp(o2.bool)
          val r2: MOption[Option[Name]] = transformOption(o2.result, transformName _)
          if (hasChanged || r0.nonEmpty || r1.nonEmpty || r2.nonEmpty)
            MSome(o2(target = r0.getOrElse(o2.target), bool = r1.getOrElse(o2.bool), result = r2.getOrElse(o2.result)))
          else
            MNone()
        case o2: BTSFetchAnd =>
          val r0: MOption[Name] = transformName(o2.target)
          val r1: MOption[BTSExp] = transformBTSExp(o2.bool)
          val r2: MOption[Option[Name]] = transformOption(o2.result, transformName _)
          if (hasChanged || r0.nonEmpty || r1.nonEmpty || r2.nonEmpty)
            MSome(o2(target = r0.getOrElse(o2.target), bool = r1.getOrElse(o2.bool), result = r2.getOrElse(o2.result)))
          else
            MNone()
        case o2: BTSFetchXor =>
          val r0: MOption[Name] = transformName(o2.target)
          val r1: MOption[BTSExp] = transformBTSExp(o2.bool)
          val r2: MOption[Option[Name]] = transformOption(o2.result, transformName _)
          if (hasChanged || r0.nonEmpty || r1.nonEmpty || r2.nonEmpty)
            MSome(o2(target = r0.getOrElse(o2.target), bool = r1.getOrElse(o2.bool), result = r2.getOrElse(o2.result)))
          else
            MNone()
        case o2: BTSSwap =>
          val r0: MOption[Name] = transformName(o2.target)
          val r1: MOption[Name] = transformName(o2.reference)
          val r2: MOption[Name] = transformName(o2.result)
          if (hasChanged || r0.nonEmpty || r1.nonEmpty || r2.nonEmpty)
            MSome(o2(target = r0.getOrElse(o2.target), reference = r1.getOrElse(o2.reference), result = r2.getOrElse(o2.result)))
          else
            MNone()
      }
      rOpt
    } else if (preR.resultOpt.nonEmpty) {
      MSome(preR.resultOpt.getOrElse(o))
    } else {
      MNone()
    }
    val hasChanged: B = r.nonEmpty
    val o2: BTSCombinableOperation = r.getOrElse(o)
    val postR: MOption[BTSCombinableOperation] = postBTSCombinableOperation(o2)
    if (postR.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return MSome(o2)
    } else {
      return MNone()
    }
  }

  def transformBTSFetchAdd(o: BTSFetchAdd): MOption[BTSFetchAdd] = {
    val preR: PreResult[BTSFetchAdd] = preBTSFetchAdd(o)
    val r: MOption[BTSFetchAdd] = if (preR.continu) {
      val o2: BTSFetchAdd = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val r0: MOption[Name] = transformName(o2.target)
      val r1: MOption[BTSExp] = transformBTSExp(o2.arithmetic)
      val r2: MOption[Name] = transformName(o2.result)
      if (hasChanged || r0.nonEmpty || r1.nonEmpty || r2.nonEmpty)
        MSome(o2(target = r0.getOrElse(o2.target), arithmetic = r1.getOrElse(o2.arithmetic), result = r2.getOrElse(o2.result)))
      else
        MNone()
    } else if (preR.resultOpt.nonEmpty) {
      MSome(preR.resultOpt.getOrElse(o))
    } else {
      MNone()
    }
    val hasChanged: B = r.nonEmpty
    val o2: BTSFetchAdd = r.getOrElse(o)
    val postR: MOption[BTSFetchAdd] = postBTSFetchAdd(o2)
    if (postR.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return MSome(o2)
    } else {
      return MNone()
    }
  }

  def transformBTSFetchOr(o: BTSFetchOr): MOption[BTSFetchOr] = {
    val preR: PreResult[BTSFetchOr] = preBTSFetchOr(o)
    val r: MOption[BTSFetchOr] = if (preR.continu) {
      val o2: BTSFetchOr = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val r0: MOption[Name] = transformName(o2.target)
      val r1: MOption[BTSExp] = transformBTSExp(o2.bool)
      val r2: MOption[Option[Name]] = transformOption(o2.result, transformName _)
      if (hasChanged || r0.nonEmpty || r1.nonEmpty || r2.nonEmpty)
        MSome(o2(target = r0.getOrElse(o2.target), bool = r1.getOrElse(o2.bool), result = r2.getOrElse(o2.result)))
      else
        MNone()
    } else if (preR.resultOpt.nonEmpty) {
      MSome(preR.resultOpt.getOrElse(o))
    } else {
      MNone()
    }
    val hasChanged: B = r.nonEmpty
    val o2: BTSFetchOr = r.getOrElse(o)
    val postR: MOption[BTSFetchOr] = postBTSFetchOr(o2)
    if (postR.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return MSome(o2)
    } else {
      return MNone()
    }
  }

  def transformBTSFetchAnd(o: BTSFetchAnd): MOption[BTSFetchAnd] = {
    val preR: PreResult[BTSFetchAnd] = preBTSFetchAnd(o)
    val r: MOption[BTSFetchAnd] = if (preR.continu) {
      val o2: BTSFetchAnd = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val r0: MOption[Name] = transformName(o2.target)
      val r1: MOption[BTSExp] = transformBTSExp(o2.bool)
      val r2: MOption[Option[Name]] = transformOption(o2.result, transformName _)
      if (hasChanged || r0.nonEmpty || r1.nonEmpty || r2.nonEmpty)
        MSome(o2(target = r0.getOrElse(o2.target), bool = r1.getOrElse(o2.bool), result = r2.getOrElse(o2.result)))
      else
        MNone()
    } else if (preR.resultOpt.nonEmpty) {
      MSome(preR.resultOpt.getOrElse(o))
    } else {
      MNone()
    }
    val hasChanged: B = r.nonEmpty
    val o2: BTSFetchAnd = r.getOrElse(o)
    val postR: MOption[BTSFetchAnd] = postBTSFetchAnd(o2)
    if (postR.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return MSome(o2)
    } else {
      return MNone()
    }
  }

  def transformBTSFetchXor(o: BTSFetchXor): MOption[BTSFetchXor] = {
    val preR: PreResult[BTSFetchXor] = preBTSFetchXor(o)
    val r: MOption[BTSFetchXor] = if (preR.continu) {
      val o2: BTSFetchXor = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val r0: MOption[Name] = transformName(o2.target)
      val r1: MOption[BTSExp] = transformBTSExp(o2.bool)
      val r2: MOption[Option[Name]] = transformOption(o2.result, transformName _)
      if (hasChanged || r0.nonEmpty || r1.nonEmpty || r2.nonEmpty)
        MSome(o2(target = r0.getOrElse(o2.target), bool = r1.getOrElse(o2.bool), result = r2.getOrElse(o2.result)))
      else
        MNone()
    } else if (preR.resultOpt.nonEmpty) {
      MSome(preR.resultOpt.getOrElse(o))
    } else {
      MNone()
    }
    val hasChanged: B = r.nonEmpty
    val o2: BTSFetchXor = r.getOrElse(o)
    val postR: MOption[BTSFetchXor] = postBTSFetchXor(o2)
    if (postR.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return MSome(o2)
    } else {
      return MNone()
    }
  }

  def transformBTSSwap(o: BTSSwap): MOption[BTSSwap] = {
    val preR: PreResult[BTSSwap] = preBTSSwap(o)
    val r: MOption[BTSSwap] = if (preR.continu) {
      val o2: BTSSwap = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val r0: MOption[Name] = transformName(o2.target)
      val r1: MOption[Name] = transformName(o2.reference)
      val r2: MOption[Name] = transformName(o2.result)
      if (hasChanged || r0.nonEmpty || r1.nonEmpty || r2.nonEmpty)
        MSome(o2(target = r0.getOrElse(o2.target), reference = r1.getOrElse(o2.reference), result = r2.getOrElse(o2.result)))
      else
        MNone()
    } else if (preR.resultOpt.nonEmpty) {
      MSome(preR.resultOpt.getOrElse(o))
    } else {
      MNone()
    }
    val hasChanged: B = r.nonEmpty
    val o2: BTSSwap = r.getOrElse(o)
    val postR: MOption[BTSSwap] = postBTSSwap(o2)
    if (postR.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return MSome(o2)
    } else {
      return MNone()
    }
  }

  def transformBTSCommunicationAction(o: BTSCommunicationAction): MOption[BTSCommunicationAction] = {
    val preR: PreResult[BTSCommunicationAction] = preBTSCommunicationAction(o)
    val r: MOption[BTSCommunicationAction] = if (preR.continu) {
      val o2: BTSCommunicationAction = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val rOpt: MOption[BTSCommunicationAction] = o2 match {
        case o2: BTSSubprogramCallAction =>
          val r0: MOption[Name] = transformName(o2.name)
          val r1: MOption[IS[Z, BTSFormalActual]] = transformISZ(o2.params, transformBTSFormalActual _)
          if (hasChanged || r0.nonEmpty || r1.nonEmpty)
            MSome(o2(name = r0.getOrElse(o2.name), params = r1.getOrElse(o2.params)))
          else
            MNone()
        case o2: BTSPortOutput =>
          val r0: MOption[Name] = transformName(o2.port)
          val r1: MOption[Option[BTSExp]] = transformOption(o2.exp, transformBTSExp _)
          if (hasChanged || r0.nonEmpty || r1.nonEmpty)
            MSome(o2(port = r0.getOrElse(o2.port), exp = r1.getOrElse(o2.exp)))
          else
            MNone()
        case o2: BTSPortInput =>
          val r0: MOption[Name] = transformName(o2.port)
          val r1: MOption[BTSValueName] = transformBTSValueName(o2.variable)
          if (hasChanged || r0.nonEmpty || r1.nonEmpty)
            MSome(o2(port = r0.getOrElse(o2.port), variable = r1.getOrElse(o2.variable)))
          else
            MNone()
        case o2: BTSFrozenPortAction =>
          val r0: MOption[IS[Z, Name]] = transformISZ(o2.ports, transformName _)
          if (hasChanged || r0.nonEmpty)
            MSome(o2(ports = r0.getOrElse(o2.ports)))
          else
            MNone()
        case o2: BTSPause =>
          if (hasChanged)
            MSome(o2)
          else
            MNone()
      }
      rOpt
    } else if (preR.resultOpt.nonEmpty) {
      MSome(preR.resultOpt.getOrElse(o))
    } else {
      MNone()
    }
    val hasChanged: B = r.nonEmpty
    val o2: BTSCommunicationAction = r.getOrElse(o)
    val postR: MOption[BTSCommunicationAction] = postBTSCommunicationAction(o2)
    if (postR.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return MSome(o2)
    } else {
      return MNone()
    }
  }

  def transformBTSSubprogramCallAction(o: BTSSubprogramCallAction): MOption[BTSSubprogramCallAction] = {
    val preR: PreResult[BTSSubprogramCallAction] = preBTSSubprogramCallAction(o)
    val r: MOption[BTSSubprogramCallAction] = if (preR.continu) {
      val o2: BTSSubprogramCallAction = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val r0: MOption[Name] = transformName(o2.name)
      val r1: MOption[IS[Z, BTSFormalActual]] = transformISZ(o2.params, transformBTSFormalActual _)
      if (hasChanged || r0.nonEmpty || r1.nonEmpty)
        MSome(o2(name = r0.getOrElse(o2.name), params = r1.getOrElse(o2.params)))
      else
        MNone()
    } else if (preR.resultOpt.nonEmpty) {
      MSome(preR.resultOpt.getOrElse(o))
    } else {
      MNone()
    }
    val hasChanged: B = r.nonEmpty
    val o2: BTSSubprogramCallAction = r.getOrElse(o)
    val postR: MOption[BTSSubprogramCallAction] = postBTSSubprogramCallAction(o2)
    if (postR.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return MSome(o2)
    } else {
      return MNone()
    }
  }

  def transformBTSFormalActual(o: BTSFormalActual): MOption[BTSFormalActual] = {
    val preR: PreResult[BTSFormalActual] = preBTSFormalActual(o)
    val r: MOption[BTSFormalActual] = if (preR.continu) {
      val o2: BTSFormalActual = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val r0: MOption[Name] = transformName(o2.formal)
      val r1: MOption[BTSExp] = transformBTSExp(o2.actual)
      if (hasChanged || r0.nonEmpty || r1.nonEmpty)
        MSome(o2(formal = r0.getOrElse(o2.formal), actual = r1.getOrElse(o2.actual)))
      else
        MNone()
    } else if (preR.resultOpt.nonEmpty) {
      MSome(preR.resultOpt.getOrElse(o))
    } else {
      MNone()
    }
    val hasChanged: B = r.nonEmpty
    val o2: BTSFormalActual = r.getOrElse(o)
    val postR: MOption[BTSFormalActual] = postBTSFormalActual(o2)
    if (postR.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return MSome(o2)
    } else {
      return MNone()
    }
  }

  def transformBTSPortOutput(o: BTSPortOutput): MOption[BTSPortOutput] = {
    val preR: PreResult[BTSPortOutput] = preBTSPortOutput(o)
    val r: MOption[BTSPortOutput] = if (preR.continu) {
      val o2: BTSPortOutput = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val r0: MOption[Name] = transformName(o2.port)
      val r1: MOption[Option[BTSExp]] = transformOption(o2.exp, transformBTSExp _)
      if (hasChanged || r0.nonEmpty || r1.nonEmpty)
        MSome(o2(port = r0.getOrElse(o2.port), exp = r1.getOrElse(o2.exp)))
      else
        MNone()
    } else if (preR.resultOpt.nonEmpty) {
      MSome(preR.resultOpt.getOrElse(o))
    } else {
      MNone()
    }
    val hasChanged: B = r.nonEmpty
    val o2: BTSPortOutput = r.getOrElse(o)
    val postR: MOption[BTSPortOutput] = postBTSPortOutput(o2)
    if (postR.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return MSome(o2)
    } else {
      return MNone()
    }
  }

  def transformBTSPortInput(o: BTSPortInput): MOption[BTSPortInput] = {
    val preR: PreResult[BTSPortInput] = preBTSPortInput(o)
    val r: MOption[BTSPortInput] = if (preR.continu) {
      val o2: BTSPortInput = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val r0: MOption[Name] = transformName(o2.port)
      val r1: MOption[BTSValueName] = transformBTSValueName(o2.variable)
      if (hasChanged || r0.nonEmpty || r1.nonEmpty)
        MSome(o2(port = r0.getOrElse(o2.port), variable = r1.getOrElse(o2.variable)))
      else
        MNone()
    } else if (preR.resultOpt.nonEmpty) {
      MSome(preR.resultOpt.getOrElse(o))
    } else {
      MNone()
    }
    val hasChanged: B = r.nonEmpty
    val o2: BTSPortInput = r.getOrElse(o)
    val postR: MOption[BTSPortInput] = postBTSPortInput(o2)
    if (postR.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return MSome(o2)
    } else {
      return MNone()
    }
  }

  def transformBTSFrozenPortAction(o: BTSFrozenPortAction): MOption[BTSFrozenPortAction] = {
    val preR: PreResult[BTSFrozenPortAction] = preBTSFrozenPortAction(o)
    val r: MOption[BTSFrozenPortAction] = if (preR.continu) {
      val o2: BTSFrozenPortAction = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val r0: MOption[IS[Z, Name]] = transformISZ(o2.ports, transformName _)
      if (hasChanged || r0.nonEmpty)
        MSome(o2(ports = r0.getOrElse(o2.ports)))
      else
        MNone()
    } else if (preR.resultOpt.nonEmpty) {
      MSome(preR.resultOpt.getOrElse(o))
    } else {
      MNone()
    }
    val hasChanged: B = r.nonEmpty
    val o2: BTSFrozenPortAction = r.getOrElse(o)
    val postR: MOption[BTSFrozenPortAction] = postBTSFrozenPortAction(o2)
    if (postR.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return MSome(o2)
    } else {
      return MNone()
    }
  }

  def transformBTSPause(o: BTSPause): MOption[BTSPause] = {
    val preR: PreResult[BTSPause] = preBTSPause(o)
    val r: MOption[BTSPause] = if (preR.continu) {
      val o2: BTSPause = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      if (hasChanged)
        MSome(o2)
      else
        MNone()
    } else if (preR.resultOpt.nonEmpty) {
      MSome(preR.resultOpt.getOrElse(o))
    } else {
      MNone()
    }
    val hasChanged: B = r.nonEmpty
    val o2: BTSPause = r.getOrElse(o)
    val postR: MOption[BTSPause] = postBTSPause(o2)
    if (postR.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return MSome(o2)
    } else {
      return MNone()
    }
  }

  def transformBTSControlAction(o: BTSControlAction): MOption[BTSControlAction] = {
    val preR: PreResult[BTSControlAction] = preBTSControlAction(o)
    val r: MOption[BTSControlAction] = if (preR.continu) {
      val o2: BTSControlAction = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val rOpt: MOption[BTSControlAction] = o2 match {
        case o2: BTSIfBLESSAction =>
          val r0: MOption[Option[TODO]] = transformOption(o2.availability, transformTODO _)
          val r1: MOption[IS[Z, BTSGuardedAction]] = transformISZ(o2.alternatives, transformBTSGuardedAction _)
          if (hasChanged || r0.nonEmpty || r1.nonEmpty)
            MSome(o2(availability = r0.getOrElse(o2.availability), alternatives = r1.getOrElse(o2.alternatives)))
          else
            MNone()
        case o2: BTSIfBAAction =>
          val r0: MOption[BTSConditionalActions] = transformBTSConditionalActions(o2.ifBranch)
          val r1: MOption[IS[Z, BTSConditionalActions]] = transformISZ(o2.elseIfBranches, transformBTSConditionalActions _)
          val r2: MOption[Option[BTSBehaviorActions]] = transformOption(o2.elseBranch, transformBTSBehaviorActions _)
          if (hasChanged || r0.nonEmpty || r1.nonEmpty || r2.nonEmpty)
            MSome(o2(ifBranch = r0.getOrElse(o2.ifBranch), elseIfBranches = r1.getOrElse(o2.elseIfBranches), elseBranch = r2.getOrElse(o2.elseBranch)))
          else
            MNone()
        case o2: BTSWhileLoop =>
          val r0: MOption[BTSExp] = transformBTSExp(o2.test)
          val r1: MOption[Option[BTSNamelessAssertion]] = transformOption(o2.invariant, transformBTSNamelessAssertion _)
          val r2: MOption[Option[BTSExp]] = transformOption(o2.bound, transformBTSExp _)
          val r3: MOption[BTSExistentialLatticeQuantification] = transformBTSExistentialLatticeQuantification(o2.elq)
          if (hasChanged || r0.nonEmpty || r1.nonEmpty || r2.nonEmpty || r3.nonEmpty)
            MSome(o2(test = r0.getOrElse(o2.test), invariant = r1.getOrElse(o2.invariant), bound = r2.getOrElse(o2.bound), elq = r3.getOrElse(o2.elq)))
          else
            MNone()
        case o2: BTSForLoop =>
          val r0: MOption[Name] = transformName(o2.count)
          val r1: MOption[BTSExp] = transformBTSExp(o2.lowerbound)
          val r2: MOption[BTSExp] = transformBTSExp(o2.upperbound)
          val r3: MOption[Option[BTSNamelessAssertion]] = transformOption(o2.invariant, transformBTSNamelessAssertion _)
          val r4: MOption[BTSBehaviorActions] = transformBTSBehaviorActions(o2.actions)
          if (hasChanged || r0.nonEmpty || r1.nonEmpty || r2.nonEmpty || r3.nonEmpty || r4.nonEmpty)
            MSome(o2(count = r0.getOrElse(o2.count), lowerbound = r1.getOrElse(o2.lowerbound), upperbound = r2.getOrElse(o2.upperbound), invariant = r3.getOrElse(o2.invariant), actions = r4.getOrElse(o2.actions)))
          else
            MNone()
        case o2: BTSDoUntilLoop =>
          val r0: MOption[Option[BTSNamelessAssertion]] = transformOption(o2.invariant, transformBTSNamelessAssertion _)
          val r1: MOption[Option[BTSExp]] = transformOption(o2.bound, transformBTSExp _)
          val r2: MOption[BTSBehaviorActions] = transformBTSBehaviorActions(o2.actions)
          val r3: MOption[BTSExp] = transformBTSExp(o2.guard)
          if (hasChanged || r0.nonEmpty || r1.nonEmpty || r2.nonEmpty || r3.nonEmpty)
            MSome(o2(invariant = r0.getOrElse(o2.invariant), bound = r1.getOrElse(o2.bound), actions = r2.getOrElse(o2.actions), guard = r3.getOrElse(o2.guard)))
          else
            MNone()
      }
      rOpt
    } else if (preR.resultOpt.nonEmpty) {
      MSome(preR.resultOpt.getOrElse(o))
    } else {
      MNone()
    }
    val hasChanged: B = r.nonEmpty
    val o2: BTSControlAction = r.getOrElse(o)
    val postR: MOption[BTSControlAction] = postBTSControlAction(o2)
    if (postR.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return MSome(o2)
    } else {
      return MNone()
    }
  }

  def transformBTSIfBLESSAction(o: BTSIfBLESSAction): MOption[BTSIfBLESSAction] = {
    val preR: PreResult[BTSIfBLESSAction] = preBTSIfBLESSAction(o)
    val r: MOption[BTSIfBLESSAction] = if (preR.continu) {
      val o2: BTSIfBLESSAction = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val r0: MOption[Option[TODO]] = transformOption(o2.availability, transformTODO _)
      val r1: MOption[IS[Z, BTSGuardedAction]] = transformISZ(o2.alternatives, transformBTSGuardedAction _)
      if (hasChanged || r0.nonEmpty || r1.nonEmpty)
        MSome(o2(availability = r0.getOrElse(o2.availability), alternatives = r1.getOrElse(o2.alternatives)))
      else
        MNone()
    } else if (preR.resultOpt.nonEmpty) {
      MSome(preR.resultOpt.getOrElse(o))
    } else {
      MNone()
    }
    val hasChanged: B = r.nonEmpty
    val o2: BTSIfBLESSAction = r.getOrElse(o)
    val postR: MOption[BTSIfBLESSAction] = postBTSIfBLESSAction(o2)
    if (postR.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return MSome(o2)
    } else {
      return MNone()
    }
  }

  def transformBTSGuardedAction(o: BTSGuardedAction): MOption[BTSGuardedAction] = {
    val preR: PreResult[BTSGuardedAction] = preBTSGuardedAction(o)
    val r: MOption[BTSGuardedAction] = if (preR.continu) {
      val o2: BTSGuardedAction = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val r0: MOption[BTSExp] = transformBTSExp(o2.guard)
      val r1: MOption[BTSAssertedAction] = transformBTSAssertedAction(o2.action)
      if (hasChanged || r0.nonEmpty || r1.nonEmpty)
        MSome(o2(guard = r0.getOrElse(o2.guard), action = r1.getOrElse(o2.action)))
      else
        MNone()
    } else if (preR.resultOpt.nonEmpty) {
      MSome(preR.resultOpt.getOrElse(o))
    } else {
      MNone()
    }
    val hasChanged: B = r.nonEmpty
    val o2: BTSGuardedAction = r.getOrElse(o)
    val postR: MOption[BTSGuardedAction] = postBTSGuardedAction(o2)
    if (postR.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return MSome(o2)
    } else {
      return MNone()
    }
  }

  def transformBTSIfBAAction(o: BTSIfBAAction): MOption[BTSIfBAAction] = {
    val preR: PreResult[BTSIfBAAction] = preBTSIfBAAction(o)
    val r: MOption[BTSIfBAAction] = if (preR.continu) {
      val o2: BTSIfBAAction = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val r0: MOption[BTSConditionalActions] = transformBTSConditionalActions(o2.ifBranch)
      val r1: MOption[IS[Z, BTSConditionalActions]] = transformISZ(o2.elseIfBranches, transformBTSConditionalActions _)
      val r2: MOption[Option[BTSBehaviorActions]] = transformOption(o2.elseBranch, transformBTSBehaviorActions _)
      if (hasChanged || r0.nonEmpty || r1.nonEmpty || r2.nonEmpty)
        MSome(o2(ifBranch = r0.getOrElse(o2.ifBranch), elseIfBranches = r1.getOrElse(o2.elseIfBranches), elseBranch = r2.getOrElse(o2.elseBranch)))
      else
        MNone()
    } else if (preR.resultOpt.nonEmpty) {
      MSome(preR.resultOpt.getOrElse(o))
    } else {
      MNone()
    }
    val hasChanged: B = r.nonEmpty
    val o2: BTSIfBAAction = r.getOrElse(o)
    val postR: MOption[BTSIfBAAction] = postBTSIfBAAction(o2)
    if (postR.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return MSome(o2)
    } else {
      return MNone()
    }
  }

  def transformBTSConditionalActions(o: BTSConditionalActions): MOption[BTSConditionalActions] = {
    val preR: PreResult[BTSConditionalActions] = preBTSConditionalActions(o)
    val r: MOption[BTSConditionalActions] = if (preR.continu) {
      val o2: BTSConditionalActions = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val r0: MOption[BTSExp] = transformBTSExp(o2.cond)
      val r1: MOption[BTSBehaviorActions] = transformBTSBehaviorActions(o2.actions)
      if (hasChanged || r0.nonEmpty || r1.nonEmpty)
        MSome(o2(cond = r0.getOrElse(o2.cond), actions = r1.getOrElse(o2.actions)))
      else
        MNone()
    } else if (preR.resultOpt.nonEmpty) {
      MSome(preR.resultOpt.getOrElse(o))
    } else {
      MNone()
    }
    val hasChanged: B = r.nonEmpty
    val o2: BTSConditionalActions = r.getOrElse(o)
    val postR: MOption[BTSConditionalActions] = postBTSConditionalActions(o2)
    if (postR.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return MSome(o2)
    } else {
      return MNone()
    }
  }

  def transformBTSWhileLoop(o: BTSWhileLoop): MOption[BTSWhileLoop] = {
    val preR: PreResult[BTSWhileLoop] = preBTSWhileLoop(o)
    val r: MOption[BTSWhileLoop] = if (preR.continu) {
      val o2: BTSWhileLoop = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val r0: MOption[BTSExp] = transformBTSExp(o2.test)
      val r1: MOption[Option[BTSNamelessAssertion]] = transformOption(o2.invariant, transformBTSNamelessAssertion _)
      val r2: MOption[Option[BTSExp]] = transformOption(o2.bound, transformBTSExp _)
      val r3: MOption[BTSExistentialLatticeQuantification] = transformBTSExistentialLatticeQuantification(o2.elq)
      if (hasChanged || r0.nonEmpty || r1.nonEmpty || r2.nonEmpty || r3.nonEmpty)
        MSome(o2(test = r0.getOrElse(o2.test), invariant = r1.getOrElse(o2.invariant), bound = r2.getOrElse(o2.bound), elq = r3.getOrElse(o2.elq)))
      else
        MNone()
    } else if (preR.resultOpt.nonEmpty) {
      MSome(preR.resultOpt.getOrElse(o))
    } else {
      MNone()
    }
    val hasChanged: B = r.nonEmpty
    val o2: BTSWhileLoop = r.getOrElse(o)
    val postR: MOption[BTSWhileLoop] = postBTSWhileLoop(o2)
    if (postR.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return MSome(o2)
    } else {
      return MNone()
    }
  }

  def transformBTSForLoop(o: BTSForLoop): MOption[BTSForLoop] = {
    val preR: PreResult[BTSForLoop] = preBTSForLoop(o)
    val r: MOption[BTSForLoop] = if (preR.continu) {
      val o2: BTSForLoop = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val r0: MOption[Name] = transformName(o2.count)
      val r1: MOption[BTSExp] = transformBTSExp(o2.lowerbound)
      val r2: MOption[BTSExp] = transformBTSExp(o2.upperbound)
      val r3: MOption[Option[BTSNamelessAssertion]] = transformOption(o2.invariant, transformBTSNamelessAssertion _)
      val r4: MOption[BTSBehaviorActions] = transformBTSBehaviorActions(o2.actions)
      if (hasChanged || r0.nonEmpty || r1.nonEmpty || r2.nonEmpty || r3.nonEmpty || r4.nonEmpty)
        MSome(o2(count = r0.getOrElse(o2.count), lowerbound = r1.getOrElse(o2.lowerbound), upperbound = r2.getOrElse(o2.upperbound), invariant = r3.getOrElse(o2.invariant), actions = r4.getOrElse(o2.actions)))
      else
        MNone()
    } else if (preR.resultOpt.nonEmpty) {
      MSome(preR.resultOpt.getOrElse(o))
    } else {
      MNone()
    }
    val hasChanged: B = r.nonEmpty
    val o2: BTSForLoop = r.getOrElse(o)
    val postR: MOption[BTSForLoop] = postBTSForLoop(o2)
    if (postR.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return MSome(o2)
    } else {
      return MNone()
    }
  }

  def transformBTSDoUntilLoop(o: BTSDoUntilLoop): MOption[BTSDoUntilLoop] = {
    val preR: PreResult[BTSDoUntilLoop] = preBTSDoUntilLoop(o)
    val r: MOption[BTSDoUntilLoop] = if (preR.continu) {
      val o2: BTSDoUntilLoop = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val r0: MOption[Option[BTSNamelessAssertion]] = transformOption(o2.invariant, transformBTSNamelessAssertion _)
      val r1: MOption[Option[BTSExp]] = transformOption(o2.bound, transformBTSExp _)
      val r2: MOption[BTSBehaviorActions] = transformBTSBehaviorActions(o2.actions)
      val r3: MOption[BTSExp] = transformBTSExp(o2.guard)
      if (hasChanged || r0.nonEmpty || r1.nonEmpty || r2.nonEmpty || r3.nonEmpty)
        MSome(o2(invariant = r0.getOrElse(o2.invariant), bound = r1.getOrElse(o2.bound), actions = r2.getOrElse(o2.actions), guard = r3.getOrElse(o2.guard)))
      else
        MNone()
    } else if (preR.resultOpt.nonEmpty) {
      MSome(preR.resultOpt.getOrElse(o))
    } else {
      MNone()
    }
    val hasChanged: B = r.nonEmpty
    val o2: BTSDoUntilLoop = r.getOrElse(o)
    val postR: MOption[BTSDoUntilLoop] = postBTSDoUntilLoop(o2)
    if (postR.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return MSome(o2)
    } else {
      return MNone()
    }
  }

  def transformBTSQuantificationActions(o: BTSQuantificationActions): MOption[BTSQuantificationActions] = {
    val preR: PreResult[BTSQuantificationActions] = preBTSQuantificationActions(o)
    val r: MOption[BTSQuantificationActions] = if (preR.continu) {
      val o2: BTSQuantificationActions = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val rOpt: MOption[BTSQuantificationActions] = o2 match {
        case o2: BTSExistentialLatticeQuantification =>
          val r0: MOption[IS[Z, BTSVariableDeclaration]] = transformISZ(o2.quantifiedVariables, transformBTSVariableDeclaration _)
          val r1: MOption[BTSBehaviorActions] = transformBTSBehaviorActions(o2.actions)
          val r2: MOption[Option[BTSBehaviorTime]] = transformOption(o2.timeout, transformBTSBehaviorTime _)
          val r3: MOption[IS[Z, BTSCatchClauseTerm]] = transformISZ(o2.catchClause, transformBTSCatchClauseTerm _)
          if (hasChanged || r0.nonEmpty || r1.nonEmpty || r2.nonEmpty || r3.nonEmpty)
            MSome(o2(quantifiedVariables = r0.getOrElse(o2.quantifiedVariables), actions = r1.getOrElse(o2.actions), timeout = r2.getOrElse(o2.timeout), catchClause = r3.getOrElse(o2.catchClause)))
          else
            MNone()
        case o2: BTSUniversalLatticeQuantification =>
          val r0: MOption[IS[Z, Name]] = transformISZ(o2.latticeVariables, transformName _)
          val r1: MOption[BTSExp] = transformBTSExp(o2.lowerbound)
          val r2: MOption[BTSExp] = transformBTSExp(o2.upperbound)
          val r3: MOption[BTSExistentialLatticeQuantification] = transformBTSExistentialLatticeQuantification(o2.elq)
          if (hasChanged || r0.nonEmpty || r1.nonEmpty || r2.nonEmpty || r3.nonEmpty)
            MSome(o2(latticeVariables = r0.getOrElse(o2.latticeVariables), lowerbound = r1.getOrElse(o2.lowerbound), upperbound = r2.getOrElse(o2.upperbound), elq = r3.getOrElse(o2.elq)))
          else
            MNone()
      }
      rOpt
    } else if (preR.resultOpt.nonEmpty) {
      MSome(preR.resultOpt.getOrElse(o))
    } else {
      MNone()
    }
    val hasChanged: B = r.nonEmpty
    val o2: BTSQuantificationActions = r.getOrElse(o)
    val postR: MOption[BTSQuantificationActions] = postBTSQuantificationActions(o2)
    if (postR.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return MSome(o2)
    } else {
      return MNone()
    }
  }

  def transformBTSExistentialLatticeQuantification(o: BTSExistentialLatticeQuantification): MOption[BTSExistentialLatticeQuantification] = {
    val preR: PreResult[BTSExistentialLatticeQuantification] = preBTSExistentialLatticeQuantification(o)
    val r: MOption[BTSExistentialLatticeQuantification] = if (preR.continu) {
      val o2: BTSExistentialLatticeQuantification = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val r0: MOption[IS[Z, BTSVariableDeclaration]] = transformISZ(o2.quantifiedVariables, transformBTSVariableDeclaration _)
      val r1: MOption[BTSBehaviorActions] = transformBTSBehaviorActions(o2.actions)
      val r2: MOption[Option[BTSBehaviorTime]] = transformOption(o2.timeout, transformBTSBehaviorTime _)
      val r3: MOption[IS[Z, BTSCatchClauseTerm]] = transformISZ(o2.catchClause, transformBTSCatchClauseTerm _)
      if (hasChanged || r0.nonEmpty || r1.nonEmpty || r2.nonEmpty || r3.nonEmpty)
        MSome(o2(quantifiedVariables = r0.getOrElse(o2.quantifiedVariables), actions = r1.getOrElse(o2.actions), timeout = r2.getOrElse(o2.timeout), catchClause = r3.getOrElse(o2.catchClause)))
      else
        MNone()
    } else if (preR.resultOpt.nonEmpty) {
      MSome(preR.resultOpt.getOrElse(o))
    } else {
      MNone()
    }
    val hasChanged: B = r.nonEmpty
    val o2: BTSExistentialLatticeQuantification = r.getOrElse(o)
    val postR: MOption[BTSExistentialLatticeQuantification] = postBTSExistentialLatticeQuantification(o2)
    if (postR.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return MSome(o2)
    } else {
      return MNone()
    }
  }

  def transformBTSCatchClauseTerm(o: BTSCatchClauseTerm): MOption[BTSCatchClauseTerm] = {
    val preR: PreResult[BTSCatchClauseTerm] = preBTSCatchClauseTerm(o)
    val r: MOption[BTSCatchClauseTerm] = if (preR.continu) {
      val o2: BTSCatchClauseTerm = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val r0: MOption[IS[Z, Name]] = transformISZ(o2.exceptions, transformName _)
      val r1: MOption[BTSBasicAction] = transformBTSBasicAction(o2.action)
      if (hasChanged || r0.nonEmpty || r1.nonEmpty)
        MSome(o2(exceptions = r0.getOrElse(o2.exceptions), action = r1.getOrElse(o2.action)))
      else
        MNone()
    } else if (preR.resultOpt.nonEmpty) {
      MSome(preR.resultOpt.getOrElse(o))
    } else {
      MNone()
    }
    val hasChanged: B = r.nonEmpty
    val o2: BTSCatchClauseTerm = r.getOrElse(o)
    val postR: MOption[BTSCatchClauseTerm] = postBTSCatchClauseTerm(o2)
    if (postR.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return MSome(o2)
    } else {
      return MNone()
    }
  }

  def transformBTSUniversalLatticeQuantification(o: BTSUniversalLatticeQuantification): MOption[BTSUniversalLatticeQuantification] = {
    val preR: PreResult[BTSUniversalLatticeQuantification] = preBTSUniversalLatticeQuantification(o)
    val r: MOption[BTSUniversalLatticeQuantification] = if (preR.continu) {
      val o2: BTSUniversalLatticeQuantification = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val r0: MOption[IS[Z, Name]] = transformISZ(o2.latticeVariables, transformName _)
      val r1: MOption[BTSExp] = transformBTSExp(o2.lowerbound)
      val r2: MOption[BTSExp] = transformBTSExp(o2.upperbound)
      val r3: MOption[BTSExistentialLatticeQuantification] = transformBTSExistentialLatticeQuantification(o2.elq)
      if (hasChanged || r0.nonEmpty || r1.nonEmpty || r2.nonEmpty || r3.nonEmpty)
        MSome(o2(latticeVariables = r0.getOrElse(o2.latticeVariables), lowerbound = r1.getOrElse(o2.lowerbound), upperbound = r2.getOrElse(o2.upperbound), elq = r3.getOrElse(o2.elq)))
      else
        MNone()
    } else if (preR.resultOpt.nonEmpty) {
      MSome(preR.resultOpt.getOrElse(o))
    } else {
      MNone()
    }
    val hasChanged: B = r.nonEmpty
    val o2: BTSUniversalLatticeQuantification = r.getOrElse(o)
    val postR: MOption[BTSUniversalLatticeQuantification] = postBTSUniversalLatticeQuantification(o2)
    if (postR.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return MSome(o2)
    } else {
      return MNone()
    }
  }

  def transformBTSExp(o: BTSExp): MOption[BTSExp] = {
    val preR: PreResult[BTSExp] = preBTSExp(o)
    val r: MOption[BTSExp] = if (preR.continu) {
      val o2: BTSExp = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val rOpt: MOption[BTSExp] = o2 match {
        case o2: BTSUnaryExp =>
          val r0: MOption[BTSExp] = transformBTSExp(o2.exp)
          if (hasChanged || r0.nonEmpty)
            MSome(o2(exp = r0.getOrElse(o2.exp)))
          else
            MNone()
        case o2: BTSBinaryExp =>
          val r0: MOption[BTSExp] = transformBTSExp(o2.lhs)
          val r1: MOption[BTSExp] = transformBTSExp(o2.rhs)
          if (hasChanged || r0.nonEmpty || r1.nonEmpty)
            MSome(o2(lhs = r0.getOrElse(o2.lhs), rhs = r1.getOrElse(o2.rhs)))
          else
            MNone()
        case o2: BTSLiteralExp =>
          if (hasChanged)
            MSome(o2)
          else
            MNone()
        case o2: BTSVariableNameExp =>
          val r0: MOption[Name] = transformName(o2.name)
          val r1: MOption[IS[Z, BTSExp]] = transformISZ(o2.arrayindex, transformBTSExp _)
          val r2: MOption[IS[Z, BTSPartialName]] = transformISZ(o2.pn, transformBTSPartialName _)
          if (hasChanged || r0.nonEmpty || r1.nonEmpty || r2.nonEmpty)
            MSome(o2(name = r0.getOrElse(o2.name), arrayindex = r1.getOrElse(o2.arrayindex), pn = r2.getOrElse(o2.pn)))
          else
            MNone()
        case o2: BTSIndexingExp =>
          val r0: MOption[BTSExp] = transformBTSExp(o2.exp)
          val r1: MOption[IS[Z, BTSExp]] = transformISZ(o2.indices, transformBTSExp _)
          if (hasChanged || r0.nonEmpty || r1.nonEmpty)
            MSome(o2(exp = r0.getOrElse(o2.exp), indices = r1.getOrElse(o2.indices)))
          else
            MNone()
        case o2: BTSAccessExp =>
          val r0: MOption[BTSExp] = transformBTSExp(o2.exp)
          if (hasChanged || r0.nonEmpty)
            MSome(o2(exp = r0.getOrElse(o2.exp)))
          else
            MNone()
        case o2: BTSFunctionCall =>
          val r0: MOption[Name] = transformName(o2.name)
          val r1: MOption[IS[Z, BTSFormalActual]] = transformISZ(o2.args, transformBTSFormalActual _)
          if (hasChanged || r0.nonEmpty || r1.nonEmpty)
            MSome(o2(name = r0.getOrElse(o2.name), args = r1.getOrElse(o2.args)))
          else
            MNone()
        case o2: BTSConditionalExpression =>
          val r0: MOption[BTSExp] = transformBTSExp(o2.guard)
          val r1: MOption[BTSExp] = transformBTSExp(o2.t)
          val r2: MOption[BTSExp] = transformBTSExp(o2.f)
          if (hasChanged || r0.nonEmpty || r1.nonEmpty || r2.nonEmpty)
            MSome(o2(guard = r0.getOrElse(o2.guard), t = r1.getOrElse(o2.t), f = r2.getOrElse(o2.f)))
          else
            MNone()
        case o2: BTSRange =>
          val r0: MOption[BTSExp] = transformBTSExp(o2.lb)
          val r1: MOption[BTSExp] = transformBTSExp(o2.ub)
          if (hasChanged || r0.nonEmpty || r1.nonEmpty)
            MSome(o2(lb = r0.getOrElse(o2.lb), ub = r1.getOrElse(o2.ub)))
          else
            MNone()
      }
      rOpt
    } else if (preR.resultOpt.nonEmpty) {
      MSome(preR.resultOpt.getOrElse(o))
    } else {
      MNone()
    }
    val hasChanged: B = r.nonEmpty
    val o2: BTSExp = r.getOrElse(o)
    val postR: MOption[BTSExp] = postBTSExp(o2)
    if (postR.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return MSome(o2)
    } else {
      return MNone()
    }
  }

  def transformBTSUnaryExp(o: BTSUnaryExp): MOption[BTSUnaryExp] = {
    val preR: PreResult[BTSUnaryExp] = preBTSUnaryExp(o)
    val r: MOption[BTSUnaryExp] = if (preR.continu) {
      val o2: BTSUnaryExp = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val r0: MOption[BTSExp] = transformBTSExp(o2.exp)
      if (hasChanged || r0.nonEmpty)
        MSome(o2(exp = r0.getOrElse(o2.exp)))
      else
        MNone()
    } else if (preR.resultOpt.nonEmpty) {
      MSome(preR.resultOpt.getOrElse(o))
    } else {
      MNone()
    }
    val hasChanged: B = r.nonEmpty
    val o2: BTSUnaryExp = r.getOrElse(o)
    val postR: MOption[BTSUnaryExp] = postBTSUnaryExp(o2)
    if (postR.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return MSome(o2)
    } else {
      return MNone()
    }
  }

  def transformBTSBinaryExp(o: BTSBinaryExp): MOption[BTSBinaryExp] = {
    val preR: PreResult[BTSBinaryExp] = preBTSBinaryExp(o)
    val r: MOption[BTSBinaryExp] = if (preR.continu) {
      val o2: BTSBinaryExp = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val r0: MOption[BTSExp] = transformBTSExp(o2.lhs)
      val r1: MOption[BTSExp] = transformBTSExp(o2.rhs)
      if (hasChanged || r0.nonEmpty || r1.nonEmpty)
        MSome(o2(lhs = r0.getOrElse(o2.lhs), rhs = r1.getOrElse(o2.rhs)))
      else
        MNone()
    } else if (preR.resultOpt.nonEmpty) {
      MSome(preR.resultOpt.getOrElse(o))
    } else {
      MNone()
    }
    val hasChanged: B = r.nonEmpty
    val o2: BTSBinaryExp = r.getOrElse(o)
    val postR: MOption[BTSBinaryExp] = postBTSBinaryExp(o2)
    if (postR.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return MSome(o2)
    } else {
      return MNone()
    }
  }

  def transformBTSLiteralExp(o: BTSLiteralExp): MOption[BTSLiteralExp] = {
    val preR: PreResult[BTSLiteralExp] = preBTSLiteralExp(o)
    val r: MOption[BTSLiteralExp] = if (preR.continu) {
      val o2: BTSLiteralExp = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      if (hasChanged)
        MSome(o2)
      else
        MNone()
    } else if (preR.resultOpt.nonEmpty) {
      MSome(preR.resultOpt.getOrElse(o))
    } else {
      MNone()
    }
    val hasChanged: B = r.nonEmpty
    val o2: BTSLiteralExp = r.getOrElse(o)
    val postR: MOption[BTSLiteralExp] = postBTSLiteralExp(o2)
    if (postR.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return MSome(o2)
    } else {
      return MNone()
    }
  }

  def transformBTSValueName(o: BTSValueName): MOption[BTSValueName] = {
    val preR: PreResult[BTSValueName] = preBTSValueName(o)
    val r: MOption[BTSValueName] = if (preR.continu) {
      val o2: BTSValueName = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val rOpt: MOption[BTSValueName] = o2 match {
        case o2: BTSVariableNameExp =>
          val r0: MOption[Name] = transformName(o2.name)
          val r1: MOption[IS[Z, BTSExp]] = transformISZ(o2.arrayindex, transformBTSExp _)
          val r2: MOption[IS[Z, BTSPartialName]] = transformISZ(o2.pn, transformBTSPartialName _)
          if (hasChanged || r0.nonEmpty || r1.nonEmpty || r2.nonEmpty)
            MSome(o2(name = r0.getOrElse(o2.name), arrayindex = r1.getOrElse(o2.arrayindex), pn = r2.getOrElse(o2.pn)))
          else
            MNone()
        case o2: BTSFunctionCall =>
          val r0: MOption[Name] = transformName(o2.name)
          val r1: MOption[IS[Z, BTSFormalActual]] = transformISZ(o2.args, transformBTSFormalActual _)
          if (hasChanged || r0.nonEmpty || r1.nonEmpty)
            MSome(o2(name = r0.getOrElse(o2.name), args = r1.getOrElse(o2.args)))
          else
            MNone()
      }
      rOpt
    } else if (preR.resultOpt.nonEmpty) {
      MSome(preR.resultOpt.getOrElse(o))
    } else {
      MNone()
    }
    val hasChanged: B = r.nonEmpty
    val o2: BTSValueName = r.getOrElse(o)
    val postR: MOption[BTSValueName] = postBTSValueName(o2)
    if (postR.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return MSome(o2)
    } else {
      return MNone()
    }
  }

  def transformBTSVariableNameExp(o: BTSVariableNameExp): MOption[BTSVariableNameExp] = {
    val preR: PreResult[BTSVariableNameExp] = preBTSVariableNameExp(o)
    val r: MOption[BTSVariableNameExp] = if (preR.continu) {
      val o2: BTSVariableNameExp = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val r0: MOption[Name] = transformName(o2.name)
      val r1: MOption[IS[Z, BTSExp]] = transformISZ(o2.arrayindex, transformBTSExp _)
      val r2: MOption[IS[Z, BTSPartialName]] = transformISZ(o2.pn, transformBTSPartialName _)
      if (hasChanged || r0.nonEmpty || r1.nonEmpty || r2.nonEmpty)
        MSome(o2(name = r0.getOrElse(o2.name), arrayindex = r1.getOrElse(o2.arrayindex), pn = r2.getOrElse(o2.pn)))
      else
        MNone()
    } else if (preR.resultOpt.nonEmpty) {
      MSome(preR.resultOpt.getOrElse(o))
    } else {
      MNone()
    }
    val hasChanged: B = r.nonEmpty
    val o2: BTSVariableNameExp = r.getOrElse(o)
    val postR: MOption[BTSVariableNameExp] = postBTSVariableNameExp(o2)
    if (postR.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return MSome(o2)
    } else {
      return MNone()
    }
  }

  def transformBTSPartialName(o: BTSPartialName): MOption[BTSPartialName] = {
    val preR: PreResult[BTSPartialName] = preBTSPartialName(o)
    val r: MOption[BTSPartialName] = if (preR.continu) {
      val o2: BTSPartialName = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val r0: MOption[Name] = transformName(o2.label)
      val r1: MOption[IS[Z, BTSExp]] = transformISZ(o2.arrayindex, transformBTSExp _)
      if (hasChanged || r0.nonEmpty || r1.nonEmpty)
        MSome(o2(label = r0.getOrElse(o2.label), arrayindex = r1.getOrElse(o2.arrayindex)))
      else
        MNone()
    } else if (preR.resultOpt.nonEmpty) {
      MSome(preR.resultOpt.getOrElse(o))
    } else {
      MNone()
    }
    val hasChanged: B = r.nonEmpty
    val o2: BTSPartialName = r.getOrElse(o)
    val postR: MOption[BTSPartialName] = postBTSPartialName(o2)
    if (postR.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return MSome(o2)
    } else {
      return MNone()
    }
  }

  def transformBTSIndexingExp(o: BTSIndexingExp): MOption[BTSIndexingExp] = {
    val preR: PreResult[BTSIndexingExp] = preBTSIndexingExp(o)
    val r: MOption[BTSIndexingExp] = if (preR.continu) {
      val o2: BTSIndexingExp = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val r0: MOption[BTSExp] = transformBTSExp(o2.exp)
      val r1: MOption[IS[Z, BTSExp]] = transformISZ(o2.indices, transformBTSExp _)
      if (hasChanged || r0.nonEmpty || r1.nonEmpty)
        MSome(o2(exp = r0.getOrElse(o2.exp), indices = r1.getOrElse(o2.indices)))
      else
        MNone()
    } else if (preR.resultOpt.nonEmpty) {
      MSome(preR.resultOpt.getOrElse(o))
    } else {
      MNone()
    }
    val hasChanged: B = r.nonEmpty
    val o2: BTSIndexingExp = r.getOrElse(o)
    val postR: MOption[BTSIndexingExp] = postBTSIndexingExp(o2)
    if (postR.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return MSome(o2)
    } else {
      return MNone()
    }
  }

  def transformBTSAccessExp(o: BTSAccessExp): MOption[BTSAccessExp] = {
    val preR: PreResult[BTSAccessExp] = preBTSAccessExp(o)
    val r: MOption[BTSAccessExp] = if (preR.continu) {
      val o2: BTSAccessExp = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val r0: MOption[BTSExp] = transformBTSExp(o2.exp)
      if (hasChanged || r0.nonEmpty)
        MSome(o2(exp = r0.getOrElse(o2.exp)))
      else
        MNone()
    } else if (preR.resultOpt.nonEmpty) {
      MSome(preR.resultOpt.getOrElse(o))
    } else {
      MNone()
    }
    val hasChanged: B = r.nonEmpty
    val o2: BTSAccessExp = r.getOrElse(o)
    val postR: MOption[BTSAccessExp] = postBTSAccessExp(o2)
    if (postR.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return MSome(o2)
    } else {
      return MNone()
    }
  }

  def transformBTSFunctionCall(o: BTSFunctionCall): MOption[BTSFunctionCall] = {
    val preR: PreResult[BTSFunctionCall] = preBTSFunctionCall(o)
    val r: MOption[BTSFunctionCall] = if (preR.continu) {
      val o2: BTSFunctionCall = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val r0: MOption[Name] = transformName(o2.name)
      val r1: MOption[IS[Z, BTSFormalActual]] = transformISZ(o2.args, transformBTSFormalActual _)
      if (hasChanged || r0.nonEmpty || r1.nonEmpty)
        MSome(o2(name = r0.getOrElse(o2.name), args = r1.getOrElse(o2.args)))
      else
        MNone()
    } else if (preR.resultOpt.nonEmpty) {
      MSome(preR.resultOpt.getOrElse(o))
    } else {
      MNone()
    }
    val hasChanged: B = r.nonEmpty
    val o2: BTSFunctionCall = r.getOrElse(o)
    val postR: MOption[BTSFunctionCall] = postBTSFunctionCall(o2)
    if (postR.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return MSome(o2)
    } else {
      return MNone()
    }
  }

  def transformBTSPortValue(o: BTSPortValue): MOption[BTSPortValue] = {
    val preR: PreResult[BTSPortValue] = preBTSPortValue(o)
    val r: MOption[BTSPortValue] = if (preR.continu) {
      val o2: BTSPortValue = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val r0: MOption[Name] = transformName(o2.port)
      if (hasChanged || r0.nonEmpty)
        MSome(o2(port = r0.getOrElse(o2.port)))
      else
        MNone()
    } else if (preR.resultOpt.nonEmpty) {
      MSome(preR.resultOpt.getOrElse(o))
    } else {
      MNone()
    }
    val hasChanged: B = r.nonEmpty
    val o2: BTSPortValue = r.getOrElse(o)
    val postR: MOption[BTSPortValue] = postBTSPortValue(o2)
    if (postR.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return MSome(o2)
    } else {
      return MNone()
    }
  }

  def transformBTSConditionalExpression(o: BTSConditionalExpression): MOption[BTSConditionalExpression] = {
    val preR: PreResult[BTSConditionalExpression] = preBTSConditionalExpression(o)
    val r: MOption[BTSConditionalExpression] = if (preR.continu) {
      val o2: BTSConditionalExpression = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val r0: MOption[BTSExp] = transformBTSExp(o2.guard)
      val r1: MOption[BTSExp] = transformBTSExp(o2.t)
      val r2: MOption[BTSExp] = transformBTSExp(o2.f)
      if (hasChanged || r0.nonEmpty || r1.nonEmpty || r2.nonEmpty)
        MSome(o2(guard = r0.getOrElse(o2.guard), t = r1.getOrElse(o2.t), f = r2.getOrElse(o2.f)))
      else
        MNone()
    } else if (preR.resultOpt.nonEmpty) {
      MSome(preR.resultOpt.getOrElse(o))
    } else {
      MNone()
    }
    val hasChanged: B = r.nonEmpty
    val o2: BTSConditionalExpression = r.getOrElse(o)
    val postR: MOption[BTSConditionalExpression] = postBTSConditionalExpression(o2)
    if (postR.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return MSome(o2)
    } else {
      return MNone()
    }
  }

  def transformBTSRange(o: BTSRange): MOption[BTSRange] = {
    val preR: PreResult[BTSRange] = preBTSRange(o)
    val r: MOption[BTSRange] = if (preR.continu) {
      val o2: BTSRange = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val r0: MOption[BTSExp] = transformBTSExp(o2.lb)
      val r1: MOption[BTSExp] = transformBTSExp(o2.ub)
      if (hasChanged || r0.nonEmpty || r1.nonEmpty)
        MSome(o2(lb = r0.getOrElse(o2.lb), ub = r1.getOrElse(o2.ub)))
      else
        MNone()
    } else if (preR.resultOpt.nonEmpty) {
      MSome(preR.resultOpt.getOrElse(o))
    } else {
      MNone()
    }
    val hasChanged: B = r.nonEmpty
    val o2: BTSRange = r.getOrElse(o)
    val postR: MOption[BTSRange] = postBTSRange(o2)
    if (postR.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return MSome(o2)
    } else {
      return MNone()
    }
  }

  def transformBTSBehaviorTime(o: BTSBehaviorTime): MOption[BTSBehaviorTime] = {
    val preR: PreResult[BTSBehaviorTime] = preBTSBehaviorTime(o)
    val r: MOption[BTSBehaviorTime] = if (preR.continu) {
      val o2: BTSBehaviorTime = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      if (hasChanged)
        MSome(o2)
      else
        MNone()
    } else if (preR.resultOpt.nonEmpty) {
      MSome(preR.resultOpt.getOrElse(o))
    } else {
      MNone()
    }
    val hasChanged: B = r.nonEmpty
    val o2: BTSBehaviorTime = r.getOrElse(o)
    val postR: MOption[BTSBehaviorTime] = postBTSBehaviorTime(o2)
    if (postR.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return MSome(o2)
    } else {
      return MNone()
    }
  }

  def transformBTSType(o: BTSType): MOption[BTSType] = {
    val preR: PreResult[BTSType] = preBTSType(o)
    val r: MOption[BTSType] = if (preR.continu) {
      val o2: BTSType = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      val rOpt: MOption[BTSType] = o2 match {
        case o2: BTSClassifier =>
          val r0: MOption[Classifier] = transformClassifier(o2.classifier)
          if (hasChanged || r0.nonEmpty)
            MSome(o2(classifier = r0.getOrElse(o2.classifier)))
          else
            MNone()
      }
      rOpt
    } else if (preR.resultOpt.nonEmpty) {
      MSome(preR.resultOpt.getOrElse(o))
    } else {
      MNone()
    }
    val hasChanged: B = r.nonEmpty
    val o2: BTSType = r.getOrElse(o)
    val postR: MOption[BTSType] = postBTSType(o2)
    if (postR.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return MSome(o2)
    } else {
      return MNone()
    }
  }

  def transformTODO(o: TODO): MOption[TODO] = {
    val preR: PreResult[TODO] = preTODO(o)
    val r: MOption[TODO] = if (preR.continu) {
      val o2: TODO = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      if (hasChanged)
        MSome(o2)
      else
        MNone()
    } else if (preR.resultOpt.nonEmpty) {
      MSome(preR.resultOpt.getOrElse(o))
    } else {
      MNone()
    }
    val hasChanged: B = r.nonEmpty
    val o2: TODO = r.getOrElse(o)
    val postR: MOption[TODO] = postTODO(o2)
    if (postR.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return MSome(o2)
    } else {
      return MNone()
    }
  }

  def transformUnitProp(o: UnitProp): MOption[UnitProp] = {
    val preR: PreResult[UnitProp] = preUnitProp(o) match {
     case PreResult(continu, MSome(r: UnitProp)) => PreResult(continu, MSome[UnitProp](r))
     case PreResult(_, MSome(_)) => halt("Can only produce object of type UnitProp")
     case PreResult(continu, _) => PreResult(continu, MNone[UnitProp]())
    }
    val r: MOption[UnitProp] = if (preR.continu) {
      val o2: UnitProp = preR.resultOpt.getOrElse(o)
      val hasChanged: B = preR.resultOpt.nonEmpty
      if (hasChanged)
        MSome(o2)
      else
        MNone()
    } else if (preR.resultOpt.nonEmpty) {
      MSome(preR.resultOpt.getOrElse(o))
    } else {
      MNone()
    }
    val hasChanged: B = r.nonEmpty
    val o2: UnitProp = r.getOrElse(o)
    val postR: MOption[UnitProp] = postUnitProp(o2) match {
     case MSome(result: UnitProp) => MSome[UnitProp](result)
     case MSome(_) => halt("Can only produce object of type UnitProp")
     case _ => MNone[UnitProp]()
    }
    if (postR.nonEmpty) {
      return postR
    } else if (hasChanged) {
      return MSome(o2)
    } else {
      return MNone()
    }
  }

}