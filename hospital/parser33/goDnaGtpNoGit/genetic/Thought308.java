package genetic;
import java.util.ArrayList;
class Thought308 extends Thought{
private static ArrayList<Thought308> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = true;
private boolean fb1 = false;
private double fd0 = 949.5133086850673;
private double fd1 = 602.952274705608;
private Thought fo0 = null;
private Thought fo1 = null;
Thought308 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought308 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought308 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought308 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought308 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought308 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought308 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought308 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
fd0 = ad1; 
fd1 = ad2; 
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
public static Thought308 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought308 instance = new Thought308 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought308 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought308 instance = new Thought308 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought308 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought308 instance = new Thought308 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought308 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought308 instance = new Thought308 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought308 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought308 instance = new Thought308 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought308 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought308 instance = new Thought308 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought308 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought308 instance = new Thought308 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought308 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought308 instance = new Thought308 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
void m1() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    for(int i0=0; i0<10; i0++){
if(fo1 != null){
          fo1.m1(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
if(fo1 != null){
          fo0 = fo1.m4();
}
        fb0 = fd1 < fd0;
        fd1 = fd0 + fd1;
        Output.points[8][0] += fd0;
        Thought lo0 = Thought257.getInstance(fb1, fb0, fb1, fb0);
        fd1 = fd0 + fd1;
        boolean lb1 = false;
        fb0 = !fb1;
        lb1 = fd0 > fd1;
        fd0 = fd1 - fd0;
        fb0 = fb1 && lb1;
        fd1 = fd0 + fd1;
        fd0 = fd1 - fd0;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb0, fb1, lb1, fb0);
}
        fb1 = !lb1;
if(fo0 != null){
          fd1 = fo0.m3(fd0, fd1, fd0, fd1, fb0, fb1, lb1, fb0);
}
        fd0 = fd1 + fd0;
        double ld2 = 893.1962202809392;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb1, lb1, fb0, fb1);
}
if(fo1 != null){
          lb1 = fo1.m2(fo0, fo1, fo0, fo1);
}
        fb0 = fb1 || lb1;
        fd0 *= -1;
if(fo0 != null){
          fd1 = fo0.m3(ld2, fd0, fd1, ld2);
}
if(fo1 != null){
          fb0 = fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, ld2, fd0);
}
        fd1 = ld2 - fd0;
if(fo0 != null){
          fb1 = fo0.m2();
}
}
Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
void m1(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab1 = !ab2;
if(fo1 != null){
      fd0 = fo1.m3(ab3, ab4, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, ab1, ab2, ab3, ab4);
}
    boolean lb0 = false;
if(fo0 != null){
      fd1 = fo0.m3(fd0, fd1, fd0, fd1, ab4, fb0, fb1, lb0);
}
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, ab1, ab2, ab3, ab4);
}
    double ld1 = 207.51247689843953;
    fb0 = fd0 > fd1;
    boolean lb2 = true;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      ld1 = fo0.m3(fd0, fd1, ld1, fd0);
}
    boolean lb3 = false;
if(fo1 != null){
      ab4 = fo1.m2(fo0, fo1, fo0, fo1, fd1, ld1, fd0, fd1);
}
if(fo0 != null){
      fo0.m1();
}
if(fo0 != null){
      fo1 = fo0.m4(fb0, fb1, lb0, lb2);
}
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, ld1, fd0, fd1, ld1, lb3, ab1, ab2, ab3);
}
    ab4 = !fb0;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, ld1, fd0, fb1, lb0, lb2, lb3);
}
    fd1 = ld1 + fd0;
    ab1 = ab2 && ab3;
    fd1 = ld1 - fd0;
    double ld4 = 835.4724979344342;
        boolean lb5 = true;
if(fo0 != null){
      ab3 = fo0.m2(fo1, fo0, fo1, fo0, ab4, fb0, fb1, lb0);
}
    lb2 = lb3 && lb5;
    ab1 = ab2 || ab3;
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1);
}
    Thought lo6 = Thought0.getInstance(fd1, ld1, ld4, fd0);

Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
void m1(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    for(int i0=0; i0<10; i0++){
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0);
}
if(fo0 != null){
          fo0.m2();
}
        fb1 = !fb0;
if(fo1 != null){
          fb1 = fo1.m2(fb0, fb1, fb0, fb1);
}
if(fo0 != null){
          fo0.m1(fo1, fo0, fo1, fo0, fd1, ad1, ad2, ad3, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
          fo1 = fo0.m4(ad4, fd0, fd1, ad1, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
        boolean lb0 = false;
        Output.points[8][1] -= ad2;
        lb0 = ad3 > ad4;
        Thought lo1 = Thought98.getInstance(fo1, fo0, fo1, fo0);
if(fo0 != null){
          fo1 = fo0.m4(fd0, fd1, ad1, ad2);
}
        fb0 = ad3 > ad4;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, ad1, ad2);
}
        ad3 *= -1;
        ad4 = fd0 - fd1;
}
Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
void m1(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      fo1.m1();
}
if(fo1 != null){
      fo0 = fo1.m4(ab1, ab2, ab3, ab4);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4, fb0, fb1, ab1, ab2);
}
    fd0 = fd1 - ad1;
    ab3 = ab4 && fb0;
if(fo0 != null){
      fo0.m2(ad2, ad3, ad4, fd0, fb1, ab1, ab2, ab3);
}
    ab4 = fd1 > ad1;
    Output.points[8][2] -= ad2;
    fb0 = !fb1;
if(fo1 != null){
      ad3 = fo1.m3(fo0, fo1, fo0, fo1, ab1, ab2, ab3, ab4);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    double ld0 = 921.5077704256537;
    double ld1 = 283.0175972910514;
    fb0 = !fb1;
    double ld2 = 822.1144249345277;
if(fo0 != null){
      ab1 = fo0.m2(ad1, ad2, ad3, ad4);
}
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, ld0, ld1);
}
if(fo1 != null){
      fo0 = fo1.m4();
}
    boolean lb3 = false;
    boolean lb4 = false;
if(fo1 != null){
      fo0 = fo1.m4(lb4, ab1, ab2, ab3);
}
    if (ab4) {
        Thought lo5 = Thought221.getInstance(fo0, fo1, fo0, fo1, ld2, ad1, ad2, ad3, fb0, fb1, lb3, lb4);
        Output.points[8][3] -= ad4;
        ab1 = fd0 > fd1;
        boolean lb6 = true;
}
Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd0 = fd1 - fd0;
    Thought lo0 = Thought10.getInstance(fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
    boolean lb1 = false;
    fd1 *= -1;
    boolean lb2 = false;
    fd0 *= -1;
    lb2 = !fb0;
    fb1 = lb1 || lb2;
    fb0 = fb1 && lb1;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, lb2, fb0, fb1, lb1);
}
    lb2 = fb0 || fb1;
if(ao1 != null){
      fd1 = ao1.m3(ao2, ao3, ao4, fo0);
}
if(ao1 != null){
      fo1 = ao1.m4(fd0, fd1, fd0, fd1);
}
if(ao2 != null){
      lb1 = ao2.m2(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1);
}
if(ao2 != null){
      ao1 = ao2.m4();
}
    lb2 = fd0 > fd1;
    double ld3 = 336.3588357346877;
    fb0 = ld3 > fd0;
if(ao3 != null){
      fd1 = ao3.m3(fb1, lb1, lb2, fb0);
}
    fb1 = lb1 && lb2;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, ld3, fd0, fd1, ld3, fb0, fb1, lb1, lb2);
}
    fd0 = fd1 + ld3;

Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb0 = ad2 < ad3;
        ad4 *= -1;
if(ao2 != null){
      ao2.m3(fd0, fd1, ad1, ad2, fb1, fb0, fb1, fb0);
}
    if (fb1) {
        fb0 = ad3 < ad4;
        fb1 = fb0 && fb1;
if(ao3 != null){
          ao3.m2(ao4, fo0, fo1, ao1, fb0, fb1, fb0, fb1);
}
if(ao2 != null){
          fd0 = ao2.m3(ao3, ao4, fo0, fo1);
}
        boolean lb0 = true;
        fd1 *= -1;
        boolean lb1 = true;
if(ao1 != null){
          lb0 = ao1.m2(ad1, ad2, ad3, ad4);
}
        lb1 = fb0 && fb1;
        for(int i0=0; i0<10; i0++){
            Output.points[8][4] -= fd0;
            lb0 = lb1 || fb0;
if(ao3 != null){
              ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd1, ad1, ad2, ad3);
}
            Thought lo2 = Thought351.getInstance();
}}
Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab2 = !ab3;
    if (ab4) {
if(ao2 != null){
          ao2.m1(fb0, fb1, ab1, ab2);
}
        Thought lo0 = Thought18.getInstance(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0, ab3, ab4, fb0, fb1);
        boolean lb1 = true;
        lb1 = fd1 > fd0;
        double ld2 = 367.8196311712395;
        ab1 = ab2 || ab3;
if(ao2 != null){
          ao1 = ao2.m4(fd0, fd1, ld2, fd0, ab4, fb0, fb1, lb1);
}
if(ao3 != null){
          ab1 = ao3.m2(ao4, fo0, fo1, ao1, ab2, ab3, ab4, fb0);
}
        fb1 = lb1 && ab1;
        boolean lb3 = false;
        fd1 *= -1;
if(ao3 != null){
          ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
        ab1 = ld2 < fd0;
        fd1 = ld2 - fd0;
        ab2 = ab3 || ab4;
        double ld4 = 768.4329803641513;
        Output.points[8][5] -= fd0;
        Thought lo5 = Thought315.getInstance(fd1, ld2, ld4, fd0);
        fd1 *= -1;
if(ao3 != null){
          ao2 = ao3.m4(ao4, fo0, fo1, ao1, ld2, ld4, fd0, fd1);
}
if(ao2 != null){
          ao2.m3();
}
        ld2 = ld4 - fd0;
        Thought lo6 = Thought373.getInstance(fb0, fb1, lb1, lb3);
        fd1 *= -1;
        Thought lo7 = Thought240.getInstance(ao3, ao4, fo0, fo1, ld2, ld4, fd0, fd1, ab1, ab2, ab3, ab4);
}
Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao1 != null){
      ao1.m2(ad1, ad2, ad3, ad4, ab1, ab2, ab3, ab4);
}
    boolean lb0 = false;
    Output.points[8][6] += fd0;
    boolean lb1 = true;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ab3, ab4, fb0, fb1);
}
    double ld2 = 204.05314775696482;
    lb0 = !lb1;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
    ab1 = fd0 < fd1;
if(ao3 != null){
      ao2 = ao3.m4(ld2, ad1, ad2, ad3);
}
    ab2 = ab3 || ab4;
        ad4 = fd0 - fd1;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, ld2, ad1, ad2, ad3);
}
if(ao4 != null){
      fb0 = ao4.m2();
}
    fb1 = ad4 < fd0;
if(fo1 != null){
      fo0 = fo1.m4(lb0, lb1, ab1, ab2);
}
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd1, ld2, ad1, ad2, ab3, ab4, fb0, fb1);
}
    Output.points[8][7] -= ad3;
        lb0 = !lb1;
    Thought lo3 = Thought399.getInstance(ad4, fd0, fd1, ld2, ab1, ab2, ab3, ab4);
    fb0 = ad1 < ad2;
    Output.points[8][8] -= ad3;
    Output.points[0][0] -= ad4;
    fb1 = fd0 > fd1;

Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
boolean m2() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
}
    Output.points[0][1] -= fd0;
    boolean lb0 = false;
    boolean lb1 = true;
    fd1 *= -1;
    lb1 = fd0 < fd1;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1);
}
    fd0 = fd1 - fd0;
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0);
}
    fb0 = fb1 || lb0;
    boolean lb2 = false;

Thought.STACK_COUNTER++;
return lb1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return false;
} 
}
boolean m2(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    double ld0 = 447.99880736766875;
    Output.points[0][2] += fd0;
if(fo0 != null){
      ab1 = fo0.m2(fo1, fo0, fo1, fo0, fd1, ld0, fd0, fd1);
}
    Thought lo1 = Thought120.getInstance();
if(fo1 != null){
      ld0 = fo1.m3(ab2, ab3, ab4, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, ld0, fd0, fb1, ab1, ab2, ab3);
}
    ab4 = !fb0;
    fb1 = !ab1;
    Thought lo2 = Thought373.getInstance(fd1, ld0, fd0, fd1, ab2, ab3, ab4, fb0);
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb1, ab1, ab2, ab3);
}
if(fo0 != null){
      ld0 = fo0.m3(fo1, fo0, fo1, fo0);
}
    ab4 = fb0 || fb1;
if(fo1 != null){
      fd0 = fo1.m3(fd1, ld0, fd0, fd1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ld0, fd0, fd1, ld0);
}
if(fo0 != null){
      fd0 = fo0.m3();
}
    ab1 = !ab2;
    ab3 = fd1 < ld0;
if(fo0 != null){
      fo1 = fo0.m4(ab4, fb0, fb1, ab1);
}

Thought.STACK_COUNTER++;
return ab2;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return false;
} 
}
boolean m2(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb0 = ad2 > ad3;
    fb1 = fb0 || fb1;
    boolean lb0 = false;
    boolean lb1 = false;
    lb0 = lb1 && fb0;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ad1, fb1, lb0, lb1, fb0);
}
    fb1 = ad2 > ad3;
    Thought lo2 = Thought165.getInstance(ad4, fd0, fd1, ad1, lb0, lb1, fb0, fb1);
    Thought lo3 = Thought316.getInstance(fo0, fo1, fo0, fo1, lb0, lb1, fb0, fb1);
if(fo0 != null){
          lb0 = fo0.m2(fo1, fo0, fo1, fo0);
}

Thought.STACK_COUNTER++;
return lb1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return false;
} 
}
boolean m2(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    for(int i0=0; i0<10; i0++){
        ab1 = ad2 < ad3;
if(fo1 != null){
          ad4 = fo1.m3(fd0, fd1, ad1, ad2);
}
        ad3 = ad4 - fd0;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, ad1, ad2, ad3);
}
if(fo1 != null){
          fo0 = fo1.m4();
}
        if (ab2) {
if(fo1 != null){
              fo0 = fo1.m4(ab3, ab4, fb0, fb1);
}
            double ld0 = 628.5236880420753;
            double ld1 = 984.8180537695505;
            for(int i1=0; i1<10; i1++){
                Thought lo2 = Thought271.getInstance(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0, ab1, ab2, ab3, ab4);
                fb0 = fd1 > ld0;
                ld1 = ad1 + ad2;
}}}
Thought.STACK_COUNTER++;
return fb1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return false;
} 
}
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd0 = fd1 - fd0;
    fd1 = fd0 - fd1;
    for(int i0=0; i0<10; i0++){
        Thought lo0 = Thought38.getInstance(fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
if(ao2 != null){
          ao1 = ao2.m4(ao3, ao4, fo0, fo1, fb0, fb1, fb0, fb1);
}
        fd0 = fd1 + fd0;
        boolean lb1 = false;
        lb1 = !fb0;
if(ao2 != null){
          ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
        Output.points[0][3] += fd1;
        fb1 = !lb1;
        Output.points[0][4] += fd0;
if(ao1 != null){
          ao1.m2(fd1, fd0, fd1, fd0);
}
        double ld2 = 618.1471724518674;
        double ld3 = 503.644084862884;
        Output.points[0][5] += ld3;
        boolean lb4 = false;
        Output.points[0][6] += fd0;
        lb4 = fb0 || fb1;
if(ao2 != null){
          fd1 = ao2.m3(ao3, ao4, fo0, fo1, ld2, ld3, fd0, fd1);
}
        ld2 = ld3 + fd0;
if(ao2 != null){
          ao1 = ao2.m4();
}
        double ld5 = 169.3845421644975;
        fd0 *= -1;
        double ld6 = 765.6008389292577;
}
Thought.STACK_COUNTER++;
return fb0;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return false;
} 
}
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = true;
if(ao1 != null){
      ao1.m1(fb0, fb1, lb0, fb0);
}
if(ao2 != null){
      fb1 = ao2.m2(ao3, ao4, fo0, fo1, ad1, ad2, ad3, ad4, lb0, fb0, fb1, lb0);
}
    fb0 = fd0 < fd1;
    double ld1 = 769.4624556718453;
if(ao2 != null){
      ao1 = ao2.m4(ld1, ad1, ad2, ad3, fb1, lb0, fb0, fb1);
}
    ad4 *= -1;
    lb0 = fd0 < fd1;
    fb0 = fb1 && lb0;
    fb0 = ld1 > ad1;
if(ao3 != null){
      fb1 = ao3.m2(ao4, fo0, fo1, ao1, lb0, fb0, fb1, lb0);
}
    fb0 = ad2 < ad3;
    ad4 = fd0 + fd1;
    double ld2 = 667.4922214274015;
if(ao2 != null){
      ao2.m1(ao3, ao4, fo0, fo1);
}

Thought.STACK_COUNTER++;
return fb1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return false;
} 
}
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      ao1 = ao2.m4(fd0, fd1, fd0, fd1);
}
if(ao3 != null){
      ab1 = ao3.m2(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1);
}
    ab2 = ab3 || ab4;
if(ao3 != null){
      ao2 = ao3.m4();
}
if(fo0 != null){
      ao4 = fo0.m4(fb0, fb1, ab1, ab2);
}
    fd0 = fd1 - fd0;
    ab3 = ab4 && fb0;
    fb1 = ab1 && ab2;
    ab3 = ab4 && fb0;
    Thought lo0 = Thought77.getInstance(fo1, ao1, ao2, ao3, fd1, fd0, fd1, fd0, fb1, ab1, ab2, ab3);
if(fo0 != null){
      ao4 = fo0.m4(fd1, fd0, fd1, fd0, ab4, fb0, fb1, ab1);
}
    fd1 = fd0 - fd1;
    ab2 = ab3 && ab4;
    fb0 = !fb1;
    fd0 *= -1;

Thought.STACK_COUNTER++;
return ab1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return false;
} 
}
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      ab2 = ao2.m2(ao3, ao4, fo0, fo1, ab3, ab4, fb0, fb1);
}
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
    ab1 = ab2 && ab3;
if(ao1 != null){
      ao1.m2(ad2, ad3, ad4, fd0);
}
if(ao2 != null){
      ab4 = ao2.m2(ao3, ao4, fo0, fo1, fd1, ad1, ad2, ad3);
}
    double ld0 = 857.767760816857;
    boolean lb1 = false;
    ab4 = fb0 && fb1;
    double ld2 = 794.0782963578457;
if(ao1 != null){
      ao1.m3();
}
    ad2 = ad3 + ad4;
if(ao2 != null){
      fd0 = ao2.m3(lb1, ab1, ab2, ab3);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd1, ld0, ld2, ad1, ab4, fb0, fb1, lb1);
}
if(ao4 != null){
      ao3 = ao4.m4(ad2, ad3, ad4, fd0, ab1, ab2, ab3, ab4);
}
    Thought lo3 = Thought370.getInstance(fo0, fo1, ao1, ao2, fb0, fb1, lb1, ab1);
    Thought lo4 = Thought68.getInstance(ao3, ao4, fo0, fo1);
    if (ab2) {
        fd1 = ld0 + ld2;
}
Thought.STACK_COUNTER++;
return ab3;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return false;
} 
}
double m3() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Thought lo0 = Thought318.getInstance(fd0, fd1, fd0, fd1);
    Thought lo1 = Thought92.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
    fb0 = !fb1;
    fb0 = fd0 < fd1;
if(fo1 != null){
      fo0 = fo1.m4();
}
    fd0 = fd1 - fd0;
    for(int i0=0; i0<10; i0++){
        boolean lb2 = false;
        boolean lb3 = true;
        fd1 = fd0 - fd1;
        fd0 = fd1 + fd0;
        boolean lb4 = false;
        lb3 = !lb4;
        fb0 = !fb1;
if(fo1 != null){
          fo0 = fo1.m4(lb2, lb3, lb4, fb0);
}
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb1, lb2, lb3, lb4);
}
        double ld5 = 878.062989588383;
        fd0 = fd1 + ld5;
        fb0 = fb1 || lb2;
        lb3 = !lb4;
if(fo1 != null){
          fo0 = fo1.m4(fd0, fd1, ld5, fd0, fb0, fb1, lb2, lb3);
}
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, lb4, fb0, fb1, lb2);
}
        fd1 = ld5 - fd0;
}
Thought.STACK_COUNTER++;
return fd0;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return 0.0;
} 
}
double m3(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      ab2 = fo0.m2(fd1, fd0, fd1, fd0);
}
        fd1 *= -1;
        fd0 *= -1;
        double ld0 = 940.9436219265832;
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, fd1, ld0, fd0, fd1);
}
        double ld1 = 405.6254931431849;

Thought.STACK_COUNTER++;
return ld0;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return 0.0;
} 
}
double m3(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Thought lo0 = Thought282.getInstance();
    ad2 *= -1;
    ad3 = ad4 + fd0;
    boolean lb1 = true;
if(fo1 != null){
      fo0 = fo1.m4(lb1, fb0, fb1, lb1);
}
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0, fd1, ad1, ad2, ad3, fb1, lb1, fb0, fb1);
}
    ad4 *= -1;
    lb1 = !fb0;
if(fo1 != null){
      fb1 = fo1.m2(fd0, fd1, ad1, ad2, lb1, fb0, fb1, lb1);
}
    Thought lo2 = Thought121.getInstance(fo0, fo1, fo0, fo1, fb0, fb1, lb1, fb0);
    Output.points[0][7] -= ad3;
if(fo0 != null){
      fb1 = fo0.m2(fo1, fo0, fo1, fo0);
}
    boolean lb3 = true;
    ad4 = fd0 - fd1;
if(fo1 != null){
      lb1 = fo1.m2(ad1, ad2, ad3, ad4);
}
    fd0 = fd1 - ad1;
if(fo0 != null){
      ad2 = fo0.m3(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1);
}

Thought.STACK_COUNTER++;
return ad1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return 0.0;
} 
}
double m3(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo0 != null){
      fo1 = fo0.m4();
}
    ab2 = ad2 > ad3;
if(fo1 != null){
      fo1.m3(ab3, ab4, fb0, fb1);
}
    Thought lo0 = Thought25.getInstance(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ad1, ab1, ab2, ab3, ab4);
    fb0 = ad2 > ad3;
    fb1 = ad4 > fd0;
    fd1 = ad1 + ad2;
    boolean lb1 = false;
if(fo0 != null){
      lb1 = fo0.m2(ad3, ad4, fd0, fd1, ab1, ab2, ab3, ab4);
}
    ad1 = ad2 - ad3;
    boolean lb2 = true;
    ab4 = fb0 && fb1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, lb1, lb2, ab1, ab2);
}
if(fo1 != null){
      ad4 = fo1.m3(fo0, fo1, fo0, fo1);
}

Thought.STACK_COUNTER++;
return fd0;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return 0.0;
} 
}
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd1 *= -1;
    fd0 = fd1 - fd0;
    fb0 = fd1 < fd0;
if(ao2 != null){
      ao1 = ao2.m4(fd1, fd0, fd1, fd0);
}
    fb1 = fd1 > fd0;
    fb0 = fd1 > fd0;
if(ao3 != null){
      fb1 = ao3.m2(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0);
}
    Output.points[0][8] += fd1;
    fd0 *= -1;
        double ld0 = 683.4366506974275;
if(ao3 != null){
      ao2 = ao3.m4();
}

Thought.STACK_COUNTER++;
return fd0;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return 0.0;
} 
}
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb0 = ad1 < ad2;
if(ao2 != null){
      ao2.m3(fb1, fb0, fb1, fb0);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, ad3, ad4, fd0, fd1, fb1, fb0, fb1, fb0);
}
    boolean lb0 = true;
if(ao4 != null){
      ao3 = ao4.m4(ad1, ad2, ad3, ad4, fb0, fb1, lb0, fb0);
}
    fb1 = lb0 && fb0;
if(fo0 != null){
      fo0.m3(fo1, ao1, ao2, ao3, fb1, lb0, fb0, fb1);
}
    fd0 = fd1 - ad1;
    Output.points[1][0] += ad2;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3);
}
if(ao4 != null){
      ad3 = ao4.m3(ad4, fd0, fd1, ad1);
}
    ad2 *= -1;
if(fo0 != null){
      fo0.m3(fo1, ao1, ao2, ao3, ad3, ad4, fd0, fd1);
}
    Thought lo1 = Thought70.getInstance();
    boolean lb2 = true;
if(fo0 != null){
      ao4 = fo0.m4(lb0, lb2, fb0, fb1);
}
    ad1 = ad2 - ad3;

Thought.STACK_COUNTER++;
return ad4;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return 0.0;
} 
}
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab1 = ab2 || ab3;
    Output.points[1][1] -= fd0;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0, ab4, fb0, fb1, ab1);
}
    fd1 = fd0 + fd1;
if(ao3 != null){
      ao2 = ao3.m4(fd0, fd1, fd0, fd1, ab2, ab3, ab4, fb0);
}
    fd0 = fd1 - fd0;
    fb1 = ab1 && ab2;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, ab3, ab4, fb0, fb1);
}
    fd1 = fd0 - fd1;
    ab1 = fd0 > fd1;
    boolean lb0 = true;
    ab1 = !ab2;
    ab3 = ab4 || fb0;
    fb1 = fd0 > fd1;
    fd0 *= -1;
    lb0 = ab1 && ab2;

Thought.STACK_COUNTER++;
return fd1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return 0.0;
} 
}
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
if(ao2 != null){
      ao2.m2(ad1, ad2, ad3, ad4);
}
    double ld0 = 330.0655134157395;
    Output.points[1][2] += ad4;
if(ao3 != null){
      fd0 = ao3.m3(ao4, fo0, fo1, ao1, fd1, ld0, ad1, ad2);
}
if(ao2 != null){
      ao2.m2();
}
    ab2 = !ab3;
    ad3 = ad4 + fd0;
    ab4 = fb0 && fb1;
    fd1 = ld0 - ad1;
if(ao3 != null){
      ao3.m1(ab1, ab2, ab3, ab4);
}
    ad2 = ad3 - ad4;
    fb0 = fb1 && ab1;
    boolean lb1 = true;
if(ao4 != null){
      fd0 = ao4.m3(fo0, fo1, ao1, ao2, fd1, ld0, ad1, ad2, ab1, ab2, ab3, ab4);
}
if(ao3 != null){
      fb0 = ao3.m2(ad3, ad4, fd0, fd1, fb1, lb1, ab1, ab2);
}
    ab3 = ab4 && fb0;
    boolean lb2 = true;
if(ao4 != null){
      ao4.m1(fo0, fo1, ao1, ao2, fb0, fb1, lb1, lb2);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2);
}
    Thought lo3 = Thought337.getInstance(ld0, ad1, ad2, ad3);
    boolean lb4 = false;
    lb4 = ab1 && ab2;
    ab3 = !ab4;
    ad4 = fd0 - fd1;
if(ao3 != null){
      ld0 = ao3.m3(ao4, fo0, fo1, ao1, ad1, ad2, ad3, ad4);
}
    Thought lo5 = Thought24.getInstance();
if(ao3 != null){
      ao2 = ao3.m4(fb0, fb1, lb1, lb2);
}
    fd0 = fd1 - ld0;

Thought.STACK_COUNTER++;
return ad1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return 0.0;
} 
}
Thought m4() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Thought lo0 = Thought209.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
        fd0 = fd1 - fd0;
    Thought lo1 = Thought226.getInstance(fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
    fd1 = fd0 - fd1;
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
    fd1 = fd0 + fd1;
    boolean lb2 = true;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      fo0.m3(fd0, fd1, fd0, fd1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
    boolean lb3 = true;
    fd0 *= -1;
if(fo1 != null){
      lb2 = fo1.m2();
}
    fd1 *= -1;
if(fo0 != null){
      fo0.m2(lb3, fb0, fb1, lb2);
}

Thought.STACK_COUNTER++;
return fo1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return null;
} 
}
Thought m4(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = true;
    boolean lb1 = true;
    boolean lb2 = true;
    Thought lo3 = Thought201.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, lb1, lb2, ab1, ab2);
    fd0 = fd1 + fd0;
    fd1 = fd0 + fd1;
if(fo0 != null){
      fo0.m2(fd0, fd1, fd0, fd1, ab3, ab4, fb0, fb1);
}
    fd0 = fd1 + fd0;
    Thought lo4 = Thought136.getInstance(fo1, fo0, fo1, fo0, lb0, lb1, lb2, ab1);
    ab2 = fd1 > fd0;
    fd1 = fd0 + fd1;
    fd0 *= -1;
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1);
}

Thought.STACK_COUNTER++;
return fo0;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return null;
} 
}
Thought m4(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb1 = ad1 > ad2;
if(fo1 != null){
      ad3 = fo1.m3(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ad1);
}
    double ld0 = 666.0445187998383;
if(fo1 != null){
      fo0 = fo1.m4();
}
    Output.points[1][3] -= ad1;
    fb0 = ad2 > ad3;
    fb1 = !fb0;
    fb1 = fb0 && fb1;
if(fo1 != null){
      fo0 = fo1.m4(fb0, fb1, fb0, fb1);
}
    ad4 *= -1;
    fd0 = fd1 - ld0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fd0 = fo0.m3(fd1, ld0, ad1, ad2, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1);
}
    boolean lb1 = false;
    boolean lb2 = false;
    double ld3 = 701.2702210182015;
    ad2 = ad3 - ad4;

Thought.STACK_COUNTER++;
return fo0;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return null;
} 
}
Thought m4(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ad1 = ad2 + ad3;
    double ld0 = 566.7144286690265;
if(fo0 != null){
      fo1 = fo0.m4(ad3, ad4, fd0, fd1);
}
    ld0 *= -1;
    ad1 = ad2 - ad3;
    ad4 *= -1;
    double ld1 = 302.2912898949675;
if(fo1 != null){
      ab1 = fo1.m2(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ld0);
}
if(fo0 != null){
      fo0.m2();
}
    double ld2 = 758.4259236313677;
if(fo1 != null){
      fo1.m1(ab2, ab3, ab4, fb0);
}
    fb1 = ab1 && ab2;
    ld1 *= -1;
    ab3 = ab4 || fb0;
if(fo0 != null){
      ld2 = fo0.m3(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4, fb1, ab1, ab2, ab3);
}
    ab4 = !fb0;
    Output.points[1][4] -= fd0;
    fb1 = fd1 > ld0;
if(fo1 != null){
      fo1.m1(ld1, ld2, ad1, ad2, ab1, ab2, ab3, ab4);
}
    ad3 *= -1;
    double ld3 = 667.5722011649696;
    Thought lo4 = Thought68.getInstance(fo0, fo1, fo0, fo1, fb0, fb1, ab1, ab2);
    ad3 = ad4 - fd0;
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0);
}
    ld0 = ld1 + ld2;
    ab3 = ab4 && fb0;

Thought.STACK_COUNTER++;
return fo1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return null;
} 
}
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Thought lo0 = Thought170.getInstance(fd1, fd0, fd1, fd0);
    boolean lb1 = true;
    double ld2 = 769.4342992871832;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd0, fd1, ld2, fd0);
}
    fb0 = fb1 && lb1;
    fd1 = ld2 + fd0;
if(ao1 != null){
      ao1.m3();
}
    fb0 = fb1 && lb1;
    boolean lb3 = true;
if(ao2 != null){
      fd1 = ao2.m3(lb3, fb0, fb1, lb1);
}
    for(int i0=0; i0<10; i0++){
        ld2 = fd0 - fd1;
        Thought lo4 = Thought335.getInstance(ao3, ao4, fo0, fo1, ld2, fd0, fd1, ld2, lb3, fb0, fb1, lb1);
        double ld5 = 72.47111949675362;
        ld2 *= -1;
        fd0 = fd1 - ld5;
        Thought lo6 = Thought168.getInstance(ld2, fd0, fd1, ld5, lb3, fb0, fb1, lb1);
if(ao1 != null){
          ld2 = ao1.m3(ao2, ao3, ao4, fo0, lb3, fb0, fb1, lb1);
}
        double ld7 = 492.0076888463631;
if(ao1 != null){
          fo1 = ao1.m4(ao2, ao3, ao4, fo0);
}
        lb3 = fb0 && fb1;
        lb1 = !lb3;
}
Thought.STACK_COUNTER++;
return fo1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return null;
} 
}
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao1 != null){
          ao1.m2(ad1, ad2, ad3, ad4);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd0, fd1, ad1, ad2);
}
    ad3 = ad4 - fd0;
    fd1 *= -1;
    ad1 *= -1;
    fb0 = !fb1;
    fb0 = !fb1;
    fb0 = !fb1;
if(ao2 != null){
      ad2 = ao2.m3();
}
    Thought lo0 = Thought133.getInstance(fb0, fb1, fb0, fb1);
    boolean lb1 = true;
    ad3 = ad4 + fd0;
if(ao3 != null){
      fd1 = ao3.m3(ao4, fo0, fo1, ao1, ad1, ad2, ad3, ad4, lb1, fb0, fb1, lb1);
}
if(ao2 != null){
      fb0 = ao2.m2(fd0, fd1, ad1, ad2, fb1, lb1, fb0, fb1);
}
    Thought lo2 = Thought4.getInstance(ao3, ao4, fo0, fo1, lb1, fb0, fb1, lb1);
    fb0 = ad3 < ad4;
    fd0 = fd1 + ad1;
    fb1 = ad2 > ad3;
    Output.points[1][5] += ad4;

Thought.STACK_COUNTER++;
return ao1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return null;
} 
}
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      ab1 = ao2.m2(ao3, ao4, fo0, fo1);
}
    ab2 = fd0 > fd1;
    ab3 = fd0 < fd1;
    fd0 = fd1 + fd0;
    boolean lb0 = false;
    Thought lo1 = Thought129.getInstance(fd1, fd0, fd1, fd0);
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0);
}
        boolean lb2 = false;
if(ao2 != null){
      ao1 = ao2.m4();
}
    ab2 = fd1 > fd0;
if(ao3 != null){
      ao3.m2(ab3, ab4, fb0, fb1);
}
    if (lb0) {
        lb2 = fd1 > fd0;
        ab1 = fd1 > fd0;
if(fo0 != null){
          ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd1, fd0, fd1, fd0, ab2, ab3, ab4, fb0);
}
        } else {
}
Thought.STACK_COUNTER++;
return ao4;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return null;
} 
}
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      ao1 = ao2.m4(ad2, ad3, ad4, fd0, ab2, ab3, ab4, fb0);
}
    fd1 *= -1;
if(ao3 != null){
      ao3.m3(ao4, fo0, fo1, ao1, fb1, ab1, ab2, ab3);
}
    ad1 *= -1;
    Output.points[1][6] += ad2;
if(ao2 != null){
      ao2.m3(ao3, ao4, fo0, fo1);
}
if(ao1 != null){
          ab4 = ao1.m2(ad3, ad4, fd0, fd1);
}
if(ao2 != null){
      fb0 = ao2.m2(ao3, ao4, fo0, fo1, ad1, ad2, ad3, ad4);
}
if(ao2 != null){
      ao1 = ao2.m4();
}
    double ld0 = 592.0476381960422;
if(ao4 != null){
      ao3 = ao4.m4(fb1, ab1, ab2, ab3);
}
    ab4 = ad4 < fd0;
    fb0 = fd1 > ld0;

Thought.STACK_COUNTER++;
return fo0;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return null;
} 
}
void accept(String color) throws CountDownExc {
switch (color) {
case "e":
empty();
break;
case "own":
own();
break;
case "other":
other();
break;
default:
throw new RuntimeException("Illegal color!!!");
}
}
void empty() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb1 = fb0 || fb1;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
    boolean lb0 = false;
if(fo0 != null){
      fd1 = fo0.m3(fd0, fd1, fd0, fd1, lb0, fb0, fb1, lb0);
}
        boolean lb1 = false;
if(fo1 != null){
      lb1 = fo1.m2(fo0, fo1, fo0, fo1, fb0, fb1, lb0, lb1);
}
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0);
}
    Thought lo2 = Thought276.getInstance(fd0, fd1, fd0, fd1);
        Thought lo3 = Thought199.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);

Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
void own() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = true;
    fd0 *= -1;
    fd1 = fd0 + fd1;
    fb0 = fb1 && lb0;
if(fo1 != null){
      fo1.m2();
}
if(fo1 != null){
      fo0 = fo1.m4(fb0, fb1, lb0, fb0);
}
if(fo0 != null){
      fb1 = fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, lb0, fb0, fb1, lb0);
}
    fb0 = fb1 || lb0;
    Thought lo1 = Thought338.getInstance(fd0, fd1, fd0, fd1, fb0, fb1, lb0, fb0);
    fb1 = lb0 && fb0;
    fb1 = lb0 || fb0;
    Output.points[1][7] += fd0;
    fd1 = fd0 - fd1;
    boolean lb2 = false;
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, fb0, fb1, lb0, lb2);
}
    fd1 *= -1;
    fb0 = fb1 && lb0;

Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
void other() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = true;
    boolean lb1 = true;
if(fo0 != null){
      lb1 = fo0.m2(fo1, fo0, fo1, fo0);
}
    Output.points[1][8] += fd0;
    fb0 = fd1 > fd0;
    fd1 *= -1;
    fb1 = lb0 && lb1;
    Output.points[2][0] -= fd0;
if(fo1 != null){
      fb0 = fo1.m2(fd1, fd0, fd1, fd0);
}
    fd1 *= -1;
    fb1 = !lb0;
    fd0 *= -1;
    lb1 = fd1 < fd0;
    fd1 = fd0 + fd1;

Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
}
