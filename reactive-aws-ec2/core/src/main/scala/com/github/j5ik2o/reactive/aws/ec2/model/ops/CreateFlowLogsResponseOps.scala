// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class CreateFlowLogsResponseBuilderOps(val self: CreateFlowLogsResponse.Builder) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def clientTokenAsScala(value: Option[String]): CreateFlowLogsResponse.Builder = {
            value.fold(self){ v => self.clientToken(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def flowLogIdsAsScala(value: Option[Seq[String]]): CreateFlowLogsResponse.Builder = {
                value.filter(_.nonEmpty).fold(self){ v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.flowLogIds(v.asJava) } 
            }

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def unsuccessfulAsScala(value: Option[Seq[UnsuccessfulItem]]): CreateFlowLogsResponse.Builder = {
                value.filter(_.nonEmpty).fold(self){ v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.unsuccessful(v.asJava) } 
            }


}

final class CreateFlowLogsResponseOps(val self: CreateFlowLogsResponse) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def clientTokenAsScala: Option[String] = Option(self.clientToken) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
                final def flowLogIdsAsScala: Option[Seq[String]] = Option(self.flowLogIds).map{ v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
                final def unsuccessfulAsScala: Option[Seq[UnsuccessfulItem]] = Option(self.unsuccessful).map{ v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala } 


}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToCreateFlowLogsResponseOps {

implicit def toCreateFlowLogsResponseBuilderOps(v: CreateFlowLogsResponse.Builder): CreateFlowLogsResponseBuilderOps = new CreateFlowLogsResponseBuilderOps(v)

implicit def toCreateFlowLogsResponseOps(v: CreateFlowLogsResponse): CreateFlowLogsResponseOps = new CreateFlowLogsResponseOps(v)

}

