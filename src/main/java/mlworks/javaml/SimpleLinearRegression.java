package mlworks.javaml;

import no.uib.cipr.matrix.DenseMatrix;
import no.uib.cipr.matrix.DenseVector;


public class SimpleLinearRegression {

    private DenseVector omega;

    /**
     * 根据X、y学习线性回归模型
     * @param X 特征矩阵，要求为列满秩或行满秩（具体可参考LAPACK的LLS文档）。
     * @param y 目标向量
     */
    public void fit(DenseMatrix X, DenseVector y) {
        X.solve(y,omega); // 内部调用LAPACK的相关例程，具体可参考其源代码。
    }

    public double predict(DenseVector x){
        return x.dot(omega);
    }

}
