// Auto-Generated
package com.github.j5ik2o.reactive.aws.elasticsearch.model.ops

import software.amazon.awssdk.services.elasticsearch.model._

final class CancelElasticsearchServiceSoftwareUpdateResponseBuilderOps(
    val self: CancelElasticsearchServiceSoftwareUpdateResponse.Builder
) extends AnyVal {

  final def serviceSoftwareOptionsAsScala(
      value: Option[ServiceSoftwareOptions]
  ): CancelElasticsearchServiceSoftwareUpdateResponse.Builder = {
    value.fold(self) { v =>
      self.serviceSoftwareOptions(v)
    }
  } // ServiceSoftwareOptions

}

final class CancelElasticsearchServiceSoftwareUpdateResponseOps(
    val self: CancelElasticsearchServiceSoftwareUpdateResponse
) extends AnyVal {

  final def serviceSoftwareOptionsAsScala: Option[ServiceSoftwareOptions] =
    Option(self.serviceSoftwareOptions) // ServiceSoftwareOptions

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToCancelElasticsearchServiceSoftwareUpdateResponseOps {

  implicit def toCancelElasticsearchServiceSoftwareUpdateResponseBuilderOps(
      v: CancelElasticsearchServiceSoftwareUpdateResponse.Builder
  ): CancelElasticsearchServiceSoftwareUpdateResponseBuilderOps =
    new CancelElasticsearchServiceSoftwareUpdateResponseBuilderOps(v)

  implicit def toCancelElasticsearchServiceSoftwareUpdateResponseOps(
      v: CancelElasticsearchServiceSoftwareUpdateResponse
  ): CancelElasticsearchServiceSoftwareUpdateResponseOps = new CancelElasticsearchServiceSoftwareUpdateResponseOps(v)

}
