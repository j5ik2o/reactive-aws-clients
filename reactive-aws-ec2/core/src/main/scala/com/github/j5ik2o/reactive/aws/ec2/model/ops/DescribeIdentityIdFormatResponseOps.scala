// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class DescribeIdentityIdFormatResponseBuilderOps(val self: DescribeIdentityIdFormatResponse.Builder) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def statusesAsScala(value: Option[Seq[IdFormat]]): DescribeIdentityIdFormatResponse.Builder = {
                value.filter(_.nonEmpty).fold(self){ v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.statuses(v.asJava) } 
            }


}

final class DescribeIdentityIdFormatResponseOps(val self: DescribeIdentityIdFormatResponse) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
                final def statusesAsScala: Option[Seq[IdFormat]] = Option(self.statuses).map{ v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala } 


}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDescribeIdentityIdFormatResponseOps {

implicit def toDescribeIdentityIdFormatResponseBuilderOps(v: DescribeIdentityIdFormatResponse.Builder): DescribeIdentityIdFormatResponseBuilderOps = new DescribeIdentityIdFormatResponseBuilderOps(v)

implicit def toDescribeIdentityIdFormatResponseOps(v: DescribeIdentityIdFormatResponse): DescribeIdentityIdFormatResponseOps = new DescribeIdentityIdFormatResponseOps(v)

}

