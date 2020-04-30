// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class DescribeFlowLogsResponseBuilderOps(val self: DescribeFlowLogsResponse.Builder) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def flowLogsAsScala(value: Option[Seq[FlowLog]]): DescribeFlowLogsResponse.Builder = {
                value.filter(_.nonEmpty).fold(self){ v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.flowLogs(v.asJava) } 
            }

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def nextTokenAsScala(value: Option[String]): DescribeFlowLogsResponse.Builder = {
            value.fold(self){ v => self.nextToken(v) }
            } 


}

final class DescribeFlowLogsResponseOps(val self: DescribeFlowLogsResponse) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
                final def flowLogsAsScala: Option[Seq[FlowLog]] = Option(self.flowLogs).map{ v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def nextTokenAsScala: Option[String] = Option(self.nextToken) 


}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDescribeFlowLogsResponseOps {

implicit def toDescribeFlowLogsResponseBuilderOps(v: DescribeFlowLogsResponse.Builder): DescribeFlowLogsResponseBuilderOps = new DescribeFlowLogsResponseBuilderOps(v)

implicit def toDescribeFlowLogsResponseOps(v: DescribeFlowLogsResponse): DescribeFlowLogsResponseOps = new DescribeFlowLogsResponseOps(v)

}

