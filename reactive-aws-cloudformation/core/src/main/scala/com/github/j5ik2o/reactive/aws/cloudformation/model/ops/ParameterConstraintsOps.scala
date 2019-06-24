// Auto-Generated
package com.github.j5ik2o.reactive.aws.cloudformation.model.ops

import software.amazon.awssdk.services.cloudformation.model._

final class ParameterConstraintsBuilderOps(val self: ParameterConstraints.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def allowedValuesAsScala(value: Option[Seq[String]]): ParameterConstraints.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.allowedValues(v.asJava)
    }
  }

}

final class ParameterConstraintsOps(val self: ParameterConstraints) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def allowedValuesAsScala: Option[Seq[String]] = Option(self.allowedValues).map { v =>
    import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
  }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToParameterConstraintsOps {

  implicit def toParameterConstraintsBuilderOps(v: ParameterConstraints.Builder): ParameterConstraintsBuilderOps =
    new ParameterConstraintsBuilderOps(v)

  implicit def toParameterConstraintsOps(v: ParameterConstraints): ParameterConstraintsOps =
    new ParameterConstraintsOps(v)

}
