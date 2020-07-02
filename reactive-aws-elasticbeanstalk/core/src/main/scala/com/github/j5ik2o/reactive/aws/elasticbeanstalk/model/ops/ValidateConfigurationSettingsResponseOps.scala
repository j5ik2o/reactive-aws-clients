// Auto-Generated
package com.github.j5ik2o.reactive.aws.elasticbeanstalk.model.ops

import software.amazon.awssdk.services.elasticbeanstalk.model._

final class ValidateConfigurationSettingsResponseBuilderOps(val self: ValidateConfigurationSettingsResponse.Builder)
    extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def messagesAsScala(value: Option[Seq[ValidationMessage]]): ValidateConfigurationSettingsResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.messages(v.asJava)
    }
  }

}

final class ValidateConfigurationSettingsResponseOps(val self: ValidateConfigurationSettingsResponse) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def messagesAsScala: Option[Seq[ValidationMessage]] =
    Option(self.messages).map { v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToValidateConfigurationSettingsResponseOps {

  implicit def toValidateConfigurationSettingsResponseBuilderOps(
      v: ValidateConfigurationSettingsResponse.Builder
  ): ValidateConfigurationSettingsResponseBuilderOps = new ValidateConfigurationSettingsResponseBuilderOps(v)

  implicit def toValidateConfigurationSettingsResponseOps(
      v: ValidateConfigurationSettingsResponse
  ): ValidateConfigurationSettingsResponseOps = new ValidateConfigurationSettingsResponseOps(v)

}
