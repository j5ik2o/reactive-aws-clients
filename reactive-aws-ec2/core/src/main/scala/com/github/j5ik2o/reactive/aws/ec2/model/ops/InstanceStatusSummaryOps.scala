// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class InstanceStatusSummaryBuilderOps(val self: InstanceStatusSummary.Builder) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def detailsAsScala(value: Option[Seq[InstanceStatusDetails]]): InstanceStatusSummary.Builder = {
                value.filter(_.nonEmpty).fold(self){ v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.details(v.asJava) } 
            }

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def statusAsScala(value: Option[SummaryStatus]): InstanceStatusSummary.Builder = {
            value.fold(self){ v => self.status(v) }
            } 


}

final class InstanceStatusSummaryOps(val self: InstanceStatusSummary) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
                final def detailsAsScala: Option[Seq[InstanceStatusDetails]] = Option(self.details).map{ v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def statusAsScala: Option[SummaryStatus] = Option(self.status) 


}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToInstanceStatusSummaryOps {

implicit def toInstanceStatusSummaryBuilderOps(v: InstanceStatusSummary.Builder): InstanceStatusSummaryBuilderOps = new InstanceStatusSummaryBuilderOps(v)

implicit def toInstanceStatusSummaryOps(v: InstanceStatusSummary): InstanceStatusSummaryOps = new InstanceStatusSummaryOps(v)

}

