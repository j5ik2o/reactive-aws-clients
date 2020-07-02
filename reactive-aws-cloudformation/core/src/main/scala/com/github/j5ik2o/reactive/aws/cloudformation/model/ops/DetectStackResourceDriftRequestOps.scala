// Auto-Generated
package com.github.j5ik2o.reactive.aws.cloudformation.model.ops

import software.amazon.awssdk.services.cloudformation.model._

final class DetectStackResourceDriftRequestBuilderOps(val self: DetectStackResourceDriftRequest.Builder)
    extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def stackNameAsScala(value: Option[String]): DetectStackResourceDriftRequest.Builder = {
    value.fold(self) { v => self.stackName(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def logicalResourceIdAsScala(value: Option[String]): DetectStackResourceDriftRequest.Builder = {
    value.fold(self) { v => self.logicalResourceId(v) }
  }

}

final class DetectStackResourceDriftRequestOps(val self: DetectStackResourceDriftRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def stackNameAsScala: Option[String] = Option(self.stackName)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def logicalResourceIdAsScala: Option[String] = Option(self.logicalResourceId)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDetectStackResourceDriftRequestOps {

  implicit def toDetectStackResourceDriftRequestBuilderOps(
      v: DetectStackResourceDriftRequest.Builder
  ): DetectStackResourceDriftRequestBuilderOps = new DetectStackResourceDriftRequestBuilderOps(v)

  implicit def toDetectStackResourceDriftRequestOps(
      v: DetectStackResourceDriftRequest
  ): DetectStackResourceDriftRequestOps = new DetectStackResourceDriftRequestOps(v)

}
