// Auto-Generated
package com.github.j5ik2o.reactive.aws.elasticsearch.model.ops

import software.amazon.awssdk.services.elasticsearch.model._

final class DeleteElasticsearchServiceRoleResponseBuilderOps(val self: DeleteElasticsearchServiceRoleResponse.Builder)
    extends AnyVal {}

final class DeleteElasticsearchServiceRoleResponseOps(val self: DeleteElasticsearchServiceRoleResponse) extends AnyVal {}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDeleteElasticsearchServiceRoleResponseOps {

  implicit def toDeleteElasticsearchServiceRoleResponseBuilderOps(
      v: DeleteElasticsearchServiceRoleResponse.Builder
  ): DeleteElasticsearchServiceRoleResponseBuilderOps = new DeleteElasticsearchServiceRoleResponseBuilderOps(v)

  implicit def toDeleteElasticsearchServiceRoleResponseOps(
      v: DeleteElasticsearchServiceRoleResponse
  ): DeleteElasticsearchServiceRoleResponseOps = new DeleteElasticsearchServiceRoleResponseOps(v)

}
