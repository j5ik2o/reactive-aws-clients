// Auto-Generated
package com.github.j5ik2o.reactive.aws.ecs.model.ops

import software.amazon.awssdk.services.ecs.model._

final class DescribeServicesResponseBuilderOps(val self: DescribeServicesResponse.Builder) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def servicesAsScala(value: Option[Seq[Service]]): DescribeServicesResponse.Builder = {
                value.filter(_.nonEmpty).fold(self){ v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.services(v.asJava) } 
            }

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def failuresAsScala(value: Option[Seq[Failure]]): DescribeServicesResponse.Builder = {
                value.filter(_.nonEmpty).fold(self){ v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.failures(v.asJava) } 
            }


}

final class DescribeServicesResponseOps(val self: DescribeServicesResponse) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
                final def servicesAsScala: Option[Seq[Service]] = Option(self.services).map{ v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
                final def failuresAsScala: Option[Seq[Failure]] = Option(self.failures).map{ v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala } 


}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDescribeServicesResponseOps {

implicit def toDescribeServicesResponseBuilderOps(v: DescribeServicesResponse.Builder): DescribeServicesResponseBuilderOps = new DescribeServicesResponseBuilderOps(v)

implicit def toDescribeServicesResponseOps(v: DescribeServicesResponse): DescribeServicesResponseOps = new DescribeServicesResponseOps(v)

}

