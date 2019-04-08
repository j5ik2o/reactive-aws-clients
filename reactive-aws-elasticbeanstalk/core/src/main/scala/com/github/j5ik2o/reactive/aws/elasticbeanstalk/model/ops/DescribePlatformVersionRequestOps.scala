// Auto-Generated
package com.github.j5ik2o.reactive.aws.elasticbeanstalk.model.ops

import software.amazon.awssdk.services.elasticbeanstalk.model._

final class DescribePlatformVersionRequestBuilderOps(val self: DescribePlatformVersionRequest.Builder) extends AnyVal {

  final def platformArnAsScala(value: Option[String]): DescribePlatformVersionRequest.Builder = {
    value.fold(self) { v =>
      self.platformArn(v)
    }
  } // String

}

final class DescribePlatformVersionRequestOps(val self: DescribePlatformVersionRequest) extends AnyVal {

  final def platformArnAsScala: Option[String] = Option(self.platformArn) // String

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDescribePlatformVersionRequestOps {

  implicit def toDescribePlatformVersionRequestBuilderOps(
      v: DescribePlatformVersionRequest.Builder
  ): DescribePlatformVersionRequestBuilderOps = new DescribePlatformVersionRequestBuilderOps(v)

  implicit def toDescribePlatformVersionRequestOps(
      v: DescribePlatformVersionRequest
  ): DescribePlatformVersionRequestOps = new DescribePlatformVersionRequestOps(v)

}
