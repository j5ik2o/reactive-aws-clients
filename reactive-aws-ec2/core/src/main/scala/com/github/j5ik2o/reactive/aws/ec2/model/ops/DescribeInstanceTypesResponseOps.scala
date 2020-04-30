// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class DescribeInstanceTypesResponseBuilderOps(val self: DescribeInstanceTypesResponse.Builder) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def instanceTypesAsScala(value: Option[Seq[InstanceTypeInfo]]): DescribeInstanceTypesResponse.Builder = {
                value.filter(_.nonEmpty).fold(self){ v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.instanceTypes(v.asJava) } 
            }

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def nextTokenAsScala(value: Option[String]): DescribeInstanceTypesResponse.Builder = {
            value.fold(self){ v => self.nextToken(v) }
            } 


}

final class DescribeInstanceTypesResponseOps(val self: DescribeInstanceTypesResponse) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
                final def instanceTypesAsScala: Option[Seq[InstanceTypeInfo]] = Option(self.instanceTypes).map{ v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def nextTokenAsScala: Option[String] = Option(self.nextToken) 


}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDescribeInstanceTypesResponseOps {

implicit def toDescribeInstanceTypesResponseBuilderOps(v: DescribeInstanceTypesResponse.Builder): DescribeInstanceTypesResponseBuilderOps = new DescribeInstanceTypesResponseBuilderOps(v)

implicit def toDescribeInstanceTypesResponseOps(v: DescribeInstanceTypesResponse): DescribeInstanceTypesResponseOps = new DescribeInstanceTypesResponseOps(v)

}

