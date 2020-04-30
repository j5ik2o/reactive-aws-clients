// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class DescribeHostsResponseBuilderOps(val self: DescribeHostsResponse.Builder) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def hostsAsScala(value: Option[Seq[Host]]): DescribeHostsResponse.Builder = {
                value.filter(_.nonEmpty).fold(self){ v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.hosts(v.asJava) } 
            }

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def nextTokenAsScala(value: Option[String]): DescribeHostsResponse.Builder = {
            value.fold(self){ v => self.nextToken(v) }
            } 


}

final class DescribeHostsResponseOps(val self: DescribeHostsResponse) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
                final def hostsAsScala: Option[Seq[Host]] = Option(self.hosts).map{ v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def nextTokenAsScala: Option[String] = Option(self.nextToken) 


}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDescribeHostsResponseOps {

implicit def toDescribeHostsResponseBuilderOps(v: DescribeHostsResponse.Builder): DescribeHostsResponseBuilderOps = new DescribeHostsResponseBuilderOps(v)

implicit def toDescribeHostsResponseOps(v: DescribeHostsResponse): DescribeHostsResponseOps = new DescribeHostsResponseOps(v)

}

