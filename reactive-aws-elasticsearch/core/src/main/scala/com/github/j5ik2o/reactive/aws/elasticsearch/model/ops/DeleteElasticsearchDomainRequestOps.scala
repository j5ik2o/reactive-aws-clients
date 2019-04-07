// Auto-Generated
package com.github.j5ik2o.reactive.aws.elasticsearch.model.ops

import software.amazon.awssdk.services.elasticsearch.model._

final class DeleteElasticsearchDomainRequestBuilderOps(val self: DeleteElasticsearchDomainRequest.Builder)
    extends AnyVal {

  final def withDomainNameAsScala(value: Option[String]): DeleteElasticsearchDomainRequest.Builder = {
    value.fold(self) { v =>
      self.domainName(v)
    }
  } // String

}

final class DeleteElasticsearchDomainRequestOps(val self: DeleteElasticsearchDomainRequest) extends AnyVal {

  final def domainNameAsScala: Option[String] = Option(self.domainName) // String

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
