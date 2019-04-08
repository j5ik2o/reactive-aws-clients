// Auto-Generated
package com.github.j5ik2o.reactive.aws.elasticbeanstalk.model.ops

import software.amazon.awssdk.services.elasticbeanstalk.model._

final class CreateStorageLocationRequestBuilderOps(val self: CreateStorageLocationRequest.Builder) extends AnyVal {}

final class CreateStorageLocationRequestOps(val self: CreateStorageLocationRequest) extends AnyVal {}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToCreateStorageLocationRequestOps {

  implicit def toCreateStorageLocationRequestBuilderOps(
      v: CreateStorageLocationRequest.Builder
  ): CreateStorageLocationRequestBuilderOps = new CreateStorageLocationRequestBuilderOps(v)

  implicit def toCreateStorageLocationRequestOps(v: CreateStorageLocationRequest): CreateStorageLocationRequestOps =
    new CreateStorageLocationRequestOps(v)

}
