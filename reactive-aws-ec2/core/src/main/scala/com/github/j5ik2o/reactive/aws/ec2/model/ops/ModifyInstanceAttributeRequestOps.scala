// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class ModifyInstanceAttributeRequestBuilderOps(val self: ModifyInstanceAttributeRequest.Builder) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def sourceDestCheckAsScala(value: Option[AttributeBooleanValue]): ModifyInstanceAttributeRequest.Builder = {
            value.fold(self){ v => self.sourceDestCheck(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def attributeAsScala(value: Option[InstanceAttributeName]): ModifyInstanceAttributeRequest.Builder = {
            value.fold(self){ v => self.attribute(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def blockDeviceMappingsAsScala(value: Option[Seq[InstanceBlockDeviceMappingSpecification]]): ModifyInstanceAttributeRequest.Builder = {
                value.filter(_.nonEmpty).fold(self){ v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.blockDeviceMappings(v.asJava) } 
            }

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def disableApiTerminationAsScala(value: Option[AttributeBooleanValue]): ModifyInstanceAttributeRequest.Builder = {
            value.fold(self){ v => self.disableApiTermination(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def ebsOptimizedAsScala(value: Option[AttributeBooleanValue]): ModifyInstanceAttributeRequest.Builder = {
            value.fold(self){ v => self.ebsOptimized(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def enaSupportAsScala(value: Option[AttributeBooleanValue]): ModifyInstanceAttributeRequest.Builder = {
            value.fold(self){ v => self.enaSupport(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def groupsAsScala(value: Option[Seq[String]]): ModifyInstanceAttributeRequest.Builder = {
                value.filter(_.nonEmpty).fold(self){ v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.groups(v.asJava) } 
            }

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def instanceIdAsScala(value: Option[String]): ModifyInstanceAttributeRequest.Builder = {
            value.fold(self){ v => self.instanceId(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def instanceInitiatedShutdownBehaviorAsScala(value: Option[AttributeValue]): ModifyInstanceAttributeRequest.Builder = {
            value.fold(self){ v => self.instanceInitiatedShutdownBehavior(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def instanceTypeAsScala(value: Option[AttributeValue]): ModifyInstanceAttributeRequest.Builder = {
            value.fold(self){ v => self.instanceType(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def kernelAsScala(value: Option[AttributeValue]): ModifyInstanceAttributeRequest.Builder = {
            value.fold(self){ v => self.kernel(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def ramdiskAsScala(value: Option[AttributeValue]): ModifyInstanceAttributeRequest.Builder = {
            value.fold(self){ v => self.ramdisk(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def sriovNetSupportAsScala(value: Option[AttributeValue]): ModifyInstanceAttributeRequest.Builder = {
            value.fold(self){ v => self.sriovNetSupport(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def userDataAsScala(value: Option[BlobAttributeValue]): ModifyInstanceAttributeRequest.Builder = {
            value.fold(self){ v => self.userData(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def valueAsScala(value: Option[String]): ModifyInstanceAttributeRequest.Builder = {
            value.fold(self){ v => self.value(v) }
            } 


}

final class ModifyInstanceAttributeRequestOps(val self: ModifyInstanceAttributeRequest) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def sourceDestCheckAsScala: Option[AttributeBooleanValue] = Option(self.sourceDestCheck) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def attributeAsScala: Option[InstanceAttributeName] = Option(self.attribute) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
                final def blockDeviceMappingsAsScala: Option[Seq[InstanceBlockDeviceMappingSpecification]] = Option(self.blockDeviceMappings).map{ v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def disableApiTerminationAsScala: Option[AttributeBooleanValue] = Option(self.disableApiTermination) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def ebsOptimizedAsScala: Option[AttributeBooleanValue] = Option(self.ebsOptimized) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def enaSupportAsScala: Option[AttributeBooleanValue] = Option(self.enaSupport) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
                final def groupsAsScala: Option[Seq[String]] = Option(self.groups).map{ v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def instanceIdAsScala: Option[String] = Option(self.instanceId) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def instanceInitiatedShutdownBehaviorAsScala: Option[AttributeValue] = Option(self.instanceInitiatedShutdownBehavior) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def instanceTypeAsScala: Option[AttributeValue] = Option(self.instanceType) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def kernelAsScala: Option[AttributeValue] = Option(self.kernel) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def ramdiskAsScala: Option[AttributeValue] = Option(self.ramdisk) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def sriovNetSupportAsScala: Option[AttributeValue] = Option(self.sriovNetSupport) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def userDataAsScala: Option[BlobAttributeValue] = Option(self.userData) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def valueAsScala: Option[String] = Option(self.value) 


}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToModifyInstanceAttributeRequestOps {

implicit def toModifyInstanceAttributeRequestBuilderOps(v: ModifyInstanceAttributeRequest.Builder): ModifyInstanceAttributeRequestBuilderOps = new ModifyInstanceAttributeRequestBuilderOps(v)

implicit def toModifyInstanceAttributeRequestOps(v: ModifyInstanceAttributeRequest): ModifyInstanceAttributeRequestOps = new ModifyInstanceAttributeRequestOps(v)

}

