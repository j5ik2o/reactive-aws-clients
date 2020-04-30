// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class DescribeAccountAttributesResponseBuilderOps(val self: DescribeAccountAttributesResponse.Builder) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def accountAttributesAsScala(value: Option[Seq[AccountAttribute]]): DescribeAccountAttributesResponse.Builder = {
                value.filter(_.nonEmpty).fold(self){ v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.accountAttributes(v.asJava) } 
            }


}

final class DescribeAccountAttributesResponseOps(val self: DescribeAccountAttributesResponse) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
                final def accountAttributesAsScala: Option[Seq[AccountAttribute]] = Option(self.accountAttributes).map{ v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala } 


}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDescribeAccountAttributesResponseOps {

implicit def toDescribeAccountAttributesResponseBuilderOps(v: DescribeAccountAttributesResponse.Builder): DescribeAccountAttributesResponseBuilderOps = new DescribeAccountAttributesResponseBuilderOps(v)

implicit def toDescribeAccountAttributesResponseOps(v: DescribeAccountAttributesResponse): DescribeAccountAttributesResponseOps = new DescribeAccountAttributesResponseOps(v)

}

