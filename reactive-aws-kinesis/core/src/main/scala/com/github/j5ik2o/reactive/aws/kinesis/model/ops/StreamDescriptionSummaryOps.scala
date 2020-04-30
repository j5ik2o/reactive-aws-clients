// Auto-Generated
package com.github.j5ik2o.reactive.aws.kinesis.model.ops

import software.amazon.awssdk.services.kinesis.model._

final class StreamDescriptionSummaryBuilderOps(val self: StreamDescriptionSummary.Builder) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def streamNameAsScala(value: Option[String]): StreamDescriptionSummary.Builder = {
            value.fold(self){ v => self.streamName(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def streamARNAsScala(value: Option[String]): StreamDescriptionSummary.Builder = {
            value.fold(self){ v => self.streamARN(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def streamStatusAsScala(value: Option[StreamStatus]): StreamDescriptionSummary.Builder = {
            value.fold(self){ v => self.streamStatus(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def retentionPeriodHoursAsScala(value: Option[Int]): StreamDescriptionSummary.Builder = {
            value.fold(self){ v => self.retentionPeriodHours(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def streamCreationTimestampAsScala(value: Option[java.time.Instant]): StreamDescriptionSummary.Builder = {
            value.fold(self){ v => self.streamCreationTimestamp(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def enhancedMonitoringAsScala(value: Option[Seq[EnhancedMetrics]]): StreamDescriptionSummary.Builder = {
                value.filter(_.nonEmpty).fold(self){ v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.enhancedMonitoring(v.asJava) } 
            }

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def encryptionTypeAsScala(value: Option[EncryptionType]): StreamDescriptionSummary.Builder = {
            value.fold(self){ v => self.encryptionType(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def keyIdAsScala(value: Option[String]): StreamDescriptionSummary.Builder = {
            value.fold(self){ v => self.keyId(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def openShardCountAsScala(value: Option[Int]): StreamDescriptionSummary.Builder = {
            value.fold(self){ v => self.openShardCount(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def consumerCountAsScala(value: Option[Int]): StreamDescriptionSummary.Builder = {
            value.fold(self){ v => self.consumerCount(v) }
            } 


}

final class StreamDescriptionSummaryOps(val self: StreamDescriptionSummary) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def streamNameAsScala: Option[String] = Option(self.streamName) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def streamARNAsScala: Option[String] = Option(self.streamARN) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def streamStatusAsScala: Option[StreamStatus] = Option(self.streamStatus) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def retentionPeriodHoursAsScala: Option[Int] = Option(self.retentionPeriodHours) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def streamCreationTimestampAsScala: Option[java.time.Instant] = Option(self.streamCreationTimestamp) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
                final def enhancedMonitoringAsScala: Option[Seq[EnhancedMetrics]] = Option(self.enhancedMonitoring).map{ v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def encryptionTypeAsScala: Option[EncryptionType] = Option(self.encryptionType) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def keyIdAsScala: Option[String] = Option(self.keyId) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def openShardCountAsScala: Option[Int] = Option(self.openShardCount) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def consumerCountAsScala: Option[Int] = Option(self.consumerCount) 


}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToStreamDescriptionSummaryOps {

implicit def toStreamDescriptionSummaryBuilderOps(v: StreamDescriptionSummary.Builder): StreamDescriptionSummaryBuilderOps = new StreamDescriptionSummaryBuilderOps(v)

implicit def toStreamDescriptionSummaryOps(v: StreamDescriptionSummary): StreamDescriptionSummaryOps = new StreamDescriptionSummaryOps(v)

}

