// Auto-Generated
package com.github.j5ik2o.reactive.aws.cloudformation.model.ops

import software.amazon.awssdk.services.cloudformation.model._

final class DescribeStackEventsResponseBuilderOps(val self: DescribeStackEventsResponse.Builder) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def stackEventsAsScala(value: Option[Seq[StackEvent]]): DescribeStackEventsResponse.Builder = {
                value.filter(_.nonEmpty).fold(self){ v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.stackEvents(v.asJava) } 
            }

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def nextTokenAsScala(value: Option[String]): DescribeStackEventsResponse.Builder = {
            value.fold(self){ v => self.nextToken(v) }
            } 


}

final class DescribeStackEventsResponseOps(val self: DescribeStackEventsResponse) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
                final def stackEventsAsScala: Option[Seq[StackEvent]] = Option(self.stackEvents).map{ v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def nextTokenAsScala: Option[String] = Option(self.nextToken) 


}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDescribeStackEventsResponseOps {

implicit def toDescribeStackEventsResponseBuilderOps(v: DescribeStackEventsResponse.Builder): DescribeStackEventsResponseBuilderOps = new DescribeStackEventsResponseBuilderOps(v)

implicit def toDescribeStackEventsResponseOps(v: DescribeStackEventsResponse): DescribeStackEventsResponseOps = new DescribeStackEventsResponseOps(v)

}

