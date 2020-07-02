// Auto-Generated
package com.github.j5ik2o.reactive.aws.elasticsearch.model.ops

import software.amazon.awssdk.services.elasticsearch.model._

final class DeleteElasticsearchDomainRequestBuilderOps(val self: DeleteElasticsearchDomainRequest.Builder)
    extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def domainNameAsScala(value: Option[String]): DeleteElasticsearchDomainRequest.Builder = {
    value.fold(self) { v => self.domainName(v) }
  }

}

final class DeleteElasticsearchDomainRequestOps(val self: DeleteElasticsearchDomainRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def domainNameAsScala: Option[String] = Option(self.domainName)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDeleteElasticsearchDomainRequestOps {

  implicit def toDeleteElasticsearchDomainRequestBuilderOps(
      v: DeleteElasticsearchDomainRequest.Builder
  ): DeleteElasticsearchDomainRequestBuilderOps = new DeleteElasticsearchDomainRequestBuilderOps(v)

  implicit def toDeleteElasticsearchDomainRequestOps(
      v: DeleteElasticsearchDomainRequest
  ): DeleteElasticsearchDomainRequestOps = new DeleteElasticsearchDomainRequestOps(v)

}
