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

package org.sireum.aadl.ir;

import java.util.List;

public class AadlASTJavaFactory {

    public enum AccessType {
        Provides, Requires
    }

    public enum AccessCategory {
        Bus, Data, Subprogram, SubprogramGroup, VirtualBus
    }

    public enum ComponentCategory {
        Abstract, Bus, Data, Device, Memory, Process, Processor, Subprogram,
        SubprogramGroup, System, Thread, ThreadGroup, VirtualBus, VirtualProcessor
    }

    public enum Direction {
        In, Out, InOut, None
    }

    public enum FeatureCategory {
        AbstractFeature, BusAccess, DataAccess, DataPort, EventPort, EventDataPort,
        FeatureGroup, Parameter, SubprogramAccess, SubprogramAccessGroup
    }

    public enum ConnectionKind {
        Feature, Access, Parameter, Port, ModeTransition, FeatureGroup
    }

    public enum FlowKind {
        Source, Sink, Path
    }

    private static AadlASTFactory f = new AadlASTFactory();

    public static Aadl aadl(List<Component> components,
                            List<Emv2Library> errorLib,
                            List<Component> dataComponents) {
        return f.aadl(components, errorLib, dataComponents);
    }

    public static Name name(List<String> name) {
        return f.name(name);
    }

    public static Component component(Name identifier,
                                      ComponentCategory category,
                                      Classifier classifier,
                                      List<Feature> features,
                                      List<Component> subComponents,
                                      List<Connection> connections,
                                      List<ConnectionInstance> connectionInstances,
                                      List<Property> properties,
                                      List<Flow> flows,
                                      List<Mode> modes,
                                      List<Annex> annexes) {
        return f.component(identifier,
                category, classifier, features, subComponents, connections,
                connectionInstances, properties, flows, modes, annexes);
    }

    public static Classifier classifier(String name) {
        return f.classifier(name);
    }

    public static FeatureEnd featureEnd(Name identifier,
                                        Direction direction,
                                        FeatureCategory category,
                                        Classifier classifier,
                                        List<Property> properties) {
        return f.featureEnd(identifier, direction, category, classifier, properties);
    }

    public static FeatureGroup featureGroup(Name identifier,
                                            List<Feature> features,
                                            boolean isInverse,
                                            FeatureCategory category,
                                            //Classifier classifier,
                                            List<Property> properties) {
        return f.featureGroup(identifier, features, isInverse, category, properties);
    }

    public static FeatureAccess featureAccess(Name identifier,
                                              FeatureCategory category,
                                              Classifier classifier,
                                              AccessType accessType,
                                              AccessCategory accessCategory,
                                              List<Property> properties) {
        return f.featureAccess(identifier, category, classifier, accessType, accessCategory, properties);
    }

    public static Connection connection(Name name,
                                        List<EndPoint> src,
                                        List<EndPoint> dst,
                                        ConnectionKind kind,
                                        boolean isBiDirectional,
                                        List<Name> connectionInstances,
                                        List<Property> properties) {
        return f.connection(name, src, dst, kind, isBiDirectional, connectionInstances, properties);
    }

    public static ConnectionInstance connectionInstance(Name name,
                                                        EndPoint src,
                                                        EndPoint dst,
                                                        ConnectionKind kind,
                                                        List<ConnectionReference> connectionRefs,
                                                        List<Property> properties) {
        return f.connectionInstance(name, src, dst, kind, connectionRefs, properties);
    }

    public static ConnectionReference connectionReference(Name name,
                                                          Name context,
                                                          boolean isParent) {
        return f.connectionReference(name, context, isParent);
    }

    public static EndPoint endPoint(Name component,
                                    Name feature,
                                    Direction direction) {
        return f.endPoint(component, feature, direction);
    }

    public static Property property(Name name,
                                    List<PropertyValue> propertyValues) {
        return f.property(name, propertyValues);
    }

    public static ClassifierProp classifierProp(String name) {
        return f.classifierProp(name);
    }

    public static RangeProp rangeProp(UnitProp low,
                                      UnitProp high) {
        return f.rangeProp(low, high);
    }

    public static RecordProp recordProp(List<Property> properties) {
        return f.recordProp(properties);
    }

    public static ReferenceProp referenceProp(Name value) {
        return f.referenceProp(value);
    }

    public static UnitProp unitProp(String value,
                                    String unit) {
        return f.unitProp(value, unit);
    }

    public static ValueProp valueProp(String value) {
        return f.valueProp(value);
    }

    public static Mode mode(Name name) {
        return f.mode(name);
    }

    public static Flow flow(Name name,
                            FlowKind kind,
                            Feature source,
                            Feature sink) {
        return f.flow(name, kind, source, sink);
    }

    //-------------EMv2 Clause------------------

    public static Emv2Clause emv2Clause(List<Name> libraries,
                                        List<Emv2Propagation> propagations,
                                        List<Emv2Flow> flows,
                                        Emv2BehaviorSection componentBehavior) {
        return f.emv2Clause(libraries, propagations, flows, componentBehavior);
    }

    public static Emv2Propagation emv2Propagation(PropagationDirection direction,
                                                  List<Name> propagationPoint,
                                                  List<Name> errorTokens) {
        return f.emv2Propagation(direction, propagationPoint, errorTokens);
    }

    public static Emv2Flow emv2Flow(Name identifier,
                                    FlowKind kind,
                                    Emv2Propagation sourcePropagation,
                                    Emv2Propagation sinkPropagation) {
        return f.emv2Flow(identifier, kind, sourcePropagation, sinkPropagation);
    }

    public static Emv2BehaviorSection emv2BehaviorSection(List<ErrorEvent> events,
                                                          List<ErrorTransition> transitions,
                                                          List<ErrorPropagation> propagations) {
        return f.emv2BehaviorSection(events, transitions, propagations);
    }

    public static ErrorPropagation errorPropagation(Name id,
                                                    List<Name> source,
                                                    ErrorCondition errorCondition,
                                                    List<Emv2Propagation> target) {
        return f.errorPropagation(id, source, errorCondition, target);
    }

    public enum PropagationDirection {
        In, Out
    }

    public static ConditionTrigger conditionTrigger(List<Name> events,
                                                    List<Emv2Propagation> propagationPoints) {
        return f.conditionTrigger(events, propagationPoints);
    }

    public static AndCondition andCondition(ErrorCondition lhs, ErrorCondition rhs) {
        return f.andCondition(lhs, rhs);
    }

    public static OrCondition orCondition(ErrorCondition lhs, ErrorCondition rhs) {
        return f.orCondition(lhs, rhs);
    }

    public static OrLessCondition orLessCondition(int number,
                                                  List<ConditionTrigger> conds) {
        return f.orLessCondition(number, conds);
    }

    public static OrMoreCondition orMoreCondition(int number,
                                                  List<ConditionTrigger> conds) {
        return f.orMoreCondition(number, conds);
    }

    //--------------EMv2 Library-------------------

    public static Emv2Library emv2Library(Name name,
                                          List<String> useTypes,
                                          List<ErrorTypeDef> errorTypeDefs,
                                          List<ErrorTypeSetDef> errorTypeSetDefList,
                                          List<ErrorAliseDef> alias,
                                          List<BehaveStateMachine> behaveStateMachines) {
        return f.emv2Library(name,
                useTypes, errorTypeDefs, errorTypeSetDefList, alias, behaveStateMachines);
    }

    public static ErrorTypeDef errorTypeDef(Name id, Name extendType) {
        return f.errorTypeDef(id, extendType);
    }

    public static ErrorAliseDef errorAliseDef(Name errorType, Name aliasType) {
        return f.errorAliseDef(errorType, aliasType);
    }

    public static ErrorTypeSetDef errorTypeSetDef(Name id, List<Name> errorTypes) {
        return f.errorTypeSetDef(id, errorTypes);
    }

    public static BehaveStateMachine behaveStateMachine(Name id,
                                                        List<ErrorEvent> events,
                                                        List<ErrorState> states,
                                                        List<ErrorTransition> transitions,
                                                        List<Property> properties) {
        return f.behaveStateMachine(id, events, states, transitions, properties);
    }

    public static ErrorEvent errorEvent(Name id) {
        return f.errorEvent(id);
    }

    public static ErrorState errorState(Name id, Boolean isInitial) {
        return f.errorState(id, isInitial);
    }

    public static ErrorTransition errorTransition(Name id,
                                                  Name sourceState,
                                                  ErrorCondition condition,
                                                  Name targetState) {
        return f.errorTransition(id, sourceState, condition, targetState);
    }

}
