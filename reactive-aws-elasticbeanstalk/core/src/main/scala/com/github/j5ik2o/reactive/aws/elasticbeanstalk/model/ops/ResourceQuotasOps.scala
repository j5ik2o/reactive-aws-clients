// Auto-Generated
package com.github.j5ik2o.reactive.aws.elasticbeanstalk.model.ops

import software.amazon.awssdk.services.elasticbeanstalk.model._

final class ResourceQuotasBuilderOps(val self: ResourceQuotas.Builder) extends AnyVal {

  final def applicationQuotaAsScala(value: Option[ResourceQuota]): ResourceQuotas.Builder = {
    value.fold(self) { v =>
      self.applicationQuota(v)
    }
  } // ResourceQuota

  final def applicationVersionQuotaAsScala(value: Option[ResourceQuota]): ResourceQuotas.Builder = {
    value.fold(self) { v =>
      self.applicationVersionQuota(v)
    }
  } // ResourceQuota

  final def environmentQuotaAsScala(value: Option[ResourceQuota]): ResourceQuotas.Builder = {
    value.fold(self) { v =>
      self.environmentQuota(v)
    }
  } // ResourceQuota

  final def configurationTemplateQuotaAsScala(value: Option[ResourceQuota]): ResourceQuotas.Builder = {
    value.fold(self) { v =>
      self.configurationTemplateQuota(v)
    }
  } // ResourceQuota

  final def customPlatformQuotaAsScala(value: Option[ResourceQuota]): ResourceQuotas.Builder = {
    value.fold(self) { v =>
      self.customPlatformQuota(v)
    }
  } // ResourceQuota

}

final class ResourceQuotasOps(val self: ResourceQuotas) extends AnyVal {

  final def applicationQuotaAsScala: Option[ResourceQuota] = Option(self.applicationQuota) // ResourceQuota

  final def applicationVersionQuotaAsScala: Option[ResourceQuota] =
    Option(self.applicationVersionQuota) // ResourceQuota

  final def environmentQuotaAsScala: Option[ResourceQuota] = Option(self.environmentQuota) // ResourceQuota

  final def configurationTemplateQuotaAsScala: Option[ResourceQuota] =
    Option(self.configurationTemplateQuota) // ResourceQuota

  final def customPlatformQuotaAsScala: Option[ResourceQuota] = Option(self.customPlatformQuota) // ResourceQuota

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToResourceQuotasOps {

  implicit def toResourceQuotasBuilderOps(v: ResourceQuotas.Builder): ResourceQuotasBuilderOps =
    new ResourceQuotasBuilderOps(v)

  implicit def toResourceQuotasOps(v: ResourceQuotas): ResourceQuotasOps = new ResourceQuotasOps(v)

}
