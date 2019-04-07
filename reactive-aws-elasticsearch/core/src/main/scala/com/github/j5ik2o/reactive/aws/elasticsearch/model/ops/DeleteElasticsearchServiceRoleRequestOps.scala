// Auto-Generated
package com.github.j5ik2o.reactive.aws.elasticsearch.model.ops

import software.amazon.awssdk.services.elasticsearch.model._

final class DeleteElasticsearchServiceRoleRequestBuilderOps(val self: DeleteElasticsearchServiceRoleRequest.Builder)
    extends AnyVal {}

final class DeleteElasticsearchServiceRoleRequestOps(val self: DeleteElasticsearchServiceRoleRequest) extends AnyVal {}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDeleteElasticsearchServiceRoleRequestOps {

  implicit def toDeleteElasticsearchServiceRoleRequestBuilderOps(
      v: DeleteElasticsearchServiceRoleRequest.Builder
  ): DeleteElasticsearchServiceRoleRequestBuilderOps = new DeleteElasticsearchServiceRoleRequestBuilderOps(v)

  implicit def toDeleteElasticsearchServiceRoleRequestOps(
      v: DeleteElasticsearchServiceRoleRequest
  ): DeleteElasticsearchServiceRoleRequestOps = new DeleteElasticsearchServiceRoleRequestOps(v)

}
