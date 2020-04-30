// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class ConversionTaskBuilderOps(val self: ConversionTask.Builder) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def conversionTaskIdAsScala(value: Option[String]): ConversionTask.Builder = {
            value.fold(self){ v => self.conversionTaskId(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def expirationTimeAsScala(value: Option[String]): ConversionTask.Builder = {
            value.fold(self){ v => self.expirationTime(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def importInstanceAsScala(value: Option[ImportInstanceTaskDetails]): ConversionTask.Builder = {
            value.fold(self){ v => self.importInstance(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def importVolumeAsScala(value: Option[ImportVolumeTaskDetails]): ConversionTask.Builder = {
            value.fold(self){ v => self.importVolume(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def stateAsScala(value: Option[ConversionTaskState]): ConversionTask.Builder = {
            value.fold(self){ v => self.state(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def statusMessageAsScala(value: Option[String]): ConversionTask.Builder = {
            value.fold(self){ v => self.statusMessage(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def tagsAsScala(value: Option[Seq[Tag]]): ConversionTask.Builder = {
                value.filter(_.nonEmpty).fold(self){ v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.tags(v.asJava) } 
            }


}

final class ConversionTaskOps(val self: ConversionTask) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def conversionTaskIdAsScala: Option[String] = Option(self.conversionTaskId) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def expirationTimeAsScala: Option[String] = Option(self.expirationTime) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def importInstanceAsScala: Option[ImportInstanceTaskDetails] = Option(self.importInstance) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def importVolumeAsScala: Option[ImportVolumeTaskDetails] = Option(self.importVolume) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def stateAsScala: Option[ConversionTaskState] = Option(self.state) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def statusMessageAsScala: Option[String] = Option(self.statusMessage) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
                final def tagsAsScala: Option[Seq[Tag]] = Option(self.tags).map{ v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala } 


}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToConversionTaskOps {

implicit def toConversionTaskBuilderOps(v: ConversionTask.Builder): ConversionTaskBuilderOps = new ConversionTaskBuilderOps(v)

implicit def toConversionTaskOps(v: ConversionTask): ConversionTaskOps = new ConversionTaskOps(v)

}

