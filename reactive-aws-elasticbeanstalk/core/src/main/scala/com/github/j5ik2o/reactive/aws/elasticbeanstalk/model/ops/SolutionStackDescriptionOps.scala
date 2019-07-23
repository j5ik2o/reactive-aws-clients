// Auto-Generated
package com.github.j5ik2o.reactive.aws.elasticbeanstalk.model.ops

import software.amazon.awssdk.services.elasticbeanstalk.model._

final class SolutionStackDescriptionBuilderOps(val self: SolutionStackDescription.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def solutionStackNameAsScala(value: Option[String]): SolutionStackDescription.Builder = {
    value.fold(self) { v =>
      self.solutionStackName(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def permittedFileTypesAsScala(value: Option[Seq[String]]): SolutionStackDescription.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.permittedFileTypes(v.asJava)
    }
  }

}

final class SolutionStackDescriptionOps(val self: SolutionStackDescription) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def solutionStackNameAsScala: Option[String] = Option(self.solutionStackName)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def permittedFileTypesAsScala: Option[Seq[String]] = Option(self.permittedFileTypes).map { v =>
    import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
  }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToSolutionStackDescriptionOps {

  implicit def toSolutionStackDescriptionBuilderOps(
      v: SolutionStackDescription.Builder
  ): SolutionStackDescriptionBuilderOps = new SolutionStackDescriptionBuilderOps(v)

  implicit def toSolutionStackDescriptionOps(v: SolutionStackDescription): SolutionStackDescriptionOps =
    new SolutionStackDescriptionOps(v)

}
