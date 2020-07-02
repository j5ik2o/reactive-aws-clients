// Auto-Generated
package com.github.j5ik2o.reactive.aws.elasticbeanstalk.model.ops

import software.amazon.awssdk.services.elasticbeanstalk.model._

final class DescribePlatformVersionResponseBuilderOps(val self: DescribePlatformVersionResponse.Builder)
    extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def platformDescriptionAsScala(value: Option[PlatformDescription]): DescribePlatformVersionResponse.Builder = {
    value.fold(self) { v => self.platformDescription(v) }
  }

}

final class DescribePlatformVersionResponseOps(val self: DescribePlatformVersionResponse) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def platformDescriptionAsScala: Option[PlatformDescription] = Option(self.platformDescription)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDescribePlatformVersionResponseOps {

  implicit def toDescribePlatformVersionResponseBuilderOps(
      v: DescribePlatformVersionResponse.Builder
  ): DescribePlatformVersionResponseBuilderOps = new DescribePlatformVersionResponseBuilderOps(v)

  implicit def toDescribePlatformVersionResponseOps(
      v: DescribePlatformVersionResponse
  ): DescribePlatformVersionResponseOps = new DescribePlatformVersionResponseOps(v)

}
