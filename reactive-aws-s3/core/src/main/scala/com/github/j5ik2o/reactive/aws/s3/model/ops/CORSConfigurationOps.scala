// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import software.amazon.awssdk.services.s3.model._

final class CORSConfigurationBuilderOps(val self: CORSConfiguration.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def corsRulesAsScala(value: Option[Seq[CORSRule]]): CORSConfiguration.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.corsRules(v.asJava)
    }
  }

}

final class CORSConfigurationOps(val self: CORSConfiguration) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def corsRulesAsScala: Option[Seq[CORSRule]] = Option(self.corsRules).map { v =>
    import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
  }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToCORSConfigurationOps {

  implicit def toCORSConfigurationBuilderOps(v: CORSConfiguration.Builder): CORSConfigurationBuilderOps =
    new CORSConfigurationBuilderOps(v)

  implicit def toCORSConfigurationOps(v: CORSConfiguration): CORSConfigurationOps = new CORSConfigurationOps(v)

}
