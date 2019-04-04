// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import software.amazon.awssdk.services.s3.model._

final class ListBucketsRequestBuilderOps(val self: ListBucketsRequest.Builder) extends AnyVal {}

final class ListBucketsRequestOps(val self: ListBucketsRequest) extends AnyVal {}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToListBucketsRequestOps {

  implicit def toListBucketsRequestBuilderOps(v: ListBucketsRequest.Builder): ListBucketsRequestBuilderOps =
    new ListBucketsRequestBuilderOps(v)

  implicit def toListBucketsRequestOps(v: ListBucketsRequest): ListBucketsRequestOps = new ListBucketsRequestOps(v)

}
