// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class DescribeIdFormatResponseBuilderOps(val self: DescribeIdFormatResponse.Builder) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def statusesAsScala(value: Option[Seq[IdFormat]]): DescribeIdFormatResponse.Builder = {
                value.filter(_.nonEmpty).fold(self){ v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.statuses(v.asJava) } 
            }


}

final class DescribeIdFormatResponseOps(val self: DescribeIdFormatResponse) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
                final def statusesAsScala: Option[Seq[IdFormat]] = Option(self.statuses).map{ v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala } 


}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDescribeIdFormatResponseOps {

implicit def toDescribeIdFormatResponseBuilderOps(v: DescribeIdFormatResponse.Builder): DescribeIdFormatResponseBuilderOps = new DescribeIdFormatResponseBuilderOps(v)

implicit def toDescribeIdFormatResponseOps(v: DescribeIdFormatResponse): DescribeIdFormatResponseOps = new DescribeIdFormatResponseOps(v)

}

