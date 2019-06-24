// Auto-Generated
package com.github.j5ik2o.reactive.aws.elasticsearch.model.ops

import software.amazon.awssdk.services.elasticsearch.model._

final class AdditionalLimitBuilderOps(val self: AdditionalLimit.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def limitNameAsScala(value: Option[String]): AdditionalLimit.Builder = {
    value.fold(self) { v =>
      self.limitName(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def limitValuesAsScala(value: Option[Seq[String]]): AdditionalLimit.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.limitValues(v.asJava)
    }
  }

}

final class AdditionalLimitOps(val self: AdditionalLimit) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def limitNameAsScala: Option[String] = Option(self.limitName)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def limitValuesAsScala: Option[Seq[String]] = Option(self.limitValues).map { v =>
    import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
  }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToAdditionalLimitOps {

  implicit def toAdditionalLimitBuilderOps(v: AdditionalLimit.Builder): AdditionalLimitBuilderOps =
    new AdditionalLimitBuilderOps(v)

  implicit def toAdditionalLimitOps(v: AdditionalLimit): AdditionalLimitOps = new AdditionalLimitOps(v)

}
