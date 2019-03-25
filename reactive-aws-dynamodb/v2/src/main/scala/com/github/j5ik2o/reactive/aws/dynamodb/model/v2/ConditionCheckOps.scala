package com.github.j5ik2o.reactive.aws.dynamodb.model.v2

import com.github.j5ik2o.reactive.aws.dynamodb.model.{ ConditionCheck => ScalaConditionCheck, _ }
import software.amazon.awssdk.services.dynamodb.model.{ ConditionCheck => JavaConditionCheck }

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object ConditionCheckOps {

  implicit class ScalaConditionCheckOps(val self: ScalaConditionCheck) extends AnyVal {

    def toJava: JavaConditionCheck = {
      val result = JavaConditionCheck.builder()
                                                              self.key.filter(_.nonEmpty).foreach{ v => import scala.collection.JavaConverters._, AttributeValueOps._; result.key(v.mapValues(_.toJava).asJava) } // Map[String, AttributeValue], case Map[_], UserDefined
                      self.tableName.filter(_.nonEmpty).foreach(v => result.tableName(v)) // String, case String
                      self.conditionExpression.filter(_.nonEmpty).foreach(v => result.conditionExpression(v)) // String, case String
                          self.expressionAttributeNames.filter(_.nonEmpty).map(_.mapValues(_.asInstanceOf[java.lang.String])).foreach{ v => import scala.collection.JavaConverters._; result.expressionAttributeNames(v.asJava) } // Map[String, String], case Map[_]
                              self.expressionAttributeValues.filter(_.nonEmpty).foreach{ v => import scala.collection.JavaConverters._, AttributeValueOps._; result.expressionAttributeValues(v.mapValues(_.toJava).asJava) } // Map[String, AttributeValue], case Map[_], UserDefined
                      self.returnValuesOnConditionCheckFailure.foreach{ v => import ReturnValuesOnConditionCheckFailureOps._; result.returnValuesOnConditionCheckFailure(v.toJava) } // String, case Other

      result.build()
    }

  }

  implicit class JavaConditionCheckOps(val self: JavaConditionCheck) extends AnyVal {

     def toScala: ScalaConditionCheck = {
       ScalaConditionCheck()
                    .withKey(Option(self.key).map{ v => import scala.collection.JavaConverters._, AttributeValueOps._; v.asScala.toMap.mapValues(_.toScala) }) // Map[String, AttributeValue], Map-8
            .withTableName(Option(self.tableName)) // String
            .withConditionExpression(Option(self.conditionExpression)) // String
                .withExpressionAttributeNames(Option(self.expressionAttributeNames).map{ v => import scala.collection.JavaConverters._; v.asScala.toMap}) // Map[String, String], Seq-7
                    .withExpressionAttributeValues(Option(self.expressionAttributeValues).map{ v => import scala.collection.JavaConverters._, AttributeValueOps._; v.asScala.toMap.mapValues(_.toScala) }) // Map[String, AttributeValue], Map-8
            .withReturnValuesOnConditionCheckFailure(Option(self.returnValuesOnConditionCheckFailure).map{ v => import ReturnValuesOnConditionCheckFailureOps._; v.toScala}) // String, Map-12
     }

   }

}