// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class ModifyTrafficMirrorFilterRuleRequestBuilderOps(val self: ModifyTrafficMirrorFilterRuleRequest.Builder) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def trafficMirrorFilterRuleIdAsScala(value: Option[String]): ModifyTrafficMirrorFilterRuleRequest.Builder = {
            value.fold(self){ v => self.trafficMirrorFilterRuleId(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def trafficDirectionAsScala(value: Option[TrafficDirection]): ModifyTrafficMirrorFilterRuleRequest.Builder = {
            value.fold(self){ v => self.trafficDirection(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def ruleNumberAsScala(value: Option[Int]): ModifyTrafficMirrorFilterRuleRequest.Builder = {
            value.fold(self){ v => self.ruleNumber(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def ruleActionAsScala(value: Option[TrafficMirrorRuleAction]): ModifyTrafficMirrorFilterRuleRequest.Builder = {
            value.fold(self){ v => self.ruleAction(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def destinationPortRangeAsScala(value: Option[TrafficMirrorPortRangeRequest]): ModifyTrafficMirrorFilterRuleRequest.Builder = {
            value.fold(self){ v => self.destinationPortRange(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def sourcePortRangeAsScala(value: Option[TrafficMirrorPortRangeRequest]): ModifyTrafficMirrorFilterRuleRequest.Builder = {
            value.fold(self){ v => self.sourcePortRange(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def protocolAsScala(value: Option[Int]): ModifyTrafficMirrorFilterRuleRequest.Builder = {
            value.fold(self){ v => self.protocol(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def destinationCidrBlockAsScala(value: Option[String]): ModifyTrafficMirrorFilterRuleRequest.Builder = {
            value.fold(self){ v => self.destinationCidrBlock(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def sourceCidrBlockAsScala(value: Option[String]): ModifyTrafficMirrorFilterRuleRequest.Builder = {
            value.fold(self){ v => self.sourceCidrBlock(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def descriptionAsScala(value: Option[String]): ModifyTrafficMirrorFilterRuleRequest.Builder = {
            value.fold(self){ v => self.description(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def removeFieldsAsScala(value: Option[Seq[TrafficMirrorFilterRuleField]]): ModifyTrafficMirrorFilterRuleRequest.Builder = {
                value.filter(_.nonEmpty).fold(self){ v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.removeFields(v.asJava) } 
            }


}

final class ModifyTrafficMirrorFilterRuleRequestOps(val self: ModifyTrafficMirrorFilterRuleRequest) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def trafficMirrorFilterRuleIdAsScala: Option[String] = Option(self.trafficMirrorFilterRuleId) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def trafficDirectionAsScala: Option[TrafficDirection] = Option(self.trafficDirection) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def ruleNumberAsScala: Option[Int] = Option(self.ruleNumber) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def ruleActionAsScala: Option[TrafficMirrorRuleAction] = Option(self.ruleAction) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def destinationPortRangeAsScala: Option[TrafficMirrorPortRangeRequest] = Option(self.destinationPortRange) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def sourcePortRangeAsScala: Option[TrafficMirrorPortRangeRequest] = Option(self.sourcePortRange) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def protocolAsScala: Option[Int] = Option(self.protocol) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def destinationCidrBlockAsScala: Option[String] = Option(self.destinationCidrBlock) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def sourceCidrBlockAsScala: Option[String] = Option(self.sourceCidrBlock) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def descriptionAsScala: Option[String] = Option(self.description) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
                final def removeFieldsAsScala: Option[Seq[TrafficMirrorFilterRuleField]] = Option(self.removeFields).map{ v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala } 


}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToModifyTrafficMirrorFilterRuleRequestOps {

implicit def toModifyTrafficMirrorFilterRuleRequestBuilderOps(v: ModifyTrafficMirrorFilterRuleRequest.Builder): ModifyTrafficMirrorFilterRuleRequestBuilderOps = new ModifyTrafficMirrorFilterRuleRequestBuilderOps(v)

implicit def toModifyTrafficMirrorFilterRuleRequestOps(v: ModifyTrafficMirrorFilterRuleRequest): ModifyTrafficMirrorFilterRuleRequestOps = new ModifyTrafficMirrorFilterRuleRequestOps(v)

}

