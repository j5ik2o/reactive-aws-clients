// Auto-Generated
package com.github.j5ik2o.reactive.aws.elasticsearch.model.ops

import software.amazon.awssdk.services.elasticsearch.model._

final class AdditionalLimitBuilderOps(val self: AdditionalLimit.Builder) extends AnyVal {

  final def limitNameAsScala(value: Option[String]): AdditionalLimit.Builder = {
    value.fold(self) { v =>
      self.limitName(v)
    }
  } // String

  final def limitValuesAsScala(value: Option[Seq[String]]): AdditionalLimit.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.limitValues(v.asJava)
    } // Seq[String]
  }

}

final class AdditionalLimitOps(val self: AdditionalLimit) extends AnyVal {

  final def limitNameAsScala: Option[String] = Option(self.limitName) // String

  final def limitValuesAsScala: Option[Seq[String]] = Option(self.limitValues).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  } // Seq[String]

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToAdditionalLimitOps {

  implicit def toAdditionalLimitBuilderOps(v: AdditionalLimit.Builder): AdditionalLimitBuilderOps =
    new AdditionalLimitBuilderOps(v)

  implicit def toAdditionalLimitOps(v: AdditionalLimit): AdditionalLimitOps = new AdditionalLimitOps(v)

}
