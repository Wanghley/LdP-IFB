import matplotlib.pyplot as plt
import numpy as np

x = np.random.randn(10000)
plt.hist(x,100)
plt.title(r'Normal distribution with $\mu=0, \sigma=1$')
plt.savefig('3.2.1.matplot_histogram.png')
plt.show()