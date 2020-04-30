// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class DescribeFleetHistoryResponseBuilderOps(val self: DescribeFleetHistoryResponse.Builder) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def historyRecordsAsScala(value: Option[Seq[HistoryRecordEntry]]): DescribeFleetHistoryResponse.Builder = {
                value.filter(_.nonEmpty).fold(self){ v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.historyRecords(v.asJava) } 
            }

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def lastEvaluatedTimeAsScala(value: Option[java.time.Instant]): DescribeFleetHistoryResponse.Builder = {
            value.fold(self){ v => self.lastEvaluatedTime(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def nextTokenAsScala(value: Option[String]): DescribeFleetHistoryResponse.Builder = {
            value.fold(self){ v => self.nextToken(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def fleetIdAsScala(value: Option[String]): DescribeFleetHistoryResponse.Builder = {
            value.fold(self){ v => self.fleetId(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def startTimeAsScala(value: Option[java.time.Instant]): DescribeFleetHistoryResponse.Builder = {
            value.fold(self){ v => self.startTime(v) }
            } 


}

final class DescribeFleetHistoryResponseOps(val self: DescribeFleetHistoryResponse) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
                final def historyRecordsAsScala: Option[Seq[HistoryRecordEntry]] = Option(self.historyRecords).map{ v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def lastEvaluatedTimeAsScala: Option[java.time.Instant] = Option(self.lastEvaluatedTime) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def nextTokenAsScala: Option[String] = Option(self.nextToken) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def fleetIdAsScala: Option[String] = Option(self.fleetId) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def startTimeAsScala: Option[java.time.Instant] = Option(self.startTime) 


}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDescribeFleetHistoryResponseOps {

implicit def toDescribeFleetHistoryResponseBuilderOps(v: DescribeFleetHistoryResponse.Builder): DescribeFleetHistoryResponseBuilderOps = new DescribeFleetHistoryResponseBuilderOps(v)

implicit def toDescribeFleetHistoryResponseOps(v: DescribeFleetHistoryResponse): DescribeFleetHistoryResponseOps = new DescribeFleetHistoryResponseOps(v)

}

