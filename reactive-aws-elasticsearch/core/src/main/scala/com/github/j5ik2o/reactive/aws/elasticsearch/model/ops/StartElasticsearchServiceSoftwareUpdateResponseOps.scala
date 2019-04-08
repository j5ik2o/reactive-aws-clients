// Auto-Generated
package com.github.j5ik2o.reactive.aws.elasticsearch.model.ops

import software.amazon.awssdk.services.elasticsearch.model._

final class StartElasticsearchServiceSoftwareUpdateResponseBuilderOps(
    val self: StartElasticsearchServiceSoftwareUpdateResponse.Builder
) extends AnyVal {

  final def serviceSoftwareOptionsAsScala(
      value: Option[ServiceSoftwareOptions]
  ): StartElasticsearchServiceSoftwareUpdateResponse.Builder = {
    value.fold(self) { v =>
      self.serviceSoftwareOptions(v)
    }
  } // ServiceSoftwareOptions

}

final class StartElasticsearchServiceSoftwareUpdateResponseOps(
    val self: StartElasticsearchServiceSoftwareUpdateResponse
) extends AnyVal {

  final def serviceSoftwareOptionsAsScala: Option[ServiceSoftwareOptions] =
    Option(self.serviceSoftwareOptions) // ServiceSoftwareOptions

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToStartElasticsearchServiceSoftwareUpdateResponseOps {

  implicit def toStartElasticsearchServiceSoftwareUpdateResponseBuilderOps(
      v: StartElasticsearchServiceSoftwareUpdateResponse.Builder
  ): StartElasticsearchServiceSoftwareUpdateResponseBuilderOps =
    new StartElasticsearchServiceSoftwareUpdateResponseBuilderOps(v)

  implicit def toStartElasticsearchServiceSoftwareUpdateResponseOps(
      v: StartElasticsearchServiceSoftwareUpdateResponse
  ): StartElasticsearchServiceSoftwareUpdateResponseOps = new StartElasticsearchServiceSoftwareUpdateResponseOps(v)

}
