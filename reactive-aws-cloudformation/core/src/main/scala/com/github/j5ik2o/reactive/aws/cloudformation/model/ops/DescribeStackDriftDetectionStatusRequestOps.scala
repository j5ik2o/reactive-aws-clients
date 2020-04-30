// Auto-Generated
package com.github.j5ik2o.reactive.aws.cloudformation.model.ops

import software.amazon.awssdk.services.cloudformation.model._

final class DescribeStackDriftDetectionStatusRequestBuilderOps(val self: DescribeStackDriftDetectionStatusRequest.Builder) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def stackDriftDetectionIdAsScala(value: Option[String]): DescribeStackDriftDetectionStatusRequest.Builder = {
            value.fold(self){ v => self.stackDriftDetectionId(v) }
            } 


}

final class DescribeStackDriftDetectionStatusRequestOps(val self: DescribeStackDriftDetectionStatusRequest) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def stackDriftDetectionIdAsScala: Option[String] = Option(self.stackDriftDetectionId) 


}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDescribeStackDriftDetectionStatusRequestOps {

implicit def toDescribeStackDriftDetectionStatusRequestBuilderOps(v: DescribeStackDriftDetectionStatusRequest.Builder): DescribeStackDriftDetectionStatusRequestBuilderOps = new DescribeStackDriftDetectionStatusRequestBuilderOps(v)

implicit def toDescribeStackDriftDetectionStatusRequestOps(v: DescribeStackDriftDetectionStatusRequest): DescribeStackDriftDetectionStatusRequestOps = new DescribeStackDriftDetectionStatusRequestOps(v)

}

